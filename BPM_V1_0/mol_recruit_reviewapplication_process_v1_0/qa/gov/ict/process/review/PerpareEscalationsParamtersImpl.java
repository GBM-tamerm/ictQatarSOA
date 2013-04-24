package qa.gov.ict.process.review;

import qa.gov.mol.lr.process.constants.IProcessConstants;
import qa.gov.mol.lr.process.util.ResourceBundleUtil;
import commonj.sdo.DataObject;

import com.ibm.icu.util.Calendar;
import com.ibm.websphere.bo.BOFactory;
import com.ibm.websphere.sca.ServiceManager;

public class PerpareEscalationsParamtersImpl {
	private String ARABIC="0";
	private String ENGLISH="1";

	/**
	 * Default constructor.
	 */
	public PerpareEscalationsParamtersImpl() {
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
	 * Method generated to support implementation of operation "getEscalationParams" defined for WSDL port type 
	 * named "PerpareEscalationsParamters".
	 * 
	 * The presence of commonj.sdo.DataObject as the return type and/or as a parameter 
	 * type conveys that it is a complex type. Please refer to the WSDL Definition for more information 
	 * on the type of input, output and fault(s).
	 */
	public DataObject getEscalationParams(DataObject app) {
		String AppNo=app.getDataObject("applicationID").getString("ApplicationNumber");
		String year=app.getDataObject("applicationID").getString("year");
		String separtor="%";
		String escSubjectEn=ResourceBundleUtil.getString(IProcessConstants.PROCESS_CONFIG, IProcessConstants.REVIEW_APP_ESCALATION_SUBJECT_EN).replaceFirst(separtor, AppNo).replaceFirst(separtor, year);
		String escSubjectAr=ResourceBundleUtil.getString(IProcessConstants.PROCESS_CONFIG, IProcessConstants.REVIEW_APP_ESCALATION_SUBJECT_AR).replaceFirst(separtor, AppNo).replaceFirst(separtor, year);
		String escBodyEn=ResourceBundleUtil.getString(IProcessConstants.PROCESS_CONFIG, IProcessConstants.REVIEW_APP_ESCALATION_BODY_EN).replaceFirst(separtor, AppNo).replaceFirst(separtor, year);
		String escBodyAr=ResourceBundleUtil.getString(IProcessConstants.PROCESS_CONFIG, IProcessConstants.REVIEW_APP_ESCALATION_BODY_AR).replaceFirst(separtor, AppNo).replaceFirst(separtor, year);
		String duration=ResourceBundleUtil.getString(IProcessConstants.PROCESS_CONFIG, IProcessConstants.REVIEW_APP_ESCALATION_DURATION);

		String notificationLang=ResourceBundleUtil.getString(IProcessConstants.PROCESS_CONFIG, IProcessConstants.NOTIFICATION_LANG);
		
		switch (Calendar.getInstance().get(Calendar.DAY_OF_WEEK)){
			case Calendar.THURSDAY:
				duration="0seconds 0minutes 0hours 3days";	
				break;
		
			case Calendar.FRIDAY:
				duration="0seconds 0minutes 0hours 2days";	
				break;
			default:
				duration="0seconds 0minutes 0hours 1days";	
				break;
		}
		
		//create a escalation parameters object
		BOFactory factory = (BOFactory) new ServiceManager().locateService("com/ibm/websphere/bo/BOFactory");
		DataObject escParamBO = factory.create("http://mol.gov.qa/recruitment/process","EscalationParamters");
		String Subject="";
		String body="";
		if(notificationLang.equalsIgnoreCase(ARABIC)){
			Subject=escSubjectAr;
			body=escBodyAr;
		}
		else if(notificationLang.equalsIgnoreCase(ENGLISH)){
			Subject=escSubjectEn;
			body=escBodyEn;
		}else{
			Subject=escSubjectAr+" "+escSubjectEn;
			body=escBodyAr+ "<BR>"+escBodyEn;
			
		}

		escParamBO.set("subject", Subject);
		escParamBO.set("body",body);
		escParamBO.set("duration", duration);
		return escParamBO;
	}

}