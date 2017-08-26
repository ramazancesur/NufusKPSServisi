package kps.config.utilities;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * Created by ramazancesur on 25/08/2017.
 */
public class Helper {


    private static DateFormatProvider dfProvider = new DateFormatProvider();

    public static String createTimeStamp() {
        return formatDate(new Date());
    }

    public static String formatDate(Date date) {
        return dfProvider.get().format(date);
    }

    public static Date parseDate(String text) throws ParseException {
        return dfProvider.get().parse(text);
    }

    public static byte[] createNonce() {
        return new SecureRandom().generateSeed(18);
    }

    public static byte[] decodeString(String input) {
        try {
            return input.getBytes("UTF-8");
        } catch (UnsupportedEncodingException ueEx) {
            ueEx.printStackTrace();
        }

        return null;
    }

    public static String encodeBytes(byte[] input) {
        return Base64.encodeBytes(input);
    }

    public static String transformDocumentToString(Document d) throws TransformerException {
        TransformerFactory transFactory = TransformerFactory.newInstance();
        Transformer transformer = transFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
        transformer.setOutputProperty(OutputKeys.INDENT, "no");

        StringWriter buffer = new StringWriter();

        transformer.transform(new DOMSource(d), new StreamResult(buffer));

        return buffer.toString();
    }

    public static Document transformStringToDocument(String str) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        factory.setNamespaceAware(true);

        DocumentBuilder builder = factory.newDocumentBuilder();

        Document doc = builder.parse(new InputSource(new StringReader(str)));

        return doc;
    }

    private static class DateFormatProvider extends ThreadLocal<DateFormat> {

        @Override
        protected DateFormat initialValue() {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            df.setTimeZone(TimeZone.getTimeZone("UTC"));
            return df;
        }
    }
}
