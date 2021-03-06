package eu.chorevolution.farmbusinessstartup.provider.registryoffice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2017-07-12T11:52:52.793+02:00
 * Generated source version: 3.1.6
 * 
 */
@WebService(targetNamespace = "http://eu.chorevolution.farmbusinessstartup/registryoffice", name = "RegistryOfficePT")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface RegistryOfficePT {

    @WebMethod
    @WebResult(name = "receiveFarmRegistrationResponseElementResponse", targetNamespace = "http://eu.chorevolution.farmbusinessstartup/registryoffice", partName = "parameters")
    public ReceiveFarmRegistrationResponseReturnType receiveFarmRegistrationResponse(
        @WebParam(partName = "parameters", name = "receiveFarmRegistrationResponseElementRequest", targetNamespace = "http://eu.chorevolution.farmbusinessstartup/registryoffice")
        ReceiveFarmRegistrationResponseType parameters
    );

    @WebMethod
    @WebResult(name = "farmOpeningNotificationElementResponse", targetNamespace = "http://eu.chorevolution.farmbusinessstartup/registryoffice", partName = "parameters")
    public FarmOpeningNotificationReturnType farmOpening(
        @WebParam(partName = "parameters", name = "farmOpeningNotificationElementRequest", targetNamespace = "http://eu.chorevolution.farmbusinessstartup/registryoffice")
        FarmOpeningNotificationType parameters
    );

    @WebMethod
    @WebResult(name = "farmRegistrationRequestElementResponse", targetNamespace = "http://eu.chorevolution.farmbusinessstartup/registryoffice", partName = "parameters")
    public FarmRegistrationRequestReturnType farmRegistrationRequest(
        @WebParam(partName = "parameters", name = "farmRegistrationRequestElementRequest", targetNamespace = "http://eu.chorevolution.farmbusinessstartup/registryoffice")
        SendRequestType parameters
    );

    @WebMethod
    @WebResult(name = "farmBusinessCodeStartupNotificationElementResponse", targetNamespace = "http://eu.chorevolution.farmbusinessstartup/registryoffice", partName = "parameters")
    public FarmBusinessCodeStartupNotificationReturnType farmBusinessCodeStartupNotification(
        @WebParam(partName = "parameters", name = "farmBusinessCodeStartupNotificationElementRequest", targetNamespace = "http://eu.chorevolution.farmbusinessstartup/registryoffice")
        SendRequestType parameters
    );

    @WebMethod
    @WebResult(name = "farmRegistrationNotificationElementResponse", targetNamespace = "http://eu.chorevolution.farmbusinessstartup/registryoffice", partName = "parameters")
    public FarmRegistrationNotificationReturnType farmRegistrationNotification(
        @WebParam(partName = "parameters", name = "farmRegistrationNotificationElementRequest", targetNamespace = "http://eu.chorevolution.farmbusinessstartup/registryoffice")
        SendRequestType parameters
    );
}
