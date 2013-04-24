package qa.gov.ict.process.review;

import qa.gov.mol.lr.process.constants.IProcessConstants;
import qa.gov.mol.lr.process.util.ResourceBundleUtil;
import commonj.sdo.DataObject;

import com.ibm.websphere.bo.BOFactory;
import com.ibm.websphere.sca.ServiceManager;

public class PerpareEscalationsParamtersImpl {
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
		String separtor="?";
		String escSubjectEn=ResourceBundleUtil.getString(IProcessConstants.PROCESS_CONFIG, IProcessConstants.REVIEW_APP_ESCALATION_SUBJECT_EN).replace(separtor, AppNo);
		String escSubjectAr=ResourceBundleUtil.getString(IProcessConstants.PROCESS_CONFIG, IProcessConstants.REVIEW_APP_ESCALATION_SUBJECT_AR).replace(separtor, AppNo);
		String escBodyEn=ResourceBundleUtil.getString(IProcessConstants.PROCESS_CONFIG, IProcessConstants.REVIEW_APP_ESCALATION_BODY_EN).replace(separtor, AppNo);
		String escBodyAr=ResourceBundleUtil.getString(IProcessConstants.PROCESS_CONFIG, IProcessConstants.REVIEW_APP_ESCALATION_BODY_AR).replace(separtor, AppNo);
		String duration=ResourceBundleUtil.getString(IProcessConstants.PROCESS_CONFIG, IProcessConstants.REVIEW_APP_ESCALATION_DURATION);
		//create a escalation parameters object
		BOFactory factory = (BOFactory) new ServiceManager().locateService("com/ibm/websphere/bo/BOFactory");
		DataObject escParamBO = factory.create("http://mol.gov.qa/recruitment/process","EscalationParamters");
		escParamBO.set("subject", escSubjectEn+"  "+escSubjectAr);
		escParamBO.set("body", escBodyEn+"  "+escBodyAr);
		escParamBO.set("duration", duration);
		return escParamBO;
	}

}