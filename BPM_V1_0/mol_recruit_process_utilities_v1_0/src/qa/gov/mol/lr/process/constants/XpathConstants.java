/**
 * Interface XpathConstants
 * This interface is listing the XPath Constants used in the application BOs
 * @author Tlatif
 * @copyright (C) GBM/ictQATAR 2010
 * @date 18.04.2010
 * @history 
 */
package qa.gov.mol.lr.process.constants;

public interface XpathConstants {
	// Application No
	public static final String App_No="/applicationID/ApplicationNumber";
	public static final String App_Year="/applicationID/year";
	public static final String Est_ID="estID";
	public static final String Elec_NO="electricityNumber";
	public static final String Agent_QID="agentQID";
	public static final String applicationDate="applicationDate";
	
	
	// process meta data
	public static final String Step_ID="/processMetadata/stepID";
	public static final String faultMessage="/processMetadata/faultMessage";
	public static final String Correlation_ID="/processMetadata/correlationID";
	
	
	// IGOVHeader
	public static final String Govheader_SenderInfo_trackingID="/SenderInfo/TrackingID";
	public static final String Govheader_SenderInfo_userID="/SenderInfo/UID";
	public static final String Govheader_SenderInfo_appID="/SenderInfo/ApplicationID";
	public static final String Govheader_MEP="MEP";
	public static final String Govheader_RunMode="RunMode";
	

}
