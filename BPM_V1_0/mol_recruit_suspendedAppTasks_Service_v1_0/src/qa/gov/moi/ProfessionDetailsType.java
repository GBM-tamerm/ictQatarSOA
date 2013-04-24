/**
 * ProfessionDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.moi;

public class ProfessionDetailsType  {
    private java.lang.Integer permittedVisaCount;
    private java.lang.Integer usedVisaCount;
    private java.lang.Integer remainingVisaCount;
    private qa.gov.igov.ProfessionType profession;
    private qa.gov.igov.NationalityType nationality;
    private qa.gov.igov.GenderType gender;
    private java.lang.String vpNumber;
    private java.lang.String applicationNumber;
    private java.lang.String year;
    private java.util.Calendar expiryDate;

    public ProfessionDetailsType() {
    }

    public java.lang.Integer getPermittedVisaCount() {
        return permittedVisaCount;
    }

    public void setPermittedVisaCount(java.lang.Integer permittedVisaCount) {
        this.permittedVisaCount = permittedVisaCount;
    }

    public java.lang.Integer getUsedVisaCount() {
        return usedVisaCount;
    }

    public void setUsedVisaCount(java.lang.Integer usedVisaCount) {
        this.usedVisaCount = usedVisaCount;
    }

    public java.lang.Integer getRemainingVisaCount() {
        return remainingVisaCount;
    }

    public void setRemainingVisaCount(java.lang.Integer remainingVisaCount) {
        this.remainingVisaCount = remainingVisaCount;
    }

    public qa.gov.igov.ProfessionType getProfession() {
        return profession;
    }

    public void setProfession(qa.gov.igov.ProfessionType profession) {
        this.profession = profession;
    }

    public qa.gov.igov.NationalityType getNationality() {
        return nationality;
    }

    public void setNationality(qa.gov.igov.NationalityType nationality) {
        this.nationality = nationality;
    }

    public qa.gov.igov.GenderType getGender() {
        return gender;
    }

    public void setGender(qa.gov.igov.GenderType gender) {
        this.gender = gender;
    }

    public java.lang.String getVpNumber() {
        return vpNumber;
    }

    public void setVpNumber(java.lang.String vpNumber) {
        this.vpNumber = vpNumber;
    }

    public java.lang.String getApplicationNumber() {
        return applicationNumber;
    }

    public void setApplicationNumber(java.lang.String applicationNumber) {
        this.applicationNumber = applicationNumber;
    }

    public java.lang.String getYear() {
        return year;
    }

    public void setYear(java.lang.String year) {
        this.year = year;
    }

    public java.util.Calendar getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(java.util.Calendar expiryDate) {
        this.expiryDate = expiryDate;
    }

}
