
package eu.chorevolution.farmbusinessstartup.provider.veterinary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for farmOpeningNotification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="farmOpeningNotification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="farmOpeningRequestForm" type="{http://eu.chorevolution.farmbusinessstartup/veterinary}farmBusinessStartupRequestFormDetails"/&gt;
 *         &lt;element name="siteInspectionDetails" type="{http://eu.chorevolution.farmbusinessstartup/veterinary}veterinarySiteInspectionDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "farmOpeningNotification", propOrder = {
    "farmOpeningRequestForm",
    "siteInspectionDetails"
})
public class FarmOpeningNotification {

    @XmlElement(required = true)
    protected FarmBusinessStartupRequestFormDetails farmOpeningRequestForm;
    @XmlElement(required = true)
    protected VeterinarySiteInspectionDetails siteInspectionDetails;

    /**
     * Gets the value of the farmOpeningRequestForm property.
     * 
     * @return
     *     possible object is
     *     {@link FarmBusinessStartupRequestFormDetails }
     *     
     */
    public FarmBusinessStartupRequestFormDetails getFarmOpeningRequestForm() {
        return farmOpeningRequestForm;
    }

    /**
     * Sets the value of the farmOpeningRequestForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FarmBusinessStartupRequestFormDetails }
     *     
     */
    public void setFarmOpeningRequestForm(FarmBusinessStartupRequestFormDetails value) {
        this.farmOpeningRequestForm = value;
    }

    /**
     * Gets the value of the siteInspectionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link VeterinarySiteInspectionDetails }
     *     
     */
    public VeterinarySiteInspectionDetails getSiteInspectionDetails() {
        return siteInspectionDetails;
    }

    /**
     * Sets the value of the siteInspectionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link VeterinarySiteInspectionDetails }
     *     
     */
    public void setSiteInspectionDetails(VeterinarySiteInspectionDetails value) {
        this.siteInspectionDetails = value;
    }

}
