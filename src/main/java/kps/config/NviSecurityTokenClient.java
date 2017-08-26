package kps.config;

import kps.config.utilities.Helper;
import kps.test.helper.NviNamespaces;

import javax.xml.namespace.QName;
import javax.xml.soap.*;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.PortInfo;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import javax.xml.ws.soap.AddressingFeature;
import javax.xml.ws.soap.SOAPBinding;
import javax.xml.xpath.XPathExpressionException;
import java.text.ParseException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by ramazancesur on 25/08/2017.
 */
public class NviSecurityTokenClient {

    private static final QName tokenServiceName = new QName("SecurityTokenService");
    private static final QName tokenServicePortName = new QName("WS2007HttpBinding_IWSTrust13Sync");
    private final Object syncObject = new Object();
    private String endpointUri;
    private String appliesToUri;
    private volatile Service tokenService = null;
    private volatile MessageFactory tokenServiceMessageFactory = null;

    public NviSecurityTokenClient(String endpointUri, String appliesToUri) {
        this.endpointUri = endpointUri;
        this.appliesToUri = appliesToUri;
    }

    public NviSecurityToken requestToken(String username, char[] password)
            throws SOAPException {
        NviSecurityToken result = null;

        try {
            Dispatch<SOAPMessage> dispatch = createDispatch();
            SOAPMessage request = buildMessage(username, password);
            SOAPMessage response = dispatch.invoke(request);
            result = buildToken(response);
        } catch (XPathExpressionException ex) {
            Logger.getLogger(NviSecurityTokenClient.class.getName()).log(Level.SEVERE, null, ex);

            throw new SOAPException(ex);
        } catch (ParseException ex) {
            Logger.getLogger(NviSecurityTokenClient.class.getName()).log(Level.SEVERE, null, ex);

            throw new SOAPException(ex);
        }

        return result;
    }

    private NviSecurityToken buildToken(SOAPMessage message)
            throws XPathExpressionException, ParseException {
        NviSecurityToken token = new NviSecurityToken();

        token.setRstResponse(message.getSOAPPart());

        return token;
    }

    private SOAPMessage buildMessage(String username, char[] password)
            throws SOAPException {
        SOAPMessage msg = createMessage();

        buildNamespaces(msg.getSOAPPart().getEnvelope());
        buildMessageHeader(msg.getSOAPPart().getEnvelope().getHeader(), username, password);
        buildMessageBody(msg.getSOAPPart().getEnvelope().getBody());

        return msg;
    }

    private void buildNamespaces(SOAPEnvelope envelope)
            throws SOAPException {
        envelope.addNamespaceDeclaration(NviNamespaces.NS_ADDRESSING_PREFIX, NviNamespaces.NS_ADDRESSING);
        envelope.addNamespaceDeclaration(NviNamespaces.NS_ENVELOPE_PREFIX, NviNamespaces.NS_ENVELOPE);
        envelope.addNamespaceDeclaration(NviNamespaces.NS_POLICY_PREFIX, NviNamespaces.NS_POLICY);
        envelope.addNamespaceDeclaration(NviNamespaces.NS_SECURITY_PREFIX, NviNamespaces.NS_SECURITY);
        envelope.addNamespaceDeclaration(NviNamespaces.NS_SECURITY_UTIL_PREFIX, NviNamespaces.NS_SECURITY_UTIL);
        envelope.addNamespaceDeclaration(NviNamespaces.NS_TRUST_PREFIX, NviNamespaces.NS_TRUST);
    }

