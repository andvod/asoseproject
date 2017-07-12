
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package eu.chorevolution.farmbusinessstartup.provider.registryoffice;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2017-07-12T11:52:52.606+02:00
 * Generated source version: 3.1.6
 * 
 */

@javax.jws.WebService(
                      serviceName = "RegistryOfficeService",
                      portName = "RegistryOfficePort",
                      targetNamespace = "http://eu.chorevolution.farmbusinessstartup/registryoffice",
                      wsdlLocation = "file:/C:/Users/HP/Desktop/Chor/workspaceProject/RegistryOffice/src/main/resources/RegistryOffice.wsdl",
                      endpointInterface = "eu.chorevolution.farmbusinessstartup.provider.registryoffice.RegistryOfficePT")
                      
public class RegistryOfficePortImpl implements RegistryOfficePT {

    private static final Logger LOG = Logger.getLogger(RegistryOfficePortImpl.class.getName());

    /* (non-Javadoc)
     * @see eu.chorevolution.farmbusinessstartup.provider.registryoffice.RegistryOfficePT#receiveFarmRegistrationResponse(eu.chorevolution.farmbusinessstartup.provider.registryoffice.ReceiveFarmRegistrationResponseType  parameters )*
     */
    public eu.chorevolution.farmbusinessstartup.provider.registryoffice.ReceiveFarmRegistrationResponseReturnType receiveFarmRegistrationResponse(ReceiveFarmRegistrationResponseType parameters) { 
        LOG.info("Executing operation receiveFarmRegistrationResponse");
        System.out.println(parameters);
        try {
            eu.chorevolution.farmbusinessstartup.provider.registryoffice.ReceiveFarmRegistrationResponseReturnType _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see eu.chorevolution.farmbusinessstartup.provider.registryoffice.RegistryOfficePT#farmOpening(eu.chorevolution.farmbusinessstartup.provider.registryoffice.FarmOpeningNotificationType  parameters )*
     */
    public eu.chorevolution.farmbusinessstartup.provider.registryoffice.FarmOpeningNotificationReturnType farmOpening(FarmOpeningNotificationType parameters) { 
        LOG.info("Executing operation farmOpening");
        System.out.println(parameters);
        try {
            eu.chorevolution.farmbusinessstartup.provider.registryoffice.FarmOpeningNotificationReturnType _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see eu.chorevolution.farmbusinessstartup.provider.registryoffice.RegistryOfficePT#farmRegistrationRequest(eu.chorevolution.farmbusinessstartup.provider.registryoffice.SendRequestType  parameters )*
     */
    public eu.chorevolution.farmbusinessstartup.provider.registryoffice.FarmRegistrationRequestReturnType farmRegistrationRequest(SendRequestType parameters) { 
        LOG.info("Executing operation farmRegistrationRequest");
        System.out.println(parameters);
        try {
            eu.chorevolution.farmbusinessstartup.provider.registryoffice.FarmRegistrationRequestReturnType _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see eu.chorevolution.farmbusinessstartup.provider.registryoffice.RegistryOfficePT#farmBusinessCodeStartupNotification(eu.chorevolution.farmbusinessstartup.provider.registryoffice.SendRequestType  parameters )*
     */
    public eu.chorevolution.farmbusinessstartup.provider.registryoffice.FarmBusinessCodeStartupNotificationReturnType farmBusinessCodeStartupNotification(SendRequestType parameters) { 
        LOG.info("Executing operation farmBusinessCodeStartupNotification");
        System.out.println(parameters);
        try {
            eu.chorevolution.farmbusinessstartup.provider.registryoffice.FarmBusinessCodeStartupNotificationReturnType _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see eu.chorevolution.farmbusinessstartup.provider.registryoffice.RegistryOfficePT#farmRegistrationNotification(eu.chorevolution.farmbusinessstartup.provider.registryoffice.SendRequestType  parameters )*
     */
    public eu.chorevolution.farmbusinessstartup.provider.registryoffice.FarmRegistrationNotificationReturnType farmRegistrationNotification(SendRequestType parameters) { 
        LOG.info("Executing operation farmRegistrationNotification");
        System.out.println(parameters);
        try {
            eu.chorevolution.farmbusinessstartup.provider.registryoffice.FarmRegistrationNotificationReturnType _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}