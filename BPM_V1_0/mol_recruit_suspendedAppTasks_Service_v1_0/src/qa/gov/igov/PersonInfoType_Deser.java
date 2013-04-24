/**
 * PersonInfoType_Deser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.igov;

public class PersonInfoType_Deser extends com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializer {
    /**
     * Constructor
     */
    public PersonInfoType_Deser(
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType, 
           com.ibm.ws.webservices.engine.description.TypeDesc _typeDesc) {
        super(_javaType, _xmlType, _typeDesc);
    }
    /**
     * Create instance of java bean
     */
    public void createValue() {
        value = new qa.gov.igov.PersonInfoType();
    }
    protected boolean tryElementSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        if (qName==QName_6_37) {
          ((PersonInfoType)value).setQID(strValue);
          return true;}
        else if (qName==QName_6_39) {
          ((PersonInfoType)value).setHomePhone(strValue);
          return true;}
        else if (qName==QName_6_40) {
          ((PersonInfoType)value).setBusinessPhone(strValue);
          return true;}
        else if (qName==QName_6_41) {
          ((PersonInfoType)value).setMobilePhone(strValue);
          return true;}
        else if (qName==QName_6_42) {
          ((PersonInfoType)value).setEmailAddress(strValue);
          return true;}
        return false;
    }
    protected boolean tryAttributeSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        return false;
    }
    protected boolean tryElementSetFromObject(javax.xml.namespace.QName qName, java.lang.Object objValue) {
        if (qName==QName_6_38) {
          ((PersonInfoType)value).setPersonName((qa.gov.igov.PersonNameType)objValue);
          return true;}
        else if (qName==QName_6_43) {
          ((PersonInfoType)value).setAddress((qa.gov.igov.AddressType)objValue);
          return true;}
        else if (qName==QName_6_44) {
          ((PersonInfoType)value).setNationality((qa.gov.igov.NationalityType)objValue);
          return true;}
        else if (qName==QName_6_45) {
          ((PersonInfoType)value).setProfession((qa.gov.igov.ProfessionType)objValue);
          return true;}
        return false;
    }
    protected boolean tryElementSetFromList(javax.xml.namespace.QName qName, java.util.List listValue) {
        return false;
    }
    private final static javax.xml.namespace.QName QName_6_45 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "profession");
    private final static javax.xml.namespace.QName QName_6_44 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "nationality");
    private final static javax.xml.namespace.QName QName_6_43 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "address");
    private final static javax.xml.namespace.QName QName_6_41 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "mobilePhone");
    private final static javax.xml.namespace.QName QName_6_38 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "personName");
    private final static javax.xml.namespace.QName QName_6_42 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "emailAddress");
    private final static javax.xml.namespace.QName QName_6_39 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "homePhone");
    private final static javax.xml.namespace.QName QName_6_40 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "businessPhone");
    private final static javax.xml.namespace.QName QName_6_37 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "qID");
}
