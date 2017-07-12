
package eu.chorevolution.farmbusinessstartup.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for choreographyInstanceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="choreographyInstanceRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="choreographyId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "choreographyInstanceRequest", propOrder = {
    "choreographyId"
})
public class ChoreographyInstanceRequest {

    @XmlElement(required = true)
    protected String choreographyId;

    /**
     * Gets the value of the choreographyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChoreographyId() {
        return choreographyId;
    }

    /**
     * Sets the value of the choreographyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChoreographyId(String value) {
        this.choreographyId = value;
    }

}
