
package eu.chorevolution.farmbusinessstartup.provider.veterinaryregionalregister;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for farmRegistrationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="farmRegistrationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="owner" type="{http://eu.chorevolution.farmbusinessstartup/services/veterinaryregionalregister}personData"/&gt;
 *         &lt;element name="farm" type="{http://eu.chorevolution.farmbusinessstartup/services/veterinaryregionalregister}farmDetails"/&gt;
 *         &lt;element name="siteInspectionDetails" type="{http://eu.chorevolution.farmbusinessstartup/services/veterinaryregionalregister}veterinarySiteInspectionDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "farmRegistrationRequest", propOrder = {
    "owner",
    "farm",
    "siteInspectionDetails"
})
public class FarmRegistrationRequest {

    @XmlElement(required = true)
    protected PersonData owner;
    @XmlElement(required = true)
    protected FarmDetails farm;
    @XmlElement(required = true)
    protected VeterinarySiteInspectionDetails siteInspectionDetails;

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link PersonData }
     *     
     */
    public PersonData getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonData }
     *     
     */
    public void setOwner(PersonData value) {
        this.owner = value;
    }

    /**
     * Gets the value of the farm property.
     * 
     * @return
     *     possible object is
     *     {@link FarmDetails }
     *     
     */
    public FarmDetails getFarm() {
        return farm;
    }

    /**
     * Sets the value of the farm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FarmDetails }
     *     
     */
    public void setFarm(FarmDetails value) {
        this.farm = value;
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
