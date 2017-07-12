package eu.chorevolution.farmbusinessstartup.provider.registryoffice.webservices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import eu.chorevolution.farmbusinessstartup.provider.registryoffice.FarmBusinessCodeStartupNotification;
import eu.chorevolution.farmbusinessstartup.provider.registryoffice.FarmOpeningNotification;
import eu.chorevolution.farmbusinessstartup.provider.registryoffice.FarmRegistrationNotification;
import eu.chorevolution.farmbusinessstartup.provider.registryoffice.FarmRegistrationRequest;
import eu.chorevolution.farmbusinessstartup.provider.registryoffice.FarmRegistrationResponse;


import eu.chorevolution.utilities.dataservice.ChoreographyInstanceMessages;
import eu.chorevolution.utilities.dataservice.ChoreographyDataService;
import eu.chorevolution.utilities.dataservice.ChoreographyInstanceMessagesStore;
import eu.chorevolution.utilities.dataservice.impl.ChoreographiesDataServiceImpl;
import eu.chorevolution.utilities.dataservice.impl.ChoreographyInstanceMessagesStoreImpl;
import eu.chorevolution.utilities.dataservice.model.MessagesData;


@Service
public class RegistryOfficeServiceImpl implements RegistryOfficeService {
	
	private static Logger LOGGER = LoggerFactory.getLogger(RegistryOfficeServiceImpl.class);

	@Override
	public void farmOpening(FarmOpeningNotification parameter, String choreographyTaskName, String senderParticipantName) {
		/**
		*	TODO Add your business logic upon the reception of FarmOpeningNotification message from senderParticipantName
		*/
	}     

