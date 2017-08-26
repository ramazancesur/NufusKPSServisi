
package services.kps.bilesikkutuk;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for YabanciKisiKutukleri complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="YabanciKisiKutukleri">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HataBilgisi" type="{http://kps.nvi.gov.tr/2011/01/01}Parametre" minOccurs="0"/>
 *         &lt;element name="KisiBilgisi" type="{http://kps.nvi.gov.tr/2017/08/01}YabanciKisiBilgisi" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "YabanciKisiKutukleri", propOrder = {
    "hataBilgisi",
    "kisiBilgisi"
})
public class YabanciKisiKutukleri {

    @XmlElementRef(name = "HataBilgisi", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Parametre> hataBilgisi;
    @XmlElementRef(name = "KisiBilgisi", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<YabanciKisiBilgisi> kisiBilgisi;

    /**
     * Gets the value of the hataBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Parametre }{@code >}
     *     
     */
    public JAXBElement<Parametre> getHataBilgisi() {
        return hataBilgisi;
    }

    /**
     * Sets the value of the hataBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Parametre }{@code >}
     *     
     */
    public void setHataBilgisi(JAXBElement<Parametre> value) {
        this.hataBilgisi = value;
    }

    /**
     * Gets the value of the kisiBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link YabanciKisiBilgisi }{@code >}
     *     
     */
    public JAXBElement<YabanciKisiBilgisi> getKisiBilgisi() {
        return kisiBilgisi;
    }

    /**
     * Sets the value of the kisiBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link YabanciKisiBilgisi }{@code >}
     *     
     */
    public void setKisiBilgisi(JAXBElement<YabanciKisiBilgisi> value) {
        this.kisiBilgisi = value;
    }

}
