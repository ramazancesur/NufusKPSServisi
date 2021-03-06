
package services.kps.bilesikkutuk;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BilesikKutukSorgulaKimlikNoServis", targetNamespace = "http://kps.nvi.gov.tr/2017/08/01")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BilesikKutukSorgulaKimlikNoServis {


    /**
     * 
     * @param kriterListesi
     * @return
     *     returns services.kps.bilesikkutuk.BilesikKutukBilgileriSonucu
     */
    @WebMethod(operationName = "Sorgula", action = "http://kps.nvi.gov.tr/2017/08/01/BilesikKutukSorgulaKimlikNoServis/Sorgula")
    @WebResult(name = "SorgulaResult", targetNamespace = "http://kps.nvi.gov.tr/2017/08/01")
    @RequestWrapper(localName = "Sorgula", targetNamespace = "http://kps.nvi.gov.tr/2017/08/01", className = "services.kps.bilesikkutuk.Sorgula")
    @ResponseWrapper(localName = "SorgulaResponse", targetNamespace = "http://kps.nvi.gov.tr/2017/08/01", className = "services.kps.bilesikkutuk.SorgulaResponse")
    public BilesikKutukBilgileriSonucu sorgula(
        @WebParam(name = "kriterListesi", targetNamespace = "http://kps.nvi.gov.tr/2017/08/01")
        ArrayOfBilesikKutukSorgulaKimlikNoSorguKriteri kriterListesi);

}
