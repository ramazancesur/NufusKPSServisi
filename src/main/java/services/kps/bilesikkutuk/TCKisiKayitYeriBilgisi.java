
package services.kps.bilesikkutuk;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TCKisiKayitYeriBilgisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TCKisiKayitYeriBilgisi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AileSiraNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BireySiraNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Cilt" type="{http://kps.nvi.gov.tr/2011/01/01}Parametre" minOccurs="0"/>
 *         &lt;element name="Il" type="{http://kps.nvi.gov.tr/2011/01/01}Parametre" minOccurs="0"/>
 *         &lt;element name="Ilce" type="{http://kps.nvi.gov.tr/2011/01/01}Parametre" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCKisiKayitYeriBilgisi", namespace = "http://kps.nvi.gov.tr/2011/01/01", propOrder = {
    "aileSiraNo",
    "bireySiraNo",
    "cilt",
    "il",
    "ilce"
})
public class TCKisiKayitYeriBilgisi {

    @XmlElementRef(name = "AileSiraNo", namespace = "http://kps.nvi.gov.tr/2011/01/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> aileSiraNo;
    @XmlElementRef(name = "BireySiraNo", namespace = "http://kps.nvi.gov.tr/2011/01/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bireySiraNo;
    @XmlElementRef(name = "Cilt", namespace = "http://kps.nvi.gov.tr/2011/01/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Parametre> cilt;
    @XmlElementRef(name = "Il", namespace = "http://kps.nvi.gov.tr/2011/01/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Parametre> il;
    @XmlElementRef(name = "Ilce", namespace = "http://kps.nvi.gov.tr/2011/01/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Parametre> ilce;

    /**
     * Gets the value of the aileSiraNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAileSiraNo() {
        return aileSiraNo;
    }

    /**
     * Sets the value of the aileSiraNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAileSiraNo(JAXBElement<Integer> value) {
        this.aileSiraNo = value;
    }

    /**
     * Gets the value of the bireySiraNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBireySiraNo() {
        return bireySiraNo;
    }

    /**
     * Sets the value of the bireySiraNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBireySiraNo(JAXBElement<Integer> value) {
        this.bireySiraNo = value;
    }

    /**
     * Gets the value of the cilt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Parametre }{@code >}
     *     
     */
    public JAXBElement<Parametre> getCilt() {
        return cilt;
    }

    /**
     * Sets the value of the cilt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Parametre }{@code >}
     *     
     */
    public void setCilt(JAXBElement<Parametre> value) {
        this.cilt = value;
    }

    /**
     * Gets the value of the il property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Parametre }{@code >}
     *     
     */
    public JAXBElement<Parametre> getIl() {
        return il;
    }

    /**
     * Sets the value of the il property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Parametre }{@code >}
     *     
     */
    public void setIl(JAXBElement<Parametre> value) {
        this.il = value;
    }

    /**
     * Gets the value of the ilce property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Parametre }{@code >}
     *     
     */
    public JAXBElement<Parametre> getIlce() {
        return ilce;
    }

    /**
     * Sets the value of the ilce property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Parametre }{@code >}
     *     
     */
    public void setIlce(JAXBElement<Parametre> value) {
        this.ilce = value;
    }

}
