package eu.chorevolution.farmbusinessstartup.provider.registryoffice.webservices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import eu.chorevolution.farmbusinessstartup.provider.registryoffice.RegistryOfficePT;
import eu.chorevolution.farmbusinessstartup.provider.registryoffice.FarmOpeningNotificationType;
import eu.chorevolution.farmbusinessstartup.provider.registryoffice.FarmOpeningNotificationReturnType;
import eu.chorevolution.farmbusinessstartup.provider.registryoffice.SendRequestType;
import eu.chorevolution.farmbusinessstartup.provider.registryoffice.FarmRegistrationRequestReturnType;
import eu.chorevolution.farmbusinessstartup.provider.registryoffice.FarmRegistrationRequest;
import eu.chorevolution.farmbusinessstartup.provider.registryoffice.FarmRegistrationNotificationReturnType;
import eu.chorevolution.farmbusinessstartup.provider.registryoffice.FarmRegistrationNotification;
import eu.chorevolution.farmbusinessstartup.provider.registryoffice.FarmBusinessCodeStartupNotificationReturnType;
import eu.chorevolution.farmbusinessstartup.provider.registryoffice.FarmBusinessCodeStartupNotification;
import eu.chorevolution.farmbusinessstartup.provider.registryoffice.ReceiveFarmRegistrationResponseType;
import eu.chorevolution.farmbusinessstartup.provider.registryoffice.ReceiveFarmRegistrationResponseReturnType;

//import eu.chorevolution.farmbusinessstartup.provider.registryoffice.business.ChoreographyDataService;
//import eu.chorevolution.farmbusinessstartup.provider.registryoffice.business.ChoreographyInstanceMessagesStore;
import eu.chorevolution.farmbusinessstartup.provider.registryoffice.webservices.RegistryOfficeService;


import eu.chorevolution.utilities.dataservice.ChoreographyInstanceMessages;
import eu.chorevolution.utilities.dataservice.ChoreographyDataService;
import eu.chorevolution.utilities.dataservice.ChoreographyInstanceMessagesStore;
import eu.chorevolution.utilities.dataservice.impl.ChoreographyInstanceMessagesStoreImpl;
import eu.chorevolution.utilities.dataservice.model.MessagesData;


@Component(value="RegistryOfficePTImpl")
public class RegistryOfficePTImpl implements RegistryOfficePT {
	
	private static Logger logger = LoggerFactory.getLogger(RegistryOfficePTImpl.class);

	@Autowired
	private RegistryOfficeService service;
	
	@Autowired
	private ChoreographyDataService choreographyDataService;
	
	
    @Override
    public FarmOpeningNotificationReturnType farmOpening(FarmOpeningNotificationType parameters) {
    	logger.info("CALLED farmOpening ON RegistryOffice");	
    	FarmOpeningNotificationReturnType result = new FarmOpeningNotificationReturnType();
    	ChoreographyInstanceMessagesStore store = choreographyDataService.getChoreographyInstanceMessages(parameters.getChoreographyId().getChoreographyId());
		store.storeMessage(parameters.getSenderParticipantName(), parameters.getReceiverParticipantName(), parameters.getInputMessageName(), parameters.getChoreographyTaskName(), parameters.getInputMessageData());
  		service.farmOpening(parameters.getInputMessageData(), parameters.getChoreographyTaskName(), parameters.getSenderParticipantName());
		
		return result;
    }
     
    @Override
    public FarmRegistrationRequestReturnType farmRegistrationRequest(SendRequestType parameters) {
    	logger.info("CALLED farmRegistrationRequest ON RegistryOffice");	
    	ChoreographyInstanceMessagesStore store = choreographyDataService.getChoreographyInstanceMessages(parameters.getChoreographyId().getChoreographyId());
		FarmRegistrationRequest businessResult = service.createFarmRegistrationRequest(store, parameters.getChoreographyTaskName(), parameters.getReceiverParticipantName());
		
		logger.info("CALLED sendFarmRegistrationRequest ON RegistryOffice");
		logger.info("CALLED sendFarmRegistrationRequest ON RegistryOffice");
		
		store.storeMessage(parameters.getSenderParticipantName(), parameters.getReceiverParticipantName(), parameters.getInputMessageName(), parameters.getChoreographyTaskName(), businessResult);
		FarmRegistrationRequestReturnType result = new FarmRegistrationRequestReturnType();
		result.setInputMessageData(businessResult);
	 
		return result;
    }
     
    @Override
    public FarmRegistrationNotificationReturnType farmRegistrationNotification(SendRequestType parameters) {
    	logger.info("CALLED farmRegistrationNotification ON RegistryOffice");	
    	ChoreographyInstanceMessagesStore store = choreographyDataService.getChoreographyInstanceMessages(parameters.getChoreographyId().getChoreographyId());
		FarmRegistrationNotification businessResult = service.createFarmRegistrationNotification(store, parameters.getChoreographyTaskName(), parameters.getReceiverParticipantName());
		store.storeMessage(parameters.getSenderParticipantName(), parameters.getReceiverParticipantName(), parameters.getInputMessageName(), parameters.getChoreographyTaskName(), businessResult);
		FarmRegistrationNotificationReturnType result = new FarmRegistrationNotificationReturnType();
		result.setInputMessageData(businessResult);
	 
		return result;
    }
     
    @Override
    public FarmBusinessCodeStartupNotificationReturnType farmBusinessCodeStartupNotification(SendRequestType parameters) {
    	logger.info("CALLED farmBusinessCodeStartupNotification ON RegistryOffice");	
    	ChoreographyInstanceMessagesStore store = choreographyDataService.getChoreographyInstanceMessages(parameters.getChoreographyId().getChoreographyId());
		FarmBusinessCodeStartupNotification businessResult = service.createFarmBusinessCodeStartupNotification(store, parameters.getChoreographyTaskName(), parameters.getReceiverParticipantName());
		store.storeMessage(parameters.getSenderParticipantName(), parameters.getReceiverParticipantName(), parameters.getInputMessageName(), parameters.getChoreographyTaskName(), businessResult);
		FarmBusinessCodeStartupNotificationReturnType result = new FarmBusinessCodeStartupNotificationReturnType();
		result.setInputMessageData(businessResult);
	 
		return result;
    }
     
	@Override
	public ReceiveFarmRegistrationResponseReturnType receiveFarmRegistrationResponse(ReceiveFarmRegistrationResponseType parameters) {
		logger.info("CALLED receiveFarmRegistrationResponse ON RegistryOffice");			
		ChoreographyInstanceMessagesStore store = choreographyDataService.getChoreographyInstanceMessages(parameters.getChoreographyId().getChoreographyId());
		store.storeMessage(parameters.getSenderParticipantName(), parameters.getReceiverParticipantName(), parameters.getOutputMessageName(), parameters.getChoreographyTaskName(), parameters.getOutputMessageData());
		service.receiveFarmRegistrationResponse(parameters.getOutputMessageData(), parameters.getChoreographyTaskName(), parameters.getSenderParticipantName());
		return new ReceiveFarmRegistrationResponseReturnType();
	}
     

	
}
