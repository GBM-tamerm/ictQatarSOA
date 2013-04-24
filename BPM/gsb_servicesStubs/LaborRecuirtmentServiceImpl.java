
import java.util.Date;

import commonj.sdo.DataObject;

import com.ibm.websphere.bo.BOFactory;
import com.ibm.websphere.sca.ServiceManager;

public class LaborRecuirtmentServiceImpl {
	/**
	 * Default constructor.
	 */
	public LaborRecuirtmentServiceImpl() {
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
	 * Method generated to support implementation of operation "insertNewApplication" defined for WSDL port type 
	 * named "LaborRecruitmentApplication".
	 * 
	 * The presence of commonj.sdo.DataObject as the return type and/or as a parameter 
	 * type conveys that it is a complex type. Please refer to the WSDL Definition for more information 
	 * on the type of input, output and fault(s).
	 */
	public DataObject insertNewApplication(
			DataObject aInsertNewApplicationRequest) {
		BOFactory factory = (BOFactory) new ServiceManager().locateService("com/ibm/websphere/bo/BOFactory");
		DataObject applicationID = factory.create("urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/","ApplicationIdType");
		Date date= new Date();
		applicationID.setString("ApplicationNumber", String.valueOf(date.getTime()));
		applicationID.setString("year", "2010");
		DataObject appStatus = factory.create("urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/","ApplicationStatusType");
		appStatus.setString("ID", "1");
		appStatus.setString("nameAr", "new");
		appStatus.setString("nameEn", "new");

		DataObject response = factory.create("urn:mol.gov.qa/customerService/recruitment/specifications/v1_0/","InsertNewApplicationResponse");
		response.set("appID", applicationID);
		response.set("appStatus", appStatus);
		
		return response;
	}

	/**
	 * Method generated to support implementation of operation "insertCSRReviewResult" defined for WSDL port type 
	 * named "LaborRecruitmentApplication".
	 * 
	 * The presence of commonj.sdo.DataObject as the return type and/or as a parameter 
	 * type conveys that it is a complex type. Please refer to the WSDL Definition for more information 
	 * on the type of input, output and fault(s).
	 */
	public DataObject insertCSRReviewResult(
			DataObject aInsertCSRReviewResultRequest) {
		// To get or set attributes for DataObject aInsertCSRReviewResultRequest, use the APIs as shown below:
		// To set a string attribute in aInsertCSRReviewResultRequest, use aInsertCSRReviewResultRequest.setString(stringAttributeName, stringValue)
		// To get a string attribute in aInsertCSRReviewResultRequest, use aInsertCSRReviewResultRequest.getString(stringAttributeName)
		// To set a dataObject attribute in aInsertCSRReviewResultRequest, use aInsertCSRReviewResultRequest.setDataObject(stringAttributeName, dataObjectValue)
		// To get a dataObject attribute in aInsertCSRReviewResultRequest, use aInsertCSRReviewResultRequest.getDataObject(stringAttributeName)
		return null;
	}

}