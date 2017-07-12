
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2017-07-12T11:36:35.056+02:00
 * Generated source version: 3.1.6
 * 
 */

@javax.jws.WebService(
                      serviceName = "LocalHealthcareCompanyService",
                      portName = "LocalHealthcareCompanyPort",
                      targetNamespace = "http://eu.chorevolution.farmbusinessstartup/localhealthcarecompany",
                      wsdlLocation = "file:/C:/Users/HP/Desktop/Chor/workspaceProject/LocalHealthcareCompany/src/main/resources/LocalHealthcareCompany.wsdl",
                      endpointInterface = "eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.LocalHealthcareCompanyPT")
                      
public class LocalHealthcareCompanyPortImpl implements LocalHealthcareCompanyPT {

    private static final Logger LOG = Logger.getLogger(LocalHealthcareCompanyPortImpl.class.getName());

    /* (non-Javadoc)
     * @see eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.LocalHealthcareCompanyPT#farmBusinessCodeRequest(eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.FarmBusinessStartupRequestType  parameters )*
     */
    public eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.FarmBusinessStartupRequestReturnType farmBusinessCodeRequest(FarmBusinessStartupRequestType parameters) { 
        LOG.info("Executing operation farmBusinessCodeRequest");
        System.out.println(parameters);
        try {
            eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.FarmBusinessStartupRequestReturnType _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.LocalHealthcareCompanyPT#farmSiteInspectionVerbal(eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.FarmSiteInspectionResponseType  parameters )*
     */
    public eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.FarmSiteInspectionResponseReturnType farmSiteInspectionVerbal(FarmSiteInspectionResponseType parameters) { 
        LOG.info("Executing operation farmSiteInspectionVerbal");
        System.out.println(parameters);
        try {
            eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.FarmSiteInspectionResponseReturnType _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.LocalHealthcareCompanyPT#farmBusinessStartupNotification(eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.FarmRegistrationNotificationType  parameters )*
     */
    public eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.FarmRegistrationNotificationReturnType farmBusinessStartupNotification(FarmRegistrationNotificationType parameters) { 
        LOG.info("Executing operation farmBusinessStartupNotification");
        System.out.println(parameters);
        try {
            eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.FarmRegistrationNotificationReturnType _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.LocalHealthcareCompanyPT#farmOpeningNotification(eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.SendRequestType  parameters )*
     */
    public eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.FarmOpeningNotificationReturnType farmOpeningNotification(SendRequestType parameters) { 
        LOG.info("Executing operation farmOpeningNotification");
        System.out.println(parameters);
        try {
            eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.FarmOpeningNotificationReturnType _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.LocalHealthcareCompanyPT#farmSiteInspectionRequest(eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.SendRequestType  parameters )*
     */
    public eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.FarmSiteInspectionRequestReturnType farmSiteInspectionRequest(SendRequestType parameters) { 
        LOG.info("Executing operation farmSiteInspectionRequest");
        System.out.println(parameters);
        try {
            eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.FarmSiteInspectionRequestReturnType _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.LocalHealthcareCompanyPT#farmBusinessStartupResponse(eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.SendRequestType  parameters )*
     */
    public eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.FarmBusinessStartupResponseReturnType farmBusinessStartupResponse(SendRequestType parameters) { 
        LOG.info("Executing operation farmBusinessStartupResponse");
        System.out.println(parameters);
        try {
            eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.FarmBusinessStartupResponseReturnType _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}