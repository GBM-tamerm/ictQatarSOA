package qa.gov.ict.process.review;

import qa.gov.mol.lr.common.GovHeaderHelper;
import qa.gov.mol.lr.process.constants.XpathConstants;
import commonj.sdo.DataObject;

import com.ibm.websphere.bo.BOFactory;
import com.ibm.websphere.sca.ServiceManager;

public class PerpareGovHeaderImpl {
	/**
	 * Default constructor.
	 */
	public PerpareGovHeaderImpl() {
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
	 * Method generated to support implementation of operation "perpareGovHeader" defined for WSDL port type 
	 * named "IPrepareGovHeader".
	 * 
	 * The presence of commonj.sdo.DataObject as the return type and/or as a parameter 
	 * type conveys that it is a complex type. Please refer to the WSDL Definition for more information 
	 * on the type of input, output and fault(s).
	 */
	public DataObject perpareGovHeader(DataObject processHeader) {
		BOFactory factory = (BOFactory) new ServiceManager().locateService("com/ibm/websphere/bo/BOFactory");
		DataObject eGovHeader = factory.create("urn:igov.gov.qa/xml/schemas/v1_0/","IGOVHeaderType");
		String trackingID=GovHeaderHelper.createTrackingID(processHeader.getString("userID"));
		eGovHeader.set(XpathConstants.Govheader_SenderInfo_trackingID,trackingID);
		eGovHeader.set(XpathConstants.Govheader_SenderInfo_userID,processHeader.getString("userID"));
		eGovHeader.set(XpathConstants.Govheader_SenderInfo_appID,GovHeaderHelper.ApplicationID);
		eGovHeader.set(XpathConstants.Govheader_MEP,GovHeaderHelper.MEP_RR);
		eGovHeader.set(XpathConstants.Govheader_RunMode,GovHeaderHelper.RUNMODE_P);
		return eGovHeader;
	}

}