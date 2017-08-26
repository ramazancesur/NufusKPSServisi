package kps.handler;


import kps.config.*;
import kps.config.utilities.Helper;
import kps.test.helper.NviNamespaces;
import org.apache.xml.security.c14n.CanonicalizationException;
import org.apache.xml.security.c14n.Canonicalizer;
import org.apache.xml.security.c14n.InvalidCanonicalizerException;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.dsig.CanonicalizationMethod;
import javax.xml.crypto.dsig.XMLSignatureException;
import javax.xml.namespace.QName;
import javax.xml.soap.*;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.ProtocolException;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Created by ramazancesur on 25/08/2017.
 */
public class NviStsHandler implements SOAPHandler<SOAPMessageContext> {


    static {
        org.apache.xml.security.Init.init();
    }

    public boolean handleMessage(SOAPMessageContext messageContext) {
        boolean outbound = (Boolean) messageContext.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

        if (outbound) {
            try {
                SOAPMessage msg = messageContext.getMessage();
                String username = "userName";
                String appliesTo = (String) messageContext.get(BindingProvider.ENDPOINT_ADDRESS_PROPERTY);
                String passwd = "password";
                String tokenServiceEndPoint = "https://kimlikdogrulama.nvi.gov.tr/Services/Issuer.svc/IWSTrust13";

                NviConfigurationItem config = new NviConfigurationItem(tokenServiceEndPoint, username, passwd.toCharArray());
                NviTokenProviderService tokenProviderService = NviTokenProvider.Instance.getService(config.getTokenServiceEndpoint(), appliesTo);
                NviSecurityToken token = tokenProviderService.getToken(config.getUsername(), config.getPassword());

                applySecurityToken(msg, token);


                return true;
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(NviStsHandler.class.getName()).log(Level.SEVERE, null, ex);

                throw new ProtocolException("Unable to find the specified algorithm.", ex);
            } catch (InvalidAlgorithmParameterException ex) {
                Logger.getLogger(NviStsHandler.class.getName()).log(Level.SEVERE, null, ex);

                throw new ProtocolException("Invalid algorithm parameters specified.", ex);
            } catch (MarshalException ex) {
                Logger.getLogger(NviStsHandler.class.getName()).log(Level.SEVERE, null, ex);

                throw new ProtocolException("Unable to marshal XML signature.", ex);
            } catch (XMLSignatureException ex) {
                Logger.getLogger(NviStsHandler.class.getName()).log(Level.SEVERE, null, ex);

                throw new ProtocolException("Unable to build XML signature.", ex);
            } catch (SOAPException ex) {
                Logger.getLogger(NviStsHandler.class.getName()).log(Level.SEVERE, null, ex);

                throw new ProtocolException("SOAP operation failed.", ex);
            } catch (InvalidKeyException ex) {
                Logger.getLogger(NviStsHandler.class.getName()).log(Level.SEVERE, null, ex);

                throw new ProtocolException("Key is not valid.", ex);
            } catch (InvalidCanonicalizerException ex) {
                Logger.getLogger(NviStsHandler.class.getName()).log(Level.SEVERE, null, ex);

                throw new ProtocolException("Canonicalizer not found.", ex);
            } catch (CanonicalizationException ex) {
                Logger.getLogger(NviStsHandler.class.getName()).log(Level.SEVERE, null, ex);

                throw new ProtocolException("Canonicalization failed.", ex);
            }
        }

        return true;
    }

    public boolean handleFault(SOAPMessageContext context) {
        return true;
    }

    public void close(MessageContext context) {
    }

    public Set<QName> getHeaders() {
        HashSet<QName> headers = new HashSet<QName>();

        headers.add(new QName(NviNamespaces.NS_SECURITY, NviConstants.TAG_SECURITY));

        return headers;
    }

