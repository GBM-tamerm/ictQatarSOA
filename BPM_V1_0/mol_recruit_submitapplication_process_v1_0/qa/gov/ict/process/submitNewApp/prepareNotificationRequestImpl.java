package qa.gov.ict.process.submitNewApp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import qa.gov.mol.lr.common.ICommonConstants;
import qa.gov.mol.lr.process.constants.IProcessConstants;
import qa.gov.mol.lr.process.util.PrepareNotificationUtil;
import qa.gov.mol.lr.process.util.ResourceBundleUtil;

import com.ibm.websphere.bo.BOFactory;
import com.ibm.websphere.sca.ServiceManager;
import commonj.sdo.DataObject;


public class prepareNotificationRequestImpl {

	static Logger myLogger = Logger.getLogger("SumbitAppNotification");
	private String ARABIC="0";
	private String ENGLISH="1";
	private String BOTH="2";
	private String TRUE="TRUE";
	/**
	 * Default constructor.
	 */
	public prepareNotificationRequestImpl() {
		super();
	}

	/**
	 * Return a reference to the component service instance for this implementation
	 * class.  This method should be used when passing this service to a partner reference
	 * or if you want to invoke this component service asynchronously.    
	 *
	 * @generated (com.ibm.wbit.java)
	 */
	@SuppressWarnings("unused")
	private Object getMyService() {
		return (Object) ServiceManager.INSTANCE.locateService("self");
	}

	/**
	 * Method generated to support implementation of operation "PrepareNotificationRequest" defined for WSDL port type 
	 * named "PrepareNotification".
	 * 
	 * The presence of commonj.sdo.DataObject as the return type and/or as a parameter 
	 * type conveys that it is a complex type. Please refer to the WSDL Definition for more information 
	 * on the type of input, output and fault(s).
	 */
	public DataObject PrepareNotificationRequest(DataObject app,
			DataObject estInfo) {
		return PrepareNotificationUtil.prepareNotificatoinForSubmitNewApp(app, estInfo);
	}
}