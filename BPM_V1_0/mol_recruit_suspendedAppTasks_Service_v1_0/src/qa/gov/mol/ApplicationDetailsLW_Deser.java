/**
 * ApplicationDetailsLW_Deser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.mol;

public class ApplicationDetailsLW_Deser extends com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializer {
    /**
     * Constructor
     */
    public ApplicationDetailsLW_Deser(
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType, 
           com.ibm.ws.webservices.engine.description.TypeDesc _typeDesc) {
        super(_javaType, _xmlType, _typeDesc);
    }
    /**
     * Create instance of java bean
     */
    public void createValue() {
        value = new qa.gov.mol.ApplicationDetailsLW();
    }
    protected boolean tryElementSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        if (qName==QName_0_4) {
          ((ApplicationDetailsLW)value).setEstID(strValue);
          return true;}
        else if (qName==QName_0_5) {
          ((ApplicationDetailsLW)value).setElectricityNumber(strValue);
          return true;}
        else if (qName==QName_0_3) {
          ((ApplicationDetailsLW)value).setAgentQID(strValue);
          return true;}
        else if (qName==QName_0_86) {
          ((ApplicationDetailsLW)value).setAgentEmail(strValue);
          return true;}
        else if (qName==QName_0_87) {
          ((ApplicationDetailsLW)value).setAgentPhone(strValue);
          return true;}
        else if (qName==QName_0_1) {
          ((ApplicationDetailsLW)value).setEstName(strValue);
          return true;}
        else if (qName==QName_0_9) {
          ((ApplicationDetailsLW)value).setCommercialRegistrationCode(strValue);
          return true;}
        else if (qName==QName_0_10) {
          ((ApplicationDetailsLW)value).setCommercialPermitID(strValue);
          return true;}
        return false;
    }
    protected boolean tryAttributeSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        return false;
    }
    protected boolean tryElementSetFromObject(javax.xml.namespace.QName qName, java.lang.Object objValue) {
        if (qName==QName_0_90) {
          ((ApplicationDetailsLW)value).setPaymentFees((qa.gov.mol.PaymentFeesType)objValue);
          return true;}
        else if (qName==QName_0_91) {
          ((ApplicationDetailsLW)value).setPaymentTransaction((qa.gov.mol.PaymentTransactionType)objValue);
          return true;}
        return false;
    }
    protected boolean tryElementSetFromList(javax.xml.namespace.QName qName, java.util.List listValue) {
        if (qName==QName_0_82) {
          qa.gov.mol.DetailedProfessionsType[] array = new qa.gov.mol.DetailedProfessionsType[listValue.size()];
          listValue.toArray(array);
          ((ApplicationDetailsLW)value).setRequiredProfessions(array);
          return true;}
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
    private final static javax.xml.namespace.QName QName_0_91 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "paymentTransaction");
    private final static javax.xml.namespace.QName QName_0_90 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "paymentFees");
    private final static javax.xml.namespace.QName QName_0_9 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "commercialRegistrationCode");
    private final static javax.xml.namespace.QName QName_0_82 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "requiredProfessions");
    private final static javax.xml.namespace.QName QName_0_87 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "agentPhone");
    private final static javax.xml.namespace.QName QName_0_5 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "electricityNumber");
}
