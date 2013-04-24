package qa.gov.mol.lr.process.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import qa.gov.mol.lr.common.ICommonConstants;
import qa.gov.mol.lr.common.IReviewResults;
import qa.gov.mol.lr.process.constants.IProcessConstants;

import com.ibm.websphere.bo.BOFactory;
import com.ibm.websphere.sca.ServiceManager;

import commonj.sdo.DataObject;

public class PrepareNotificationUtil {
	static Logger myLogger = Logger.getLogger("prepareNotificationUtil");
	private static String ARABIC = "0";
	private static String ENGLISH = "1";
	private static String BOTH = "2";
	private static String TRUE = "TRUE";
	private static String StringSeparator = "@@";
	
	
	public static DataObject prepareNotificatoinForSubmitNewApp(DataObject app,
			DataObject estInfo) {
		myLogger.log(ICommonConstants.LOGGER_LEVEL_DEBUG,	"Begin of method: prepareNotificationRequest");
		
		String AppNo=app.getDataObject("applicationID").getString("ApplicationNumber");
		String year=app.getDataObject("applicationID").getString("year");
		
		String separtor="%";
		String agentPhone=app.getString("agentPhone");
		String agentEmail=app.getString("agentEmail");
		List ownersEmail= new ArrayList();
		List ownersPhone= new ArrayList();
		if(estInfo!=null){		
			List owners=estInfo.getList("owners");
			for (Iterator iterator = owners.iterator(); iterator.hasNext();) {
				DataObject owner = (DataObject) iterator.next();
				String email=owner.getString("emailAddress");
				if(email!=null && email!=""){
					ownersEmail.add(email);
				}
				String phone=owner.getString("businessPhone");
				if(phone!=null && phone!=""){
					ownersPhone.add(phone);
				}
			}
		}
		String notificationLang=ResourceBundleUtil.getString(IProcessConstants.PROCESS_CONFIG, IProcessConstants.NOTIFICATION_LANG);
		String SENDSMS=ResourceBundleUtil.getString(IProcessConstants.PROCESS_CONFIG, IProcessConstants.SEND_SMS);

		//create a notificationRequest object
		BOFactory factory = (BOFactory) new ServiceManager().locateService("com/ibm/websphere/bo/BOFactory");
		DataObject notificationRequestBO = factory.create("urn:igov.gov.qa/sharedServices/notification/xml/schemas/v1_0/","NotificationRequestType");
		String notifySubjectEn=ResourceBundleUtil.getString(IProcessConstants.PROCESS_CONFIG, IProcessConstants.NEW_APP_NOTIFICATION_SUBJECT_EN).replaceFirst(separtor, AppNo).replaceFirst(separtor, year);
		String notifySubjectAr=ResourceBundleUtil.getString(IProcessConstants.PROCESS_CONFIG, IProcessConstants.NEW_APP_NOTIFICATION_SUBJECT_AR).replaceFirst(separtor, AppNo).replaceFirst(separtor, year);
		String notifyBodyEn_Email=ResourceBundleUtil.getString(IProcessConstants.PROCESS_CONFIG, IProcessConstants.NEW_APP_NOTIFICATION_BODY_EN_EMAIL).replaceFirst(separtor, AppNo).replaceFirst(separtor, year);
		String notifyBodyEn_SMS=ResourceBundleUtil.getString(IProcessConstants.PROCESS_CONFIG, IProcessConstants.NEW_APP_NOTIFICATION_BODY_EN_SMS).replaceFirst(separtor, AppNo).replaceFirst(separtor, year);
		String notifyBodyAr_Email=ResourceBundleUtil.getString(IProcessConstants.PROCESS_CONFIG, IProcessConstants.NEW_APP_NOTIFICATION_BODY_AR_EMAIL).replaceFirst(separtor, AppNo).replaceFirst(separtor, year);
		String notifyBodyAr_SMS=ResourceBundleUtil.getString(IProcessConstants.PROCESS_CONFIG, IProcessConstants.NEW_APP_NOTIFICATION_BODY_AR_SMS).replaceFirst(separtor, AppNo).replaceFirst(separtor, year);
		String sender=ResourceBundleUtil.getString(ICommonConstants.COMMON_CONFIG, ICommonConstants.LR_EMAIL_SENDER);
		List notificatioinMessageList = new ArrayList();
		if(agentPhone!=null && agentPhone!=""){
			// SMS message for agent EN
			if(SENDSMS.equalsIgnoreCase(TRUE) && (notificationLang.equalsIgnoreCase(ENGLISH) || notificationLang.equalsIgnoreCase(BOTH))){
				notificatioinMessageList.add(createSMSNotificationMessage(agentPhone, notifyBodyEn_SMS,ICommonConstants.ENGLISH));
			}
			// SMS message for agent AR
			if(SENDSMS.equalsIgnoreCase(TRUE) && (notificationLang.equalsIgnoreCase(ARABIC) || notificationLang.equalsIgnoreCase(BOTH))){
				notificatioinMessageList.add(createSMSNotificationMessage(agentPhone, notifyBodyAr_SMS,ICommonConstants.ARABIC));			
			}
		}
		if(agentEmail!=null && agentEmail!=""){
			// Email message for agent EN
			if(notificationLang.equalsIgnoreCase(ENGLISH) || notificationLang.equalsIgnoreCase(BOTH)){
				notificatioinMessageList.add(createEmailNotificationMessage(sender,agentEmail,notifySubjectEn,notifyBodyEn_Email));
			}
			// Email message for agent AR
			if(notificationLang.equalsIgnoreCase(ARABIC) || notificationLang.equalsIgnoreCase(BOTH)){
				notificatioinMessageList.add(createEmailNotificationMessage(sender,agentEmail,notifySubjectAr,notifyBodyAr_Email));			
			}
		}
		// notify owners by SMS
		for (Iterator iterator = ownersPhone.iterator(); iterator
				.hasNext();) {
			String ownerPhone = (String) iterator.next();
			// SMS message for owner EN
			if(SENDSMS.equalsIgnoreCase(TRUE) && (notificationLang.equalsIgnoreCase(ENGLISH) || notificationLang.equalsIgnoreCase(BOTH))){
				notificatioinMessageList.add(createSMSNotificationMessage(ownerPhone, notifyBodyEn_SMS,ICommonConstants.ENGLISH));
			}
			// SMS message for owner AR
			if(SENDSMS.equalsIgnoreCase(TRUE) && (notificationLang.equalsIgnoreCase(ARABIC) || notificationLang.equalsIgnoreCase(BOTH))){
				notificatioinMessageList.add(createSMSNotificationMessage(ownerPhone, notifyBodyAr_SMS,ICommonConstants.ARABIC));
			}
			
		}
		// notify owners by Email
		for (Iterator iterator = ownersEmail.iterator(); iterator
				.hasNext();) {
			String ownerEmail = (String) iterator.next();
			// Email message for owner EN
			if(notificationLang.equalsIgnoreCase(ENGLISH) || notificationLang.equalsIgnoreCase(BOTH)){
				notificatioinMessageList.add(createEmailNotificationMessage(sender,ownerEmail,notifySubjectEn,notifyBodyEn_Email));
			}
			// Email message for owner AR
			if(notificationLang.equalsIgnoreCase(ARABIC) || notificationLang.equalsIgnoreCase(BOTH)){
				notificatioinMessageList.add(createEmailNotificationMessage(sender,ownerEmail,notifySubjectAr,notifyBodyAr_Email));
			}
		}
		
		notificationRequestBO.set("notificationMessage", notificatioinMessageList);
		
		myLogger.log(ICommonConstants.LOGGER_LEVEL_DEBUG,	"End of method: prepareNotificationRequest");
		return notificationRequestBO;
	}
	
