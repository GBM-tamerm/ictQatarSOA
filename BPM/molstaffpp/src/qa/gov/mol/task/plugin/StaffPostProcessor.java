/**
 * Class RoundRobinDispatcher
 * This class is the main entry point for the human task post processor 
 * it will be called from the human task container after finishing the staff 
 * resolution for every human task instance.
 * @author Tlatif
 * @copyright (C) GBM/ictQATAR 2010
 * @date 21.03.2010
 * @history 
 */

package qa.gov.mol.task.plugin;

import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import qa.gov.mol.task.util.PostProcessorConstants;

import com.ibm.task.api.ApplicationComponent;
import com.ibm.task.api.Escalation;
import com.ibm.task.api.EscalationTemplate;
import com.ibm.task.api.Task;
import com.ibm.task.api.TaskTemplate;
import com.ibm.task.spi.StaffQueryResult;
import com.ibm.task.spi.StaffQueryResultPostProcessorPlugin;

public class StaffPostProcessor implements StaffQueryResultPostProcessorPlugin {

	Logger logger =  Logger.getLogger("MOLStaffPP");
	
	private Properties htNames = null;

	/**
	 * Constructor StaffPostProcessor
	 * The class constructor is responsible of loading the configuration file "HumanTaskNames.properties"
	 * which has key-value pairs as follow:
	 * key: task template name
	 * value : the qualified class name of the human task dispatcher.
	 */
	
	public StaffPostProcessor() {
		
		try {
			htNames=new Properties();
	
			htNames.load(getClass().getClassLoader().getResourceAsStream(PostProcessorConstants.HUMANTASKSNAMES_CONFIG_FILE));
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.log(Level.SEVERE,e.toString());
		}	
	}

	/**
	 * Method processStaffQueryResult
	 * This method is responsible of correlating the current human task instance
	 *  with the corresponding  human task dispatcher as per configuration file "HumanTaskNames.properties"
	 * @param StaffQueryResult,Task,role,Context
	 * @return StaffQueryResult
	 */

	public StaffQueryResult processStaffQueryResult(StaffQueryResult qResult, Task task, int role, Map context) {
		String htFullName =task.getName();
		int index=htFullName.indexOf("$");
		String hTName=htFullName.substring(index+1);  
		String dispatcherName=(String)htNames.get(hTName);
		if(dispatcherName!=null && dispatcherName!=""){
			logger.log(Level.INFO,"Task Dispatcher '"+dispatcherName+"' has been selected for task template '"+task.getName()+"'");		
			try {
				Object classInstance=Class.forName(dispatcherName).newInstance();
				if(classInstance instanceof IHumanTaskDispatcher){
					IHumanTaskDispatcher dispatcher= (IHumanTaskDispatcher)classInstance;
					return dispatcher.processStaffQueryResult(qResult, task, role, context);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		logger.log(Level.INFO,"No Task Dispatcher has been selected for task template '"+task.getName()+"'");		
		return qResult;
	}

	public StaffQueryResult processStaffQueryResult(StaffQueryResult arg0,
			TaskTemplate arg1, int arg2, Map arg3) {
		// TODO Auto-generated method stub
		return null;
	}

	public StaffQueryResult processStaffQueryResult(StaffQueryResult arg0,
			Escalation arg1, Task arg2, int arg3, Map arg4) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	public StaffQueryResult processStaffQueryResult(StaffQueryResult arg0,
			ApplicationComponent arg1, int arg2, Map arg3) {
		// TODO Auto-generated method stub
		return null;
	}

	public StaffQueryResult processStaffQueryResult(StaffQueryResult arg0,
			EscalationTemplate arg1, int arg2, Map arg3) {
		// TODO Auto-generated method stub
		return null;
	}

}
