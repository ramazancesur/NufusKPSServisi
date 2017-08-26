package kps.config;

import kps.test.helper.NviNamespaces;

import javax.xml.namespace.NamespaceContext;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by ramazancesur on 25/08/2017.
 */
public class NviNamespaceContext implements NamespaceContext {

    public static final NviNamespaceContext Instance = new NviNamespaceContext();
    private Map<String, String> prefixToNamespaceMap = new HashMap<String, String>();
    private Map<String, String> namespaceToPrefixMap = new HashMap<String, String>();

    private NviNamespaceContext() {
        add(NviNamespaces.NS_ADDRESSING_PREFIX, NviNamespaces.NS_ADDRESSING);
        add(NviNamespaces.NS_ENVELOPE_PREFIX, NviNamespaces.NS_ENVELOPE);
        add(NviNamespaces.NS_POLICY_PREFIX, NviNamespaces.NS_POLICY);
        add(NviNamespaces.NS_SECURITY_PREFIX, NviNamespaces.NS_SECURITY);
        add(NviNamespaces.NS_SECURITY_UTIL_PREFIX, NviNamespaces.NS_SECURITY_UTIL);
        add(NviNamespaces.NS_TRUST_PREFIX, NviNamespaces.NS_TRUST);
        add(NviNamespaces.NS_XML_ENCRYPTION_PREFIX, NviNamespaces.NS_XML_ENCRYPTION);
    }

    private void add(String prefix, String namespace) {
        prefixToNamespaceMap.put(prefix, namespace);
        namespaceToPrefixMap.put(namespace, prefix);
    }

    public String getNamespaceURI(String prefix) {
        return prefixToNamespaceMap.get(prefix);
    }

    public String getPrefix(String namespaceURI) {
        return namespaceToPrefixMap.get(namespaceURI);
    }

    public Iterator<String> getPrefixes(String namespaceURI) {
        return null;
    }
}