    @Override
    public FarmRegistrationRequest createFarmRegistrationRequest(ChoreographyInstanceMessages choreographyInstanceMessages, String choreographyTaskName, String receiverParticipantName) {
    	FarmRegistrationRequest result = new FarmRegistrationRequest();
    	/**
		 *	TODO write the code that generates FarmRegistrationRequest message 
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
//    	FarmOpeningNotification farmOpeningNotification = (FarmOpeningNotification) choreographyInstanceMessages.getMessage("farmOpeningNotification");
    	
//    	FarmOpeningNotification farmOpeningNotification = (FarmOpeningNotification) choreographyInstanceMessages.getMessageSentFromParticipant("farmOpeningNotification","Local Healthcare Company");
//    	FarmOpeningNotification farmOpeningNotification = (FarmOpeningNotification) choreographyInstanceMessages.getMessageSentFromParticipant("farmOpeningNotification","Local Healthcare Company","Farm Opening");
    	
    	
    	LOGGER.info("******* 3 USER *******");
		LOGGER.info("******* 3 USER *******");
		LOGGER.info("******* 3 USER *******");
		LOGGER.info("******* 3 USER *******");
    	
//    	FarmOpeningNotification farmOpeningNotification = (FarmOpeningNotification) choreographyInstanceMessages.getMessageReceivedParticipant("farmOpeningNotification", "Registry Office");
		
		
		
    	FarmOpeningNotification farmOpeningNotification = (FarmOpeningNotification) choreographyInstanceMessages.getMessageReceivedFromParticipant("farmOpeningNotification", "Registry Office", "Farm Opening"); 
    	
    	LOGGER.info("******* 3 USER *******");
		LOGGER.info("******* 3 USER *******");
		LOGGER.info("******* 3 USER *******");
		LOGGER.info("******* 3 USER *******");
    	
    	result.setFarm(farmOpeningNotification.getFarmOpeningRequestForm().getFarm());
    	result.setOwner(farmOpeningNotification.getFarmOpeningRequestForm().getOwner());
    	result.setSiteInspectionDetails(farmOpeningNotification.getSiteInspectionDetails());
    	
    	LOGGER.info("******* 3 USER *******");
		LOGGER.info("******* 3 USER *******");
		LOGGER.info("******* 3 USER *******");
		LOGGER.info("******* 3 USER *******");
    	
    	return result;
    }
    
    @Override
    public FarmRegistrationNotification createFarmRegistrationNotification(ChoreographyInstanceMessages choreographyInstanceMessages, String choreographyTaskName, String receiverParticipantName) {
    	FarmRegistrationNotification result = new FarmRegistrationNotification();
    	/**
		 *	TODO write the code that generates FarmRegistrationNotification message 
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
//    	FarmRegistrationResponse farmRegistrationResponse = (FarmRegistrationResponse) choreographyInstanceMessages.getMessage("farmRegistrationResponse");
    	
//    	FarmRegistrationResponse farmRegistrationResponse = (FarmRegistrationResponse) choreographyInstanceMessages.getMessageSentFromParticipant("farmRegistrationResponse","Veterinary Regional Register");
//    	FarmRegistrationResponse farmRegistrationResponse = (FarmRegistrationResponse) choreographyInstanceMessages.getMessageSentFromParticipant("farmRegistrationResponse","Veterinary Regional Register","Farm Registration");
 
//    	FarmRegistrationResponse farmRegistrationResponse = (FarmRegistrationResponse) choreographyInstanceMessages.getMessageReceivedParticipant("farmRegistrationResponse", "Registry Office");
    	FarmRegistrationResponse farmRegistrationResponse = (FarmRegistrationResponse) choreographyInstanceMessages.getMessageReceivedFromParticipant("farmRegistrationResponse", "Registry Office", "Farm Registration");
    	
    	
//    	FarmOpeningNotification farmOpeningNotification = (FarmOpeningNotification) choreographyInstanceMessages.getMessage("farmOpeningNotification");
    	
//    	FarmOpeningNotification farmOpeningNotification = (FarmOpeningNotification) choreographyInstanceMessages.getMessageSentFromParticipant("farmOpeningNotification","Local Healthcare Company");
//    	FarmOpeningNotification farmOpeningNotification = (FarmOpeningNotification) choreographyInstanceMessages.getMessageSentFromParticipant("farmOpeningNotification","Local Healthcare Company","Farm Opening");

//    	FarmOpeningNotification farmOpeningNotification = (FarmOpeningNotification) choreographyInstanceMessages.getMessageReceivedParticipant("farmOpeningNotification", "Registry Office");
    	FarmOpeningNotification farmOpeningNotification = (FarmOpeningNotification) choreographyInstanceMessages.getMessageReceivedFromParticipant("farmOpeningNotification", "Registry Office", "Farm Opening");    	
    	
    	result.setBreedingMethodologyType(farmOpeningNotification.getFarmOpeningRequestForm().getFarm().getBreedingMethodologyType());
    	result.setFarmCode(farmRegistrationResponse.getFarmCode());
    	result.setFarmName(farmOpeningNotification.getFarmOpeningRequestForm().getFarm().getFarmName());
    	result.setFarmSurface(farmOpeningNotification.getFarmOpeningRequestForm().getFarm().getFarmSurface());
    	result.setProductionType(farmOpeningNotification.getFarmOpeningRequestForm().getFarm().getProductionType());
    	result.setSiteAddress(farmOpeningNotification.getFarmOpeningRequestForm().getFarm().getCompanyHeadquarter());
    	LOGGER.info("******* USER IN sendFarmRegistrationNotification *******");
    	
    	return result;
    }
    
    @Override
    public FarmBusinessCodeStartupNotification createFarmBusinessCodeStartupNotification(ChoreographyInstanceMessages choreographyInstanceMessages, String choreographyTaskName, String receiverParticipantName) {
    	FarmBusinessCodeStartupNotification result = new FarmBusinessCodeStartupNotification();
    	/**
		 *	TODO write the code that generates FarmBusinessCodeStartupNotification message 
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
//    	FarmRegistrationResponse farmRegistrationResponse = (FarmRegistrationResponse) choreographyInstanceMessages.getMessage("farmRegistrationResponse");
    	
//    	FarmRegistrationResponse farmRegistrationResponse = (FarmRegistrationResponse) choreographyInstanceMessages.getMessageSentFromParticipant("farmRegistrationResponse","Veterinary Regional Register");
//    	FarmRegistrationResponse farmRegistrationResponse = (FarmRegistrationResponse) choreographyInstanceMessages.getMessageSentFromParticipant("farmRegistrationResponse","Veterinary Regional Register","Farm Registration");    	
 
//    	FarmRegistrationResponse farmRegistrationResponse = (FarmRegistrationResponse) choreographyInstanceMessages.getMessageReceivedParticipant("farmRegistrationResponse", "Registry Office");
    	FarmRegistrationResponse farmRegistrationResponse = (FarmRegistrationResponse) choreographyInstanceMessages.getMessageReceivedFromParticipant("farmRegistrationResponse", "Registry Office", "Farm Registration");      	
    	
//    	FarmOpeningNotification farmOpeningNotification = (FarmOpeningNotification) choreographyInstanceMessages.getMessage("farmOpeningNotification");
    	
//    	FarmOpeningNotification farmOpeningNotification = (FarmOpeningNotification) choreographyInstanceMessages.getMessageSentFromParticipant("farmOpeningNotification","Local Healthcare Company");
//    	FarmOpeningNotification farmOpeningNotification = (FarmOpeningNotification) choreographyInstanceMessages.getMessageSentFromParticipant("farmOpeningNotification","Local Healthcare Company","Farm Opening");    	

//    	FarmOpeningNotification farmOpeningNotification = (FarmOpeningNotification) choreographyInstanceMessages.getMessageReceivedParticipant("farmOpeningNotification", "Registry Office");
    	FarmOpeningNotification farmOpeningNotification = (FarmOpeningNotification) choreographyInstanceMessages.getMessageReceivedFromParticipant("farmOpeningNotification", "Registry Office", "Farm Opening");    	
    	
    	result.setFarm(farmOpeningNotification.getFarmOpeningRequestForm().getFarm());
    	result.setFarmCode(farmRegistrationResponse.getFarmCode());
    	return result;
    }
    
	@Override    
    public void receiveFarmRegistrationResponse(FarmRegistrationResponse parameter, String choreographyTaskName, String senderParticipantName) {
    	/**
		*	TODO Add your business logic upon the reception of (FarmRegistrationResponse message from senderParticipantName 
		*		 within the interaction belonging to choreographyTaskName
		*/
    }
    

}
