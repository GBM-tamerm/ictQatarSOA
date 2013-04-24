/**
 * EstablishmentInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.moi;

public class EstablishmentInfoType  {
    private java.lang.String name;
    private java.lang.String id;
    private qa.gov.igov.AddressType[] address;
    private java.lang.String[] phone;
    private qa.gov.igov.PersonInfoType[] owners;
    private qa.gov.igov.PersonInfoType[] agents;
    private java.lang.Integer currentCountOfWorkers;
    private java.lang.String email;
    private qa.gov.igov.PersonInfoType[] authorizedSignatories;

    public EstablishmentInfoType() {
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getId() {
        return id;
    }

    public void setId(java.lang.String id) {
        this.id = id;
    }

    public qa.gov.igov.AddressType[] getAddress() {
        return address;
    }

    public void setAddress(qa.gov.igov.AddressType[] address) {
        this.address = address;
    }

    public qa.gov.igov.AddressType getAddress(int i) {
        return this.address[i];
    }

    public void setAddress(int i, qa.gov.igov.AddressType value) {
        this.address[i] = value;
    }

    public java.lang.String[] getPhone() {
        return phone;
    }

    public void setPhone(java.lang.String[] phone) {
        this.phone = phone;
    }

    public java.lang.String getPhone(int i) {
        return this.phone[i];
    }

    public void setPhone(int i, java.lang.String value) {
        this.phone[i] = value;
    }

    public qa.gov.igov.PersonInfoType[] getOwners() {
        return owners;
    }

    public void setOwners(qa.gov.igov.PersonInfoType[] owners) {
        this.owners = owners;
    }

    public qa.gov.igov.PersonInfoType getOwners(int i) {
        return this.owners[i];
    }

    public void setOwners(int i, qa.gov.igov.PersonInfoType value) {
        this.owners[i] = value;
    }

    public qa.gov.igov.PersonInfoType[] getAgents() {
        return agents;
    }

    public void setAgents(qa.gov.igov.PersonInfoType[] agents) {
        this.agents = agents;
    }

    public qa.gov.igov.PersonInfoType getAgents(int i) {
        return this.agents[i];
    }

    public void setAgents(int i, qa.gov.igov.PersonInfoType value) {
        this.agents[i] = value;
    }

    public java.lang.Integer getCurrentCountOfWorkers() {
        return currentCountOfWorkers;
    }

    public void setCurrentCountOfWorkers(java.lang.Integer currentCountOfWorkers) {
        this.currentCountOfWorkers = currentCountOfWorkers;
    }

    public java.lang.String getEmail() {
        return email;
    }

    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    public qa.gov.igov.PersonInfoType[] getAuthorizedSignatories() {
        return authorizedSignatories;
    }

    public void setAuthorizedSignatories(qa.gov.igov.PersonInfoType[] authorizedSignatories) {
        this.authorizedSignatories = authorizedSignatories;
    }

    public qa.gov.igov.PersonInfoType getAuthorizedSignatories(int i) {
        return this.authorizedSignatories[i];
    }

    public void setAuthorizedSignatories(int i, qa.gov.igov.PersonInfoType value) {
        this.authorizedSignatories[i] = value;
    }

}
