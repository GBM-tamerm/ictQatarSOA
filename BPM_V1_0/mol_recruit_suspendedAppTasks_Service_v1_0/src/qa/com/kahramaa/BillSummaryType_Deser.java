/**
 * BillSummaryType_Deser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.com.kahramaa;

public class BillSummaryType_Deser extends com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializer {
    /**
     * Constructor
     */
    public BillSummaryType_Deser(
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType, 
           com.ibm.ws.webservices.engine.description.TypeDesc _typeDesc) {
        super(_javaType, _xmlType, _typeDesc);
    }
    /**
     * Create instance of java bean
     */
    public void createValue() {
        value = new qa.com.kahramaa.BillSummaryType();
    }
    protected boolean tryElementSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        if (qName==QName_3_128) {
          ((BillSummaryType)value).setWaterNumber(strValue);
          return true;}
        else if (qName==QName_3_129) {
          ((BillSummaryType)value).setBillNumber(strValue);
          return true;}
        else if (qName==QName_3_130) {
          ((BillSummaryType)value).setAreaCode(strValue);
          return true;}
        else if (qName==QName_3_131) {
          ((BillSummaryType)value).setBillPeriod(strValue);
          return true;}
        else if (qName==QName_3_132) {
          ((BillSummaryType)value).setBillDate(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseDateTimeToCalendar(strValue));
          return true;}
        else if (qName==QName_3_133) {
          ((BillSummaryType)value).setCustomerNameArabic(strValue);
          return true;}
        else if (qName==QName_3_134) {
          ((BillSummaryType)value).setCustomerNameEnglish(strValue);
          return true;}
        else if (qName==QName_3_135) {
          ((BillSummaryType)value).setAccountId(strValue);
          return true;}
        else if (qName==QName_3_136) {
          ((BillSummaryType)value).setOwnerNameArabic(strValue);
          return true;}
        else if (qName==QName_3_137) {
          ((BillSummaryType)value).setOwnerNameEnglish(strValue);
          return true;}
        else if (qName==QName_3_138) {
          ((BillSummaryType)value).setRemarksArabic(strValue);
          return true;}
        else if (qName==QName_3_139) {
          ((BillSummaryType)value).setRemarksEnglish(strValue);
          return true;}
        else if (qName==QName_3_85) {
          ((BillSummaryType)value).setStatus(strValue);
          return true;}
        else if (qName==QName_3_140) {
          ((BillSummaryType)value).setLastPaidDate(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseDateTimeToCalendar(strValue));
          return true;}
        else if (qName==QName_3_141) {
          ((BillSummaryType)value).setOutstandingAmount(strValue);
          return true;}
        else if (qName==QName_3_142) {
          ((BillSummaryType)value).setGrandTotal(strValue);
          return true;}
        else if (qName==QName_3_5) {
          ((BillSummaryType)value).setElectricityNumber(strValue);
          return true;}
        else if (qName==QName_3_143) {
          ((BillSummaryType)value).setTenantId(strValue);
          return true;}
        return false;
    }
    protected boolean tryAttributeSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        return false;
    }
    protected boolean tryElementSetFromObject(javax.xml.namespace.QName qName, java.lang.Object objValue) {
        if (qName==QName_3_43) {
          ((BillSummaryType)value).setAddress((qa.gov.igov.AddressType)objValue);
          return true;}
        return false;
    }
    protected boolean tryElementSetFromList(javax.xml.namespace.QName qName, java.util.List listValue) {
        return false;
    }
    private final static javax.xml.namespace.QName QName_3_133 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "customerNameArabic");
    private final static javax.xml.namespace.QName QName_3_131 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "billPeriod");
    private final static javax.xml.namespace.QName QName_3_128 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "waterNumber");
    private final static javax.xml.namespace.QName QName_3_130 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "areaCode");
    private final static javax.xml.namespace.QName QName_3_138 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "remarksArabic");
    private final static javax.xml.namespace.QName QName_3_132 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "billDate");
    private final static javax.xml.namespace.QName QName_3_43 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "address");
    private final static javax.xml.namespace.QName QName_3_136 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "ownerNameArabic");
    private final static javax.xml.namespace.QName QName_3_5 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "electricityNumber");
    private final static javax.xml.namespace.QName QName_3_134 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "customerNameEnglish");
    private final static javax.xml.namespace.QName QName_3_85 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "status");
    private final static javax.xml.namespace.QName QName_3_140 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "lastPaidDate");
    private final static javax.xml.namespace.QName QName_3_143 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "tenantId");
    private final static javax.xml.namespace.QName QName_3_129 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "billNumber");
    private final static javax.xml.namespace.QName QName_3_135 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "accountId");
    private final static javax.xml.namespace.QName QName_3_142 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "grandTotal");
    private final static javax.xml.namespace.QName QName_3_141 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "outstandingAmount");
    private final static javax.xml.namespace.QName QName_3_137 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "ownerNameEnglish");
    private final static javax.xml.namespace.QName QName_3_139 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "remarksEnglish");
}
