/**
 * ProfessionDetailsType_Deser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.moi;

public class ProfessionDetailsType_Deser extends com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializer {
    /**
     * Constructor
     */
    public ProfessionDetailsType_Deser(
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType, 
           com.ibm.ws.webservices.engine.description.TypeDesc _typeDesc) {
        super(_javaType, _xmlType, _typeDesc);
    }
    /**
     * Create instance of java bean
     */
    public void createValue() {
        value = new qa.gov.moi.ProfessionDetailsType();
    }
    protected boolean tryElementSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        if (qName==QName_2_61) {
          ((ProfessionDetailsType)value).setPermittedVisaCount(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseInteger(strValue));
          return true;}
        else if (qName==QName_2_62) {
          ((ProfessionDetailsType)value).setUsedVisaCount(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseInteger(strValue));
          return true;}
        else if (qName==QName_2_63) {
          ((ProfessionDetailsType)value).setRemainingVisaCount(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseInteger(strValue));
          return true;}
        else if (qName==QName_2_65) {
          ((ProfessionDetailsType)value).setVpNumber(strValue);
          return true;}
        else if (qName==QName_2_66) {
          ((ProfessionDetailsType)value).setApplicationNumber(strValue);
          return true;}
        else if (qName==QName_2_67) {
          ((ProfessionDetailsType)value).setYear(strValue);
          return true;}
        else if (qName==QName_2_68) {
          ((ProfessionDetailsType)value).setExpiryDate(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseDateTimeToCalendar(strValue));
          return true;}
        return false;
    }
    protected boolean tryAttributeSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        return false;
    }
    protected boolean tryElementSetFromObject(javax.xml.namespace.QName qName, java.lang.Object objValue) {
        if (qName==QName_2_45) {
          ((ProfessionDetailsType)value).setProfession((qa.gov.igov.ProfessionType)objValue);
          return true;}
        else if (qName==QName_2_44) {
          ((ProfessionDetailsType)value).setNationality((qa.gov.igov.NationalityType)objValue);
          return true;}
        else if (qName==QName_2_64) {
          ((ProfessionDetailsType)value).setGender((qa.gov.igov.GenderType)objValue);
          return true;}
        return false;
    }
    protected boolean tryElementSetFromList(javax.xml.namespace.QName qName, java.util.List listValue) {
        return false;
    }
    private final static javax.xml.namespace.QName QName_2_65 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/",
                  "vpNumber");
    private final static javax.xml.namespace.QName QName_2_61 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/",
                  "permittedVisaCount");
    private final static javax.xml.namespace.QName QName_2_44 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/",
                  "nationality");
    private final static javax.xml.namespace.QName QName_2_62 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/",
                  "usedVisaCount");
    private final static javax.xml.namespace.QName QName_2_66 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/",
                  "applicationNumber");
    private final static javax.xml.namespace.QName QName_2_67 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/",
                  "year");
    private final static javax.xml.namespace.QName QName_2_63 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/",
                  "remainingVisaCount");
    private final static javax.xml.namespace.QName QName_2_68 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/",
                  "expiryDate");
    private final static javax.xml.namespace.QName QName_2_64 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/",
                  "gender");
    private final static javax.xml.namespace.QName QName_2_45 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/",
                  "profession");
}
