package kps.handler;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPHeader;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by ramazancesur on 25/08/2017.
 */

@Stateless
public class KpsHandler implements SOAPHandler<SOAPMessageContext> {


    private String username="16945672820";

    private String password="Kdgm.123";

    public KpsHandler(){

    }

    public boolean handleMessage(SOAPMessageContext context) {
        Boolean outboundProperty =
                (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

        Date date = new Date(System.currentTimeMillis());
        System.out.println("PaswordString :"+password);
        String nonce = NonceAndDiggestPassword.buildNonce(date);
        String passDiggest = NonceAndDiggestPassword.buildDiggest(password,nonce,date.toString());


        String passDigestFromUi = "WWO2lPsZ1LoEkANS/JSAzU54VPA=";
        String nonceFromUi      = "htu9JGxzcN5HepbQQ4sRQg==";
        String createdFromUi    ="2016-04-16T12:46:56.324Z";
        if (outboundProperty.booleanValue()) {
            try {
                /*** ENVELOPE ***/
                SOAPEnvelope envelope = context.getMessage().getSOAPPart().getEnvelope();
                SOAPFactory factory = SOAPFactory.newInstance();
                String prefix = "wsse";
                String uri = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";

                /*** Security Element***/
                SOAPElement securityElement =
                        factory.createElement("Security", prefix, uri);
                securityElement.addAttribute(QName.valueOf("xmlns:wsu"),"\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"");

                /*Token Element*/
                SOAPElement tokenElement =
                        factory.createElement("UsernameToken", prefix, uri);
                tokenElement.addAttribute(QName.valueOf("wsu:Id"), "\"UsernameToken-6A22B7A7A68D4A1C7E14608108163245\"");
                tokenElement.addAttribute(QName.valueOf("xmlns:wsu"), "\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"");

                /*** User Element***/
                SOAPElement userElem =
                        factory.createElement("Username", prefix, uri);
                userElem.addTextNode(username);
                System.out.println("Username :" +username);

                /*** Password Element***/
                SOAPElement passwordElement =
                        factory.createElement("Password", prefix, uri);
                //passwordElement.addTextNode(passDiggest);
                passwordElement.addTextNode(passDigestFromUi);
                System.out.println("Password Diggest:"+passDiggest);
                passwordElement.addAttribute(QName.valueOf("Type"), "\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordDigest\"");

                /*** Nonce Element***/
                SOAPElement nonceElement =
                        factory.createElement("Nonce",prefix,uri);
                // nonceElement.addTextNode(nonce);
                nonceElement.addTextNode(nonceFromUi);
                System.out.println("Nonce :"+nonce);
                nonceElement.addAttribute(QName.valueOf("EncodingType"),"\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary\"");

                /***Created Date Element***/
                SOAPElement createdElement=
                        factory.createElement("Created","wsu",uri);
                //createdElement.addTextNode(date.toString());
                createdElement.addTextNode(createdFromUi);
                System.out.println("Created :"+createdFromUi);

                /*** Adding Authentication Variables Child Elements(Username,Pass,Nonce,Created)
                 to Parent Token Element
                 ***/
                tokenElement.addChildElement(userElem);
                tokenElement.addChildElement(passwordElement);
                tokenElement.addChildElement(nonceElement);
                tokenElement.addChildElement(createdElement);
                securityElement.addChildElement(tokenElement);
                if (envelope.getHeader() != null) {
                    envelope.getHeader().detachNode();
                }
                SOAPHeader header = envelope.addHeader();
                header.addChildElement(securityElement);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {

        }
        return true;
    }

    public boolean handleFault(SOAPMessageContext context) {
        return false;
    }

    public Set<QName> getHeaders() {
        return new TreeSet<QName>();
    }

    public void close(MessageContext context) {

    }
}
