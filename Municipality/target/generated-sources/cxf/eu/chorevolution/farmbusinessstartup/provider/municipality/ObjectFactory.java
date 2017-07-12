
package eu.chorevolution.farmbusinessstartup.provider.municipality;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.chorevolution.farmbusinessstartup.provider.municipality package. 
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

    private final static QName _FarmBusinessCodeStartupNotificationElementRequest_QNAME = new QName("http://eu.chorevolution.farmbusinessstartup/services/municipality", "farmBusinessCodeStartupNotificationElementRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.chorevolution.farmbusinessstartup.provider.municipality
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FarmBusinessCodeStartupNotification }
     * 
     */
    public FarmBusinessCodeStartupNotification createFarmBusinessCodeStartupNotification() {
        return new FarmBusinessCodeStartupNotification();
    }

    /**
     * Create an instance of {@link FarmDetails }
     * 
     */
    public FarmDetails createFarmDetails() {
        return new FarmDetails();
    }

    /**
     * Create an instance of {@link AddressDetails }
     * 
     */
    public AddressDetails createAddressDetails() {
        return new AddressDetails();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FarmBusinessCodeStartupNotification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eu.chorevolution.farmbusinessstartup/services/municipality", name = "farmBusinessCodeStartupNotificationElementRequest")
    public JAXBElement<FarmBusinessCodeStartupNotification> createFarmBusinessCodeStartupNotificationElementRequest(FarmBusinessCodeStartupNotification value) {
        return new JAXBElement<FarmBusinessCodeStartupNotification>(_FarmBusinessCodeStartupNotificationElementRequest_QNAME, FarmBusinessCodeStartupNotification.class, null, value);
    }

}