    private void applySecurityToken(SOAPMessage message, NviSecurityToken token)
            throws SOAPException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, MarshalException, XMLSignatureException, InvalidKeyException, InvalidCanonicalizerException, CanonicalizationException {
        SOAPEnvelope envelope = message.getSOAPPart().getEnvelope();
        buildNamespaces(envelope);

        SOAPHeader header = envelope.getHeader();
        if (header == null) {
            envelope.addHeader();
        }

        buildMessageHeader(envelope.getHeader(), token);
    }

    private void buildNamespaces(SOAPEnvelope envelope)
            throws SOAPException {
        envelope.addNamespaceDeclaration(NviNamespaces.NS_ADDRESSING_PREFIX, NviNamespaces.NS_ADDRESSING);
        envelope.addNamespaceDeclaration(NviNamespaces.NS_ENVELOPE_PREFIX, NviNamespaces.NS_ENVELOPE);
        envelope.addNamespaceDeclaration(NviNamespaces.NS_POLICY_PREFIX, NviNamespaces.NS_POLICY);
        envelope.addNamespaceDeclaration(NviNamespaces.NS_SECURITY_PREFIX, NviNamespaces.NS_SECURITY);
        envelope.addNamespaceDeclaration(NviNamespaces.NS_SECURITY_UTIL_PREFIX, NviNamespaces.NS_SECURITY_UTIL);
        envelope.addNamespaceDeclaration(NviNamespaces.NS_TRUST_PREFIX, NviNamespaces.NS_TRUST);
        envelope.addNamespaceDeclaration(NviNamespaces.NS_XML_SIGNATURE_PREFIX, NviNamespaces.NS_XML_SIGNATURE);
    }

    private void buildMessageHeader(SOAPHeader header, NviSecurityToken token)
            throws SOAPException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, MarshalException, XMLSignatureException, InvalidKeyException, InvalidCanonicalizerException, CanonicalizationException {
        SOAPElement securityElement = header.addChildElement(NviConstants.TAG_SECURITY, NviNamespaces.NS_SECURITY_PREFIX);
        securityElement.setAttributeNS(NviNamespaces.NS_ENVELOPE, NviNamespaces.NS_ENVELOPE_PREFIX + ":" + NviConstants.ATT_MUSTUNDERSTAND, "1");

        // Build Time Stamp...
        SOAPElement timestampElement = securityElement.addChildElement(NviConstants.TAG_TIMESTAMP, NviNamespaces.NS_SECURITY_UTIL_PREFIX);
        timestampElement.addAttribute(NviConstants.ATT_TIMESTAMP_ID, "_0");
        SOAPElement createdElement = timestampElement.addChildElement(NviConstants.TAG_TIMESTAMP_CREATED, NviNamespaces.NS_SECURITY_UTIL_PREFIX);
        SOAPElement expiresElement = timestampElement.addChildElement(NviConstants.TAG_TIMESTAMP_EXPIRES, NviNamespaces.NS_SECURITY_UTIL_PREFIX);

        Calendar created = Calendar.getInstance();
        Calendar expires = (Calendar) created.clone();
        expires.add(Calendar.MINUTE, 5);

        createdElement.addTextNode(Helper.formatDate(created.getTime()));
        expiresElement.addTextNode(Helper.formatDate(expires.getTime()));

        Node securityTokenNode = token.getSecurityToken().cloneNode(true);
        Node importedSecurityTokenNode = header.getOwnerDocument().importNode(securityTokenNode, true);
        securityElement.appendChild(importedSecurityTokenNode);

        buildSimpleSignature(securityElement, timestampElement, token);
    }

