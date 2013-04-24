/**
 * ApplicationDetailsLW.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.mol;

public class ApplicationDetailsLW  {
    private java.lang.String estID;
    private java.lang.String electricityNumber;
    private java.lang.String agentQID;
    private java.lang.String agentEmail;
    private java.lang.String agentPhone;
    private qa.gov.mol.DetailedProfessionsType[] requiredProfessions;
    private java.lang.String estName;
    private qa.gov.mol.PaymentFeesType paymentFees;
    private qa.gov.mol.PaymentTransactionType paymentTransaction;
    private java.lang.String commercialRegistrationCode;
    private java.lang.String commercialPermitID;

    public ApplicationDetailsLW() {
    }

    public java.lang.String getEstID() {
        return estID;
    }

    public void setEstID(java.lang.String estID) {
        this.estID = estID;
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

    public java.lang.String getEstName() {
        return estName;
    }

    public void setEstName(java.lang.String estName) {
        this.estName = estName;
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
