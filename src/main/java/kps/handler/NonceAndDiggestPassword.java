package kps.handler;

import org.apache.commons.codec.binary.Base64;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Date;


/**
 * Created by ramazancesur on 25/08/2017.
 */
public class NonceAndDiggestPassword {
    public static String buildNonce(Date date){
        String nonce="";
        try {
            SecureRandom random = java.security.SecureRandom.getInstance("SHA1PRNG");
            random.setSeed(date.getTime());
            byte[] nonceBytes = new byte[16];
            random.nextBytes(nonceBytes);
            nonce = new String(Base64.encodeBase64(nonceBytes), "UTF-8");

        }catch (Exception e){
            e.printStackTrace();
        }
        return  nonce;
    }

    public static  String buildDiggest(String password, String nonce, String dateTime){

        MessageDigest sha1;
        String passwordDigest=null;
        try {
            sha1= MessageDigest.getInstance("SHA-1");
            byte[] hash = MessageDigest.getInstance("SHA-1").digest(password.getBytes("UTF-8"));
            sha1.update(nonce.getBytes("UTF-8"));
            sha1.update(dateTime.getBytes("UTF-8"));
            passwordDigest = new String(Base64.encodeBase64(sha1.digest(hash)));
            sha1.reset();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return passwordDigest;
    }

}
