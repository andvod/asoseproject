package eu.chorevolution.farmbusinessstartup.provider.veterinary.webservices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import eu.chorevolution.farmbusinessstartup.provider.veterinary.VeterinaryPT;
import eu.chorevolution.farmbusinessstartup.provider.veterinary.FarmSiteInspectionRequestType;
import eu.chorevolution.farmbusinessstartup.provider.veterinary.FarmSiteInspectionRequestReturnType;
import eu.chorevolution.farmbusinessstartup.provider.veterinary.FarmRegistrationNotificationType;
import eu.chorevolution.farmbusinessstartup.provider.veterinary.FarmRegistrationNotificationReturnType;
import eu.chorevolution.farmbusinessstartup.provider.veterinary.SendRequestType;
import eu.chorevolution.farmbusinessstartup.provider.veterinary.FarmSiteInspectionResponseReturnType;
import eu.chorevolution.farmbusinessstartup.provider.veterinary.FarmSiteInspectionResponse;

import eu.chorevolution.farmbusinessstartup.provider.veterinary.webservices.VeterinaryService;

import eu.chorevolution.utilities.dataservice.ChoreographyDataService;
import eu.chorevolution.utilities.dataservice.ChoreographyInstanceMessagesStore;


@Component(value="VeterinaryPTImpl")
public class VeterinaryPTImpl implements VeterinaryPT {
	
	private static Logger logger = LoggerFactory.getLogger(VeterinaryPTImpl.class);

	@Autowired
	private VeterinaryService service;
	
	@Autowired
	private ChoreographyDataService choreographyDataService;
	
    @Override
    public FarmSiteInspectionRequestReturnType farmOpeningSiteInspectionRequest(FarmSiteInspectionRequestType parameters) {
    	logger.info("CALLED farmOpeningSiteInspectionRequest ON Veterinary");	
    	FarmSiteInspectionRequestReturnType result = new FarmSiteInspectionRequestReturnType();
    	ChoreographyInstanceMessagesStore store = choreographyDataService.getChoreographyInstanceMessages(parameters.getChoreographyId().getChoreographyId());
		store.storeMessage(parameters.getSenderParticipantName(), parameters.getReceiverParticipantName(), parameters.getInputMessageName(), parameters.getChoreographyTaskName(), parameters.getInputMessageData());
  		service.farmOpeningSiteInspectionRequest(parameters.getInputMessageData(), parameters.getChoreographyTaskName(), parameters.getSenderParticipantName());
		
		return result;
    }
     
    @Override
    public FarmRegistrationNotificationReturnType farmHealthcareRegistration(FarmRegistrationNotificationType parameters) {
    	logger.info("CALLED farmHealthcareRegistration ON Veterinary");		
    	FarmRegistrationNotificationReturnType result = new FarmRegistrationNotificationReturnType();
    	ChoreographyInstanceMessagesStore store = choreographyDataService.getChoreographyInstanceMessages(parameters.getChoreographyId().getChoreographyId());
		store.storeMessage(parameters.getSenderParticipantName(), parameters.getReceiverParticipantName(), parameters.getInputMessageName(), parameters.getChoreographyTaskName(), parameters.getInputMessageData());
  		service.farmHealthcareRegistration(parameters.getInputMessageData(), parameters.getChoreographyTaskName(), parameters.getSenderParticipantName());
		
		return result;
    }
     
    @Override
    public FarmSiteInspectionResponseReturnType farmSiteInspectionResponse(SendRequestType parameters) {
    	logger.info("CALLED farmSiteInspectionResponse ON Veterinary");	
    	ChoreographyInstanceMessagesStore store = choreographyDataService.getChoreographyInstanceMessages(parameters.getChoreographyId().getChoreographyId());
		FarmSiteInspectionResponse businessResult = service.createFarmSiteInspectionResponse(store, parameters.getChoreographyTaskName(), parameters.getReceiverParticipantName());
		store.storeMessage(parameters.getSenderParticipantName(), parameters.getReceiverParticipantName(), parameters.getInputMessageName(), parameters.getChoreographyTaskName(), businessResult);
		FarmSiteInspectionResponseReturnType result = new FarmSiteInspectionResponseReturnType();
		result.setInputMessageData(businessResult);
	 
		return result;
    }
     

	
}
