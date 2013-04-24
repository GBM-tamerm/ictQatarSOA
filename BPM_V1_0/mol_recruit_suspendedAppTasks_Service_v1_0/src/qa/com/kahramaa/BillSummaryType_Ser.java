/**
 * BillSummaryType_Ser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.com.kahramaa;

public class BillSummaryType_Ser extends com.ibm.ws.webservices.engine.encoding.ser.BeanSerializer {
    /**
     * Constructor
     */
    public BillSummaryType_Ser(
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType, 
           com.ibm.ws.webservices.engine.description.TypeDesc _typeDesc) {
        super(_javaType, _xmlType, _typeDesc);
    }
    public void serialize(
        javax.xml.namespace.QName name,
        org.xml.sax.Attributes attributes,
        java.lang.Object value,
        com.ibm.ws.webservices.engine.encoding.SerializationContext context)
        throws java.io.IOException
    {
        context.startElement(name, addAttributes(attributes, value, context));
        addElements(value, context);
        context.endElement();
    }
    protected org.xml.sax.Attributes addAttributes(
        org.xml.sax.Attributes attributes,
        java.lang.Object value,
        com.ibm.ws.webservices.engine.encoding.SerializationContext context)
        throws java.io.IOException
    {
           javax.xml.namespace.QName
           elemQName = QName_3_128;
           context.qName2String(elemQName, true);
           elemQName = QName_3_129;
           context.qName2String(elemQName, true);
           elemQName = QName_3_43;
           context.qName2String(elemQName, true);
           elemQName = QName_3_130;
           context.qName2String(elemQName, true);
           elemQName = QName_3_131;
           context.qName2String(elemQName, true);
           elemQName = QName_3_132;
           context.qName2String(elemQName, true);
           elemQName = QName_3_133;
           context.qName2String(elemQName, true);
           elemQName = QName_3_134;
           context.qName2String(elemQName, true);
           elemQName = QName_3_135;
           context.qName2String(elemQName, true);
           elemQName = QName_3_136;
           context.qName2String(elemQName, true);
           elemQName = QName_3_137;
           context.qName2String(elemQName, true);
           elemQName = QName_3_138;
           context.qName2String(elemQName, true);
           elemQName = QName_3_139;
           context.qName2String(elemQName, true);
           elemQName = QName_3_85;
           context.qName2String(elemQName, true);
           elemQName = QName_3_140;
           context.qName2String(elemQName, true);
           elemQName = QName_3_141;
           context.qName2String(elemQName, true);
           elemQName = QName_3_142;
           context.qName2String(elemQName, true);
           elemQName = QName_3_5;
           context.qName2String(elemQName, true);
           elemQName = QName_3_143;
           context.qName2String(elemQName, true);
        return attributes;
    }
    protected void addElements(
        java.lang.Object value,
        com.ibm.ws.webservices.engine.encoding.SerializationContext context)
        throws java.io.IOException
    {
        BillSummaryType bean = (BillSummaryType) value;
        java.lang.Object propValue;
        javax.xml.namespace.QName propQName;
        {
          propQName = QName_3_128;
          propValue = bean.getWaterNumber();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              false,null,context);
          }
          propQName = QName_3_129;
          propValue = bean.getBillNumber();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              false,null,context);
          }
          propQName = QName_3_43;
          propValue = bean.getAddress();
          serializeChild(propQName, null, 
              propValue, 
              QName_6_49,
              false,null,context);
          propQName = QName_3_130;
          propValue = bean.getAreaCode();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              false,null,context);
          }
          propQName = QName_3_131;
          propValue = bean.getBillPeriod();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              false,null,context);
          }
          propQName = QName_3_132;
          propValue = bean.getBillDate();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_13,
              false,null,context);
          propQName = QName_3_133;
          propValue = bean.getCustomerNameArabic();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              false,null,context);
          }
          propQName = QName_3_134;
          propValue = bean.getCustomerNameEnglish();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              false,null,context);
          }
          propQName = QName_3_135;
          propValue = bean.getAccountId();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              false,null,context);
          }
          propQName = QName_3_136;
          propValue = bean.getOwnerNameArabic();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              false,null,context);
          }
          propQName = QName_3_137;
          propValue = bean.getOwnerNameEnglish();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              false,null,context);
          }
          propQName = QName_3_138;
          propValue = bean.getRemarksArabic();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              false,null,context);
          }
          propQName = QName_3_139;
          propValue = bean.getRemarksEnglish();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              false,null,context);
          }
          propQName = QName_3_85;
          propValue = bean.getStatus();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              false,null,context);
          }
          propQName = QName_3_140;
          propValue = bean.getLastPaidDate();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_13,
              false,null,context);
          propQName = QName_3_141;
          propValue = bean.getOutstandingAmount();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              false,null,context);
          }
          propQName = QName_3_142;
          propValue = bean.getGrandTotal();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              false,null,context);
          }
          propQName = QName_3_5;
          propValue = bean.getElectricityNumber();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_3_16,
              true,null,context);
          }
          propQName = QName_3_143;
          propValue = bean.getTenantId();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_3_144,
              true,null,context);
          }
        }
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
    private final static javax.xml.namespace.QName QName_3_16 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "ElectricityNumberType");
    private final static javax.xml.namespace.QName QName_3_43 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "address");
    private final static javax.xml.namespace.QName QName_6_49 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "AddressType");
    private final static javax.xml.namespace.QName QName_3_136 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "ownerNameArabic");
    private final static javax.xml.namespace.QName QName_3_5 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "electricityNumber");
    private final static javax.xml.namespace.QName QName_1_12 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://www.w3.org/2001/XMLSchema",
                  "string");
    private final static javax.xml.namespace.QName QName_3_134 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "customerNameEnglish");
    private final static javax.xml.namespace.QName QName_3_85 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "status");
    private final static javax.xml.namespace.QName QName_1_13 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://www.w3.org/2001/XMLSchema",
                  "dateTime");
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
    private final static javax.xml.namespace.QName QName_3_144 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "TenantIDType");
    private final static javax.xml.namespace.QName QName_3_137 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "ownerNameEnglish");
    private final static javax.xml.namespace.QName QName_3_139 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "remarksEnglish");
}
