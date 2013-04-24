/**
 * ApplicationDetailsType_Ser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.mol;

public class ApplicationDetailsType_Ser extends com.ibm.ws.webservices.engine.encoding.ser.BeanSerializer {
    /**
     * Constructor
     */
    public ApplicationDetailsType_Ser(
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
           elemQName = QName_0_2;
           context.qName2String(elemQName, true);
           elemQName = QName_0_81;
           context.qName2String(elemQName, true);
           elemQName = QName_0_82;
           context.qName2String(elemQName, true);
           elemQName = QName_0_83;
           context.qName2String(elemQName, true);
           elemQName = QName_0_84;
           context.qName2String(elemQName, true);
           elemQName = QName_0_85;
           context.qName2String(elemQName, true);
           elemQName = QName_0_5;
           context.qName2String(elemQName, true);
           elemQName = QName_0_3;
           context.qName2String(elemQName, true);
           elemQName = QName_0_86;
           context.qName2String(elemQName, true);
           elemQName = QName_0_87;
           context.qName2String(elemQName, true);
           elemQName = QName_0_88;
           context.qName2String(elemQName, true);
           elemQName = QName_0_89;
           context.qName2String(elemQName, true);
           elemQName = QName_0_70;
           context.qName2String(elemQName, true);
           elemQName = QName_0_90;
           context.qName2String(elemQName, true);
           elemQName = QName_0_91;
           context.qName2String(elemQName, true);
           elemQName = QName_0_9;
           context.qName2String(elemQName, true);
           elemQName = QName_0_10;
           context.qName2String(elemQName, true);
        return attributes;
    }
    protected void addElements(
        java.lang.Object value,
        com.ibm.ws.webservices.engine.encoding.SerializationContext context)
        throws java.io.IOException
    {
        ApplicationDetailsType bean = (ApplicationDetailsType) value;
        java.lang.Object propValue;
        javax.xml.namespace.QName propQName;
        {
          propQName = QName_0_2;
          propValue = bean.getApplicationDate();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_13,
              false,null,context);
          propQName = QName_0_81;
          propValue = bean.getEstablishmentName();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              true,null,context);
          }
          propQName = QName_0_82;
          {
            propValue = bean.getRequiredProfessions();
            if (propValue != null) {
              for (int i=0; i<java.lang.reflect.Array.getLength(propValue); i++) {
                serializeChild(propQName, null, 
                    java.lang.reflect.Array.get(propValue, i), 
                    QName_0_92,
                    true,null,context);
              }
            }
          }
          propQName = QName_0_83;
          {
            propValue = bean.getApprovedProfessions();
            if (propValue != null) {
              for (int i=0; i<java.lang.reflect.Array.getLength(propValue); i++) {
                serializeChild(propQName, null, 
                    java.lang.reflect.Array.get(propValue, i), 
                    QName_0_92,
                    true,null,context);
              }
            }
          }
          propQName = QName_0_84;
          {
            propValue = bean.getReviewResults();
            if (propValue != null) {
              for (int i=0; i<java.lang.reflect.Array.getLength(propValue); i++) {
                serializeChild(propQName, null, 
                    java.lang.reflect.Array.get(propValue, i), 
                    QName_0_93,
                    true,null,context);
              }
            }
          }
          propQName = QName_0_85;
          propValue = bean.getStatus();
          serializeChild(propQName, null, 
              propValue, 
              QName_0_94,
              false,null,context);
          propQName = QName_0_5;
          propValue = bean.getElectricityNumber();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_3_16,
              true,null,context);
          }
          propQName = QName_0_3;
          propValue = bean.getAgentQID();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_2_14,
              true,null,context);
          }
          propQName = QName_0_86;
          propValue = bean.getAgentEmail();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_6_48,
              false,null,context);
          }
          propQName = QName_0_87;
          propValue = bean.getAgentPhone();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_6_47,
              false,null,context);
          }
          propQName = QName_0_88;
          propValue = bean.getEstablishmentID();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_2_15,
              true,null,context);
          }
          propQName = QName_0_89;
          propValue = bean.getEstablishmentAddress();
          serializeChild(propQName, null, 
              propValue, 
              QName_6_49,
              false,null,context);
          propQName = QName_0_70;
          propValue = bean.getRemarks();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              false,null,context);
          }
          propQName = QName_0_90;
          propValue = bean.getPaymentFees();
          serializeChild(propQName, null, 
              propValue, 
              QName_0_95,
              false,null,context);
          propQName = QName_0_91;
          propValue = bean.getPaymentTransaction();
          serializeChild(propQName, null, 
              propValue, 
              QName_0_96,
              false,null,context);
          propQName = QName_0_9;
          propValue = bean.getCommercialRegistrationCode();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_4_17,
              false,null,context);
          }
          propQName = QName_0_10;
          propValue = bean.getCommercialPermitID();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_5_18,
              false,null,context);
          }
        }
    }
    private final static javax.xml.namespace.QName QName_5_18 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/",
                  "CommercialPermitIDType");
    private final static javax.xml.namespace.QName QName_0_9 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "commercialRegistrationCode");
    private final static javax.xml.namespace.QName QName_2_14 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/",
                  "QIdType");
    private final static javax.xml.namespace.QName QName_0_82 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "requiredProfessions");
    private final static javax.xml.namespace.QName QName_0_95 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "PaymentFeesType");
    private final static javax.xml.namespace.QName QName_0_70 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "remarks");
    private final static javax.xml.namespace.QName QName_4_17 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "CommercialRegistrationCodeType");
    private final static javax.xml.namespace.QName QName_0_84 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "reviewResults");
    private final static javax.xml.namespace.QName QName_0_3 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "agentQID");
    private final static javax.xml.namespace.QName QName_0_2 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "applicationDate");
    private final static javax.xml.namespace.QName QName_3_16 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "ElectricityNumberType");
    private final static javax.xml.namespace.QName QName_0_87 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "agentPhone");
    private final static javax.xml.namespace.QName QName_6_49 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "AddressType");
    private final static javax.xml.namespace.QName QName_0_92 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "DetailedProfessionsType");
    private final static javax.xml.namespace.QName QName_0_81 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "establishmentName");
    private final static javax.xml.namespace.QName QName_0_10 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "commercialPermitID");
    private final static javax.xml.namespace.QName QName_0_89 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "establishmentAddress");
    private final static javax.xml.namespace.QName QName_0_83 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "approvedProfessions");
    private final static javax.xml.namespace.QName QName_6_48 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "EmailAddressType");
    private final static javax.xml.namespace.QName QName_0_90 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "paymentFees");
    private final static javax.xml.namespace.QName QName_1_12 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://www.w3.org/2001/XMLSchema",
                  "string");
    private final static javax.xml.namespace.QName QName_0_91 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "paymentTransaction");
    private final static javax.xml.namespace.QName QName_1_13 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://www.w3.org/2001/XMLSchema",
                  "dateTime");
    private final static javax.xml.namespace.QName QName_0_85 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "status");
    private final static javax.xml.namespace.QName QName_0_94 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "ApplicationStatusType");
    private final static javax.xml.namespace.QName QName_2_15 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/",
                  "EstablishmentIdType");
    private final static javax.xml.namespace.QName QName_6_47 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "TelephoneNumberType");
    private final static javax.xml.namespace.QName QName_0_88 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "establishmentID");
    private final static javax.xml.namespace.QName QName_0_5 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "electricityNumber");
    private final static javax.xml.namespace.QName QName_0_86 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "agentEmail");
    private final static javax.xml.namespace.QName QName_0_96 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "PaymentTransactionType");
    private final static javax.xml.namespace.QName QName_0_93 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "ReviewResultType");
}
