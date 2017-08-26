
package services.kps.bilesikkutuk;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBilesikKutukSorgulaKimlikNoSorguKriteri complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBilesikKutukSorgulaKimlikNoSorguKriteri">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BilesikKutukSorgulaKimlikNoSorguKriteri" type="{http://kps.nvi.gov.tr/2017/08/01}BilesikKutukSorgulaKimlikNoSorguKriteri" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBilesikKutukSorgulaKimlikNoSorguKriteri", propOrder = {
    "bilesikKutukSorgulaKimlikNoSorguKriteri"
})
public class ArrayOfBilesikKutukSorgulaKimlikNoSorguKriteri {

    @XmlElement(name = "BilesikKutukSorgulaKimlikNoSorguKriteri", nillable = true)
    protected List<BilesikKutukSorgulaKimlikNoSorguKriteri> bilesikKutukSorgulaKimlikNoSorguKriteri;

    /**
     * Gets the value of the bilesikKutukSorgulaKimlikNoSorguKriteri property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bilesikKutukSorgulaKimlikNoSorguKriteri property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBilesikKutukSorgulaKimlikNoSorguKriteri().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BilesikKutukSorgulaKimlikNoSorguKriteri }
     * 
     * 
     */
    public List<BilesikKutukSorgulaKimlikNoSorguKriteri> getBilesikKutukSorgulaKimlikNoSorguKriteri() {
        if (bilesikKutukSorgulaKimlikNoSorguKriteri == null) {
            bilesikKutukSorgulaKimlikNoSorguKriteri = new ArrayList<BilesikKutukSorgulaKimlikNoSorguKriteri>();
        }
        return this.bilesikKutukSorgulaKimlikNoSorguKriteri;
    }

}
