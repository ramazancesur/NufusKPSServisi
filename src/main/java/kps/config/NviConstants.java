package kps.config;

import kps.test.helper.NviNamespaces;

import javax.xml.namespace.QName;

/**
 * Created by ramazancesur on 25/08/2017.
 */
public class NviConstants {

    public final static String CST_RST_ISSUE_ACTION = "http://docs.oasis-open.org/ws-sx/ws-trust/200512/RST/Issue";
    public final static String CST_TRUST_ISSUE = "http://docs.oasis-open.org/ws-sx/ws-trust/200512/Issue";
    public final static String CST_PASSWORD_TYPE = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText";
    public final static String CST_ALGORITHM_C14N = "http://www.w3.org/2001/10/xml-exc-c14n#";
    public final static String CST_ALGORITHM_HMAC_SHA1 = "http://www.w3.org/2000/09/xmldsig#hmac-sha1";
    public final static String CST_ALGORITHM_SHA1 = "http://www.w3.org/2000/09/xmldsig#sha1";
    public final static String CST_ANONYMOUS_ADDRESS = "http://www.w3.org/2005/08/addressing/anonymous";

    public final static String TAG_ACTION = "Action";
    public final static String TAG_MESSAGE_ID = "MessageID";
    public final static String TAG_REPLY_TO = "ReplyTo";
    public final static String TAG_ADDRESS = "Address";
    public final static String TAG_TO = "To";
    public final static String TAG_SECURITY = "Security";
    public final static String TAG_TIMESTAMP = "Timestamp";
    public final static String TAG_TIMESTAMP_CREATED = "Created";
    public final static String TAG_TIMESTAMP_EXPIRES = "Expires";
    public final static String TAG_USERNAMETOKEN = "UsernameToken";
    public final static String TAG_USERNAME = "Username";
    public final static String TAG_PASSWORD = "Password";
    public final static String TAG_SIGNATURE = "Signature";
    public final static String TAG_SIGNEDINFO = "SignedInfo";
    public final static String TAG_CANONALIZATION_METHOD = "CanonicalizationMethod";
    public final static String TAG_SIGNATURE_METHOD = "SignatureMethod";
    public final static String TAG_REFERENCE = "Reference";
    public final static String TAG_TRANSFORMS = "Transforms";
    public final static String TAG_TRANSFORM = "Transform";
    public final static String TAG_DIGEST_METHOD = "DigestMethod";
    public final static String TAG_DIGEST_VALUE = "DigestValue";
    public final static String TAG_SIGNATURE_VALUE = "SignatureValue";
    public final static String TAG_KEY_INFO = "KeyInfo";

    public final static String ATT_MUSTUNDERSTAND = "mustUnderstand";
    public final static String ATT_TYPE = "Type";
    public final static String ATT_ID = "Id";
    public final static String ATT_URI = "URI";
    public final static String ATT_ALGORITHM = "Algorithm";

    public final static String TAG_REQUEST_SECURITY_TOKEN = "RequestSecurityToken";
    public final static String TAG_APPLIES_TO = "AppliesTo";
    public final static String TAG_ENDPOINT_REFERENCE = "EndpointReference";
    public final static String TAG_REQUEST_TYPE = "RequestType";

    public final static String TOKEN_USER_NAME = "TokenUserName";
    public final static String TOKEN_USER_PASSWORD = "TokenPassword";
    public final static String TOKEN_ENDPOINT_URI = "TokenEndPoint";
    public final static String TOKEN_APPLIESTO = "TokenAppliesTo";

    public final static QName ATT_MUSTUNDERSTAND_NAME = new QName(NviNamespaces.NS_ENVELOPE, ATT_MUSTUNDERSTAND, NviNamespaces.NS_ENVELOPE_PREFIX);
    public final static QName ATT_PASSWORDTYPE_NAME = new QName(NviNamespaces.NS_SECURITY, ATT_TYPE, NviNamespaces.NS_SECURITY_PREFIX);
    public final static QName ATT_TIMESTAMP_ID = new QName(NviNamespaces.NS_SECURITY_UTIL, ATT_ID, NviNamespaces.NS_SECURITY_UTIL_PREFIX);

    private NviConstants() {

    }
}
