
package services.kps.bilesikkutuk;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for YabanciKisiBilgisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="YabanciKisiBilgisi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AnneKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="BabaKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="BitisTarihiBelirsizOlmaNeden" type="{http://kps.nvi.gov.tr/2011/01/01}Parametre" minOccurs="0"/>
 *         &lt;element name="DogumTarih" type="{http://kps.nvi.gov.tr/2011/01/01}TarihBilgisi" minOccurs="0"/>
 *         &lt;element name="DogumYerKod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DurumBilgisi" type="{http://kps.nvi.gov.tr/2011/01/01}YabanciKisiDurumBilgisi" minOccurs="0"/>
 *         &lt;element name="EsKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="GercekKisiKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="HataBilgisi" type="{http://kps.nvi.gov.tr/2011/01/01}Parametre" minOccurs="0"/>
 *         &lt;element name="IzinBaslangicTarih" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="IzinBitisTarih" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="IzinDuzenlenenIl" type="{http://kps.nvi.gov.tr/2011/01/01}Parametre" minOccurs="0"/>
 *         &lt;element name="IzinNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KaynakBirim" type="{http://kps.nvi.gov.tr/2011/01/01}Parametre" minOccurs="0"/>
 *         &lt;element name="KazanilanTCKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="KimlikNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OlumTarih" type="{http://kps.nvi.gov.tr/2011/01/01}TarihBilgisi" minOccurs="0"/>
 *         &lt;element name="TemelBilgisi" type="{http://kps.nvi.gov.tr/2011/01/01}YabanciKisiTemelBilgisi" minOccurs="0"/>
 *         &lt;element name="Uyruk" type="{http://kps.nvi.gov.tr/2011/01/01}Parametre" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "YabanciKisiBilgisi", propOrder = {
    "anneKimlikNo",
    "babaKimlikNo",
    "bitisTarihiBelirsizOlmaNeden",
    "dogumTarih",
    "dogumYerKod",
    "durumBilgisi",
    "esKimlikNo",
    "gercekKisiKimlikNo",
    "hataBilgisi",
    "izinBaslangicTarih",
    "izinBitisTarih",
    "izinDuzenlenenIl",
    "izinNo",
    "kaynakBirim",
    "kazanilanTCKimlikNo",
    "kimlikNo",
    "olumTarih",
    "temelBilgisi",
    "uyruk"
})
public class YabanciKisiBilgisi {

