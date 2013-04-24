/**
 * Interface IHumanTaskDispatcher
 * This is the main interface for any human task dispatcher such as round robin dispatcher
 * @author Tlatif
 * @copyright (C) GBM/ictQATAR 2010
 * @date 21.03.2010
 * @history 
 */

package qa.gov.mol.task.plugin;
import com.ibm.task.api.Task;
import com.ibm.task.spi.StaffQueryResult;
import java.util.Map;

public interface IHumanTaskDispatcher {
	public StaffQueryResult processStaffQueryResult(StaffQueryResult qResult, Task task, int role, Map context);
}
