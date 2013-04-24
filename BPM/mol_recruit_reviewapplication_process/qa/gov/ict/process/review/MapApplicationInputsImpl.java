package qa.gov.ict.process.review;

import qa.gov.mol.lr.process.util.ProcessUtil;

import com.ibm.websphere.bo.BOFactory;
import com.ibm.websphere.sca.Service;
import com.ibm.websphere.sca.Ticket;
import commonj.sdo.DataObject;
import commonj.sdo.Type;

import com.ibm.websphere.sca.ServiceManager;
import com.ibm.websphere.sca.scdl.OperationType;
import com.ibm.websphere.sca.scdl.Reference;

public class MapApplicationInputsImpl {
	/**
	 * Default constructor.
	 */
	public MapApplicationInputsImpl() {
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
	 * This method is used to locate the service for the reference
	 * named "ResumeApplicationRequestPartner".  This will return an instance of 
	 * {@link com.ibm.websphere.sca.Service}.  This is the dynamic
	 * interface which is used to invoke operations on the reference service
	 * either synchronously or asynchronously.  You will need to pass the operation
	 * name in order to invoke an operation on the service.
	 *
	 * @generated (com.ibm.wbit.java)
	 *
	 * @return Service
	 */
	public Service locateService_ResumeApplicationRequestPartner() {
		return (Service) ServiceManager.INSTANCE
				.locateService("ResumeApplicationRequestPartner");
	}

	/**
	 * Method generated to support implementation of operation "resumeApplication" defined for WSDL port type 
	 * named "RecruitmentProcessResumeApplication".
	 * 
	 * The presence of commonj.sdo.DataObject as the return type and/or as a parameter 
	 * type conveys that it is a complex type. Please refer to the WSDL Definition for more information 
	 * on the type of input, output and fault(s).
	 */
	public DataObject resumeApplication(DataObject aResumeApplicationRequest,
			DataObject pHeader) {
		Service service=locateService_ResumeApplicationRequestPartner();
		Reference reference = service.getReference();

		OperationType methodMultiType = 
				reference.getOperationType("requestResume");

		Type t = methodMultiType.getInputType();

		BOFactory boFactory = (BOFactory)ServiceManager.INSTANCE.locateService
				("com/ibm/websphere/bo/BOFactory");

		DataObject paramObject = boFactory.createByType(t);
		String appNo=aResumeApplicationRequest.getDataObject("applicationID").getString("ApplicationNumber");
		String year=aResumeApplicationRequest.getDataObject("applicationID").getString("year");
		String userID=aResumeApplicationRequest.getDataObject("userID").getString("ID");
		String correlationID=ProcessUtil.createCorrelation(appNo,year);
		paramObject.set(0,correlationID);
		paramObject.set(1,userID);
		paramObject.set(2,pHeader);
		DataObject response = boFactory.create("urn:mol.gov.qa/customerService/recruitment/specifications/v1_0/","ResumeApplicationResponse");
		response.set("acknowledgement", "false");
		try{
			 Object out=service.invoke("requestResume",paramObject);
			 String ack=String.valueOf(((DataObject)out).get(0));
			 if(out instanceof DataObject){
				 System.out.println("output is:"+ack);
			 }
			response.set("acknowledgement", ack);
		}catch (Exception e){
			 System.out.println("excpetion raised :"+e);
		}
		 return response;
	}

	/**
	 * Method generated to support the async implementation using callback
	 * for the operation "ResumeApplicationRequest#requestResume(String correlationID, String userID, DataObject pHeader)"
	 * of wsdl interface "ResumeApplicationRequest"	
	 */
	public void onRequestResumeResponse(Ticket __ticket, Boolean returnValue,
			Exception exception) {
		//TODO Needs to be implemented.
	}

}