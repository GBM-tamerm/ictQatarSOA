/**
 * Interface ProcessErrorCodes
 * This interface is listing the error codes raised from process layer
 * @author Tlatif
 * @copyright (C) GBM/ictQATAR 2010
 * @date 21.03.2010
 * @history 
 */
package qa.gov.mol.lr.process.constants;

public interface ProcessErrorCodes {
	// This error code raised for all unlmodeled exceptions catch in the process
	public static final String Unmodeled_case ="9613";
	//  This error code raised if failed to notify agent & owner after successfully submitting new application
	public static final String NotifyAgentFailure ="9614";
	// this is the network location default value in commonErrorStrucure for excpetions in process
	public static final String networkLocation ="MOL:Recuirtment:Process";
	

}
