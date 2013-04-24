/**
 * ApplicationDetailsType_Deser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.mol;

public class ApplicationDetailsType_Deser extends com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializer {
    /**
     * Constructor
     */
    public ApplicationDetailsType_Deser(
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType, 
           com.ibm.ws.webservices.engine.description.TypeDesc _typeDesc) {
        super(_javaType, _xmlType, _typeDesc);
    }
    /**
     * Create instance of java bean
     */
    public void createValue() {
        value = new qa.gov.mol.ApplicationDetailsType();
    }
    protected boolean tryElementSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        if (qName==QName_0_2) {
          ((ApplicationDetailsType)value).setApplicationDate(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseDateTimeToCalendar(strValue));
          return true;}
        else if (qName==QName_0_81) {
          ((ApplicationDetailsType)value).setEstablishmentName(strValue);
          return true;}
        else if (qName==QName_0_5) {
          ((ApplicationDetailsType)value).setElectricityNumber(strValue);
          return true;}
        else if (qName==QName_0_3) {
          ((ApplicationDetailsType)value).setAgentQID(strValue);
          return true;}
        else if (qName==QName_0_86) {
          ((ApplicationDetailsType)value).setAgentEmail(strValue);
          return true;}
        else if (qName==QName_0_87) {
          ((ApplicationDetailsType)value).setAgentPhone(strValue);
          return true;}
        else if (qName==QName_0_88) {
          ((ApplicationDetailsType)value).setEstablishmentID(strValue);
          return true;}
        else if (qName==QName_0_70) {
          ((ApplicationDetailsType)value).setRemarks(strValue);
          return true;}
        else if (qName==QName_0_9) {
          ((ApplicationDetailsType)value).setCommercialRegistrationCode(strValue);
          return true;}
        else if (qName==QName_0_10) {
          ((ApplicationDetailsType)value).setCommercialPermitID(strValue);
          return true;}
        return false;
    }
    protected boolean tryAttributeSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        return false;
    }
    protected boolean tryElementSetFromObject(javax.xml.namespace.QName qName, java.lang.Object objValue) {
        if (qName==QName_0_85) {
          ((ApplicationDetailsType)value).setStatus((qa.gov.mol.ApplicationStatusType)objValue);
          return true;}
        else if (qName==QName_0_89) {
          ((ApplicationDetailsType)value).setEstablishmentAddress((qa.gov.igov.AddressType)objValue);
          return true;}
        else if (qName==QName_0_90) {
          ((ApplicationDetailsType)value).setPaymentFees((qa.gov.mol.PaymentFeesType)objValue);
          return true;}
        else if (qName==QName_0_91) {
          ((ApplicationDetailsType)value).setPaymentTransaction((qa.gov.mol.PaymentTransactionType)objValue);
          return true;}
        return false;
    }
    protected boolean tryElementSetFromList(javax.xml.namespace.QName qName, java.util.List listValue) {
        if (qName==QName_0_82) {
          qa.gov.mol.DetailedProfessionsType[] array = new qa.gov.mol.DetailedProfessionsType[listValue.size()];
          listValue.toArray(array);
          ((ApplicationDetailsType)value).setRequiredProfessions(array);
          return true;}
        else if (qName==QName_0_83) {
          qa.gov.mol.DetailedProfessionsType[] array = new qa.gov.mol.DetailedProfessionsType[listValue.size()];
          listValue.toArray(array);
          ((ApplicationDetailsType)value).setApprovedProfessions(array);
          return true;}
        else if (qName==QName_0_84) {
          qa.gov.mol.ReviewResultType[] array = new qa.gov.mol.ReviewResultType[listValue.size()];
          listValue.toArray(array);
          ((ApplicationDetailsType)value).setReviewResults(array);
          return true;}
        return false;
    }
    private final static javax.xml.namespace.QName QName_0_3 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "agentQID");
    private final static javax.xml.namespace.QName QName_0_84 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "reviewResults");
    private final static javax.xml.namespace.QName QName_0_10 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "commercialPermitID");
    private final static javax.xml.namespace.QName QName_0_86 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "agentEmail");
    private final static javax.xml.namespace.QName QName_0_81 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "establishmentName");
    private final static javax.xml.namespace.QName QName_0_85 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "status");
    private final static javax.xml.namespace.QName QName_0_2 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "applicationDate");
    private final static javax.xml.namespace.QName QName_0_91 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "paymentTransaction");
    private final static javax.xml.namespace.QName QName_0_90 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "paymentFees");
    private final static javax.xml.namespace.QName QName_0_70 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "remarks");
    private final static javax.xml.namespace.QName QName_0_9 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "commercialRegistrationCode");
    private final static javax.xml.namespace.QName QName_0_83 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "approvedProfessions");
    private final static javax.xml.namespace.QName QName_0_88 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "establishmentID");
    private final static javax.xml.namespace.QName QName_0_89 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "establishmentAddress");
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
