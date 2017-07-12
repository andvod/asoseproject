
package eu.chorevolution.farmbusinessstartup.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for farmSiteInspectionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="farmSiteInspectionResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="siteInspectionVerbal" type="{http://eu.chorevolution.farmbusinessstartup/cdclient}veterinarySiteInspectionDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "farmSiteInspectionResponse", propOrder = {
    "siteInspectionVerbal"
})
public class FarmSiteInspectionResponse {

    @XmlElement(required = true)
    protected VeterinarySiteInspectionDetails siteInspectionVerbal;

    /**
     * Gets the value of the siteInspectionVerbal property.
     * 
     * @return
     *     possible object is
     *     {@link VeterinarySiteInspectionDetails }
     *     
     */
    public VeterinarySiteInspectionDetails getSiteInspectionVerbal() {
        return siteInspectionVerbal;
    }

    /**
     * Sets the value of the siteInspectionVerbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link VeterinarySiteInspectionDetails }
     *     
     */
    public void setSiteInspectionVerbal(VeterinarySiteInspectionDetails value) {
        this.siteInspectionVerbal = value;
    }

}
