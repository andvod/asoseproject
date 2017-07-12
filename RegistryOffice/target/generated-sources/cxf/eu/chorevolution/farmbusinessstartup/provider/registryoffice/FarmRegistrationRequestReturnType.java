
package eu.chorevolution.farmbusinessstartup.provider.registryoffice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for farmRegistrationRequestReturnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="farmRegistrationRequestReturnType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="inputMessageData" type="{http://eu.chorevolution.farmbusinessstartup/registryoffice}farmRegistrationRequest"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "farmRegistrationRequestReturnType", propOrder = {
    "inputMessageData"
})
public class FarmRegistrationRequestReturnType {

    @XmlElement(required = true)
    protected FarmRegistrationRequest inputMessageData;

    /**
     * Gets the value of the inputMessageData property.
     * 
     * @return
     *     possible object is
     *     {@link FarmRegistrationRequest }
     *     
     */
    public FarmRegistrationRequest getInputMessageData() {
        return inputMessageData;
    }

    /**
     * Sets the value of the inputMessageData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FarmRegistrationRequest }
     *     
     */
    public void setInputMessageData(FarmRegistrationRequest value) {
        this.inputMessageData = value;
    }

}