	public static DataObject prepareNotificatoinForCSRReview(DataObject app,
			DataObject reviewResults, DataObject estInfo) {
		myLogger.log(ICommonConstants.LOGGER_LEVEL_IN_CODE,
		"Begin of method: prepareNotificationRequest");

		String AppNo = app.getDataObject("applicationID").getString(
				"ApplicationNumber");
		String year = app.getDataObject("applicationID").getString("year");
		String separtor = "%";
		String agentPhone = app.getString("agentPhone");
		String agentEmail = app.getString("agentEmail");
		
		List ownersEmail= new ArrayList();
		List ownersPhone= new ArrayList();
		if(estInfo!=null){
			List owners=estInfo.getList("owners");
			for (Iterator iterator = owners.iterator(); iterator.hasNext();) {
				DataObject owner = (DataObject) iterator.next();
				String email=owner.getString("emailAddress");
				if(email!=null && email!=""){
					ownersEmail.add(email);
				}
				String phone=owner.getString("businessPhone");
				if(phone!=null && phone!=""){
					ownersPhone.add(phone);
				}
			}
			
		}
		
		
		String notificationLang = ResourceBundleUtil.getString(
				IProcessConstants.PROCESS_CONFIG,
				IProcessConstants.NOTIFICATION_LANG);
		String SENDSMS = ResourceBundleUtil.getString(
				IProcessConstants.PROCESS_CONFIG, IProcessConstants.SEND_SMS);
		
		String result = reviewResults.getString("result");
		String notifySubjectEn = ResourceBundleUtil.getString(
				IProcessConstants.PROCESS_CONFIG,
				IProcessConstants.REVIEW_APP_NOTIFICATION_SUBJECT_EN)
				.replaceFirst(separtor, AppNo).replaceFirst(separtor, year);
		String notifySubjectAr = ResourceBundleUtil.getString(
				IProcessConstants.PROCESS_CONFIG,
				IProcessConstants.REVIEW_APP_NOTIFICATION_SUBJECT_AR)
				.replaceFirst(separtor, AppNo).replaceFirst(separtor, year);
		String notifyBodyEn = "";
		String notifyBodyAr = "";
		String notificationMsg = reviewResults.getString("notification");
		if (notificationMsg != null && notificationMsg.trim() != "") {
			notificationLang = ARABIC;
			notifyBodyAr = notificationMsg;
			// temp solution to get notification English text from userName
			String notificationMsgEng = reviewResults.getString("/userID/name");
			if (notificationMsgEng != null && notificationMsgEng.trim() != "") {
				notificationLang = BOTH;
				notifyBodyEn = notificationMsgEng;
				reviewResults.setString("/userID/name", "");
			}
		
		} else {
			if (IReviewResults.APPROVED.equalsIgnoreCase(result)) {
				notifyBodyEn = ResourceBundleUtil
						.getString(
								IProcessConstants.PROCESS_CONFIG,
								IProcessConstants.REVIEW_APP_NOTIFICATION_BODY_EN_APPROVED)
						.replaceFirst(separtor, AppNo).replaceFirst(separtor,
								year);
				notifyBodyAr = ResourceBundleUtil
						.getString(
								IProcessConstants.PROCESS_CONFIG,
								IProcessConstants.REVIEW_APP_NOTIFICATION_BODY_AR_APPROVED)
						.replaceFirst(separtor, AppNo).replaceFirst(separtor,
								year);
			} else if (IReviewResults.REJECTED.equalsIgnoreCase(result)) {
				notifyBodyEn = ResourceBundleUtil
						.getString(
								IProcessConstants.PROCESS_CONFIG,
								IProcessConstants.REVIEW_APP_NOTIFICATION_BODY_EN_REJECTED)
						.replaceFirst(separtor, AppNo).replaceFirst(separtor,
								year);
				notifyBodyAr = ResourceBundleUtil
						.getString(
								IProcessConstants.PROCESS_CONFIG,
								IProcessConstants.REVIEW_APP_NOTIFICATION_BODY_AR_REJECTED)
						.replaceFirst(separtor, AppNo).replaceFirst(separtor,
								year);
			} else if (IReviewResults.SUSPENDED.equalsIgnoreCase(result)) {
				notifyBodyEn = ResourceBundleUtil
						.getString(
								IProcessConstants.PROCESS_CONFIG,
								IProcessConstants.REVIEW_APP_NOTIFICATION_BODY_EN_SUSPENDED)
						.replaceFirst(separtor, AppNo).replaceFirst(separtor,
								year);
				notifyBodyAr = ResourceBundleUtil
						.getString(
								IProcessConstants.PROCESS_CONFIG,
								IProcessConstants.REVIEW_APP_NOTIFICATION_BODY_AR_SUSPENDED)
						.replaceFirst(separtor, AppNo).replaceFirst(separtor,
								year);
			}
		}
		//create a notificationRequest object
		BOFactory factory = (BOFactory) new ServiceManager()
				.locateService("com/ibm/websphere/bo/BOFactory");
		DataObject notificationRequestBO = factory
				.create(
						"urn:igov.gov.qa/sharedServices/notification/xml/schemas/v1_0/",
						"NotificationRequestType");
		
		String sender = ResourceBundleUtil.getString(
				ICommonConstants.COMMON_CONFIG,
				ICommonConstants.LR_EMAIL_SENDER);
		List notificatioinMessageList = new ArrayList();
		if (agentPhone != null && agentPhone != "") {
			// SMS message for agent EN
			if (SENDSMS.equalsIgnoreCase(TRUE)
					&& (notificationLang.equalsIgnoreCase(ENGLISH) || notificationLang
							.equalsIgnoreCase(BOTH))) {
				notificatioinMessageList.add(createSMSNotificationMessage(
						agentPhone, notifyBodyEn, ICommonConstants.ENGLISH));
			}
			// SMS message for agent AR
			if (SENDSMS.equalsIgnoreCase(TRUE)
					&& (notificationLang.equalsIgnoreCase(ARABIC) || notificationLang
							.equalsIgnoreCase(BOTH))) {
				notificatioinMessageList.add(createSMSNotificationMessage(
						agentPhone, notifyBodyAr, ICommonConstants.ARABIC));
			}
		}
		if (agentEmail != null && agentEmail != "") {
			// Email message for agent EN
			if ((notificationLang.equalsIgnoreCase(ENGLISH) || notificationLang
					.equalsIgnoreCase(BOTH))) {
				notificatioinMessageList.add(createEmailNotificationMessage(
						sender, agentEmail, notifySubjectEn, notifyBodyEn));
			}
			// Email message for agent AR
			if (notificationLang.equalsIgnoreCase(ARABIC)
					|| notificationLang.equalsIgnoreCase(BOTH)) {
				notificatioinMessageList.add(createEmailNotificationMessage(
						sender, agentEmail, notifySubjectAr, notifyBodyAr));
			}
		}
		if(IReviewResults.APPROVED.equalsIgnoreCase(result) ||IReviewResults.REJECTED.equalsIgnoreCase(result) ){
			// notify owners by SMS
			for (Iterator iterator = ownersPhone.iterator(); iterator
					.hasNext();) {
				String ownerPhone = (String) iterator.next();
				// SMS message for owner EN
				if(SENDSMS.equalsIgnoreCase(TRUE) && (notificationLang.equalsIgnoreCase(ENGLISH) || notificationLang.equalsIgnoreCase(BOTH))){
					notificatioinMessageList.add(createSMSNotificationMessage(ownerPhone, notifyBodyEn,ICommonConstants.ENGLISH));
				}
				// SMS message for owner AR
				if(SENDSMS.equalsIgnoreCase(TRUE) && (notificationLang.equalsIgnoreCase(ARABIC) || notificationLang.equalsIgnoreCase(BOTH))){
					notificatioinMessageList.add(createSMSNotificationMessage(ownerPhone, notifyBodyAr,ICommonConstants.ARABIC));
				}
				
			}
			// notify owners by Email
			for (Iterator iterator = ownersEmail.iterator(); iterator
					.hasNext();) {
				String ownerEmail = (String) iterator.next();
				// Email message for owner EN
				if(notificationLang.equalsIgnoreCase(ENGLISH) || notificationLang.equalsIgnoreCase(BOTH)){
					notificatioinMessageList.add(createEmailNotificationMessage(sender,ownerEmail,notifySubjectEn,notifyBodyEn));
				}
				// Email message for owner AR
				if(notificationLang.equalsIgnoreCase(ARABIC) || notificationLang.equalsIgnoreCase(BOTH)){
					notificatioinMessageList.add(createEmailNotificationMessage(sender,ownerEmail,notifySubjectAr,notifyBodyAr));
				}
			}			
		}
		notificationRequestBO.set("notificationMessage",
				notificatioinMessageList);
		
		myLogger.log(ICommonConstants.LOGGER_LEVEL_IN_CODE,
				"End of method: prepareNotificationRequest");
		return notificationRequestBO;
		}
		
