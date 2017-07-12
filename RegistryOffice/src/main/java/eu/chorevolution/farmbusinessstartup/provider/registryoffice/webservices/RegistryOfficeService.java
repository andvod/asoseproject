package eu.chorevolution.farmbusinessstartup.provider.registryoffice.webservices;

import eu.chorevolution.farmbusinessstartup.provider.registryoffice.FarmOpeningNotification;
import eu.chorevolution.farmbusinessstartup.provider.registryoffice.FarmRegistrationRequest;
import eu.chorevolution.farmbusinessstartup.provider.registryoffice.FarmRegistrationNotification;
import eu.chorevolution.farmbusinessstartup.provider.registryoffice.FarmBusinessCodeStartupNotification;
import eu.chorevolution.farmbusinessstartup.provider.registryoffice.FarmRegistrationResponse;


import eu.chorevolution.utilities.dataservice.ChoreographyInstanceMessages;



public interface RegistryOfficeService {

	void farmOpening(FarmOpeningNotification parameter, String choreographyTaskName, String senderParticipantName);
	      
    FarmRegistrationRequest createFarmRegistrationRequest(ChoreographyInstanceMessages choreographyInstanceMessages, String choreographyTaskName, String receiverParticipantName);
    
    FarmRegistrationNotification createFarmRegistrationNotification(ChoreographyInstanceMessages choreographyInstanceMessages, String choreographyTaskName, String receiverParticipantName);
    
    FarmBusinessCodeStartupNotification createFarmBusinessCodeStartupNotification(ChoreographyInstanceMessages choreographyInstanceMessages, String choreographyTaskName, String receiverParticipantName);
    
    void receiveFarmRegistrationResponse(FarmRegistrationResponse parameter, String choreographyTaskName, String senderParticipantName);
    
}
