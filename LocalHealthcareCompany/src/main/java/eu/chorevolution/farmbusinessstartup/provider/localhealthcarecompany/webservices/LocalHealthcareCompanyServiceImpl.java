package eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.webservices;

import java.util.Calendar;

import org.springframework.stereotype.Service;

import eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.FarmBusinessStartupRequest;
import eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.FarmBusinessStartupResponse;
import eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.FarmOpeningNotification;
import eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.FarmRegistrationNotification;
import eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.FarmSiteInspectionRequest;
import eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.FarmSiteInspectionResponse;

import eu.chorevolution.utilities.dataservice.ChoreographyInstanceMessages;

@Service
public class LocalHealthcareCompanyServiceImpl implements LocalHealthcareCompanyService {

	@Override
	public void farmBusinessCodeRequest(FarmBusinessStartupRequest parameter, String choreographyTaskName, String senderParticipantName) {
		/**
		*	TODO Add your business logic upon the reception of FarmBusinessStartupRequest message from senderParticipantName
		*/
	}     

	@Override
	public void farmSiteInspectionVerbal(FarmSiteInspectionResponse parameter, String choreographyTaskName, String senderParticipantName) {
		/**
		*	TODO Add your business logic upon the reception of FarmSiteInspectionResponse message from senderParticipantName
		*/
	}     

	@Override
	public void farmBusinessStartupNotification(FarmRegistrationNotification parameter, String choreographyTaskName, String senderParticipantName) {
		/**
		*	TODO Add your business logic upon the reception of FarmRegistrationNotification message from senderParticipantName
		*/
	}     

    @Override
    public FarmSiteInspectionRequest createFarmSiteInspectionRequest(ChoreographyInstanceMessages choreographyInstanceMessages, String choreographyTaskName, String receiverParticipantName) {
    	FarmSiteInspectionRequest result = new FarmSiteInspectionRequest();
    	/**
		 *	TODO write the code that generates FarmSiteInspectionRequest message 
		 *	that has to be sent to receiverParticipantName within the interaction belonging to choreographyTaskName
		 *	You can exploit the following API from choreographyInstanceMessages
		 *	1. Get a Message using its name 
		 *		- example: 
		 *			EcoRoutesRequest message = (EcoRoutesRequest) choreographyInstanceMessages.getMessage("EcoRoutesRequest");
		 *		A null value is returned if no message has been found.
		 *	2. Get a list of messages using a message name
		 *		- example: 
		 *			List<EcoRoutesRequest> messages = choreographyInstanceMessages.getMessages("EcoRoutesRequest");
		 *		A null value is returned if no message has been found. 
		 *	3. Get a message using its name and the name of the sender participant
		 *		- example: 
		 *			EcoRoutesRequest message = (EcoRoutesRequest) choreographyInstanceMessages.getMessageSentFromParticipant("EcoRoutesRequest","ND");
		 *		A null value is returned if no message has been found. 
		 *	4. Get a list of messages using a message name and a sender participant name
		 *		- example: 
		 *			List<EcoRoutesRequest> messages = choreographyInstanceMessages.getMessagesSentFromParticipant("EcoRoutesRequest","ND"); 
		 *		A null value is returned if no message has been found.
		 *	5. Get a message using its name, the name of the sender participant and the name of the task in which 
		 *		the message has been exchanged
		 *		- example: 
		 *			EcoRoutesRequest message = (EcoRoutesRequest) choreographyInstanceMessages.getMessageSentFromParticipant("EcoRoutesRequest","ND","Get Eco Routes");	
		 *		A null value is returned if no message has been found.
		 *	6. Get a list of messages using a message name, the name of the sender participant and the name of the task in which 
		 *		the messages has been exchanged
		 *		- example: 
		 *			List<EcoRoutesRequest> messages = choreographyInstanceMessages.getMessagesSentFromParticipant("EcoRoutesRequest","ND","Get Eco Routes");
		 *		A null value is returned if no message has been found.
		 *	7. Get a message using its name and the name of the receiver participant
		 *		- example: 
		 *			RoutesRequest message = (RoutesRequest) choreographyInstanceMessages.getMessageReceivedParticipant("RoutesRequest", "DTS-GOOGLE");
		 *		A null value is returned if no message has been found. 
		 *	8. Get a message using its name, the name of the receiver participant and the name of the task in which 
		 *		the message has been exchanged
		 *		- example: 
		 *			RoutesRequest message = (RoutesRequest) choreographyInstanceMessages.getMessageReceivedFromParticipant("RoutesRequest", "DTS-GOOGLE", "Routes Request");;	
		 *		A null value is returned if no message has been found.
		 *	9. Get a list of messages using a message name and a receiver participant name
		 *		- example: 
         *			List<RoutesRequest> messages = choreographyInstanceMessages.getMessagesReceivedFromParticipant("RoutesRequest", "DTS-GOOGLE");
		 *	10. Get a list of messages using a message name, the name of the receiver participant and the name of the task in which 
		 *		the messages has been exchanged
		 *		- example: 
		 *			List<RoutesRequest> messages = choreographyInstanceMessages.getMessagesReceivedFromParticipant("RoutesRequest", "DTS-GOOGLE", "Routes Request");
		 *		A null value is returned if no message has been found.
		 */	
//    	FarmBusinessStartupRequest farmBusinessStartupRequest = (FarmBusinessStartupRequest) choreographyInstanceMessages.getMessage("farmBusinessStartupRequest");

//    	FarmBusinessStartupRequest farmBusinessStartupRequest = (FarmBusinessStartupRequest) choreographyInstanceMessages.getMessageSentFromParticipant("farmBusinessStartupRequest","User");
//    	FarmBusinessStartupRequest farmBusinessStartupRequest = (FarmBusinessStartupRequest) choreographyInstanceMessages.getMessageSentFromParticipant("farmBusinessStartupRequest","User","Farm Business Code Request");

//    	FarmBusinessStartupRequest farmBusinessStartupRequest = (FarmBusinessStartupRequest) choreographyInstanceMessages.getMessageReceivedParticipant("farmBusinessStartupRequest", "Local Healthcare Company");
    	FarmBusinessStartupRequest farmBusinessStartupRequest = (FarmBusinessStartupRequest) choreographyInstanceMessages.getMessageReceivedFromParticipant("farmBusinessStartupRequest", "Local Healthcare Company", "Farm Business Code Request");
    	
    	result.setBreedingMethodologyType(farmBusinessStartupRequest.getFarmBusinessStartupRequestForm().getFarm().getBreedingMethodologyType());
    	result.setCompanyName(farmBusinessStartupRequest.getFarmBusinessStartupRequestForm().getFarm().getCompanyName());
    	result.setFarmName(farmBusinessStartupRequest.getFarmBusinessStartupRequestForm().getFarm().getFarmName());
    	result.setFarmSurface(farmBusinessStartupRequest.getFarmBusinessStartupRequestForm().getFarm().getFarmSurface());
    	result.setProductionType(farmBusinessStartupRequest.getFarmBusinessStartupRequestForm().getFarm().getProductionType());
    	result.setSiteAddress(farmBusinessStartupRequest.getFarmBusinessStartupRequestForm().getFarm().getCompanyHeadquarter());
    	Calendar calendar = Calendar.getInstance();
    	calendar.add(Calendar.DAY_OF_MONTH, 30);
    	result.setSiteInspectionDeadline(calendar.getTime());
    	return result;
    }
    
