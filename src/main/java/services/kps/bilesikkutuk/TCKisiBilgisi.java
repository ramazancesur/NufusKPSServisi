
package services.kps.bilesikkutuk;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TCKisiBilgisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TCKisiBilgisi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AnneTCKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AnneUstSoyBulunamadi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BabaTCKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="BabaUstSoyBulunamadi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DogumYerKod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DurumBilgisi" type="{http://kps.nvi.gov.tr/2011/01/01}TCKisiDurumBilgisi" minOccurs="0"/>
 *         &lt;element name="EsTCKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="HataBilgisi" type="{http://kps.nvi.gov.tr/2011/01/01}Parametre" minOccurs="0"/>
 *         &lt;element name="KayitYeriBilgisi" type="{http://kps.nvi.gov.tr/2011/01/01}TCKisiKayitYeriBilgisi" minOccurs="0"/>
 *         &lt;element name="TCKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TemelBilgisi" type="{http://kps.nvi.gov.tr/2011/01/01}TCKisiTemelBilgisi" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCKisiBilgisi", propOrder = {
    "anneTCKimlikNo",
    "anneUstSoyBulunamadi",
    "babaTCKimlikNo",
    "babaUstSoyBulunamadi",
    "dogumYerKod",
    "durumBilgisi",
    "esTCKimlikNo",
    "hataBilgisi",
    "kayitYeriBilgisi",
    "tcKimlikNo",
    "temelBilgisi"
})
public class TCKisiBilgisi {

    @XmlElementRef(name = "AnneTCKimlikNo", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> anneTCKimlikNo;
    @XmlElementRef(name = "AnneUstSoyBulunamadi", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> anneUstSoyBulunamadi;
    @XmlElementRef(name = "BabaTCKimlikNo", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> babaTCKimlikNo;
    @XmlElementRef(name = "BabaUstSoyBulunamadi", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> babaUstSoyBulunamadi;
    @XmlElementRef(name = "DogumYerKod", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dogumYerKod;
    @XmlElementRef(name = "DurumBilgisi", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<TCKisiDurumBilgisi> durumBilgisi;
    @XmlElementRef(name = "EsTCKimlikNo", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> esTCKimlikNo;
    @XmlElementRef(name = "HataBilgisi", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Parametre> hataBilgisi;
    @XmlElementRef(name = "KayitYeriBilgisi", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<TCKisiKayitYeriBilgisi> kayitYeriBilgisi;
    @XmlElementRef(name = "TCKimlikNo", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> tcKimlikNo;
    @XmlElementRef(name = "TemelBilgisi", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<TCKisiTemelBilgisi> temelBilgisi;

    /**
     * Gets the value of the anneTCKimlikNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getAnneTCKimlikNo() {
        return anneTCKimlikNo;
    }

    /**
     * Sets the value of the anneTCKimlikNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setAnneTCKimlikNo(JAXBElement<Long> value) {
        this.anneTCKimlikNo = value;
    }

    /**
     * Gets the value of the anneUstSoyBulunamadi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAnneUstSoyBulunamadi() {
        return anneUstSoyBulunamadi;
    }

    /**
     * Sets the value of the anneUstSoyBulunamadi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAnneUstSoyBulunamadi(JAXBElement<Boolean> value) {
        this.anneUstSoyBulunamadi = value;
    }

    /**
     * Gets the value of the babaTCKimlikNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getBabaTCKimlikNo() {
        return babaTCKimlikNo;
    }

    /**
     * Sets the value of the babaTCKimlikNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setBabaTCKimlikNo(JAXBElement<Long> value) {
        this.babaTCKimlikNo = value;
    }

    /**
     * Gets the value of the babaUstSoyBulunamadi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getBabaUstSoyBulunamadi() {
        return babaUstSoyBulunamadi;
    }

    /**
     * Sets the value of the babaUstSoyBulunamadi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setBabaUstSoyBulunamadi(JAXBElement<Boolean> value) {
        this.babaUstSoyBulunamadi = value;
    }

    /**
     * Gets the value of the dogumYerKod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDogumYerKod() {
        return dogumYerKod;
    }

    /**
     * Sets the value of the dogumYerKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDogumYerKod(JAXBElement<Integer> value) {
        this.dogumYerKod = value;
    }

    /**
     * Gets the value of the durumBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TCKisiDurumBilgisi }{@code >}
     *     
     */
    public JAXBElement<TCKisiDurumBilgisi> getDurumBilgisi() {
        return durumBilgisi;
    }

    /**
     * Sets the value of the durumBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TCKisiDurumBilgisi }{@code >}
     *     
     */
    public void setDurumBilgisi(JAXBElement<TCKisiDurumBilgisi> value) {
        this.durumBilgisi = value;
    }

    /**
     * Gets the value of the esTCKimlikNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getEsTCKimlikNo() {
        return esTCKimlikNo;
    }

    /**
     * Sets the value of the esTCKimlikNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setEsTCKimlikNo(JAXBElement<Long> value) {
        this.esTCKimlikNo = value;
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
     * Gets the value of the kayitYeriBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TCKisiKayitYeriBilgisi }{@code >}
     *     
     */
    public JAXBElement<TCKisiKayitYeriBilgisi> getKayitYeriBilgisi() {
        return kayitYeriBilgisi;
    }

    /**
     * Sets the value of the kayitYeriBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TCKisiKayitYeriBilgisi }{@code >}
     *     
     */
    public void setKayitYeriBilgisi(JAXBElement<TCKisiKayitYeriBilgisi> value) {
        this.kayitYeriBilgisi = value;
    }

    /**
     * Gets the value of the tcKimlikNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTCKimlikNo() {
        return tcKimlikNo;
    }

    /**
     * Sets the value of the tcKimlikNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTCKimlikNo(JAXBElement<Long> value) {
        this.tcKimlikNo = value;
    }

    /**
     * Gets the value of the temelBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TCKisiTemelBilgisi }{@code >}
     *     
     */
    public JAXBElement<TCKisiTemelBilgisi> getTemelBilgisi() {
        return temelBilgisi;
    }

    /**
     * Sets the value of the temelBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TCKisiTemelBilgisi }{@code >}
     *     
     */
    public void setTemelBilgisi(JAXBElement<TCKisiTemelBilgisi> value) {
        this.temelBilgisi = value;
    }

}
