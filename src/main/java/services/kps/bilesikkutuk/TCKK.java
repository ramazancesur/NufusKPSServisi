
package services.kps.bilesikkutuk;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TCKK complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TCKK">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnneAd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BabaAd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cinsiyet" type="{http://kps.nvi.gov.tr/2011/01/01}Parametre" minOccurs="0"/>
 *         &lt;element name="DogumTarih" type="{http://kps.nvi.gov.tr/2011/01/01}TarihBilgisi" minOccurs="0"/>
 *         &lt;element name="HataBilgisi" type="{http://kps.nvi.gov.tr/2011/01/01}Parametre" minOccurs="0"/>
 *         &lt;element name="KanGrubu" type="{http://kps.nvi.gov.tr/2011/01/01}Parametre" minOccurs="0"/>
 *         &lt;element name="SeriNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SonGecerlilikTarih" type="{http://kps.nvi.gov.tr/2011/01/01}TarihBilgisi" minOccurs="0"/>
 *         &lt;element name="Soyad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TCKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="VerenMakam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCKK", propOrder = {
    "ad",
    "anneAd",
    "babaAd",
    "cinsiyet",
    "dogumTarih",
    "hataBilgisi",
    "kanGrubu",
    "seriNo",
    "sonGecerlilikTarih",
    "soyad",
    "tcKimlikNo",
    "verenMakam"
})
public class TCKK {

    @XmlElementRef(name = "Ad", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ad;
    @XmlElementRef(name = "AnneAd", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> anneAd;
    @XmlElementRef(name = "BabaAd", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> babaAd;
    @XmlElementRef(name = "Cinsiyet", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Parametre> cinsiyet;
    @XmlElementRef(name = "DogumTarih", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<TarihBilgisi> dogumTarih;
    @XmlElementRef(name = "HataBilgisi", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Parametre> hataBilgisi;
    @XmlElementRef(name = "KanGrubu", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Parametre> kanGrubu;
    @XmlElementRef(name = "SeriNo", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> seriNo;
    @XmlElementRef(name = "SonGecerlilikTarih", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<TarihBilgisi> sonGecerlilikTarih;
    @XmlElementRef(name = "Soyad", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> soyad;
    @XmlElementRef(name = "TCKimlikNo", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> tcKimlikNo;
    @XmlElementRef(name = "VerenMakam", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> verenMakam;

    /**
     * Gets the value of the ad property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAd() {
        return ad;
    }

    /**
     * Sets the value of the ad property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAd(JAXBElement<String> value) {
        this.ad = value;
    }

    /**
     * Gets the value of the anneAd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAnneAd() {
        return anneAd;
    }

    /**
     * Sets the value of the anneAd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAnneAd(JAXBElement<String> value) {
        this.anneAd = value;
    }

    /**
     * Gets the value of the babaAd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBabaAd() {
        return babaAd;
    }

    /**
     * Sets the value of the babaAd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBabaAd(JAXBElement<String> value) {
        this.babaAd = value;
    }

    /**
     * Gets the value of the cinsiyet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Parametre }{@code >}
     *     
     */
    public JAXBElement<Parametre> getCinsiyet() {
        return cinsiyet;
    }

    /**
     * Sets the value of the cinsiyet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Parametre }{@code >}
     *     
     */
    public void setCinsiyet(JAXBElement<Parametre> value) {
        this.cinsiyet = value;
    }

    /**
     * Gets the value of the dogumTarih property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TarihBilgisi }{@code >}
     *     
     */
    public JAXBElement<TarihBilgisi> getDogumTarih() {
        return dogumTarih;
    }

    /**
     * Sets the value of the dogumTarih property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TarihBilgisi }{@code >}
     *     
     */
    public void setDogumTarih(JAXBElement<TarihBilgisi> value) {
        this.dogumTarih = value;
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
     * Gets the value of the kanGrubu property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Parametre }{@code >}
     *     
     */
    public JAXBElement<Parametre> getKanGrubu() {
        return kanGrubu;
    }

    /**
     * Sets the value of the kanGrubu property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Parametre }{@code >}
     *     
     */
    public void setKanGrubu(JAXBElement<Parametre> value) {
        this.kanGrubu = value;
    }

    /**
     * Gets the value of the seriNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSeriNo() {
        return seriNo;
    }

    /**
     * Sets the value of the seriNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSeriNo(JAXBElement<String> value) {
        this.seriNo = value;
    }

    /**
     * Gets the value of the sonGecerlilikTarih property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TarihBilgisi }{@code >}
     *     
     */
    public JAXBElement<TarihBilgisi> getSonGecerlilikTarih() {
        return sonGecerlilikTarih;
    }

    /**
     * Sets the value of the sonGecerlilikTarih property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TarihBilgisi }{@code >}
     *     
     */
    public void setSonGecerlilikTarih(JAXBElement<TarihBilgisi> value) {
        this.sonGecerlilikTarih = value;
    }

    /**
     * Gets the value of the soyad property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSoyad() {
        return soyad;
    }

    /**
     * Sets the value of the soyad property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSoyad(JAXBElement<String> value) {
        this.soyad = value;
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
     * Gets the value of the verenMakam property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVerenMakam() {
        return verenMakam;
    }

    /**
     * Sets the value of the verenMakam property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVerenMakam(JAXBElement<String> value) {
        this.verenMakam = value;
    }

}