    @Override
    public FarmOpeningNotification createFarmOpeningNotification(ChoreographyInstanceMessages choreographyInstanceMessages, String choreographyTaskName, String receiverParticipantName) {
    	FarmOpeningNotification result = new FarmOpeningNotification();
    	/**
		 *	TODO write the code that generates FarmOpeningNotification message 
		 *	that has to be sent to receiverParticipantName within the interaction belonging to choreographyTaskName
		 *	You can exploit the following API from choreographyInstanceMessages
		 *	1. Get a Message using its name 
		 *		- example: 
		 *			EcoRoutesRequest message = (EcoRoutesRequest) choreographyInstanceMessages.getMessage("EcoRoutesRequest");
		 *		A null value is returned if no message has been found.
		 *	2. Get a list of messages using a message name
		 *		- example: 
		 *			List<EcoRoutesRequest> messages = choreographyInstanceMessages.getMessages("EcoRoutesRequest");
		 *		A null value is returned if no message has been found. 
		 *	3. Get a message using its name and the name of the sender participant
		 *		- example: 
		 *			EcoRoutesRequest message = (EcoRoutesRequest) choreographyInstanceMessages.getMessageSentFromParticipant("EcoRoutesRequest","ND");
		 *		A null value is returned if no message has been found. 
		 *	4. Get a list of messages using a message name and a sender participant name
		 *		- example: 
		 *			List<EcoRoutesRequest> messages = choreographyInstanceMessages.getMessagesSentFromParticipant("EcoRoutesRequest","ND"); 
		 *		A null value is returned if no message has been found.
		 *	5. Get a message using its name, the name of the sender participant and the name of the task in which 
		 *		the message has been exchanged
		 *		- example: 
		 *			EcoRoutesRequest message = (EcoRoutesRequest) choreographyInstanceMessages.getMessageSentFromParticipant("EcoRoutesRequest","ND","Get Eco Routes");	
		 *		A null value is returned if no message has been found.
		 *	6. Get a list of messages using a message name, the name of the sender participant and the name of the task in which 
		 *		the messages has been exchanged
		 *		- example: 
		 *			List<EcoRoutesRequest> messages = choreographyInstanceMessages.getMessagesSentFromParticipant("EcoRoutesRequest","ND","Get Eco Routes");
		 *		A null value is returned if no message has been found.
		 *	7. Get a message using its name and the name of the receiver participant
		 *		- example: 
		 *			RoutesRequest message = (RoutesRequest) choreographyInstanceMessages.getMessageReceivedParticipant("RoutesRequest", "DTS-GOOGLE");
		 *		A null value is returned if no message has been found. 
		 *	8. Get a message using its name, the name of the receiver participant and the name of the task in which 
		 *		the message has been exchanged
		 *		- example: 
		 *			RoutesRequest message = (RoutesRequest) choreographyInstanceMessages.getMessageReceivedFromParticipant("RoutesRequest", "DTS-GOOGLE", "Routes Request");;	
		 *		A null value is returned if no message has been found.
		 *	9. Get a list of messages using a message name and a receiver participant name
		 *		- example: 
         *			List<RoutesRequest> messages = choreographyInstanceMessages.getMessagesReceivedFromParticipant("RoutesRequest", "DTS-GOOGLE");
		 *	10. Get a list of messages using a message name, the name of the receiver participant and the name of the task in which 
		 *		the messages has been exchanged
		 *		- example: 
		 *			List<RoutesRequest> messages = choreographyInstanceMessages.getMessagesReceivedFromParticipant("RoutesRequest", "DTS-GOOGLE", "Routes Request");
		 *		A null value is returned if no message has been found.
		 */	
//    	FarmBusinessStartupRequest farmBusinessStartupRequest = (FarmBusinessStartupRequest) choreographyInstanceMessages.getMessage("farmBusinessStartupRequest");
    	
//    	FarmBusinessStartupRequest farmBusinessStartupRequest = (FarmBusinessStartupRequest) choreographyInstanceMessages.getMessageSentFromParticipant("farmBusinessStartupRequest","User");
//    	FarmBusinessStartupRequest farmBusinessStartupRequest = (FarmBusinessStartupRequest) choreographyInstanceMessages.getMessageSentFromParticipant("farmBusinessStartupRequest","User","Farm Business Code Request");   	

//    	FarmBusinessStartupRequest farmBusinessStartupRequest = (FarmBusinessStartupRequest) choreographyInstanceMessages.getMessageReceivedParticipant("farmBusinessStartupRequest", "Local Healthcare Company");
    	FarmBusinessStartupRequest farmBusinessStartupRequest = (FarmBusinessStartupRequest) choreographyInstanceMessages.getMessageReceivedFromParticipant("farmBusinessStartupRequest", "Local Healthcare Company", "Farm Business Code Request");    	
    	
    	
//    	FarmSiteInspectionResponse farmSiteInspectionResponse = (FarmSiteInspectionResponse) choreographyInstanceMessages.getMessage("farmSiteInspectionResponse");
    	
//    	FarmSiteInspectionResponse farmSiteInspectionResponse = (FarmSiteInspectionResponse) choreographyInstanceMessages.getMessageSentFromParticipant("farmSiteInspectionResponse","Veterinary");
//    	FarmSiteInspectionResponse farmSiteInspectionResponse = (FarmSiteInspectionResponse) choreographyInstanceMessages.getMessageSentFromParticipant("farmSiteInspectionResponse","Veterinary","Farm Site Inspection Verbal");

//    	FarmSiteInspectionResponse farmSiteInspectionResponse = (FarmSiteInspectionResponse) choreographyInstanceMessages.getMessageReceivedParticipant("farmSiteInspectionResponse", "Local Healthcare Company");
    	FarmSiteInspectionResponse farmSiteInspectionResponse = (FarmSiteInspectionResponse) choreographyInstanceMessages.getMessageReceivedFromParticipant("farmSiteInspectionResponse", "Local Healthcare Company", "Farm Site Inspection Verbal");    	
    		
    	result.setFarmOpeningRequestForm(farmBusinessStartupRequest.getFarmBusinessStartupRequestForm());
    	result.setSiteInspectionDetails(farmSiteInspectionResponse.getSiteInspectionVerbal());
    	return result;
    }
    
