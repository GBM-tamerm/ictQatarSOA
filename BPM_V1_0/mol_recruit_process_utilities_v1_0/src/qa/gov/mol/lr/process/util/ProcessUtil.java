/**
 * Class ResourceBundleUtil
 * This is a helper class used from business processes ,i.e creating process correlation ID 
 * @author Tlatif
 * @copyright (C) GBM/ictQATAR 2010
 * @date 21.03.2010
 * @history 
 */
package qa.gov.mol.lr.process.util;

import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import qa.gov.mol.lr.process.constants.BusinessKeys;

import com.ibm.websphere.bo.BOFactory;
import com.ibm.websphere.bo.BOXMLSerializer;
import com.ibm.websphere.sca.ServiceManager;
import commonj.sdo.DataObject;

public class ProcessUtil {

	public static final String loggingClass = "qa.gov.mol.lr.SOALaborLogger";

	public static final String BO_FACTORY = "com/ibm/websphere/bo/BOFactory";

    public static final String XML_SERIALIZER = "com/ibm/websphere/bo/BOXMLSerializer";

	private static final BOFactory businessObjectFactory;

    private static final BOXMLSerializer businessObjectSerializer;

    static {
	businessObjectFactory = (BOFactory) ServiceManager.INSTANCE
		.locateService(BO_FACTORY);
	businessObjectSerializer = (BOXMLSerializer) ServiceManager.INSTANCE
		.locateService(XML_SERIALIZER);
    }
	

	
	/**
	 * Method createCorrelation
	 * This method is responsible of creating createCorrelation ID for a business process instance
	 * in the following format : applicationNo+"#"+year
	 * @param applicationNo,year
	 * @return applicationNo+"#"+year
	 */	
	public static String createCorrelation(String applicationNo,String year){
		return applicationNo+"#"+year;
	}
	
	public static void LogBO(DataObject bo,String caller,String called,boolean isRequest){
		try {
			Logger log = Logger.getLogger(loggingClass);
			if (!log.isLoggable(Level.FINEST)) return;
			String request=isRequest?" Request BO": " Response BO";
			log.log(Level.FINEST,"Start "+called+request );
			ByteArrayOutputStream outputStream =new ByteArrayOutputStream();
			businessObjectSerializer.writeDataObject(bo, bo.getType().getURI(), bo.getType().getName(),outputStream);
			log.log(Level.FINEST, outputStream.toString());
			log.log(Level.FINEST,"End   "+called+request  );
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static String getBusinessKeys(Map map){
		StringBuffer logText = new StringBuffer();
		if (map != null && map.size()>0) {
			logText.append(" with : " );			
			if(map.get(BusinessKeys.TrackingID)!=null){
				logText.append(" TrackingID = " + map.get(BusinessKeys.TrackingID));					
			}
			if(map.get(BusinessKeys.EstID)!=null){
				logText.append(" EstablishmentID = " + map.get(BusinessKeys.EstID) );
			}
			if(map.get(BusinessKeys.agentQID)!=null){
				logText.append(" AgentQID = " + map.get(BusinessKeys.agentQID));
			}
			if(map.get(BusinessKeys.appNo)!=null){
				logText.append(" appNO = " + map.get(BusinessKeys.appNo) );
			}
			if(map.get(BusinessKeys.appYear)!=null){
				logText.append(" ApplicationYear = " + map.get(BusinessKeys.appYear) );
			}
			if(map.get(BusinessKeys.Elect_No)!=null){
				logText.append(" ElectricityNo = " + map.get(BusinessKeys.Elect_No));
			}
		}
		return logText.toString();
	}
	
	public static void logInput(String caller,String called,DataObject bo,Map<Integer,String> map){
		try {
			Logger log = Logger.getLogger(loggingClass);
			StringBuffer logText = new StringBuffer();
			if(caller!=called){
				logText.append("Start the Call "+ called + " from "+ caller );				
			}
			else{
				logText.append("Start the call of "+ called );				
			}
			logText.append(getBusinessKeys(map));
			log.log(Level.INFO,logText.toString() );			
			LogBO(bo, caller, called, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void logOutput(String caller,String called,DataObject bo,Map<Integer,String> map){
		try {
			Logger log = Logger.getLogger(loggingClass);
			StringBuffer logText = new StringBuffer();
			if(caller!=called){
				logText.append("End   the call of "+ called + " from "+ caller );				
			}
			else{
				logText.append("End   the call of "+ called );				
				
			}
			logText.append(getBusinessKeys(map));
			LogBO(bo, caller, called, false);
			log.log(Level.INFO,logText.toString() );
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
