
package eu.chorevolution.farmbusinessstartup.provider.registryoffice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for receiveFarmRegistrationResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="receiveFarmRegistrationResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="choreographyId" type="{http://eu.chorevolution.farmbusinessstartup/registryoffice}choreographyInstanceRequest"/&gt;
 *         &lt;element name="senderParticipantName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="receiverParticipantName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="choreographyTaskName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="outputMessageName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="outputMessageData" type="{http://eu.chorevolution.farmbusinessstartup/registryoffice}farmRegistrationResponse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receiveFarmRegistrationResponseType", propOrder = {
    "choreographyId",
    "senderParticipantName",
    "receiverParticipantName",
    "choreographyTaskName",
    "outputMessageName",
    "outputMessageData"
})
public class ReceiveFarmRegistrationResponseType {

    @XmlElement(required = true)
    protected ChoreographyInstanceRequest choreographyId;
    @XmlElement(required = true)
    protected String senderParticipantName;
    @XmlElement(required = true)
    protected String receiverParticipantName;
    @XmlElement(required = true)
    protected String choreographyTaskName;
    @XmlElement(required = true)
    protected String outputMessageName;
    @XmlElement(required = true)
    protected FarmRegistrationResponse outputMessageData;

    /**
     * Gets the value of the choreographyId property.
     * 
     * @return
     *     possible object is
     *     {@link ChoreographyInstanceRequest }
     *     
     */
    public ChoreographyInstanceRequest getChoreographyId() {
        return choreographyId;
    }

    /**
     * Sets the value of the choreographyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChoreographyInstanceRequest }
     *     
     */
    public void setChoreographyId(ChoreographyInstanceRequest value) {
        this.choreographyId = value;
    }

    /**
     * Gets the value of the senderParticipantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderParticipantName() {
        return senderParticipantName;
    }

    /**
     * Sets the value of the senderParticipantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderParticipantName(String value) {
        this.senderParticipantName = value;
    }

    /**
     * Gets the value of the receiverParticipantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverParticipantName() {
        return receiverParticipantName;
    }

    /**
     * Sets the value of the receiverParticipantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverParticipantName(String value) {
        this.receiverParticipantName = value;
    }

    /**
     * Gets the value of the choreographyTaskName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChoreographyTaskName() {
        return choreographyTaskName;
    }

    /**
     * Sets the value of the choreographyTaskName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChoreographyTaskName(String value) {
        this.choreographyTaskName = value;
    }

    /**
     * Gets the value of the outputMessageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputMessageName() {
        return outputMessageName;
    }

    /**
     * Sets the value of the outputMessageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputMessageName(String value) {
        this.outputMessageName = value;
    }

    /**
     * Gets the value of the outputMessageData property.
     * 
     * @return
     *     possible object is
     *     {@link FarmRegistrationResponse }
     *     
     */
    public FarmRegistrationResponse getOutputMessageData() {
        return outputMessageData;
    }

    /**
     * Sets the value of the outputMessageData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FarmRegistrationResponse }
     *     
     */
    public void setOutputMessageData(FarmRegistrationResponse value) {
        this.outputMessageData = value;
    }

}
