/**
 * CommercialPermitType_Deser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.baladiya;

public class CommercialPermitType_Deser extends com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializer {
    /**
     * Constructor
     */
    public CommercialPermitType_Deser(
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType, 
           com.ibm.ws.webservices.engine.description.TypeDesc _typeDesc) {
        super(_javaType, _xmlType, _typeDesc);
    }
    /**
     * Create instance of java bean
     */
    public void createValue() {
        value = new qa.gov.baladiya.CommercialPermitType();
    }
    protected boolean tryElementSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        if (qName==QName_5_149) {
          ((CommercialPermitType)value).setIssueDate(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseDateTimeToCalendar(strValue));
          return true;}
        else if (qName==QName_5_68) {
          ((CommercialPermitType)value).setExpiryDate(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseDateTimeToCalendar(strValue));
          return true;}
        else if (qName==QName_5_10) {
          ((CommercialPermitType)value).setCommercialPermitID(strValue);
          return true;}
        else if (qName==QName_5_152) {
          ((CommercialPermitType)value).setLicenseeQID(strValue);
          return true;}
        else if (qName==QName_5_153) {
          ((CommercialPermitType)value).setLicenseeName(strValue);
          return true;}
        else if (qName==QName_5_154) {
          ((CommercialPermitType)value).setLicenseeNationality(strValue);
          return true;}
        else if (qName==QName_5_155) {
          ((CommercialPermitType)value).setManagerQID(strValue);
          return true;}
        else if (qName==QName_5_156) {
          ((CommercialPermitType)value).setManagerName(strValue);
          return true;}
        else if (qName==QName_5_157) {
          ((CommercialPermitType)value).setManagerNationality(strValue);
          return true;}
        else if (qName==QName_5_158) {
          ((CommercialPermitType)value).setCompanyActivity(strValue);
          return true;}
        else if (qName==QName_5_159) {
          ((CommercialPermitType)value).setBuildingOwner(strValue);
          return true;}
        else if (qName==QName_5_160) {
          ((CommercialPermitType)value).setLicenseType(strValue);
          return true;}
        else if (qName==QName_5_70) {
          ((CommercialPermitType)value).setRemarks(strValue);
          return true;}
        return false;
    }
    protected boolean tryAttributeSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        return false;
    }
    protected boolean tryElementSetFromObject(javax.xml.namespace.QName qName, java.lang.Object objValue) {
        if (qName==QName_5_147) {
          ((CommercialPermitType)value).setCommercialRegistration((qa.gov.baladiya.CommercialRegistration)objValue);
          return true;}
        else if (qName==QName_5_148) {
          ((CommercialPermitType)value).setEstablishmentCommercialName((qa.gov.baladiya.BilingualName)objValue);
          return true;}
        else if (qName==QName_5_150) {
          ((CommercialPermitType)value).setMunicipalityName((qa.gov.baladiya.BilingualName)objValue);
          return true;}
        else if (qName==QName_5_151) {
          ((CommercialPermitType)value).setLocation((qa.gov.baladiya.AddressType)objValue);
          return true;}
        else if (qName==QName_5_66) {
          ((CommercialPermitType)value).setApplicationNumber((qa.gov.baladiya.ApplicationNumber)objValue);
          return true;}
        return false;
    }
    protected boolean tryElementSetFromList(javax.xml.namespace.QName qName, java.util.List listValue) {
        return false;
    }
    private final static javax.xml.namespace.QName QName_5_70 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/",
                  "remarks");
    private final static javax.xml.namespace.QName QName_5_153 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/",
                  "licenseeName");
    private final static javax.xml.namespace.QName QName_5_160 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/",
                  "licenseType");
    private final static javax.xml.namespace.QName QName_5_151 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/",
                  "location");
    private final static javax.xml.namespace.QName QName_5_150 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/",
                  "municipalityName");
    private final static javax.xml.namespace.QName QName_5_152 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/",
                  "licenseeQID");
    private final static javax.xml.namespace.QName QName_5_147 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/",
                  "commercialRegistration");
    private final static javax.xml.namespace.QName QName_5_66 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/",
                  "applicationNumber");
    private final static javax.xml.namespace.QName QName_5_159 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/",
                  "buildingOwner");
    private final static javax.xml.namespace.QName QName_5_148 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/",
                  "establishmentCommercialName");
    private final static javax.xml.namespace.QName QName_5_68 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/",
                  "expiryDate");
    private final static javax.xml.namespace.QName QName_5_156 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/",
                  "managerName");
    private final static javax.xml.namespace.QName QName_5_157 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/",
                  "managerNationality");
    private final static javax.xml.namespace.QName QName_5_155 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/",
                  "managerQID");
    private final static javax.xml.namespace.QName QName_5_149 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/",
                  "issueDate");
    private final static javax.xml.namespace.QName QName_5_154 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/",
                  "licenseeNationality");
    private final static javax.xml.namespace.QName QName_5_158 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/",
                  "companyActivity");
    private final static javax.xml.namespace.QName QName_5_10 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/",
                  "commercialPermitID");
}
