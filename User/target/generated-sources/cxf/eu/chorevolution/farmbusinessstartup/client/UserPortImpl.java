
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package eu.chorevolution.farmbusinessstartup.client;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2017-06-22T13:15:58.353+02:00
 * Generated source version: 3.1.6
 * 
 */

@javax.jws.WebService(
                      serviceName = "UserService",
                      portName = "UserPort",
                      targetNamespace = "http://eu.chorevolution.farmbusinessstartup/cdclient",
                      wsdlLocation = "classpath:cdUser.wsdl",
                      endpointInterface = "eu.chorevolution.farmbusinessstartup.client.UserPT")
                      
public class UserPortImpl implements UserPT {

    private static final Logger LOG = Logger.getLogger(UserPortImpl.class.getName());

    /* (non-Javadoc)
     * @see eu.chorevolution.farmbusinessstartup.client.UserPT#farmBusinessCodeRequest(eu.chorevolution.farmbusinessstartup.client.FarmBusinessStartupRequestType  parameters )*
     */
    public eu.chorevolution.farmbusinessstartup.client.FarmBusinessStartupResponse farmBusinessCodeRequest(FarmBusinessStartupRequestType parameters) { 
        LOG.info("Executing operation farmBusinessCodeRequest");
        System.out.println("Println");
        System.out.println(parameters);
        try {
            eu.chorevolution.farmbusinessstartup.client.FarmBusinessStartupResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
