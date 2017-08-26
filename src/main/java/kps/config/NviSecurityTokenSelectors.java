package kps.config;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

/**
 * Created by ramazancesur on 25/08/2017.
 */
public class NviSecurityTokenSelectors {

    private XPathFactory factory;
    private XPath xpath;
    private XPathExpression proofTokenSecretSelector = null;
    private XPathExpression lifeTimeCreatedSelector = null;
    private XPathExpression lifeTimeExpiresSelector = null;
    private XPathExpression appliesToSelector = null;
    private XPathExpression tokenSelector = null;
    private XPathExpression tokenReferenceSelector = null;

    public NviSecurityTokenSelectors() throws XPathExpressionException {
        factory = XPathFactory.newInstance();

        xpath = factory.newXPath();
        xpath.setNamespaceContext(NviNamespaceContext.Instance);

        proofTokenSecretSelector = xpath.compile("/env:Envelope/env:Body/trust:RequestSecurityTokenResponseCollection/trust:RequestSecurityTokenResponse/trust:RequestedProofToken/trust:BinarySecret/text()");
        lifeTimeCreatedSelector = xpath.compile("/env:Envelope/env:Body/trust:RequestSecurityTokenResponseCollection/trust:RequestSecurityTokenResponse/trust:Lifetime/u:Created/text()");
        lifeTimeExpiresSelector = xpath.compile("/env:Envelope/env:Body/trust:RequestSecurityTokenResponseCollection/trust:RequestSecurityTokenResponse/trust:Lifetime/u:Expires/text()");
        appliesToSelector = xpath.compile("/env:Envelope/env:Body/trust:RequestSecurityTokenResponseCollection/trust:RequestSecurityTokenResponse/wsp:AppliesTo/a:EndpointReference/a:Address/text()");
        tokenSelector = xpath.compile("/env:Envelope/env:Body/trust:RequestSecurityTokenResponseCollection/trust:RequestSecurityTokenResponse/trust:RequestedSecurityToken/xenc:EncryptedData");
        tokenReferenceSelector = xpath.compile("/env:Envelope/env:Body/trust:RequestSecurityTokenResponseCollection/trust:RequestSecurityTokenResponse/trust:RequestedAttachedReference/s:SecurityTokenReference");
    }

    public XPathExpression getProofTokenSecretSelector() {
        return proofTokenSecretSelector;
    }

    public XPathExpression getLifeTimeCreatedSelector() {
        return lifeTimeCreatedSelector;
    }

    public XPathExpression getLifeTimeExpiresSelector() {
        return lifeTimeExpiresSelector;
    }

    public XPathExpression getAppliesToSelector() {
        return appliesToSelector;
    }

    public XPathExpression getTokenSelector() {
        return tokenSelector;
    }

    public XPathExpression getTokenReferenceSelector() {
        return tokenReferenceSelector;
    }
}
