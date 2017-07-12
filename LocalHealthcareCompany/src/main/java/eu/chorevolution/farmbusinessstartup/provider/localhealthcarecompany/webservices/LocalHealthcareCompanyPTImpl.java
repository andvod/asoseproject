package eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.webservices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.LocalHealthcareCompanyPT;
import eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.FarmBusinessStartupRequestType;
import eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.webservices.LocalHealthcareCompanyService;
import eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.FarmBusinessStartupRequestReturnType;
import eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.FarmSiteInspectionResponseType;
import eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.FarmSiteInspectionResponseReturnType;
import eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.FarmRegistrationNotificationType;
import eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.FarmRegistrationNotificationReturnType;
import eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.SendRequestType;
import eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.FarmSiteInspectionRequestReturnType;
import eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.FarmSiteInspectionRequest;
import eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.FarmOpeningNotificationReturnType;
import eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.FarmOpeningNotification;
import eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.FarmBusinessStartupResponseReturnType;
import eu.chorevolution.farmbusinessstartup.provider.localhealthcarecompany.FarmBusinessStartupResponse;
import eu.chorevolution.utilities.dataservice.ChoreographyDataService;
import eu.chorevolution.utilities.dataservice.ChoreographyInstanceMessagesStore;

@Component(value="LocalHealthcareCompanyPTImpl")
public class LocalHealthcareCompanyPTImpl implements LocalHealthcareCompanyPT {
	
	private static Logger logger = LoggerFactory.getLogger(LocalHealthcareCompanyPTImpl.class);

	@Autowired
	private LocalHealthcareCompanyService service;
	
	@Autowired
	private ChoreographyDataService choreographyDataService;
	
    @Override
    public FarmBusinessStartupRequestReturnType farmBusinessCodeRequest(FarmBusinessStartupRequestType parameters) {
    	logger.info("CALLED farmBusinessCodeRequest ON LocalHealthcareCompany");	
    	FarmBusinessStartupRequestReturnType result = new FarmBusinessStartupRequestReturnType();
    	ChoreographyInstanceMessagesStore store = choreographyDataService.getChoreographyInstanceMessages(parameters.getChoreographyId().getChoreographyId());
		store.storeMessage(parameters.getSenderParticipantName(), parameters.getReceiverParticipantName(), parameters.getInputMessageName(), parameters.getChoreographyTaskName(), parameters.getInputMessageData());
  		service.farmBusinessCodeRequest(parameters.getInputMessageData(), parameters.getChoreographyTaskName(), parameters.getSenderParticipantName());
		
		return result;
    }
     
    @Override
    public FarmSiteInspectionResponseReturnType farmSiteInspectionVerbal(FarmSiteInspectionResponseType parameters) {
    	logger.info("CALLED farmSiteInspectionVerbal ON LocalHealthcareCompany");	
    	FarmSiteInspectionResponseReturnType result = new FarmSiteInspectionResponseReturnType();
    	ChoreographyInstanceMessagesStore store = choreographyDataService.getChoreographyInstanceMessages(parameters.getChoreographyId().getChoreographyId());
		store.storeMessage(parameters.getSenderParticipantName(), parameters.getReceiverParticipantName(), parameters.getInputMessageName(), parameters.getChoreographyTaskName(), parameters.getInputMessageData());
  		service.farmSiteInspectionVerbal(parameters.getInputMessageData(), parameters.getChoreographyTaskName(), parameters.getSenderParticipantName());
		
		return result;
    }
     
    @Override
    public FarmRegistrationNotificationReturnType farmBusinessStartupNotification(FarmRegistrationNotificationType parameters) {
    	logger.info("CALLED farmBusinessStartupNotification ON LocalHealthcareCompany");	
    	FarmRegistrationNotificationReturnType result = new FarmRegistrationNotificationReturnType();
    	ChoreographyInstanceMessagesStore store = choreographyDataService.getChoreographyInstanceMessages(parameters.getChoreographyId().getChoreographyId());
		store.storeMessage(parameters.getSenderParticipantName(), parameters.getReceiverParticipantName(), parameters.getInputMessageName(), parameters.getChoreographyTaskName(), parameters.getInputMessageData());
  		service.farmBusinessStartupNotification(parameters.getInputMessageData(), parameters.getChoreographyTaskName(), parameters.getSenderParticipantName());
		
		return result;
    }
     
    @Override
    public FarmSiteInspectionRequestReturnType farmSiteInspectionRequest(SendRequestType parameters) {
    	logger.info("CALLED farmSiteInspectionRequest ON LocalHealthcareCompany");	
    	ChoreographyInstanceMessagesStore store = choreographyDataService.getChoreographyInstanceMessages(parameters.getChoreographyId().getChoreographyId());
		FarmSiteInspectionRequest businessResult = service.createFarmSiteInspectionRequest(store, parameters.getChoreographyTaskName(), parameters.getReceiverParticipantName());
		store.storeMessage(parameters.getSenderParticipantName(), parameters.getReceiverParticipantName(), parameters.getInputMessageName(), parameters.getChoreographyTaskName(), businessResult);
		FarmSiteInspectionRequestReturnType result = new FarmSiteInspectionRequestReturnType();
		result.setInputMessageData(businessResult);
	 
		return result;
    }
     
    @Override
    public FarmOpeningNotificationReturnType farmOpeningNotification(SendRequestType parameters) {
    	logger.info("CALLED farmOpeningNotification ON LocalHealthcareCompany");	
    	ChoreographyInstanceMessagesStore store = choreographyDataService.getChoreographyInstanceMessages(parameters.getChoreographyId().getChoreographyId());
		FarmOpeningNotification businessResult = service.createFarmOpeningNotification(store, parameters.getChoreographyTaskName(), parameters.getReceiverParticipantName());
		store.storeMessage(parameters.getSenderParticipantName(), parameters.getReceiverParticipantName(), parameters.getInputMessageName(), parameters.getChoreographyTaskName(), businessResult);
		FarmOpeningNotificationReturnType result = new FarmOpeningNotificationReturnType();
		result.setInputMessageData(businessResult);
	 
		return result;
    }
     
    @Override
    public FarmBusinessStartupResponseReturnType farmBusinessStartupResponse(SendRequestType parameters) {
    	logger.info("CALLED farmBusinessStartupResponse ON LocalHealthcareCompany");	
    	ChoreographyInstanceMessagesStore store = choreographyDataService.getChoreographyInstanceMessages(parameters.getChoreographyId().getChoreographyId());
		FarmBusinessStartupResponse businessResult = service.createFarmBusinessStartupResponse(store, parameters.getChoreographyTaskName(), parameters.getReceiverParticipantName());
		store.storeMessage(parameters.getSenderParticipantName(), parameters.getReceiverParticipantName(), parameters.getInputMessageName(), parameters.getChoreographyTaskName(), businessResult);
		FarmBusinessStartupResponseReturnType result = new FarmBusinessStartupResponseReturnType();
		result.setInputMessageData(businessResult);
	 
		return result;
    }
     

	
}