    private void buildMessageHeader(SOAPHeader header, String username, char[] password)
            throws SOAPException {
        SOAPElement securityElement = header.addChildElement(NviConstants.TAG_SECURITY, NviNamespaces.NS_SECURITY_PREFIX);
        securityElement.addAttribute(NviConstants.ATT_MUSTUNDERSTAND_NAME, "1");

        // Build Time Stamp...
        SOAPElement timestampElement = securityElement.addChildElement(NviConstants.TAG_TIMESTAMP, NviNamespaces.NS_SECURITY_UTIL_PREFIX);
        SOAPElement createdElement = timestampElement.addChildElement(NviConstants.TAG_TIMESTAMP_CREATED, NviNamespaces.NS_SECURITY_UTIL_PREFIX);
        SOAPElement expiresElement = timestampElement.addChildElement(NviConstants.TAG_TIMESTAMP_EXPIRES, NviNamespaces.NS_SECURITY_UTIL_PREFIX);

        Calendar created = Calendar.getInstance();
        Calendar expires = (Calendar) created.clone();
        expires.add(Calendar.MINUTE, 5);

        createdElement.addTextNode(Helper.formatDate(created.getTime()));
        expiresElement.addTextNode(Helper.formatDate(expires.getTime()));

        // Build UsernameToken
        SOAPElement usernameTokenElement = securityElement.addChildElement(NviConstants.TAG_USERNAMETOKEN, NviNamespaces.NS_SECURITY_PREFIX);
        SOAPElement usernameElement = usernameTokenElement.addChildElement(NviConstants.TAG_USERNAME, NviNamespaces.NS_SECURITY_PREFIX);
        SOAPElement passwordElement = usernameTokenElement.addChildElement(NviConstants.TAG_PASSWORD, NviNamespaces.NS_SECURITY_PREFIX);

        usernameElement.addTextNode(username);
        passwordElement.addAttribute(NviConstants.ATT_PASSWORDTYPE_NAME, NviConstants.CST_PASSWORD_TYPE);
        passwordElement.addTextNode(new String(password));
    }

    private void buildMessageBody(SOAPBody body)
            throws SOAPException {
        SOAPElement rstElement = body.addChildElement(NviConstants.TAG_REQUEST_SECURITY_TOKEN, NviNamespaces.NS_TRUST_PREFIX);
        SOAPElement appliesToElement = rstElement.addChildElement(NviConstants.TAG_APPLIES_TO, NviNamespaces.NS_POLICY_PREFIX);
        SOAPElement endpointReferenceElement = appliesToElement.addChildElement(NviConstants.TAG_ENDPOINT_REFERENCE, NviNamespaces.NS_ADDRESSING_PREFIX);
        SOAPElement addressElement = endpointReferenceElement.addChildElement(NviConstants.TAG_ADDRESS, NviNamespaces.NS_ADDRESSING_PREFIX);
        addressElement.addTextNode(appliesToUri);

        SOAPElement requestTypeElement = rstElement.addChildElement(NviConstants.TAG_REQUEST_TYPE, NviNamespaces.NS_TRUST_PREFIX);
        requestTypeElement.addTextNode(NviConstants.CST_TRUST_ISSUE);
    }

    private Dispatch<SOAPMessage> createDispatch() {
        if (tokenService == null) {
            synchronized (syncObject) {
                if (tokenService == null) {
                    tokenService = createService();
                }
            }
        }

        Dispatch<SOAPMessage> result =
                tokenService.createDispatch(tokenServicePortName, SOAPMessage.class, Service.Mode.MESSAGE, new AddressingFeature());

        result.getRequestContext().put(BindingProvider.SOAPACTION_URI_PROPERTY, NviConstants.CST_RST_ISSUE_ACTION);

        return result;
    }

    private SOAPMessage createMessage()
            throws SOAPException {
        if (tokenServiceMessageFactory == null) {
            synchronized (syncObject) {
                if (tokenServiceMessageFactory == null) {
                    tokenServiceMessageFactory = MessageFactory.newInstance(SOAPConstants.SOAP_1_2_PROTOCOL);
                }
            }
        }

        return tokenServiceMessageFactory.createMessage();
    }

    private Service createService() {
        Service result = Service.create(tokenServiceName);

        result.setHandlerResolver(new ServiceHandlerResolver());
        result.addPort(tokenServicePortName, SOAPBinding.SOAP12HTTP_BINDING, endpointUri);

        return result;
    }

    @SuppressWarnings("rawtypes")
    private class ServiceHandlerResolver implements HandlerResolver {

        public List<Handler> getHandlerChain(PortInfo portInfo) {
            List<Handler> handlers = new ArrayList<Handler>();

            handlers.add(new SkipMustUnderstandForSecurityHandler());

            return handlers;
        }
    }

    private class SkipMustUnderstandForSecurityHandler implements SOAPHandler<SOAPMessageContext> {

        public Set<QName> getHeaders() {
            HashSet<QName> headers = new HashSet<QName>();

            headers.add(new QName(NviNamespaces.NS_SECURITY, NviConstants.TAG_SECURITY));

            return headers;
        }

        public void close(MessageContext context) {
        }

        public boolean handleFault(SOAPMessageContext context) {
            return true;
        }

        public boolean handleMessage(SOAPMessageContext context) {
            return true;
        }
    }
}
