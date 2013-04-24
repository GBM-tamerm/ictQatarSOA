/**
 * Class GovHeaderHelper
 * This is a helper class for setting IGOVHeader with 
 * default values such as MEP , RUNMODE ,ApplicationID and tracking ID.
 * @author Tlatif
 * @copyright (C) GBM/ictQATAR 2010
 * @date 21.03.2010
 * @history 
 */

package qa.gov.mol.lr.common;

import java.util.Date;

public class GovHeaderHelper {
	
	public static String ApplicationID=ResourceBundleUtil.getString(ICommonConstants.COMMON_CONFIG,ICommonConstants.LR_APPLICATION_ID);
	public static String MEP_RR="RequestReply";
	public static String MEP_FF="FireAndForget";
	public static String RUNMODE_P="P";
	public static String RUNMODE_D="D";
	public static String RUNMODE_T="T";
	public static String RUNMODE_Q="Q";
	
	/**
	 * Method createTrackingID
	 * This method is responsible of creating tracking ID for IGOVHeader
	 * in the following format : ApplicationID+userID+TimeStamp
	 * @param UserID
	 * @return TrackingID
	 */
	
	public static String createTrackingID(String userID){
		Date date = new Date();
		String user=userID;
		try{
			if(userID!=null && userID.startsWith("TID")){
				String[] strs=userID.split("-");
				user=strs[2];		
			}
			return ApplicationID+"-"+user+"-"+date.getTime();			
		}
		catch(Exception e){
			if(userID!=null && !userID.startsWith("TID")){
				return ApplicationID+"-"+userID+"-"+date.getTime();				
			}else{
				return ApplicationID+"-"+date.getTime();				
			}
			
		}

	}
	
}
