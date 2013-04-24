/**
 * PersonInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.igov;

public class PersonInfoType  {
    private java.lang.String QID;
    private qa.gov.igov.PersonNameType personName;
    private java.lang.String homePhone;
    private java.lang.String businessPhone;
    private java.lang.String mobilePhone;
    private java.lang.String emailAddress;
    private qa.gov.igov.AddressType address;
    private qa.gov.igov.NationalityType nationality;
    private qa.gov.igov.ProfessionType profession;

    public PersonInfoType() {
    }

    public java.lang.String getQID() {
        return QID;
    }

    public void setQID(java.lang.String QID) {
        this.QID = QID;
    }

    public qa.gov.igov.PersonNameType getPersonName() {
        return personName;
    }

    public void setPersonName(qa.gov.igov.PersonNameType personName) {
        this.personName = personName;
    }

    public java.lang.String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(java.lang.String homePhone) {
        this.homePhone = homePhone;
    }

    public java.lang.String getBusinessPhone() {
        return businessPhone;
    }

    public void setBusinessPhone(java.lang.String businessPhone) {
        this.businessPhone = businessPhone;
    }

    public java.lang.String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(java.lang.String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public java.lang.String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(java.lang.String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public qa.gov.igov.AddressType getAddress() {
        return address;
    }

    public void setAddress(qa.gov.igov.AddressType address) {
        this.address = address;
    }

    public qa.gov.igov.NationalityType getNationality() {
        return nationality;
    }

    public void setNationality(qa.gov.igov.NationalityType nationality) {
        this.nationality = nationality;
    }

    public qa.gov.igov.ProfessionType getProfession() {
        return profession;
    }

    public void setProfession(qa.gov.igov.ProfessionType profession) {
        this.profession = profession;
    }

}
