package qa.gov.ict.process.submitNewApp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import qa.gov.mol.lr.common.ICommonConstants;
import qa.gov.mol.lr.process.constants.IProcessConstants;
import qa.gov.mol.lr.process.util.ResourceBundleUtil;

import com.ibm.websphere.bo.BOFactory;
import com.ibm.websphere.sca.ServiceManager;
import commonj.sdo.DataObject;


public class prepareNotificationRequestImpl {

	static Logger myLogger = Logger.getLogger("prepareNotificationRequestImpl");

	/**
	 * Default constructor.
	 */
	public prepareNotificationRequestImpl() {
		super();
	}

	/**
	 * Return a reference to the component service instance for this implementation
	 * class.  This method should be used when passing this service to a partner reference
	 * or if you want to invoke this component service asynchronously.    
	 *
	 * @generated (com.ibm.wbit.java)
	 */
	@SuppressWarnings("unused")
	private Object getMyService() {
		return (Object) ServiceManager.INSTANCE.locateService("self");
	}

	/**
	 * Method generated to support implementation of operation "PrepareNotificationRequest" defined for WSDL port type 
	 * named "PrepareNotification".
	 * 
	 * The presence of commonj.sdo.DataObject as the return type and/or as a parameter 
	 * type conveys that it is a complex type. Please refer to the WSDL Definition for more information 
	 * on the type of input, output and fault(s).
	 */
	public DataObject PrepareNotificationRequest(DataObject app,
			DataObject estInfo) {
		myLogger.log(ICommonConstants.LOGGER_LEVEL_IN_CODE,	"Begin of method: prepareNotificationRequest");
		
		String AppNo=app.getDataObject("applicationID").getString("ApplicationNumber");
		String year=app.getDataObject("applicationID").getString("year");
		
		String separtor="?";
		String agentPhone=app.getString("agentPhone");
		String agentEmail=app.getString("agentEmail");
		List ownersEmail= new ArrayList();
		List ownersPhone= new ArrayList();
		List owners=estInfo.getList("owners");
		for (Iterator iterator = owners.iterator(); iterator.hasNext();) {
			DataObject owner = (DataObject) iterator.next();
			String email=owner.getString("emailAddress");
			if(email!=null && email!=""){
				ownersEmail.add(email);
			}
			String phone=owner.getString("mobilePhone");
			if(phone!=null && phone!=""){
				ownersPhone.add(phone);
			}
		}
		//create a notificationRequest object
		BOFactory factory = (BOFactory) new ServiceManager().locateService("com/ibm/websphere/bo/BOFactory");
		DataObject notificationRequestBO = factory.create("urn:igov.gov.qa/sharedServices/notification/xml/schemas/v1_0/","NotificationRequestType");

		String notifySubjectEn=ResourceBundleUtil.getString(IProcessConstants.PROCESS_CONFIG, IProcessConstants.NEW_APP_NOTIFICATION_SUBJECT_EN).replace(separtor, AppNo);
		String notifySubjectAr=ResourceBundleUtil.getString(IProcessConstants.PROCESS_CONFIG, IProcessConstants.NEW_APP_NOTIFICATION_SUBJECT_AR).replace(separtor, AppNo);
		String notifyBodyEn=ResourceBundleUtil.getString(IProcessConstants.PROCESS_CONFIG, IProcessConstants.NEW_APP_NOTIFICATION_BODY_EN).replace(separtor, AppNo);
		String notifyBodyAr=ResourceBundleUtil.getString(IProcessConstants.PROCESS_CONFIG, IProcessConstants.NEW_APP_NOTIFICATION_BODY_AR).replace(separtor, AppNo);
		String sender=ResourceBundleUtil.getString(ICommonConstants.COMMON_CONFIG, ICommonConstants.LR_EMAIL_SENDER);
		List notificatioinMessageList = new ArrayList();
		if(agentPhone!=null && agentPhone!=""){
			// SMS message for agent EN
			notificatioinMessageList.add(createSMSNotificationMessage(agentPhone, notifyBodyEn,ICommonConstants.ENGLISH));			
			// SMS message for agent AR
			notificatioinMessageList.add(createSMSNotificationMessage(agentPhone, notifyBodyAr,ICommonConstants.ARABIC));			
		}
		if(agentEmail!=null && agentEmail!=""){
			// Email message for agent EN
			notificatioinMessageList.add(createEmailNotificationMessage(sender,agentEmail,notifySubjectEn,notifyBodyEn));			
			// Email message for agent AR
			notificatioinMessageList.add(createEmailNotificationMessage(sender,agentEmail,notifySubjectAr,notifyBodyAr));			
		}
		// notify owners by SMS
		for (Iterator iterator = ownersPhone.iterator(); iterator
				.hasNext();) {
			String ownerPhone = (String) iterator.next();
			// SMS message for owner EN
			notificatioinMessageList.add(createSMSNotificationMessage(ownerPhone, notifyBodyEn,ICommonConstants.ENGLISH));			
			// SMS message for owner AR
			notificatioinMessageList.add(createSMSNotificationMessage(ownerPhone, notifyBodyAr,ICommonConstants.ARABIC));			
			
		}
		// notify owners by Email
		for (Iterator iterator = ownersEmail.iterator(); iterator
				.hasNext();) {
			String ownerEmail = (String) iterator.next();
			// Email message for owner EN
			notificatioinMessageList.add(createEmailNotificationMessage(sender,ownerEmail,notifySubjectEn,notifyBodyEn));			
			// Email message for owner AR
			notificatioinMessageList.add(createEmailNotificationMessage(sender,ownerEmail,notifySubjectAr,notifyBodyAr));						
		}
		
		notificationRequestBO.set("notificationMessage", notificatioinMessageList);
		
		myLogger.log(ICommonConstants.LOGGER_LEVEL_IN_CODE,	"End of method: prepareNotificationRequest");
		return notificationRequestBO;
	}

