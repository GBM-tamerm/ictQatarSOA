/**
 * ApplicationLW.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.mol;

public class ApplicationLW  {
    private java.lang.String electricityNumber;
    private java.lang.String estID;
    private qa.gov.mol.ApplicationIdType applicationID;
    private java.lang.String agentQID;
    private java.lang.String agentEmail;
    private java.lang.String agentPhone;
    private java.lang.String estName;
    private java.util.Calendar applicationDate;
    private qa.gov.mol.ProcessMetadata processMetadata;
    private qa.gov.mol.ApplicationStatusType status;
    private java.lang.String commercialRegistrationCode;
    private java.lang.String commercialPermitID;

    public ApplicationLW() {
    }

    public java.lang.String getElectricityNumber() {
        return electricityNumber;
    }

    public void setElectricityNumber(java.lang.String electricityNumber) {
        this.electricityNumber = electricityNumber;
    }

    public java.lang.String getEstID() {
        return estID;
    }

    public void setEstID(java.lang.String estID) {
        this.estID = estID;
    }

    public qa.gov.mol.ApplicationIdType getApplicationID() {
        return applicationID;
    }

    public void setApplicationID(qa.gov.mol.ApplicationIdType applicationID) {
        this.applicationID = applicationID;
    }

    public java.lang.String getAgentQID() {
        return agentQID;
    }

    public void setAgentQID(java.lang.String agentQID) {
        this.agentQID = agentQID;
    }

    public java.lang.String getAgentEmail() {
        return agentEmail;
    }

    public void setAgentEmail(java.lang.String agentEmail) {
        this.agentEmail = agentEmail;
    }

    public java.lang.String getAgentPhone() {
        return agentPhone;
    }

    public void setAgentPhone(java.lang.String agentPhone) {
        this.agentPhone = agentPhone;
    }

    public java.lang.String getEstName() {
        return estName;
    }

    public void setEstName(java.lang.String estName) {
        this.estName = estName;
    }

    public java.util.Calendar getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(java.util.Calendar applicationDate) {
        this.applicationDate = applicationDate;
    }

    public qa.gov.mol.ProcessMetadata getProcessMetadata() {
        return processMetadata;
    }

    public void setProcessMetadata(qa.gov.mol.ProcessMetadata processMetadata) {
        this.processMetadata = processMetadata;
    }

    public qa.gov.mol.ApplicationStatusType getStatus() {
        return status;
    }

    public void setStatus(qa.gov.mol.ApplicationStatusType status) {
        this.status = status;
    }

    public java.lang.String getCommercialRegistrationCode() {
        return commercialRegistrationCode;
    }

    public void setCommercialRegistrationCode(java.lang.String commercialRegistrationCode) {
        this.commercialRegistrationCode = commercialRegistrationCode;
    }

    public java.lang.String getCommercialPermitID() {
        return commercialPermitID;
    }

    public void setCommercialPermitID(java.lang.String commercialPermitID) {
        this.commercialPermitID = commercialPermitID;
    }

}
