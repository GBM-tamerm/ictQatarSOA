/**
 * DetailedProfessionsType.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.mol;

public class DetailedProfessionsType  {
    private int requiredNumber;
    private qa.gov.igov.ProfessionType profession;
    private qa.gov.igov.NationalityType nationality;
    private qa.gov.igov.GenderType gender;
    private java.lang.String vpNumber;

    public DetailedProfessionsType() {
    }

    public int getRequiredNumber() {
        return requiredNumber;
    }

    public void setRequiredNumber(int requiredNumber) {
        this.requiredNumber = requiredNumber;
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

}