		private static DataObject createSMSNotificationMessage(String mobileNo,
			String Message, String lang) {
		myLogger.log(ICommonConstants.LOGGER_LEVEL_IN_CODE,
				"Begin of method: createSMSNotificationMessage");
		
		BOFactory factory = (BOFactory) new ServiceManager()
				.locateService("com/ibm/websphere/bo/BOFactory");
		//create a notificationMessage object
		DataObject notificationMessageBO = factory
				.create(
						"urn:igov.gov.qa/sharedServices/notification/xml/schemas/v1_0/",
						"NotificationMessageType");
		DataObject smsdetailsBO = factory
				.create(
						"urn:igov.gov.qa/sharedServices/notification/xml/schemas/v1_0/",
						"SMSDetailsType");
		String senderCode = ResourceBundleUtil.getString(
				ICommonConstants.COMMON_CONFIG,
				ICommonConstants.SMS_SENDER_CODE);
		try{
			Message= Message.split(StringSeparator)[0];			
		}catch(Exception e){
			
		}
		smsdetailsBO.set("senderCode", senderCode);
		smsdetailsBO.set("mobileNumber", mobileNo);
		smsdetailsBO.set("message", Message);
		smsdetailsBO.set("messageLanguage", lang);
		notificationMessageBO.set("smsDetails", smsdetailsBO);
		
		myLogger.log(ICommonConstants.LOGGER_LEVEL_IN_CODE,
				"End of method: createSMSNotificationMessage");
		return notificationMessageBO;
		}
		
