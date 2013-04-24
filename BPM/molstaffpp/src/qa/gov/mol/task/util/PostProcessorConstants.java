/**
 * Interface PostProcessorConstants
 * This interface is listing common constants such as Jndi names for
 *  human task manager and business flow manager 
 * @author Tlatif
 * @copyright (C) GBM/ictQATAR 2010
 * @date 21.03.2010
 * @history 
 */

package qa.gov.mol.task.util;

public interface PostProcessorConstants {
	public static final String HUMANTASKSNAMES_CONFIG_FILE="HumanTasksNames.properties";
	public static final String HUMANTASKMANAGER_JNDI_NAME="com/ibm/task/api/HumanTaskManagerHome";
	public static final String BUSINESSFLOWMANAGER_JNDI_NAME="com/ibm/bpe/api/BusinessFlowManagerHome";

}
