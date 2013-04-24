/**
 * RecruitmentProcessGetSuspendedApplicationsBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf250920.22 v6109135024
 */

package qa.gov.mol;

import qa.gov.mol.manager.ServiceManager;


public class RecruitmentProcessGetSuspendedApplicationsBindingImpl  implements javax.ejb.SessionBean{
    private javax.ejb.SessionContext sessionContext = null;

    public void ejbActivate() {
    }

    public void ejbCreate() {
    }

    public void ejbPassivate() {
    }

    public void ejbRemove() {
    }

    public javax.ejb.SessionContext getSessionContext() {
        return sessionContext;
    }

    public void setSessionContext(javax.ejb.SessionContext sc) {
        sessionContext = sc;
    }

    public qa.gov.mol.SuspendedApplication[] getSuspendedApplicationsTasks(qa.gov.mol.GetSuspendedApplicationsTasksRequest getSuspendedAppsTasksReq) throws java.rmi.RemoteException, qa.gov.igov.CommonErrorStructure {
        return ServiceManager.getInstance().getSuspendedApps(getSuspendedAppsTasksReq);
    }

}
