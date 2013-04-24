/**
 * Interface IApplicationStatus
 * This interface is listing common constants such as logging levels , notification language
 *  SMS Sender Code ,Application ID , and Email Sender
 * @author Tlatif
 * @copyright (C) GBM/ictQATAR 2010
 * @date 21.03.2010
 * @history 
 */


package qa.gov.mol.lr.common;
import java.util.logging.Level;

public interface ICommonConstants {
	// configuration file constants
	public static final String COMMON_CONFIG = "qa/gov/mol/lr/common/config/CommonConfig";
	public static final String LR_APPLICATION_ID = "LR_APPLICATION_ID";
	public static final String SMS_SENDER_CODE ="SMS_SENDER_CODE";
	public static final String LR_EMAIL_SENDER = "LR_EMAIL_SENDER";

	// Communication Language  
	public static final String ARABIC = "ARABIC";
	public static final String ENGLISH = "ENGLISH";
	
	
	// Logger Levels
	// all level will be controlled from WebSphere Console
	
	// for debugging purposes in development and troubleshooting
	public static final Level LOGGER_LEVEL_DEBUG = Level.FINE;
	// for portions of the code that is important to be logged to the administrator
	public static final Level LOGGER_LEVEL_IN_CODE = Level.INFO;
	// for all exceptions thrown in the code
	public static final Level LOGGER_LEVEL_EXCEPTION = Level.SEVERE;

	
}
