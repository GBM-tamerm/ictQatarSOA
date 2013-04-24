
import java.util.ArrayList;
import java.util.List;

import com.ibm.websphere.bo.BOFactory;
import com.ibm.websphere.sca.Service;
import com.ibm.websphere.sca.Ticket;
import commonj.sdo.DataObject;
import com.ibm.websphere.sca.ServiceManager;

public class LookupServiceImpl {
	/**
	 * Default constructor.
	 */
	public LookupServiceImpl() {
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
	 * named "LookupsPartner".  This will return an instance of 
	 * {@link com.ibm.websphere.sca.Service}.  This is the dynamic
	 * interface which is used to invoke operations on the reference service
	 * either synchronously or asynchronously.  You will need to pass the operation
	 * name in order to invoke an operation on the service.
	 *
	 * @generated (com.ibm.wbit.java)
	 *
	 * @return Service
	 */
	public Service locateService_LookupsPartner() {
		return (Service) ServiceManager.INSTANCE
				.locateService("LookupsPartner");
	}

	/**
	 * Method generated to support implementation of operation "getNationalitiesList" defined for WSDL port type 
	 * named "Lookups".
	 * 
	 * The presence of commonj.sdo.DataObject as the return type and/or as a parameter 
	 * type conveys that it is a complex type. Please refer to the WSDL Definition for more information 
	 * on the type of input, output and fault(s).
	 */
	public DataObject getNationalitiesList(
			DataObject aGetNationalitiesListRequest) {
		BOFactory factory = (BOFactory) new ServiceManager().locateService("com/ibm/websphere/bo/BOFactory");
		DataObject nationalityList = factory.create("urn:mol.gov.qa/customerService/recruitment/specifications/v1_0/","getNationalitiesListResponse");
		nationalityList.setList("nationalitiesList", getNationalityList());
		return nationalityList;
	}

	/**
	 * Method generated to support implementation of operation "getProfessionsList" defined for WSDL port type 
	 * named "Lookups".
	 * 
	 * The presence of commonj.sdo.DataObject as the return type and/or as a parameter 
	 * type conveys that it is a complex type. Please refer to the WSDL Definition for more information 
	 * on the type of input, output and fault(s).
	 */
	public DataObject getProfessionsList(DataObject aGetProfessionsListRequest) {
		BOFactory factory = (BOFactory) new ServiceManager().locateService("com/ibm/websphere/bo/BOFactory");
		DataObject profList = factory.create("urn:mol.gov.qa/customerService/recruitment/specifications/v1_0/","getProfessionsListResponse");
		profList.setList("professionsList", getProfessionList());
		return profList;
	}

	/**
	 * Method generated to support implementation of operation "getAllLookups" defined for WSDL port type 
	 * named "Lookups".
	 * 
	 * The presence of commonj.sdo.DataObject as the return type and/or as a parameter 
	 * type conveys that it is a complex type. Please refer to the WSDL Definition for more information 
	 * on the type of input, output and fault(s).
	 */
	private List getNationalityList(){
		List list = new ArrayList();
		list.add(creareNationality("Egyption","masri",1));
		list.add(creareNationality("American","American",2));
		list.add(creareNationality("Indian","Indian",3));
		list.add(creareNationality("Candian","Candian",4));
		return list;
	}
	private List getProfessionList(){
		List list = new ArrayList();
		list.add(creareProfession("Engineer","mohandes",1));
		list.add(creareProfession("Doctor","doctor",2));
		list.add(creareProfession("Teacher","modares",3));
		list.add(creareProfession("Trainer","modareb",4));
		return list;
	}
	private DataObject creareNationality(String nameEn,String nameAr,int id){
		BOFactory factory = (BOFactory) new ServiceManager().locateService("com/ibm/websphere/bo/BOFactory");
		DataObject nationality = factory.create("urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/","NationalityType");
		nationality.set("name_En", nameEn);
		nationality.set("name_Ar", nameEn);
		nationality.set("ID", id);
		return nationality;
	}
	private DataObject creareProfession(String nameEn,String nameAr,int id){
		BOFactory factory = (BOFactory) new ServiceManager().locateService("com/ibm/websphere/bo/BOFactory");
		DataObject nationality = factory.create("urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/","ProfessionType");
		nationality.set("name_En", nameEn);
		nationality.set("name_Ar", nameEn);
		nationality.set("ID", id);
		return nationality;
	}

	public DataObject getAllLookups(DataObject aGetAllLookupsRequest) {
		BOFactory factory = (BOFactory) new ServiceManager().locateService("com/ibm/websphere/bo/BOFactory");
		DataObject res = factory.create("urn:mol.gov.qa/customerService/recruitment/specifications/v1_0/","getAllLookupsResponse");
		res.set("nationalitiesList", getNationalityList());
		res.set("professionsList", getProfessionList());		
		return res;
	}

	/**
	 * Method generated to support the async implementation using callback
	 * for the operation "Lookups#getNationalitiesList(DataObject aGetNationalitiesListRequest)"
	 * of wsdl interface "Lookups"	
	 */
	public void onGetNationalitiesListResponse(Ticket __ticket,
			DataObject returnValue, Exception exception) {
		//TODO Needs to be implemented.
	}

	/**
	 * Method generated to support the async implementation using callback
	 * for the operation "Lookups#getProfessionsList(DataObject aGetProfessionsListRequest)"
	 * of wsdl interface "Lookups"	
	 */
	public void onGetProfessionsListResponse(Ticket __ticket,
			DataObject returnValue, Exception exception) {
		//TODO Needs to be implemented.
	}

	/**
	 * Method generated to support the async implementation using callback
	 * for the operation "Lookups#getAllLookups(DataObject aGetAllLookupsRequest)"
	 * of wsdl interface "Lookups"	
	 */
	public void onGetAllLookupsResponse(Ticket __ticket,
			DataObject returnValue, Exception exception) {
		//TODO Needs to be implemented.
	}

}