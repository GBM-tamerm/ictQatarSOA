/**
 * Class RoundRobinDispatcher
 * This class is responsible of dispatching the human tasks to users in round robin fashion 
 * @author Tlatif
 * @copyright (C) GBM/ictQATAR 2010
 * @date 21.03.2010
 * @history 
 */

package qa.gov.mol.task.dispatcher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.naming.InitialContext;

import qa.gov.mol.task.plugin.IHumanTaskDispatcher;

import com.ibm.bpe.api.LocalBusinessFlowManager;
import com.ibm.bpe.api.LocalBusinessFlowManagerHome;
import com.ibm.bpe.api.PIID;
import com.ibm.bpe.api.QueryResultSet;
import com.ibm.task.api.LocalHumanTaskManager;
import com.ibm.task.api.LocalHumanTaskManagerHome;
import com.ibm.task.api.Task;
import com.ibm.task.spi.StaffQueryResult;
import com.ibm.task.spi.StaffQueryResultFactory;
import com.ibm.task.spi.UserData;

public class RoundRobinDispatcher implements IHumanTaskDispatcher {

	Logger logger =  Logger.getLogger("MOLStaffPP");
	
	private LocalHumanTaskManager htm=null;
	private LocalBusinessFlowManager bfm=null;
	private String userIDProperty="userID";

	public RoundRobinDispatcher() {
		super();
		init();
	}

	/**
	 * Method processStaffQueryResult
	 * This method is responsible of updating the list of users returned from system staff resolution (i.e list of CSR users)
	 * by selection one user from the list in round robin fashoin 
	 * or selecting a specific user ID in case of resume a suspended application. 
	 * @param StaffQueryResult,Task,role,Context
	 * @return StaffQueryResult
	 */

	public StaffQueryResult processStaffQueryResult(StaffQueryResult result,
			Task task, int role, Map context) {
		
		List<String> users=getSortedUsers(result);
		if(users==null || users.isEmpty() ||  role != com.ibm.task.api.WorkItem.REASON_POTENTIAL_OWNER){
			return result;
		}
		String htFullName =task.getName();

		PIID piid = (PIID) task.getContainmentContextID();
		String requiredUser=getVariableValueByQueryPropery(piid.toString(), userIDProperty);
		logger.log(Level.INFO,"required user is :"+requiredUser);
		if(requiredUser!=null &&  requiredUser!="" && users.indexOf(requiredUser)!=-1){
			List<String> newUserList= new ArrayList<String>();
			newUserList.add(requiredUser);
			return getStaffQueryResult(newUserList);			
		}
		String userID=getLatestUserProcessedTask(htFullName);		
		logger.log(Level.INFO,"current user is :"+userID);

		int userIndex=users.indexOf(userID);
		String newUser="";
		if(userIndex==-1 || userIndex==users.size()-1 ){
			newUser=users.get(0);
		}
		else
		{
			newUser=users.get(userIndex+1);			
		}
		logger.log(Level.INFO,"new user is :"+newUser);
		if(newUser==null || newUser==""){
			return result;
		}
		List<String> newUserList= new ArrayList<String>();
		newUserList.add(newUser);
		return getStaffQueryResult(newUserList);
	}
	
	/**
	 * Method init
	 * This method is responsible of initializing the HumanTaskManager & BusineeFlowManager EJBs
	 * to be used for querying the tasks and getting the last user ID that perform a CSR review 
	 * or selecting a specific user ID in case of resume a suspended application. 
	 */

	private void init() {
		
		try {
			InitialContext initialHTMContext = new InitialContext();
			LocalHumanTaskManagerHome localHumanTaskManagerHome = (LocalHumanTaskManagerHome)initialHTMContext.lookup("local:ejb/com/ibm/task/api/HumanTaskManagerHome");
			htm= localHumanTaskManagerHome.create();

			InitialContext initialBFMContext = new InitialContext();
			LocalBusinessFlowManagerHome localBusinessFlowManagerHome = (LocalBusinessFlowManagerHome)initialBFMContext.lookup("local:ejb/com/ibm/bpe/api/BusinessFlowManagerHome");
			bfm=localBusinessFlowManagerHome.create();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Method getSortedUsers
	 * This method is responsible of sorting a list in ASC order
	 * @param StaffQueryResult
	 * @return List
	 */

	private List<String > getSortedUsers(StaffQueryResult queryResult){
		List<String> users= new ArrayList<String>();
		queryResult.getUserData();
		for (Iterator iterator = queryResult.getUserData().iterator(); iterator.hasNext();) {
			UserData userData = (UserData) iterator.next();
			users.add(userData.getUserName());
		}
		Collections.sort(users);
		return users;
	}
	/**
	 * Method getLatestUserProcessedTask
	 * This method is using HumanTaskManager API to query the human tasks and getting the last userId who perform a specific task
	 * @param taskName
	 * @return userID
	 */	
	private String getLatestUserProcessedTask(String taskName){
		try {
			String WhereClause="TASK.KIND IN ( TASK.KIND.KIND_HUMAN, TASK.KIND.KIND_PARTICIPATING ) AND " +   
	           "WORK_ITEM.REASON = WORK_ITEM.REASON.REASON_POTENTIAL_OWNER AND TASK.NAME='"+taskName+"'";
			 com.ibm.task.api.QueryResultSet result=htm.queryAll("DISTINCT TASK.OWNER",WhereClause, "TASK.ACTIVATED DESC", null, new Integer(1), null);
			 if(result.next()){
				  return result.getString(1);				 				 
			 }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * Method getStaffQueryResult
	 * This method is responsible of creating StaffQueryResult from a list of user IDs
	 * @param userIDList
	 * @return StaffQueryResult
	 */		
	private StaffQueryResult getStaffQueryResult(List<String> userIDList)
	{
		StaffQueryResultFactory staffResultFactory=StaffQueryResultFactory.newInstance();;
		
		UserData user;
		ArrayList<UserData> newList=new ArrayList<UserData>();
	
		for(String userID:userIDList)
		{
			user = staffResultFactory.newUserData(userID,null,"");
			newList.add(user);	
		}
		
		return staffResultFactory.newStaffQueryResult(newList);
	}
	
	/**
	 * Method getVariableValueByQueryPropery
	 * This method is using BusinessFlowManager API to query the review process and getting the user ID who resumed the suspended application.
	 * @param process ID , propertyName
	 * @return userID
	 */	

	private String getVariableValueByQueryPropery(String piid,String propertyName) 
	{
		  try {
			  
			  QueryResultSet results=bfm.queryAll("QUERY_PROPERTY.STRING_VALUE", "QUERY_PROPERTY.PIID=ID('"+piid+"') AND QUERY_PROPERTY.NAME='"+propertyName+"'",null,null,null,null);
				
			  while(results.next())
			  {
				  
				  return results.getString(1);
				  
			  } 
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return null;
		
	}

	
}
