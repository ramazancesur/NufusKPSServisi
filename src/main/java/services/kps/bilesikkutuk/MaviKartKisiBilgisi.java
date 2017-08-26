
package services.kps.bilesikkutuk;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaviKartKisiBilgisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaviKartKisiBilgisi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AnneTCKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="BabaTCKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DogumYerKod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DurumBilgisi" type="{http://kps.nvi.gov.tr/2011/01/01}MaviKartKisiDurumBilgisi" minOccurs="0"/>
 *         &lt;element name="EsTCKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="GercekKisiKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="HataBilgisi" type="{http://kps.nvi.gov.tr/2011/01/01}Parametre" minOccurs="0"/>
 *         &lt;element name="KazanilanTCKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="KimlikNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TemelBilgisi" type="{http://kps.nvi.gov.tr/2011/01/01}MaviKartKisiTemelBilgisi" minOccurs="0"/>
 *         &lt;element name="Ulke" type="{http://kps.nvi.gov.tr/2011/01/01}Parametre" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaviKartKisiBilgisi", propOrder = {
    "anneTCKimlikNo",
    "babaTCKimlikNo",
    "dogumYerKod",
    "durumBilgisi",
    "esTCKimlikNo",
    "gercekKisiKimlikNo",
    "hataBilgisi",
    "kazanilanTCKimlikNo",
    "kimlikNo",
    "temelBilgisi",
    "ulke"
})
public class MaviKartKisiBilgisi {

    @XmlElementRef(name = "AnneTCKimlikNo", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> anneTCKimlikNo;
    @XmlElementRef(name = "BabaTCKimlikNo", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> babaTCKimlikNo;
    @XmlElementRef(name = "DogumYerKod", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dogumYerKod;
    @XmlElementRef(name = "DurumBilgisi", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<MaviKartKisiDurumBilgisi> durumBilgisi;
    @XmlElementRef(name = "EsTCKimlikNo", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> esTCKimlikNo;
    @XmlElementRef(name = "GercekKisiKimlikNo", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> gercekKisiKimlikNo;
    @XmlElementRef(name = "HataBilgisi", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Parametre> hataBilgisi;
    @XmlElementRef(name = "KazanilanTCKimlikNo", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> kazanilanTCKimlikNo;
    @XmlElementRef(name = "KimlikNo", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> kimlikNo;
    @XmlElementRef(name = "TemelBilgisi", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<MaviKartKisiTemelBilgisi> temelBilgisi;
    @XmlElementRef(name = "Ulke", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Parametre> ulke;

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
     *     {@link JAXBElement }{@code <}{@link MaviKartKisiDurumBilgisi }{@code >}
     *     
     */
    public JAXBElement<MaviKartKisiDurumBilgisi> getDurumBilgisi() {
        return durumBilgisi;
    }

    /**
     * Sets the value of the durumBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MaviKartKisiDurumBilgisi }{@code >}
     *     
     */
    public void setDurumBilgisi(JAXBElement<MaviKartKisiDurumBilgisi> value) {
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
     * Gets the value of the gercekKisiKimlikNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getGercekKisiKimlikNo() {
        return gercekKisiKimlikNo;
    }

    /**
     * Sets the value of the gercekKisiKimlikNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setGercekKisiKimlikNo(JAXBElement<Long> value) {
        this.gercekKisiKimlikNo = value;
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
     * Gets the value of the kazanilanTCKimlikNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getKazanilanTCKimlikNo() {
        return kazanilanTCKimlikNo;
    }

    /**
     * Sets the value of the kazanilanTCKimlikNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setKazanilanTCKimlikNo(JAXBElement<Long> value) {
        this.kazanilanTCKimlikNo = value;
    }

    /**
     * Gets the value of the kimlikNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getKimlikNo() {
        return kimlikNo;
    }

    /**
     * Sets the value of the kimlikNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setKimlikNo(JAXBElement<Long> value) {
        this.kimlikNo = value;
    }

    /**
     * Gets the value of the temelBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MaviKartKisiTemelBilgisi }{@code >}
     *     
     */
    public JAXBElement<MaviKartKisiTemelBilgisi> getTemelBilgisi() {
        return temelBilgisi;
    }

    /**
     * Sets the value of the temelBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MaviKartKisiTemelBilgisi }{@code >}
     *     
     */
    public void setTemelBilgisi(JAXBElement<MaviKartKisiTemelBilgisi> value) {
        this.temelBilgisi = value;
    }

    /**
     * Gets the value of the ulke property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Parametre }{@code >}
     *     
     */
    public JAXBElement<Parametre> getUlke() {
        return ulke;
    }

    /**
     * Sets the value of the ulke property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Parametre }{@code >}
     *     
     */
    public void setUlke(JAXBElement<Parametre> value) {
        this.ulke = value;
    }

}