    @XmlElementRef(name = "AnneKimlikNo", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> anneKimlikNo;
    @XmlElementRef(name = "BabaKimlikNo", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> babaKimlikNo;
    @XmlElementRef(name = "BitisTarihiBelirsizOlmaNeden", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Parametre> bitisTarihiBelirsizOlmaNeden;
    @XmlElementRef(name = "DogumTarih", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<TarihBilgisi> dogumTarih;
    @XmlElementRef(name = "DogumYerKod", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dogumYerKod;
    @XmlElementRef(name = "DurumBilgisi", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<YabanciKisiDurumBilgisi> durumBilgisi;
    @XmlElementRef(name = "EsKimlikNo", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> esKimlikNo;
    @XmlElementRef(name = "GercekKisiKimlikNo", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> gercekKisiKimlikNo;
    @XmlElementRef(name = "HataBilgisi", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Parametre> hataBilgisi;
    @XmlElementRef(name = "IzinBaslangicTarih", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> izinBaslangicTarih;
    @XmlElementRef(name = "IzinBitisTarih", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> izinBitisTarih;
    @XmlElementRef(name = "IzinDuzenlenenIl", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Parametre> izinDuzenlenenIl;
    @XmlElementRef(name = "IzinNo", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> izinNo;
    @XmlElementRef(name = "KaynakBirim", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Parametre> kaynakBirim;
    @XmlElementRef(name = "KazanilanTCKimlikNo", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> kazanilanTCKimlikNo;
    @XmlElementRef(name = "KimlikNo", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> kimlikNo;
    @XmlElementRef(name = "OlumTarih", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<TarihBilgisi> olumTarih;
    @XmlElementRef(name = "TemelBilgisi", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<YabanciKisiTemelBilgisi> temelBilgisi;
    @XmlElementRef(name = "Uyruk", namespace = "http://kps.nvi.gov.tr/2017/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Parametre> uyruk;

    /**
     * Gets the value of the anneKimlikNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getAnneKimlikNo() {
        return anneKimlikNo;
    }

    /**
     * Sets the value of the anneKimlikNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setAnneKimlikNo(JAXBElement<Long> value) {
        this.anneKimlikNo = value;
    }

    /**
     * Gets the value of the babaKimlikNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getBabaKimlikNo() {
        return babaKimlikNo;
    }

    /**
     * Sets the value of the babaKimlikNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setBabaKimlikNo(JAXBElement<Long> value) {
        this.babaKimlikNo = value;
    }

    /**
     * Gets the value of the bitisTarihiBelirsizOlmaNeden property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Parametre }{@code >}
     *     
     */
    public JAXBElement<Parametre> getBitisTarihiBelirsizOlmaNeden() {
        return bitisTarihiBelirsizOlmaNeden;
    }

    /**
     * Sets the value of the bitisTarihiBelirsizOlmaNeden property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Parametre }{@code >}
     *     
     */
    public void setBitisTarihiBelirsizOlmaNeden(JAXBElement<Parametre> value) {
        this.bitisTarihiBelirsizOlmaNeden = value;
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
     *     {@link JAXBElement }{@code <}{@link YabanciKisiDurumBilgisi }{@code >}
     *     
     */
    public JAXBElement<YabanciKisiDurumBilgisi> getDurumBilgisi() {
        return durumBilgisi;
    }

    /**
     * Sets the value of the durumBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link YabanciKisiDurumBilgisi }{@code >}
     *     
     */
    public void setDurumBilgisi(JAXBElement<YabanciKisiDurumBilgisi> value) {
        this.durumBilgisi = value;
    }

    /**
     * Gets the value of the esKimlikNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getEsKimlikNo() {
        return esKimlikNo;
    }

    /**
     * Sets the value of the esKimlikNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setEsKimlikNo(JAXBElement<Long> value) {
        this.esKimlikNo = value;
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
     * Gets the value of the izinBaslangicTarih property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getIzinBaslangicTarih() {
        return izinBaslangicTarih;
    }

    /**
     * Sets the value of the izinBaslangicTarih property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setIzinBaslangicTarih(JAXBElement<XMLGregorianCalendar> value) {
        this.izinBaslangicTarih = value;
    }

    /**
     * Gets the value of the izinBitisTarih property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getIzinBitisTarih() {
        return izinBitisTarih;
    }

    /**
     * Sets the value of the izinBitisTarih property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setIzinBitisTarih(JAXBElement<XMLGregorianCalendar> value) {
        this.izinBitisTarih = value;
    }

    /**
     * Gets the value of the izinDuzenlenenIl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Parametre }{@code >}
     *     
     */
    public JAXBElement<Parametre> getIzinDuzenlenenIl() {
        return izinDuzenlenenIl;
    }

    /**
     * Sets the value of the izinDuzenlenenIl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Parametre }{@code >}
     *     
     */
    public void setIzinDuzenlenenIl(JAXBElement<Parametre> value) {
        this.izinDuzenlenenIl = value;
    }

    /**
     * Gets the value of the izinNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIzinNo() {
        return izinNo;
    }

    /**
     * Sets the value of the izinNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIzinNo(JAXBElement<String> value) {
        this.izinNo = value;
    }

    /**
     * Gets the value of the kaynakBirim property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Parametre }{@code >}
     *     
     */
    public JAXBElement<Parametre> getKaynakBirim() {
        return kaynakBirim;
    }

    /**
     * Sets the value of the kaynakBirim property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Parametre }{@code >}
     *     
     */
    public void setKaynakBirim(JAXBElement<Parametre> value) {
        this.kaynakBirim = value;
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
     * Gets the value of the olumTarih property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TarihBilgisi }{@code >}
     *     
     */
    public JAXBElement<TarihBilgisi> getOlumTarih() {
        return olumTarih;
    }

    /**
     * Sets the value of the olumTarih property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TarihBilgisi }{@code >}
     *     
     */
    public void setOlumTarih(JAXBElement<TarihBilgisi> value) {
        this.olumTarih = value;
    }

    /**
     * Gets the value of the temelBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link YabanciKisiTemelBilgisi }{@code >}
     *     
     */
    public JAXBElement<YabanciKisiTemelBilgisi> getTemelBilgisi() {
        return temelBilgisi;
    }

    /**
     * Sets the value of the temelBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link YabanciKisiTemelBilgisi }{@code >}
     *     
     */
    public void setTemelBilgisi(JAXBElement<YabanciKisiTemelBilgisi> value) {
        this.temelBilgisi = value;
    }

    /**
     * Gets the value of the uyruk property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Parametre }{@code >}
     *     
     */
    public JAXBElement<Parametre> getUyruk() {
        return uyruk;
    }

    /**
     * Sets the value of the uyruk property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Parametre }{@code >}
     *     
     */
    public void setUyruk(JAXBElement<Parametre> value) {
        this.uyruk = value;
    }

}
