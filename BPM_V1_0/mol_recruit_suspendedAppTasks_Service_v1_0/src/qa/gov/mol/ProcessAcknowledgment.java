/**
 * ProcessAcknowledgment.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.mol;

public class ProcessAcknowledgment  {
    private qa.gov.mol.ApplicationIdType applicationID;
    private qa.gov.mol.InValidType inValidResults;
    private java.lang.String failureNote;

    public ProcessAcknowledgment() {
    }

    public qa.gov.mol.ApplicationIdType getApplicationID() {
        return applicationID;
    }

    public void setApplicationID(qa.gov.mol.ApplicationIdType applicationID) {
        this.applicationID = applicationID;
    }

    public qa.gov.mol.InValidType getInValidResults() {
        return inValidResults;
    }

    public void setInValidResults(qa.gov.mol.InValidType inValidResults) {
        this.inValidResults = inValidResults;
    }

    public java.lang.String getFailureNote() {
        return failureNote;
    }

    public void setFailureNote(java.lang.String failureNote) {
        this.failureNote = failureNote;
    }

}
