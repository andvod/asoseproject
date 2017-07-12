
package eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for farmSiteInspectionRequestReturnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="farmSiteInspectionRequestReturnType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="inputMessageData" type="{http://eu.chorevolution.farmbusinessstartup/localhealthcarecompany}farmSiteInspectionRequest"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "farmSiteInspectionRequestReturnType", propOrder = {
    "inputMessageData"
})
public class FarmSiteInspectionRequestReturnType {

    @XmlElement(required = true)
    protected FarmSiteInspectionRequest inputMessageData;

    /**
     * Gets the value of the inputMessageData property.
     * 
     * @return
     *     possible object is
     *     {@link FarmSiteInspectionRequest }
     *     
     */
    public FarmSiteInspectionRequest getInputMessageData() {
        return inputMessageData;
    }

    /**
     * Sets the value of the inputMessageData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FarmSiteInspectionRequest }
     *     
     */
    public void setInputMessageData(FarmSiteInspectionRequest value) {
        this.inputMessageData = value;
    }

}
