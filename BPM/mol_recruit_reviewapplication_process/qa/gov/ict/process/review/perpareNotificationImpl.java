package qa.gov.ict.process.review;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import qa.gov.mol.lr.common.ICommonConstants;
import qa.gov.mol.lr.common.IReviewResults;
import qa.gov.mol.lr.process.constants.IProcessConstants;
import qa.gov.mol.lr.process.util.ResourceBundleUtil;

import commonj.sdo.DataObject;

import com.ibm.websphere.bo.BOFactory;
import com.ibm.websphere.sca.ServiceManager;

public class perpareNotificationImpl {
	static Logger myLogger = Logger.getLogger("prepareNotificationRequestImpl");
	/**
	 * Default constructor.
	 */
	public perpareNotificationImpl() {
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
	 * Method generated to support implementation of operation "perpareNotification" defined for WSDL port type 
	 * named "IPrepareNotifcationReview".
	 * 
	 * The presence of commonj.sdo.DataObject as the return type and/or as a parameter 
	 * type conveys that it is a complex type. Please refer to the WSDL Definition for more information 
	 * on the type of input, output and fault(s).
	 */
	public DataObject perpareNotification(DataObject app,
			DataObject reviewResults) {
		myLogger.log(ICommonConstants.LOGGER_LEVEL_IN_CODE,	"Begin of method: prepareNotificationRequest");
		
		String AppNo=app.getDataObject("applicationID").getString("ApplicationNumber");
		String year=app.getDataObject("applicationID").getString("year");
		String separtor="?";
		String agentPhone=app.getString("agentPhone");
		String agentEmail=app.getString("agentEmail");

		String  result= reviewResults.getString("result");
		String notifySubjectEn=ResourceBundleUtil.getString(IProcessConstants.PROCESS_CONFIG, IProcessConstants.REVIEW_APP_NOTIFICATION_SUBJECT_EN).replace(separtor, AppNo);
		String notifySubjectAr=ResourceBundleUtil.getString(IProcessConstants.PROCESS_CONFIG, IProcessConstants.REVIEW_APP_NOTIFICATION_SUBJECT_AR).replace(separtor, AppNo);
		String notifyBodyEn="";
		String notifyBodyAr="";
		String notificationMsg=reviewResults.getString("notification");
		if(notificationMsg!=null && notificationMsg!=""){
			notifyBodyEn=notificationMsg;
			notifyBodyAr=notificationMsg;
		}
		else{
			if(IReviewResults.APPROVED.equalsIgnoreCase(result)){
				notifyBodyEn=ResourceBundleUtil.getString(IProcessConstants.PROCESS_CONFIG, IProcessConstants.REVIEW_APP_NOTIFICATION_BODY_AR_APPROVED).replace(separtor, AppNo);
				notifyBodyAr=ResourceBundleUtil.getString(IProcessConstants.PROCESS_CONFIG, IProcessConstants.REVIEW_APP_NOTIFICATION_BODY_AR_APPROVED).replace(separtor, AppNo);			
			}
			else if(IReviewResults.REJECTED.equalsIgnoreCase(result)){
				notifyBodyEn=ResourceBundleUtil.getString(IProcessConstants.PROCESS_CONFIG, IProcessConstants.REVIEW_APP_NOTIFICATION_BODY_AR_REJECTED).replace(separtor, AppNo);
				notifyBodyAr=ResourceBundleUtil.getString(IProcessConstants.PROCESS_CONFIG, IProcessConstants.REVIEW_APP_NOTIFICATION_BODY_AR_REJECTED).replace(separtor, AppNo);			
			}
			else if(IReviewResults.SUSPENDED.equalsIgnoreCase(result)){
				notifyBodyEn=ResourceBundleUtil.getString(IProcessConstants.PROCESS_CONFIG, IProcessConstants.REVIEW_APP_NOTIFICATION_BODY_AR_SUSPENDED).replace(separtor, AppNo);
				notifyBodyAr=ResourceBundleUtil.getString(IProcessConstants.PROCESS_CONFIG, IProcessConstants.REVIEW_APP_NOTIFICATION_BODY_AR_SUSPENDED).replace(separtor, AppNo);			
			}
		}
		//create a notificationRequest object
		BOFactory factory = (BOFactory) new ServiceManager().locateService("com/ibm/websphere/bo/BOFactory");
		DataObject notificationRequestBO = factory.create("urn:igov.gov.qa/sharedServices/notification/xml/schemas/v1_0/","NotificationRequestType");

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