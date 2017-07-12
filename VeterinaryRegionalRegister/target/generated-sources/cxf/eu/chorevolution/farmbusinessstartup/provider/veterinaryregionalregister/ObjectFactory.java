
package eu.chorevolution.farmbusinessstartup.provider.veterinaryregionalregister;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.chorevolution.farmbusinessstartup.provider.veterinaryregionalregister package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FarmRegistrationRequestElementRequest_QNAME = new QName("http://eu.chorevolution.farmbusinessstartup/services/veterinaryregionalregister", "farmRegistrationRequestElementRequest");
    private final static QName _FarmRegistrationResponseElementResponse_QNAME = new QName("http://eu.chorevolution.farmbusinessstartup/services/veterinaryregionalregister", "farmRegistrationResponseElementResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.chorevolution.farmbusinessstartup.provider.veterinaryregionalregister
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FarmRegistrationRequest }
     * 
     */
    public FarmRegistrationRequest createFarmRegistrationRequest() {
        return new FarmRegistrationRequest();
    }

    /**
     * Create an instance of {@link FarmRegistrationResponse }
     * 
     */
    public FarmRegistrationResponse createFarmRegistrationResponse() {
        return new FarmRegistrationResponse();
    }

    /**
     * Create an instance of {@link PersonData }
     * 
     */
    public PersonData createPersonData() {
        return new PersonData();
    }

    /**
     * Create an instance of {@link AddressDetails }
     * 
     */
    public AddressDetails createAddressDetails() {
        return new AddressDetails();
    }

    /**
     * Create an instance of {@link FarmDetails }
     * 
     */
    public FarmDetails createFarmDetails() {
        return new FarmDetails();
    }

    /**
     * Create an instance of {@link VeterinarySiteInspectionDetails }
     * 
     */
    public VeterinarySiteInspectionDetails createVeterinarySiteInspectionDetails() {
        return new VeterinarySiteInspectionDetails();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FarmRegistrationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eu.chorevolution.farmbusinessstartup/services/veterinaryregionalregister", name = "farmRegistrationRequestElementRequest")
    public JAXBElement<FarmRegistrationRequest> createFarmRegistrationRequestElementRequest(FarmRegistrationRequest value) {
        return new JAXBElement<FarmRegistrationRequest>(_FarmRegistrationRequestElementRequest_QNAME, FarmRegistrationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FarmRegistrationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eu.chorevolution.farmbusinessstartup/services/veterinaryregionalregister", name = "farmRegistrationResponseElementResponse")
    public JAXBElement<FarmRegistrationResponse> createFarmRegistrationResponseElementResponse(FarmRegistrationResponse value) {
        return new JAXBElement<FarmRegistrationResponse>(_FarmRegistrationResponseElementResponse_QNAME, FarmRegistrationResponse.class, null, value);
    }

}
