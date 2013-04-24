package qa.gov.mol.manager;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.naming.InitialContext;

import qa.gov.igov.CommonErrorStructure;
import qa.gov.mol.ApplicationIdType;
import qa.gov.mol.GetSuspendedApplicationsTasksRequest;
import qa.gov.mol.SuspendedApplication;
import qa.gov.mol.lr.process.constants.IExceptionHandelerConstants;
import qa.gov.mol.lr.process.util.CESData;
import qa.gov.mol.lr.process.util.ExceptionHandeler;

import com.ibm.bpe.api.LocalBusinessFlowManager;
import com.ibm.bpe.api.LocalBusinessFlowManagerHome;
import com.ibm.bpe.api.QueryResultSet;

public class ServiceManager {
	private  LocalBusinessFlowManager bfm=null;
	private Logger logger= Logger.getLogger("SuspndedAppTaskService");
	private static ServiceManager instance=null; 
	
	public static ServiceManager getInstance() throws CommonErrorStructure{
		if(instance==null){
			instance= new ServiceManager(); 
		}
		return instance;
	}
	
	private ServiceManager() throws CommonErrorStructure {
		super();
		init();
	}


	private  void init() throws CommonErrorStructure {
	try {
		if(bfm==null){
			InitialContext initialBFMContext = new InitialContext();
			LocalBusinessFlowManagerHome localBusinessFlowManagerHome = (LocalBusinessFlowManagerHome)initialBFMContext.lookup("local:ejb/com/ibm/bpe/api/BusinessFlowManagerHome");
			bfm=localBusinessFlowManagerHome.create();
		}
		} catch (Exception e) {
			handleExcpetion(e);
		}
	}
	

    public  qa.gov.mol.SuspendedApplication[] getSuspendedApps(GetSuspendedApplicationsTasksRequest in) throws CommonErrorStructure {
    	QueryResultSet results;
		try {
			results = bfm.queryAll("DISTINCT QUERY_PROPERTY.PIID", "PROCESS_INSTANCE.TEMPLATE_NAME='"+IConstants.processName+"' and QUERY_PROPERTY.NAME = '"+IConstants.OnWaiting+"' AND QUERY_PROPERTY.NUMBER_VALUE = 1 ",null,null,null,null);
			StringBuffer ids=new StringBuffer();
			  while(results.next())
			  {			  
				  ids.append("ID('").append(results.getOID(1).toString()).append("'),");
			  } 
			  if(ids.length()<=0){
				  return null;
			  }
			if(ids.lastIndexOf(",")==ids.length()-1){
				ids.deleteCharAt(ids.length()-1);
//			   System.out.println("PIIDs: "+ids);				  
			}
			Map<String, SuspendedApplication> appMap = new HashMap<String, SuspendedApplication>();
			results = bfm.queryAll("QUERY_PROPERTY.PIID,QUERY_PROPERTY.NAME,QUERY_PROPERTY.STRING_VALUE,QUERY_PROPERTY.TIMESTAMP_VALUE", "QUERY_PROPERTY.PIID in ("+ids+")",null,null,null,null);
			  while(results.next())
			  {			  
//				   System.out.println("id: "+results.getOID(1).toString()+ " property: "+results.getObject(2)+" value: "+results.getObject(3)+" value2: "+results.getObject(4));
				 if(appMap.get(results.getOID(1).toString())==null){
					 appMap.put(results.getOID(1).toString(), new SuspendedApplication());
				 }
				 SuspendedApplication app=appMap.get(results.getOID(1).toString());
				 SetApplicationProperty(app,results.getString(2),results.getString(3),results.getTimestamp(4));
			  }
			  SuspendedApplication[] apps= new SuspendedApplication[appMap.size()];
			  return (SuspendedApplication[]) appMap.values().toArray(apps);
		} catch (Exception e) {
			handleExcpetion(e);
		}
		return null;
    }
    
	private  void  SetApplicationProperty(SuspendedApplication app,String propertyName,String propertyValue, Calendar calendar){
		if(IConstants.applicationNo.equalsIgnoreCase(propertyName)){
			if(app.getApplicationID()==null){
				ApplicationIdType appID= new ApplicationIdType();
				appID.setApplicationNumber(propertyValue);
				app.setApplicationID(appID);
			}else{
				app.getApplicationID().setApplicationNumber(propertyValue);
			}
		}
		else if(IConstants.year.equalsIgnoreCase(propertyName)){
			if(app.getApplicationID()==null){
				ApplicationIdType appID= new ApplicationIdType();
				appID.setYear(propertyValue);
				app.setApplicationID(appID);
			}else{
				app.getApplicationID().setYear(propertyValue);
			}
		}
		else if(IConstants.estID.equalsIgnoreCase(propertyName)){
			app.setEstID(propertyValue);
		}
		else if(IConstants.electricityNo.equalsIgnoreCase(propertyName)){
			app.setElectricityNumber(propertyValue);
		}
		else if(IConstants.agentQID.equalsIgnoreCase(propertyName)){
			app.setAgentQID(propertyValue);
		}
		else if(IConstants.estName.equalsIgnoreCase(propertyName)){
			app.setEstName(propertyValue);
		}
		else if(IConstants.applicationDate.equalsIgnoreCase(propertyName) ){
				app.setApplicationDate(calendar);
		}
		else if(IConstants.suspendedDate.equalsIgnoreCase(propertyName)){
			app.setSuspendedDate(calendar);
		}
		else if(IConstants.CSRID.equalsIgnoreCase(propertyName)){
			app.setCsrUserID(propertyValue);
		}
		else if(IConstants.CSRRemarks.equalsIgnoreCase(propertyName)){
			app.setCsrUserRemarks(propertyValue);
		}
		else if(IConstants.CRCode.equalsIgnoreCase(propertyName)){
			app.setCommercialRegistrationCode(propertyValue);
		}
		else if(IConstants.CPID.equalsIgnoreCase(propertyName)){
			app.setCommercialPermitID(propertyValue);
		}

	}

	private void handleExcpetion(Exception exp) throws CommonErrorStructure {
		CESData errorData=ExceptionHandeler.getInstance().handleUnmodeledExp(IExceptionHandelerConstants.suspenededApps,null,exp,null);
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(errorData.getTimeStamp());
		CommonErrorStructure ces= new CommonErrorStructure(errorData.getErrorCode(),errorData.getUserMessage(),errorData.getDetailMessage(),errorData.getFailedMessage(),calendar,errorData.getNetworkLocation());
		throw(ces);
	}
}
