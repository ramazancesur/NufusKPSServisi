
package services.kps.bilesikkutuk;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SorgulaResult" type="{http://kps.nvi.gov.tr/2017/08/01}BilesikKutukBilgileriSonucu" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sorgulaResult"
})
@XmlRootElement(name = "SorgulaResponse")
public class SorgulaResponse {

    @XmlElementRef(name = "SorgulaResult", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<BilesikKutukBilgileriSonucu> sorgulaResult;

    /**
     * Gets the value of the sorgulaResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BilesikKutukBilgileriSonucu }{@code >}
     *     
     */
    public JAXBElement<BilesikKutukBilgileriSonucu> getSorgulaResult() {
        return sorgulaResult;
    }

    /**
     * Sets the value of the sorgulaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BilesikKutukBilgileriSonucu }{@code >}
     *     
     */
    public void setSorgulaResult(JAXBElement<BilesikKutukBilgileriSonucu> value) {
        this.sorgulaResult = value;
    }

}
