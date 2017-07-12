package eu.chorevolution.farmbusinessstartup.provider.veterinary.webservices;

import eu.chorevolution.farmbusinessstartup.provider.veterinary.FarmSiteInspectionRequest;
import eu.chorevolution.farmbusinessstartup.provider.veterinary.FarmRegistrationNotification;
import eu.chorevolution.farmbusinessstartup.provider.veterinary.FarmSiteInspectionResponse;

import eu.chorevolution.utilities.dataservice.ChoreographyInstanceMessages;

public interface VeterinaryService {

	void farmOpeningSiteInspectionRequest(FarmSiteInspectionRequest parameter, String choreographyTaskName, String senderParticipantName);
	      
	void farmHealthcareRegistration(FarmRegistrationNotification parameter, String choreographyTaskName, String senderParticipantName);
	      
    FarmSiteInspectionResponse createFarmSiteInspectionResponse(ChoreographyInstanceMessages choreographyInstanceMessages, String choreographyTaskName, String receiverParticipantName);
    
}
