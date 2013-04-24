package qa.gov.mol.manager;

import com.ibm.bpe.api.LocalBusinessFlowManager;
import com.ibm.task.api.LocalHumanTaskManager;

public interface IConstants {
	public static LocalHumanTaskManager htm=null;
	public static LocalBusinessFlowManager bfm=null;
	public static String applicationNo="applicationNo"; 
	public static String year="year"; 
	public static String estID="estID"; 
	public static String electricityNo="electricityNo"; 
	public static String agentQID="agentQID"; 
	public static String estName="estName"; 
	public static String applicationDate="applicationDate"; 
	public static String agentID="agentID";
	public static String CSRID="csrID";
	public static String suspendedDate="suspendedDate";
	public static String CSRRemarks="CSRRemarks";
	public static String CRCode="CRCode";
	public static String CPID="CPID";

	public static String processName="LaborRecruitmentProcess";
	public static String statusID="statusID";
	public static String OnWaiting="OnWaiting";
	
	// This error code raised for all unlmodeled exceptions catch in the service
	public static final String Unmodeled_case ="9615";
	// this is the network location default value in commonErrorStrucure for excpetions in process
	public static final String networkLocation ="MOL:Recuirtment:SusepndedService";
	
	

}