	private DataObject createSMSNotificationMessage(String mobileNo, String Message,String lang){
		myLogger.log(ICommonConstants.LOGGER_LEVEL_IN_CODE,	"Begin of method: createSMSNotificationMessage");
		
		BOFactory factory = (BOFactory) new ServiceManager().locateService("com/ibm/websphere/bo/BOFactory");
		//create a notificationMessage object
		DataObject notificationMessageBO = factory.create("urn:igov.gov.qa/sharedServices/notification/xml/schemas/v1_0/","NotificationMessageType");
		DataObject smsdetailsBO = factory.create("urn:igov.gov.qa/sharedServices/notification/xml/schemas/v1_0/","SMSDetailsType");
		String senderCode=ResourceBundleUtil.getString(ICommonConstants.COMMON_CONFIG, ICommonConstants.SMS_SENDER_CODE);
			
		smsdetailsBO.set("senderCode", senderCode);
		smsdetailsBO.set("mobileNumber", mobileNo);
		smsdetailsBO.set("message", Message);
		smsdetailsBO.set("messageLanguage", lang);
		notificationMessageBO.set("smsDetails", smsdetailsBO);

		myLogger.log(ICommonConstants.LOGGER_LEVEL_IN_CODE,	"End of method: createSMSNotificationMessage");
		return notificationMessageBO;
	}

	private DataObject createEmailNotificationMessage(String sender, String recipient,String subject,String message){
		myLogger.log(ICommonConstants.LOGGER_LEVEL_IN_CODE,	"Begin of method: createEmailNotificationMessage");
		
		BOFactory factory = (BOFactory) new ServiceManager().locateService("com/ibm/websphere/bo/BOFactory");
		//create a notificationMessage object
		DataObject notificationMessageBO = factory.create("urn:igov.gov.qa/sharedServices/notification/xml/schemas/v1_0/","NotificationMessageType");
		DataObject emailDetialsBo = factory.create("urn:igov.gov.qa/sharedServices/notification/xml/schemas/v1_0/","EmailDetailsType");
			
		emailDetialsBo.set("sender", sender);
		emailDetialsBo.set("recipient", recipient);
		emailDetialsBo.set("subject", subject);
		emailDetialsBo.set("message", message);
		notificationMessageBO.set("emailDetails", emailDetialsBo);

		myLogger.log(ICommonConstants.LOGGER_LEVEL_IN_CODE,	"End of method: createEmailNotificationMessage");
		return notificationMessageBO;
	}


}