    private void buildSimpleSignature(SOAPElement securityElement, SOAPElement timestampElement, NviSecurityToken token)
            throws SOAPException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, MarshalException, XMLSignatureException, InvalidCanonicalizerException, CanonicalizationException, InvalidKeyException {
        SOAPElement signatureElement = securityElement.addChildElement(NviConstants.TAG_SIGNATURE, NviNamespaces.NS_XML_SIGNATURE_PREFIX);
        SOAPElement signedInfoElement = signatureElement.addChildElement(NviConstants.TAG_SIGNEDINFO, NviNamespaces.NS_XML_SIGNATURE_PREFIX);

        SOAPElement canonElement = signedInfoElement.addChildElement(NviConstants.TAG_CANONALIZATION_METHOD, NviNamespaces.NS_XML_SIGNATURE_PREFIX);
        canonElement.setAttribute(NviConstants.ATT_ALGORITHM, NviConstants.CST_ALGORITHM_C14N);

        SOAPElement sigMethodElement = signedInfoElement.addChildElement(NviConstants.TAG_SIGNATURE_METHOD, NviNamespaces.NS_XML_SIGNATURE_PREFIX);
        sigMethodElement.setAttribute(NviConstants.ATT_ALGORITHM, NviConstants.CST_ALGORITHM_HMAC_SHA1);

        SOAPElement referenceElement = signedInfoElement.addChildElement(NviConstants.TAG_REFERENCE, NviNamespaces.NS_XML_SIGNATURE_PREFIX);
        referenceElement.setAttribute(NviConstants.ATT_URI, "#_0");
        SOAPElement transformsElement = referenceElement.addChildElement(NviConstants.TAG_TRANSFORMS, NviNamespaces.NS_XML_SIGNATURE_PREFIX);
        SOAPElement transformElement = transformsElement.addChildElement(NviConstants.TAG_TRANSFORM, NviNamespaces.NS_XML_SIGNATURE_PREFIX);
        transformElement.setAttribute(NviConstants.ATT_ALGORITHM, NviConstants.CST_ALGORITHM_C14N);
        SOAPElement digestMethodElement = referenceElement.addChildElement(NviConstants.TAG_DIGEST_METHOD, NviNamespaces.NS_XML_SIGNATURE_PREFIX);
        digestMethodElement.setAttribute(NviConstants.ATT_ALGORITHM, NviConstants.CST_ALGORITHM_SHA1);
        SOAPElement digestValueElement = referenceElement.addChildElement(NviConstants.TAG_DIGEST_VALUE, NviNamespaces.NS_XML_SIGNATURE_PREFIX);
        digestValueElement.addTextNode(Helper.encodeBytes(computeDigest(canonalize(timestampElement))));

        SOAPElement signatureValueElement = signatureElement.addChildElement(NviConstants.TAG_SIGNATURE_VALUE, NviNamespaces.NS_XML_SIGNATURE_PREFIX);
        signatureValueElement.addTextNode(Helper.encodeBytes(computeHmacSha1(canonalize(signedInfoElement), token.getProofTokenSecret())));

        SOAPElement keyInfoElement = signatureElement.addChildElement(NviConstants.TAG_KEY_INFO, NviNamespaces.NS_XML_SIGNATURE_PREFIX);

        Node tokenReferenceNode = token.getSecurityTokenReference().cloneNode(true);
        Node importedTokenReferenceNode = securityElement.getOwnerDocument().importNode(tokenReferenceNode, true);
        keyInfoElement.appendChild(importedTokenReferenceNode);
    }

    private byte[] canonalize(Element e) throws InvalidCanonicalizerException, CanonicalizationException {
        Canonicalizer cInstance = Canonicalizer.getInstance(CanonicalizationMethod.EXCLUSIVE);

        byte[] result = cInstance.canonicalizeSubtree(e);

        return result;
    }

    private byte[] computeDigest(byte[] input) throws NoSuchAlgorithmException {
        return MessageDigest.getInstance("SHA1").digest(input);
    }

    private byte[] computeHmacSha1(byte[] input, byte[] key) throws NoSuchAlgorithmException, InvalidKeyException {
        SecretKey keySpec = new SecretKeySpec(key, "HmacSHA1");

        Mac m = Mac.getInstance("HmacSHA1");
        m.init(keySpec);
        m.update(input);

        return m.doFinal();
    }

}
