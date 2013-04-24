/**
 * ApplicationDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.mol;

public class ApplicationDetailsType  {
    private java.util.Calendar applicationDate;
    private java.lang.String establishmentName;
    private qa.gov.mol.DetailedProfessionsType[] requiredProfessions;
    private qa.gov.mol.DetailedProfessionsType[] approvedProfessions;
    private qa.gov.mol.ReviewResultType[] reviewResults;
    private qa.gov.mol.ApplicationStatusType status;
    private java.lang.String electricityNumber;
    private java.lang.String agentQID;
    private java.lang.String agentEmail;
    private java.lang.String agentPhone;
    private java.lang.String establishmentID;
    private qa.gov.igov.AddressType establishmentAddress;
    private java.lang.String remarks;
    private qa.gov.mol.PaymentFeesType paymentFees;
    private qa.gov.mol.PaymentTransactionType paymentTransaction;
    private java.lang.String commercialRegistrationCode;
    private java.lang.String commercialPermitID;

    public ApplicationDetailsType() {
    }

    public java.util.Calendar getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(java.util.Calendar applicationDate) {
        this.applicationDate = applicationDate;
    }

    public java.lang.String getEstablishmentName() {
        return establishmentName;
    }

    public void setEstablishmentName(java.lang.String establishmentName) {
        this.establishmentName = establishmentName;
    }

    public qa.gov.mol.DetailedProfessionsType[] getRequiredProfessions() {
        return requiredProfessions;
    }

    public void setRequiredProfessions(qa.gov.mol.DetailedProfessionsType[] requiredProfessions) {
        this.requiredProfessions = requiredProfessions;
    }

    public qa.gov.mol.DetailedProfessionsType getRequiredProfessions(int i) {
        return this.requiredProfessions[i];
    }

    public void setRequiredProfessions(int i, qa.gov.mol.DetailedProfessionsType value) {
        this.requiredProfessions[i] = value;
    }

    public qa.gov.mol.DetailedProfessionsType[] getApprovedProfessions() {
        return approvedProfessions;
    }

    public void setApprovedProfessions(qa.gov.mol.DetailedProfessionsType[] approvedProfessions) {
        this.approvedProfessions = approvedProfessions;
    }

    public qa.gov.mol.DetailedProfessionsType getApprovedProfessions(int i) {
        return this.approvedProfessions[i];
    }

    public void setApprovedProfessions(int i, qa.gov.mol.DetailedProfessionsType value) {
        this.approvedProfessions[i] = value;
    }

    public qa.gov.mol.ReviewResultType[] getReviewResults() {
        return reviewResults;
    }

    public void setReviewResults(qa.gov.mol.ReviewResultType[] reviewResults) {
        this.reviewResults = reviewResults;
    }

    public qa.gov.mol.ReviewResultType getReviewResults(int i) {
        return this.reviewResults[i];
    }

    public void setReviewResults(int i, qa.gov.mol.ReviewResultType value) {
        this.reviewResults[i] = value;
    }

    public qa.gov.mol.ApplicationStatusType getStatus() {
        return status;
    }

    public void setStatus(qa.gov.mol.ApplicationStatusType status) {
        this.status = status;
    }

    public java.lang.String getElectricityNumber() {
        return electricityNumber;
    }

    public void setElectricityNumber(java.lang.String electricityNumber) {
        this.electricityNumber = electricityNumber;
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

    public java.lang.String getEstablishmentID() {
        return establishmentID;
    }

    public void setEstablishmentID(java.lang.String establishmentID) {
        this.establishmentID = establishmentID;
    }

    public qa.gov.igov.AddressType getEstablishmentAddress() {
        return establishmentAddress;
    }

    public void setEstablishmentAddress(qa.gov.igov.AddressType establishmentAddress) {
        this.establishmentAddress = establishmentAddress;
    }

    public java.lang.String getRemarks() {
        return remarks;
    }

    public void setRemarks(java.lang.String remarks) {
        this.remarks = remarks;
    }

    public qa.gov.mol.PaymentFeesType getPaymentFees() {
        return paymentFees;
    }

    public void setPaymentFees(qa.gov.mol.PaymentFeesType paymentFees) {
        this.paymentFees = paymentFees;
    }

    public qa.gov.mol.PaymentTransactionType getPaymentTransaction() {
        return paymentTransaction;
    }

    public void setPaymentTransaction(qa.gov.mol.PaymentTransactionType paymentTransaction) {
        this.paymentTransaction = paymentTransaction;
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
