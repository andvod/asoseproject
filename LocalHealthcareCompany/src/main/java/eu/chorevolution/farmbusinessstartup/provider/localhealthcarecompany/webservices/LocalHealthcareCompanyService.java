package eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.webservices;

import eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.FarmBusinessStartupRequest;
import eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.FarmSiteInspectionResponse;
import eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.FarmRegistrationNotification;
import eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.FarmSiteInspectionRequest;
import eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.FarmOpeningNotification;
import eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.FarmBusinessStartupResponse;


import eu.chorevolution.utilities.dataservice.ChoreographyInstanceMessages;

public interface LocalHealthcareCompanyService {

	void farmBusinessCodeRequest(FarmBusinessStartupRequest parameter, String choreographyTaskName, String senderParticipantName);
	      
	void farmSiteInspectionVerbal(FarmSiteInspectionResponse parameter, String choreographyTaskName, String senderParticipantName);
	      
	void farmBusinessStartupNotification(FarmRegistrationNotification parameter, String choreographyTaskName, String senderParticipantName);
	      
    FarmSiteInspectionRequest createFarmSiteInspectionRequest(ChoreographyInstanceMessages choreographyInstanceMessages, String choreographyTaskName, String receiverParticipantName);
    
    FarmOpeningNotification createFarmOpeningNotification(ChoreographyInstanceMessages choreographyInstanceMessages, String choreographyTaskName, String receiverParticipantName);
    
    FarmBusinessStartupResponse createFarmBusinessStartupResponse(ChoreographyInstanceMessages choreographyInstanceMessages, String choreographyTaskName, String receiverParticipantName);
    
}
