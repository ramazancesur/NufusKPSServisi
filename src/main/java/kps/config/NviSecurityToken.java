package kps.config;

import java.io.IOException;
import java.io.Serializable;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;

import kps.config.utilities.Base64;
import kps.config.utilities.Helper;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;


/**
 * Created by ramazancesur on 25/08/2017.
 */
public class NviSecurityToken implements Serializable{
    private static final long serialVersionUID = 1L;
    private static TokenSelectors selectors = new TokenSelectors();

    private Document rstResponse;

    private Date created;
    private Date expires;
    private Element securityToken;
    private Element securityTokenReference;
    private byte[] proofTokenSecret;

    public NviSecurityToken() {
    }

    public boolean isValid() {
        if (Calendar.getInstance().getTime().before(getExpires())) {
            return true;
        } else {
            return false;
        }
    }

    public void setRstResponse(Document rstResponse)
            throws XPathExpressionException, ParseException {
        this.rstResponse = rstResponse;

        if (rstResponse != null) {
            Element docElement = rstResponse.getDocumentElement();
            NviSecurityTokenSelectors selector = selectors.get();

            String createdText = selector.getLifeTimeCreatedSelector()
                    .evaluate(docElement);
            String expiresText = selector.getLifeTimeExpiresSelector()
                    .evaluate(docElement);
            String proofTokenSecretText = selector
                    .getProofTokenSecretSelector().evaluate(docElement);
            Element tokenNode = (Element) selector.getTokenSelector().evaluate(
                    docElement, XPathConstants.NODE);
            Element tokenReferenceNode = (Element) selector
                    .getTokenReferenceSelector().evaluate(docElement,
                            XPathConstants.NODE);

            setCreated(Helper.parseDate(createdText));
            setExpires(Helper.parseDate(expiresText));
            setProofTokenSecret(Base64.decode(proofTokenSecretText));
            setSecurityToken((Element) tokenNode.cloneNode(true));
            setSecurityTokenReference((Element) tokenReferenceNode
                    .cloneNode(true));
        } else {
            created = null;
            expires = null;
            proofTokenSecret = null;
            securityToken = null;
            securityTokenReference = null;
        }
    }

    public Document getRstResponse() {
        return rstResponse;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getExpires() {
        return expires;
    }

    public void setExpires(Date expires) {
        this.expires = expires;
    }

    public Element getSecurityToken() {
        return securityToken;
    }

    public void setSecurityToken(Element securityToken) {
        this.securityToken = securityToken;
    }

    public Element getSecurityTokenReference() {
        return securityTokenReference;
    }

    public void setSecurityTokenReference(Element securityTokenReference) {
        this.securityTokenReference = securityTokenReference;
    }

    public byte[] getProofTokenSecret() {
        return proofTokenSecret;
    }

    public void setProofTokenSecret(byte[] proofTokenSecret) {
        this.proofTokenSecret = proofTokenSecret;
    }

    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        try {
            out.writeUTF(Helper.transformDocumentToString(rstResponse));
        } catch (TransformerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        out.writeUTF(Helper.encodeBytes(proofTokenSecret));
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException,
            ClassNotFoundException {
        try {
            setRstResponse(Helper.transformStringToDocument(in.readUTF()));
        } catch (ParserConfigurationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SAXException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (XPathExpressionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private static class TokenSelectors extends
            ThreadLocal<NviSecurityTokenSelectors> {

        @Override
        protected NviSecurityTokenSelectors initialValue() {
            try {
                return new NviSecurityTokenSelectors();
            } catch (XPathExpressionException ex) {
                Logger.getLogger(NviSecurityTokenClient.class.getName()).log(
                        Level.SEVERE, null, ex);
            }

            return null;
        }

    }

}
