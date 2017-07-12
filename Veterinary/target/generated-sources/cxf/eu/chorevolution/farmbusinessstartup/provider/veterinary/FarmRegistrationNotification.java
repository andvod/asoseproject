
package eu.chorevolution.farmbusinessstartup.provider.veterinary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for farmRegistrationNotification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="farmRegistrationNotification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="farmCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="farmName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="siteAddress" type="{http://eu.chorevolution.farmbusinessstartup/veterinary}addressDetails"/&gt;
 *         &lt;element name="farmSurface" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="productionType" type="{http://eu.chorevolution.farmbusinessstartup/veterinary}productionTypology"/&gt;
 *         &lt;element name="breedingMethodologyType" type="{http://eu.chorevolution.farmbusinessstartup/veterinary}breedingMethodTypology"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "farmRegistrationNotification", propOrder = {
    "farmCode",
    "farmName",
    "siteAddress",
    "farmSurface",
    "productionType",
    "breedingMethodologyType"
})
public class FarmRegistrationNotification {

    @XmlElement(required = true)
    protected String farmCode;
    @XmlElement(required = true)
    protected String farmName;
    @XmlElement(required = true)
    protected AddressDetails siteAddress;
    protected int farmSurface;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ProductionTypology productionType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected BreedingMethodTypology breedingMethodologyType;

    /**
     * Gets the value of the farmCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFarmCode() {
        return farmCode;
    }

    /**
     * Sets the value of the farmCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFarmCode(String value) {
        this.farmCode = value;
    }

    /**
     * Gets the value of the farmName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFarmName() {
        return farmName;
    }

    /**
     * Sets the value of the farmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFarmName(String value) {
        this.farmName = value;
    }

    /**
     * Gets the value of the siteAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressDetails }
     *     
     */
    public AddressDetails getSiteAddress() {
        return siteAddress;
    }

    /**
     * Sets the value of the siteAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressDetails }
     *     
     */
    public void setSiteAddress(AddressDetails value) {
        this.siteAddress = value;
    }

    /**
     * Gets the value of the farmSurface property.
     * 
     */
    public int getFarmSurface() {
        return farmSurface;
    }

    /**
     * Sets the value of the farmSurface property.
     * 
     */
    public void setFarmSurface(int value) {
        this.farmSurface = value;
    }

    /**
     * Gets the value of the productionType property.
     * 
     * @return
     *     possible object is
     *     {@link ProductionTypology }
     *     
     */
    public ProductionTypology getProductionType() {
        return productionType;
    }

    /**
     * Sets the value of the productionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductionTypology }
     *     
     */
    public void setProductionType(ProductionTypology value) {
        this.productionType = value;
    }

    /**
     * Gets the value of the breedingMethodologyType property.
     * 
     * @return
     *     possible object is
     *     {@link BreedingMethodTypology }
     *     
     */
    public BreedingMethodTypology getBreedingMethodologyType() {
        return breedingMethodologyType;
    }

    /**
     * Sets the value of the breedingMethodologyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BreedingMethodTypology }
     *     
     */
    public void setBreedingMethodologyType(BreedingMethodTypology value) {
        this.breedingMethodologyType = value;
    }

}
