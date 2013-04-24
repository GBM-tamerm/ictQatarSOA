
import commonj.sdo.DataObject;
import com.ibm.websphere.sca.ServiceManager;

public class LaborRecruitmentAppJavaServiceImpl {
	/**
	 * Default constructor.
	 */
	public LaborRecruitmentAppJavaServiceImpl() {
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
		if(true )throw(new NullPointerException());
		return null;
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
		if(true )throw(new NullPointerException());
		return null;
	}

}