    @Override
    public FarmBusinessStartupResponse createFarmBusinessStartupResponse(ChoreographyInstanceMessages choreographyInstanceMessages, String choreographyTaskName, String receiverParticipantName) {
    	FarmBusinessStartupResponse result = new FarmBusinessStartupResponse();
    	/**
		 *	TODO write the code that generates FarmBusinessStartupResponse message 
		 *	that has to be sent to receiverParticipantName within the interaction belonging to choreographyTaskName
		 *	You can exploit the following API from choreographyInstanceMessages
		 *	1. Get a Message using its name 
		 *		- example: 
		 *			EcoRoutesRequest message = (EcoRoutesRequest) choreographyInstanceMessages.getMessage("EcoRoutesRequest");
		 *		A null value is returned if no message has been found.
		 *	2. Get a list of messages using a message name
		 *		- example: 
		 *			List<EcoRoutesRequest> messages = choreographyInstanceMessages.getMessages("EcoRoutesRequest");
		 *		A null value is returned if no message has been found. 
		 *	3. Get a message using its name and the name of the sender participant
		 *		- example: 
		 *			EcoRoutesRequest message = (EcoRoutesRequest) choreographyInstanceMessages.getMessageSentFromParticipant("EcoRoutesRequest","ND");
		 *		A null value is returned if no message has been found. 
		 *	4. Get a list of messages using a message name and a sender participant name
		 *		- example: 
		 *			List<EcoRoutesRequest> messages = choreographyInstanceMessages.getMessagesSentFromParticipant("EcoRoutesRequest","ND"); 
		 *		A null value is returned if no message has been found.
		 *	5. Get a message using its name, the name of the sender participant and the name of the task in which 
		 *		the message has been exchanged
		 *		- example: 
		 *			EcoRoutesRequest message = (EcoRoutesRequest) choreographyInstanceMessages.getMessageSentFromParticipant("EcoRoutesRequest","ND","Get Eco Routes");	
		 *		A null value is returned if no message has been found.
		 *	6. Get a list of messages using a message name, the name of the sender participant and the name of the task in which 
		 *		the messages has been exchanged
		 *		- example: 
		 *			List<EcoRoutesRequest> messages = choreographyInstanceMessages.getMessagesSentFromParticipant("EcoRoutesRequest","ND","Get Eco Routes");
		 *		A null value is returned if no message has been found.
		 *	7. Get a message using its name and the name of the receiver participant
		 *		- example: 
		 *			RoutesRequest message = (RoutesRequest) choreographyInstanceMessages.getMessageReceivedParticipant("RoutesRequest", "DTS-GOOGLE");
		 *		A null value is returned if no message has been found. 
		 *	8. Get a message using its name, the name of the receiver participant and the name of the task in which 
		 *		the message has been exchanged
		 *		- example: 
		 *			RoutesRequest message = (RoutesRequest) choreographyInstanceMessages.getMessageReceivedFromParticipant("RoutesRequest", "DTS-GOOGLE", "Routes Request");;	
		 *		A null value is returned if no message has been found.
		 *	9. Get a list of messages using a message name and a receiver participant name
		 *		- example: 
         *			List<RoutesRequest> messages = choreographyInstanceMessages.getMessagesReceivedFromParticipant("RoutesRequest", "DTS-GOOGLE");
		 *	10. Get a list of messages using a message name, the name of the receiver participant and the name of the task in which 
		 *		the messages has been exchanged
		 *		- example: 
		 *			List<RoutesRequest> messages = choreographyInstanceMessages.getMessagesReceivedFromParticipant("RoutesRequest", "DTS-GOOGLE", "Routes Request");
		 *		A null value is returned if no message has been found.
		 */	
//    	FarmRegistrationNotification farmRegistrationNotification = (FarmRegistrationNotification) choreographyInstanceMessages.getMessage("farmRegistrationNotification");
    	
//    	FarmRegistrationNotification farmRegistrationNotification = (FarmRegistrationNotification) choreographyInstanceMessages.getMessageSentFromParticipant("farmRegistrationNotification","Registry Office");
//    	FarmRegistrationNotification farmRegistrationNotification = (FarmRegistrationNotification) choreographyInstanceMessages.getMessageSentFromParticipant("farmRegistrationNotification","Registry Office","Farm Business Startup Notification");    	

//    	FarmRegistrationNotification farmRegistrationNotification = (FarmRegistrationNotification) choreographyInstanceMessages.getMessageReceivedParticipant("farmRegistrationNotification", "Local Healthcare Company");
    	FarmRegistrationNotification farmRegistrationNotification = (FarmRegistrationNotification) choreographyInstanceMessages.getMessageReceivedFromParticipant("farmRegistrationNotification", "Local Healthcare Company", "Farm Business Startup Notification");     	
    	
    	result.setFarmCode(farmRegistrationNotification.getFarmCode());
    	return result;
    }
    

}
