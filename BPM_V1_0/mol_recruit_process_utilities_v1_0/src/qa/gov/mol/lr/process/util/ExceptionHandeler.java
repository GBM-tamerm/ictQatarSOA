package qa.gov.mol.lr.process.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import qa.gov.mol.lr.process.constants.BusinessKeys;
import qa.gov.mol.lr.process.constants.IExceptionHandelerConstants;
import qa.gov.mol.lr.process.constants.ProcessErrorCodes;

import com.ibm.websphere.bo.BOFactory;
import com.ibm.websphere.sca.ServiceManager;
import commonj.sdo.DataObject;

public class ExceptionHandeler {
	
	public  String loggingClass = "qa.gov.mol.lr.SOALaborLogger";
	private String userMessage1="Exception raised in %";
	private String userMessage2="Exception raised in % while invoking %";
	private static ExceptionHandeler instance=null; 
	private Map<String, String> map=null;
	
	private ExceptionHandeler() {
		init();
		
	}
	
	public static ExceptionHandeler getInstance(){
		if(instance==null){
			instance= new ExceptionHandeler();	
		}
		return instance;
	}
	
	private void init(){
		map = new HashMap<String, String>();
		map.put(IExceptionHandelerConstants.LR_ReviewApp, IExceptionHandelerConstants.process_general_Service_Code);
		map.put(IExceptionHandelerConstants.PerformScreening, IExceptionHandelerConstants.PerformScreening_code);
		map.put(IExceptionHandelerConstants.SubmitNewApp, IExceptionHandelerConstants.SubmitNewApp_Code);
		map.put(IExceptionHandelerConstants.suspenededApps, IExceptionHandelerConstants.suspenededApps_Code);
	}


	public  CESData handleUnmodeledExp(String caller,String called,Exception exp,Map<Integer,String> map){		
		// constructs the common error structure data		
		CESData ces;
		ces = new CESData();
		try {
			ces.setTimeStamp(new Date());
			String userMsg = "";
			if (called == null) {
				userMsg = userMessage1.replace("%", caller);
			} else {
				userMsg = userMessage2.replaceFirst("%", caller).replaceFirst(
						"%", called);
			}
			ces.setUserMessage(userMsg);
			if (exp != null) {
				ces.setFailedMessage(exp.getMessage());
			}
			if (exp != null && exp.getCause() != null) {
				ces.setDetailMessage(exp.getCause());
			}
			ces.setErrorCode(getErrorCode(caller,called));
			ces.setNetworkLocation(ProcessErrorCodes.networkLocation.replaceFirst("%", caller));
			logException(ces, caller, map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ces;
	}

	private void logException(CESData ces,String caller,Map<Integer,String> map) throws Exception{
		// log the exception details
		StringBuffer logText = new StringBuffer();
		logText.append("******************************************************************************************* \n");
		logText.append("CommonErrorStrcuture: \n");
		SimpleDateFormat formatter=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		formatter.format(ces.getTimeStamp());
		logText.append("Time stamp = "
				+ formatter.format(ces.getTimeStamp())
				+ "\n");
		logText.append("Error Code = " + ces.getErrorCode() + "\n");
		logText.append("User Message = " + ces.getUserMessage() + "\n");
		logText.append("Detailed Message = " + ces.getDetailMessage()+ "\n");
//		logText.append("Failed Message = " + ces.getFailedMessage()	+ "\n");
		logText.append("Network Location = " + ces.getNetworkLocation()	+ "\n");
		if (map != null && map.size()>0) {
			logText.append("BusinessKeys: \n");
				if(map.get(BusinessKeys.TrackingID)!=null){
					logText.append(" TrackingID = " + map.get(BusinessKeys.TrackingID)+ "\n" );					
				}
				if(map.get(BusinessKeys.EstID)!=null){
					logText.append(" EstablishmentID = " + map.get(BusinessKeys.EstID)+ "\n" );
				}
				if(map.get(BusinessKeys.agentQID)!=null){
					logText.append(" AgentQID = " + map.get(BusinessKeys.agentQID)+ "\n" );
				}
				if(map.get(BusinessKeys.appNo)!=null){
					logText.append(" appNO = " + map.get(BusinessKeys.appNo)+ "\n" );
				}
				if(map.get(BusinessKeys.appYear)!=null){
					logText.append(" ApplicationYear = " + map.get(BusinessKeys.appYear)+ "\n" );
				}
				if(map.get(BusinessKeys.Elect_No)!=null){
					logText.append(" ElectricityNo = " + map.get(BusinessKeys.Elect_No)+ "\n" );
				}
			}
		logText.append("******************************************************************************************* ");
		Logger log = Logger.getLogger(loggingClass);
		log.log(Level.SEVERE, logText.toString());
	}
	
	public  CESData handleModeledExp(String caller,String called,DataObject errorBO,Map<Integer,String> map){		
		// constructs the common error structure data		
		CESData ces;
		ces = new CESData();
		try {
			ces.setErrorCode((String) errorBO.get("errorCode"));
			ces.setTimeStamp((Date) errorBO.get("timeStamp"));
			ces.setNetworkLocation((String) errorBO.get("networkLocation"));
			ces.setUserMessage((String) errorBO.get("userMessage"));
			ces.setDetailMessage(errorBO.getString("detailMessage"))	;
			logException(ces, caller, map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ces;
	}


	public  DataObject handleUnmodeledExpDO(String caller,String called,Exception exp,Map<Integer,String> map){
		DataObject errorBO=null;
		try {
			CESData data = handleUnmodeledExp(caller, called, exp, map);
			BOFactory factory = (BOFactory) new ServiceManager()
					.locateService("com/ibm/websphere/bo/BOFactory");
			errorBO = factory.create(
					"urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/",
					"CommonErrorStructure");
			errorBO.set("errorCode", data.getErrorCode());
			errorBO.set("userMessage", data.getUserMessage());
			if(data.getDetailMessage()!=null){
				errorBO.setString("detailMessage", data.getDetailMessage().toString());				
			}
		//	errorBO.set("failedMessage", data.getFailedMessage());
			errorBO.set("timeStamp", data.getTimeStamp());
			errorBO.set("networkLocation", data.getNetworkLocation());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return errorBO;
	}
	
	private  String getErrorCode(String caller,String called) {
		String errorCode="";
		if(IExceptionHandelerConstants.PerformScreening.equalsIgnoreCase(caller)&& IExceptionHandelerConstants.statistics.equalsIgnoreCase(called)){
			errorCode=ProcessErrorCodes.estStatisticsFailure;
		}
		else if(IExceptionHandelerConstants.PerformScreening.equalsIgnoreCase(caller)&& IExceptionHandelerConstants.billInfo.equalsIgnoreCase(called)){
			errorCode=ProcessErrorCodes.billInfoFailure;
		}
		else if(IExceptionHandelerConstants.SubmitNewApp.equalsIgnoreCase(caller)&& IExceptionHandelerConstants.NotificationService.equalsIgnoreCase(called)){
			errorCode=ProcessErrorCodes.NotifyAgentFailure;
		}else{
			errorCode=ProcessErrorCodes.Unmodeled_case;			
		}

		// get unique error Code
		return 	IExceptionHandelerConstants.process_layer_Code+"-"+
				IExceptionHandelerConstants.process_NL_Code+"-"+	
				map.get(caller)+"-"+	
				errorCode;
		
	}

}