		private static DataObject createEmailNotificationMessage(String sender,
			String recipient, String subject, String message) {
		myLogger.log(ICommonConstants.LOGGER_LEVEL_IN_CODE,
				"Begin of method: createEmailNotificationMessage");
		
		BOFactory factory = (BOFactory) new ServiceManager()
				.locateService("com/ibm/websphere/bo/BOFactory");
		//create a notificationMessage object
		DataObject notificationMessageBO = factory
				.create(
						"urn:igov.gov.qa/sharedServices/notification/xml/schemas/v1_0/",
						"NotificationMessageType");
		DataObject emailDetialsBo = factory
				.create(
						"urn:igov.gov.qa/sharedServices/notification/xml/schemas/v1_0/",
						"EmailDetailsType");
		try{
			message= message.split(StringSeparator)[1];			
		}catch(Exception e){
			
		}		
		emailDetialsBo.set("sender", sender);
		emailDetialsBo.set("recipient", recipient);
		emailDetialsBo.set("subject", subject);
		emailDetialsBo.set("message", message);
		notificationMessageBO.set("emailDetails", emailDetialsBo);
		
		myLogger.log(ICommonConstants.LOGGER_LEVEL_IN_CODE,
				"End of method: createEmailNotificationMessage");
		return notificationMessageBO;
		}

}
