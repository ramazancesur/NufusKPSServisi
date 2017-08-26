
package services.kps.bilesikkutuk;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TCVatandasiKisiKutukleri complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TCVatandasiKisiKutukleri">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GeciciKimlikBilgisi" type="{http://kps.nvi.gov.tr/2017/08/01}TCGeciciKimlikBilgisi" minOccurs="0"/>
 *         &lt;element name="HataBilgisi" type="{http://kps.nvi.gov.tr/2011/01/01}Parametre" minOccurs="0"/>
 *         &lt;element name="KisiBilgisi" type="{http://kps.nvi.gov.tr/2017/08/01}TCKisiBilgisi" minOccurs="0"/>
 *         &lt;element name="NufusCuzdaniBilgisi" type="{http://kps.nvi.gov.tr/2017/08/01}TCCuzdanBilgisi" minOccurs="0"/>
 *         &lt;element name="TCKKBilgisi" type="{http://kps.nvi.gov.tr/2017/08/01}TCKK" minOccurs="0"/>
 *         &lt;element name="TCKKFotografBilgisi" type="{http://kps.nvi.gov.tr/2017/08/01}TCKKFotoBilgisi" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCVatandasiKisiKutukleri", propOrder = {
    "geciciKimlikBilgisi",
    "hataBilgisi",
    "kisiBilgisi",
    "nufusCuzdaniBilgisi",
    "tckkBilgisi",
    "tckkFotografBilgisi"
})
public class TCVatandasiKisiKutukleri {

    @XmlElementRef(name = "GeciciKimlikBilgisi", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<TCGeciciKimlikBilgisi> geciciKimlikBilgisi;
    @XmlElementRef(name = "HataBilgisi", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Parametre> hataBilgisi;
    @XmlElementRef(name = "KisiBilgisi", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<TCKisiBilgisi> kisiBilgisi;
    @XmlElementRef(name = "NufusCuzdaniBilgisi", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<TCCuzdanBilgisi> nufusCuzdaniBilgisi;
    @XmlElementRef(name = "TCKKBilgisi", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<TCKK> tckkBilgisi;
    @XmlElementRef(name = "TCKKFotografBilgisi", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<TCKKFotoBilgisi> tckkFotografBilgisi;

    /**
     * Gets the value of the geciciKimlikBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TCGeciciKimlikBilgisi }{@code >}
     *     
     */
    public JAXBElement<TCGeciciKimlikBilgisi> getGeciciKimlikBilgisi() {
        return geciciKimlikBilgisi;
    }

    /**
     * Sets the value of the geciciKimlikBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TCGeciciKimlikBilgisi }{@code >}
     *     
     */
    public void setGeciciKimlikBilgisi(JAXBElement<TCGeciciKimlikBilgisi> value) {
        this.geciciKimlikBilgisi = value;
    }

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
     *     {@link JAXBElement }{@code <}{@link TCKisiBilgisi }{@code >}
     *     
     */
    public JAXBElement<TCKisiBilgisi> getKisiBilgisi() {
        return kisiBilgisi;
    }

    /**
     * Sets the value of the kisiBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TCKisiBilgisi }{@code >}
     *     
     */
    public void setKisiBilgisi(JAXBElement<TCKisiBilgisi> value) {
        this.kisiBilgisi = value;
    }

    /**
     * Gets the value of the nufusCuzdaniBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TCCuzdanBilgisi }{@code >}
     *     
     */
    public JAXBElement<TCCuzdanBilgisi> getNufusCuzdaniBilgisi() {
        return nufusCuzdaniBilgisi;
    }

    /**
     * Sets the value of the nufusCuzdaniBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TCCuzdanBilgisi }{@code >}
     *     
     */
    public void setNufusCuzdaniBilgisi(JAXBElement<TCCuzdanBilgisi> value) {
        this.nufusCuzdaniBilgisi = value;
    }

    /**
     * Gets the value of the tckkBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TCKK }{@code >}
     *     
     */
    public JAXBElement<TCKK> getTCKKBilgisi() {
        return tckkBilgisi;
    }

    /**
     * Sets the value of the tckkBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TCKK }{@code >}
     *     
     */
    public void setTCKKBilgisi(JAXBElement<TCKK> value) {
        this.tckkBilgisi = value;
    }

    /**
     * Gets the value of the tckkFotografBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TCKKFotoBilgisi }{@code >}
     *     
     */
    public JAXBElement<TCKKFotoBilgisi> getTCKKFotografBilgisi() {
        return tckkFotografBilgisi;
    }

    /**
     * Sets the value of the tckkFotografBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TCKKFotoBilgisi }{@code >}
     *     
     */
    public void setTCKKFotografBilgisi(JAXBElement<TCKKFotoBilgisi> value) {
        this.tckkFotografBilgisi = value;
    }

}
