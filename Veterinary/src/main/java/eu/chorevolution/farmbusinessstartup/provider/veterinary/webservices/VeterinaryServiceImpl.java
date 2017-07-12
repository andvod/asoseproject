package eu.chorevolution.farmbusinessstartup.provider.veterinary.webservices;

import java.util.Date;

import org.springframework.stereotype.Service;

import eu.chorevolution.farmbusinessstartup.provider.veterinary.FarmRegistrationNotification;
import eu.chorevolution.farmbusinessstartup.provider.veterinary.FarmSiteInspectionRequest;
import eu.chorevolution.farmbusinessstartup.provider.veterinary.FarmSiteInspectionResponse;
import eu.chorevolution.farmbusinessstartup.provider.veterinary.VeterinarySiteInspectionDetails;

import eu.chorevolution.utilities.dataservice.ChoreographyInstanceMessages;

@Service
public class VeterinaryServiceImpl implements VeterinaryService {

	@Override
	public void farmOpeningSiteInspectionRequest(FarmSiteInspectionRequest parameter, String choreographyTaskName, String senderParticipantName) {
		/**
		*	TODO Add your business logic upon the reception of FarmSiteInspectionRequest message from senderParticipantName
		*/
	}     

	@Override
	public void farmHealthcareRegistration(FarmRegistrationNotification parameter, String choreographyTaskName, String senderParticipantName) {
		/**
		*	TODO Add your business logic upon the reception of FarmRegistrationNotification message from senderParticipantName
		*/
	}     

    @Override
    public FarmSiteInspectionResponse createFarmSiteInspectionResponse(ChoreographyInstanceMessages choreographyInstanceMessages, String choreographyTaskName, String receiverParticipantName) {
    	FarmSiteInspectionResponse result = new FarmSiteInspectionResponse();
    	/**
		 *	TODO write the code that generates FarmSiteInspectionResponse message 
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
//    	FarmSiteInspectionRequest farmSiteInspectionRequest = (FarmSiteInspectionRequest) choreographyInstanceMessages.getMessage("farmSiteInspectionRequest");

//    	FarmSiteInspectionRequest farmSiteInspectionRequest = (FarmSiteInspectionRequest) choreographyInstanceMessages.getMessageSentFromParticipant("farmSiteInspectionRequest","Local Healthcare Company");
//    	FarmSiteInspectionRequest farmSiteInspectionRequest = (FarmSiteInspectionRequest) choreographyInstanceMessages.getMessageSentFromParticipant("farmSiteInspectionRequest","Local Healthcare Company","Farm Opening Site Inspection Request");

//    	FarmSiteInspectionRequest farmSiteInspectionRequest = (FarmSiteInspectionRequest) choreographyInstanceMessages.getMessageReceivedParticipant("farmSiteInspectionRequest", "Veterinary");
    	System.out.println("VETERINARY!!!!!");
    	FarmSiteInspectionRequest farmSiteInspectionRequest = (FarmSiteInspectionRequest) choreographyInstanceMessages.getMessageReceivedFromParticipant("farmSiteInspectionRequest", "Veterinary", "Farm Opening Site Inspection Request");
    		
    	VeterinarySiteInspectionDetails veterinarySiteInspectionDetails = new VeterinarySiteInspectionDetails();
    	veterinarySiteInspectionDetails.setBreedingMethodologyType(farmSiteInspectionRequest.getBreedingMethodologyType());
    	veterinarySiteInspectionDetails.setFarmSurface(farmSiteInspectionRequest.getFarmSurface());
    	veterinarySiteInspectionDetails.setProductionType(farmSiteInspectionRequest.getProductionType());
    	veterinarySiteInspectionDetails.setReferenceLegislation("D.L.vo 146/01");
    	veterinarySiteInspectionDetails.setSiteAddress(farmSiteInspectionRequest.getSiteAddress());
    	veterinarySiteInspectionDetails.setSiteInspectionDate(new Date());
    	veterinarySiteInspectionDetails.setVeterinarySurname("Doe");
    	veterinarySiteInspectionDetails.setVeterinaryName("John");
    	result.setSiteInspectionVerbal(veterinarySiteInspectionDetails);
    	return result;
    }
    

}
