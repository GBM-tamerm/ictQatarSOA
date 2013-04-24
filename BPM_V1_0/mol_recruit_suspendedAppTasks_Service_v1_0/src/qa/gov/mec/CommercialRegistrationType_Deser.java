/**
 * CommercialRegistrationType_Deser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.mec;

public class CommercialRegistrationType_Deser extends com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializer {
    /**
     * Constructor
     */
    public CommercialRegistrationType_Deser(
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType, 
           com.ibm.ws.webservices.engine.description.TypeDesc _typeDesc) {
        super(_javaType, _xmlType, _typeDesc);
    }
    /**
     * Create instance of java bean
     */
    public void createValue() {
        value = new qa.gov.mec.CommercialRegistrationType();
    }
    protected boolean tryElementSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        if (qName==QName_4_151) {
          ((CommercialRegistrationType)value).setLocation(strValue);
          return true;}
        else if (qName==QName_4_85) {
          ((CommercialRegistrationType)value).setStatus(strValue);
          return true;}
        else if (qName==QName_4_171) {
          ((CommercialRegistrationType)value).setCreationDate(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseDateTimeToCalendar(strValue));
          return true;}
        else if (qName==QName_4_68) {
          ((CommercialRegistrationType)value).setExpiryDate(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseDateTimeToCalendar(strValue));
          return true;}
        else if (qName==QName_4_172) {
          ((CommercialRegistrationType)value).setCommerceChamberSubscriptionNo(strValue);
          return true;}
        else if (qName==QName_4_173) {
          ((CommercialRegistrationType)value).setArabicCommercialName(strValue);
          return true;}
        else if (qName==QName_4_174) {
          ((CommercialRegistrationType)value).setEnglishCommercialName(strValue);
          return true;}
        else if (qName==QName_4_175) {
          ((CommercialRegistrationType)value).setAlias(strValue);
          return true;}
        else if (qName==QName_4_176) {
          ((CommercialRegistrationType)value).setCompanyStartDate(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseDateTimeToCalendar(strValue));
          return true;}
        else if (qName==QName_4_177) {
          ((CommercialRegistrationType)value).setCompanyEndDate(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseDateTimeToCalendar(strValue));
          return true;}
        else if (qName==QName_4_178) {
          ((CommercialRegistrationType)value).setCommercialRegistrationType(strValue);
          return true;}
        else if (qName==QName_4_179) {
          ((CommercialRegistrationType)value).setBranchesCount(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseInteger(strValue));
          return true;}
        else if (qName==QName_4_180) {
          ((CommercialRegistrationType)value).setCommercialRegistrationEntityType(strValue);
          return true;}
        else if (qName==QName_4_181) {
          ((CommercialRegistrationType)value).setAddressPOBox(strValue);
          return true;}
        else if (qName==QName_4_182) {
          ((CommercialRegistrationType)value).setAddressStreet(strValue);
          return true;}
        else if (qName==QName_4_183) {
          ((CommercialRegistrationType)value).setAddressPropertyOwner(strValue);
          return true;}
        else if (qName==QName_4_184) {
          ((CommercialRegistrationType)value).setAddressArea(strValue);
          return true;}
        else if (qName==QName_4_185) {
          ((CommercialRegistrationType)value).setCompanyCapital(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parsedouble(strValue));
          return true;}
        else if (qName==QName_4_186) {
          ((CommercialRegistrationType)value).setCompanyPaidCapital(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseDouble(strValue));
          return true;}
        else if (qName==QName_4_9) {
          ((CommercialRegistrationType)value).setCommercialRegistrationCode(strValue);
          return true;}
        return false;
    }
    protected boolean tryAttributeSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        return false;
    }
    protected boolean tryElementSetFromObject(javax.xml.namespace.QName qName, java.lang.Object objValue) {
        return false;
    }
    protected boolean tryElementSetFromList(javax.xml.namespace.QName qName, java.util.List listValue) {
        if (qName==QName_4_187) {
          qa.gov.mec.HumanPartner[] array = new qa.gov.mec.HumanPartner[listValue.size()];
          listValue.toArray(array);
          ((CommercialRegistrationType)value).setHumanPartners(array);
          return true;}
        else if (qName==QName_4_188) {
          qa.gov.mec.EstablishmentPartner[] array = new qa.gov.mec.EstablishmentPartner[listValue.size()];
          listValue.toArray(array);
          ((CommercialRegistrationType)value).setEstablishmentPartners(array);
          return true;}
        else if (qName==QName_4_189) {
          qa.gov.mec.OtherPartner[] array = new qa.gov.mec.OtherPartner[listValue.size()];
          listValue.toArray(array);
          ((CommercialRegistrationType)value).setOtherPartners(array);
          return true;}
        else if (qName==QName_4_190) {
          qa.gov.mec.Signatory[] array = new qa.gov.mec.Signatory[listValue.size()];
          listValue.toArray(array);
          ((CommercialRegistrationType)value).setSignatories(array);
          return true;}
        else if (qName==QName_4_191) {
          qa.gov.mec.BoardMember[] array = new qa.gov.mec.BoardMember[listValue.size()];
          listValue.toArray(array);
          ((CommercialRegistrationType)value).setBoardMembers(array);
          return true;}
        else if (qName==QName_4_192) {
          qa.gov.mec.Branch[] array = new qa.gov.mec.Branch[listValue.size()];
          listValue.toArray(array);
          ((CommercialRegistrationType)value).setBranches(array);
          return true;}
        else if (qName==QName_4_193) {
          qa.gov.mec.Activity[] array = new qa.gov.mec.Activity[listValue.size()];
          listValue.toArray(array);
          ((CommercialRegistrationType)value).setActivities(array);
          return true;}
        return false;
    }
    private final static javax.xml.namespace.QName QName_4_172 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "commerceChamberSubscriptionNo");
    private final static javax.xml.namespace.QName QName_4_9 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "commercialRegistrationCode");
    private final static javax.xml.namespace.QName QName_4_181 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "addressPOBox");
    private final static javax.xml.namespace.QName QName_4_178 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "commercialRegistrationType");
    private final static javax.xml.namespace.QName QName_4_188 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "establishmentPartners");
    private final static javax.xml.namespace.QName QName_4_183 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "addressPropertyOwner");
    private final static javax.xml.namespace.QName QName_4_68 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "expiryDate");
    private final static javax.xml.namespace.QName QName_4_171 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "creationDate");
    private final static javax.xml.namespace.QName QName_4_184 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "addressArea");
    private final static javax.xml.namespace.QName QName_4_179 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "branchesCount");
    private final static javax.xml.namespace.QName QName_4_85 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "status");
    private final static javax.xml.namespace.QName QName_4_177 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "companyEndDate");
    private final static javax.xml.namespace.QName QName_4_175 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "alias");
    private final static javax.xml.namespace.QName QName_4_180 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "commercialRegistrationEntityType");
    private final static javax.xml.namespace.QName QName_4_182 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "addressStreet");
    private final static javax.xml.namespace.QName QName_4_187 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "humanPartners");
    private final static javax.xml.namespace.QName QName_4_189 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "otherPartners");
    private final static javax.xml.namespace.QName QName_4_174 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "englishCommercialName");
    private final static javax.xml.namespace.QName QName_4_151 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "location");
    private final static javax.xml.namespace.QName QName_4_190 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "signatories");
    private final static javax.xml.namespace.QName QName_4_173 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "arabicCommercialName");
    private final static javax.xml.namespace.QName QName_4_192 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "branches");
    private final static javax.xml.namespace.QName QName_4_191 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "boardMembers");
    private final static javax.xml.namespace.QName QName_4_186 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "companyPaidCapital");
    private final static javax.xml.namespace.QName QName_4_176 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "companyStartDate");
    private final static javax.xml.namespace.QName QName_4_193 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "activities");
    private final static javax.xml.namespace.QName QName_4_185 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "companyCapital");
}
