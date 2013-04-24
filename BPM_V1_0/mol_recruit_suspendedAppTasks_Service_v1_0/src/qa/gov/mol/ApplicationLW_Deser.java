/**
 * ApplicationLW_Deser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.mol;

public class ApplicationLW_Deser extends com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializer {
    /**
     * Constructor
     */
    public ApplicationLW_Deser(
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType, 
           com.ibm.ws.webservices.engine.description.TypeDesc _typeDesc) {
        super(_javaType, _xmlType, _typeDesc);
    }
    /**
     * Create instance of java bean
     */
    public void createValue() {
        value = new qa.gov.mol.ApplicationLW();
    }
    protected boolean tryElementSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        if (qName==QName_0_5) {
          ((ApplicationLW)value).setElectricityNumber(strValue);
          return true;}
        else if (qName==QName_0_4) {
          ((ApplicationLW)value).setEstID(strValue);
          return true;}
        else if (qName==QName_0_3) {
          ((ApplicationLW)value).setAgentQID(strValue);
          return true;}
        else if (qName==QName_0_86) {
          ((ApplicationLW)value).setAgentEmail(strValue);
          return true;}
        else if (qName==QName_0_87) {
          ((ApplicationLW)value).setAgentPhone(strValue);
          return true;}
        else if (qName==QName_0_1) {
          ((ApplicationLW)value).setEstName(strValue);
          return true;}
        else if (qName==QName_0_2) {
          ((ApplicationLW)value).setApplicationDate(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseDateTimeToCalendar(strValue));
          return true;}
        else if (qName==QName_0_9) {
          ((ApplicationLW)value).setCommercialRegistrationCode(strValue);
          return true;}
        else if (qName==QName_0_10) {
          ((ApplicationLW)value).setCommercialPermitID(strValue);
          return true;}
        return false;
    }
    protected boolean tryAttributeSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        return false;
    }
    protected boolean tryElementSetFromObject(javax.xml.namespace.QName qName, java.lang.Object objValue) {
        if (qName==QName_0_0) {
          ((ApplicationLW)value).setApplicationID((qa.gov.mol.ApplicationIdType)objValue);
          return true;}
        else if (qName==QName_0_109) {
          ((ApplicationLW)value).setProcessMetadata((qa.gov.mol.ProcessMetadata)objValue);
          return true;}
        else if (qName==QName_0_85) {
          ((ApplicationLW)value).setStatus((qa.gov.mol.ApplicationStatusType)objValue);
          return true;}
        return false;
    }
    protected boolean tryElementSetFromList(javax.xml.namespace.QName qName, java.util.List listValue) {
        return false;
    }
    private final static javax.xml.namespace.QName QName_0_3 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "agentQID");
    private final static javax.xml.namespace.QName QName_0_1 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "estName");
    private final static javax.xml.namespace.QName QName_0_10 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "commercialPermitID");
    private final static javax.xml.namespace.QName QName_0_4 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "estID");
    private final static javax.xml.namespace.QName QName_0_86 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "agentEmail");
    private final static javax.xml.namespace.QName QName_0_85 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "status");
    private final static javax.xml.namespace.QName QName_0_2 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "applicationDate");
    private final static javax.xml.namespace.QName QName_0_109 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "processMetadata");
    private final static javax.xml.namespace.QName QName_0_9 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "commercialRegistrationCode");
    private final static javax.xml.namespace.QName QName_0_87 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "agentPhone");
    private final static javax.xml.namespace.QName QName_0_0 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "applicationID");
    private final static javax.xml.namespace.QName QName_0_5 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "electricityNumber");
}
