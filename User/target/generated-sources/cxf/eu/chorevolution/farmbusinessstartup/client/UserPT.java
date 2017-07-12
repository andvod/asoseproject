package eu.chorevolution.farmbusinessstartup.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2017-06-22T13:15:58.511+02:00
 * Generated source version: 3.1.6
 * 
 */
@WebService(targetNamespace = "http://eu.chorevolution.farmbusinessstartup/cdclient", name = "UserPT")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface UserPT {

    @WebMethod
    @WebResult(name = "farmBusinessStartupResponseElementResponse", targetNamespace = "http://eu.chorevolution.farmbusinessstartup/cdclient", partName = "parameters")
    public FarmBusinessStartupResponse farmBusinessCodeRequest(
        @WebParam(partName = "parameters", name = "farmBusinessStartupRequestElementRequest", targetNamespace = "http://eu.chorevolution.farmbusinessstartup/cdclient")
        FarmBusinessStartupRequestType parameters
    );
}
