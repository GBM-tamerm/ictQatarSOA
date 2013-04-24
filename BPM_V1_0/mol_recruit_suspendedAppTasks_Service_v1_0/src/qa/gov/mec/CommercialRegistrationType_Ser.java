/**
 * CommercialRegistrationType_Ser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.mec;

public class CommercialRegistrationType_Ser extends com.ibm.ws.webservices.engine.encoding.ser.BeanSerializer {
    /**
     * Constructor
     */
    public CommercialRegistrationType_Ser(
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
           elemQName = QName_4_151;
           context.qName2String(elemQName, true);
           elemQName = QName_4_85;
           context.qName2String(elemQName, true);
           elemQName = QName_4_171;
           context.qName2String(elemQName, true);
           elemQName = QName_4_68;
           context.qName2String(elemQName, true);
           elemQName = QName_4_172;
           context.qName2String(elemQName, true);
           elemQName = QName_4_173;
           context.qName2String(elemQName, true);
           elemQName = QName_4_174;
           context.qName2String(elemQName, true);
           elemQName = QName_4_175;
           context.qName2String(elemQName, true);
           elemQName = QName_4_176;
           context.qName2String(elemQName, true);
           elemQName = QName_4_177;
           context.qName2String(elemQName, true);
           elemQName = QName_4_178;
           context.qName2String(elemQName, true);
           elemQName = QName_4_179;
           context.qName2String(elemQName, true);
           elemQName = QName_4_180;
           context.qName2String(elemQName, true);
           elemQName = QName_4_181;
           context.qName2String(elemQName, true);
           elemQName = QName_4_182;
           context.qName2String(elemQName, true);
           elemQName = QName_4_183;
           context.qName2String(elemQName, true);
           elemQName = QName_4_184;
           context.qName2String(elemQName, true);
           elemQName = QName_4_185;
           context.qName2String(elemQName, true);
           elemQName = QName_4_186;
           context.qName2String(elemQName, true);
           elemQName = QName_4_187;
           context.qName2String(elemQName, true);
           elemQName = QName_4_188;
           context.qName2String(elemQName, true);
           elemQName = QName_4_189;
           context.qName2String(elemQName, true);
           elemQName = QName_4_190;
           context.qName2String(elemQName, true);
           elemQName = QName_4_191;
           context.qName2String(elemQName, true);
           elemQName = QName_4_192;
           context.qName2String(elemQName, true);
           elemQName = QName_4_193;
           context.qName2String(elemQName, true);
           elemQName = QName_4_9;
           context.qName2String(elemQName, true);
        return attributes;
    }
    protected void addElements(
        java.lang.Object value,
        com.ibm.ws.webservices.engine.encoding.SerializationContext context)
        throws java.io.IOException
    {
        CommercialRegistrationType bean = (CommercialRegistrationType) value;
        java.lang.Object propValue;
        javax.xml.namespace.QName propQName;
        {
          propQName = QName_4_151;
          propValue = bean.getLocation();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              true,null,context);
          }
          propQName = QName_4_85;
          propValue = bean.getStatus();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              true,null,context);
          }
          propQName = QName_4_171;
          propValue = bean.getCreationDate();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_13,
              true,null,context);
          propQName = QName_4_68;
          propValue = bean.getExpiryDate();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_13,
              false,null,context);
          propQName = QName_4_172;
          propValue = bean.getCommerceChamberSubscriptionNo();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              false,null,context);
          }
          propQName = QName_4_173;
          propValue = bean.getArabicCommercialName();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              true,null,context);
          }
          propQName = QName_4_174;
          propValue = bean.getEnglishCommercialName();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              false,null,context);
          }
          propQName = QName_4_175;
          propValue = bean.getAlias();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              false,null,context);
          }
          propQName = QName_4_176;
          propValue = bean.getCompanyStartDate();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_13,
              false,null,context);
          propQName = QName_4_177;
          propValue = bean.getCompanyEndDate();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_13,
              false,null,context);
          propQName = QName_4_178;
          propValue = bean.getCommercialRegistrationType();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              true,null,context);
          }
          propQName = QName_4_179;
          propValue = bean.getBranchesCount();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_60,
              false,null,context);
          propQName = QName_4_180;
          propValue = bean.getCommercialRegistrationEntityType();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              false,null,context);
          }
          propQName = QName_4_181;
          propValue = bean.getAddressPOBox();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              false,null,context);
          }
          propQName = QName_4_182;
          propValue = bean.getAddressStreet();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              false,null,context);
          }
          propQName = QName_4_183;
          propValue = bean.getAddressPropertyOwner();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              false,null,context);
          }
          propQName = QName_4_184;
          propValue = bean.getAddressArea();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              false,null,context);
          }
          propQName = QName_4_185;
          propValue = new java.lang.Double(bean.getCompanyCapital());
          serializeChild(propQName, null, 
              propValue, 
              QName_1_103,
              true,null,context);
          propQName = QName_4_186;
          propValue = bean.getCompanyPaidCapital();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_103,
              false,null,context);
          propQName = QName_4_187;
          {
            propValue = bean.getHumanPartners();
            if (propValue != null) {
              for (int i=0; i<java.lang.reflect.Array.getLength(propValue); i++) {
                serializeChild(propQName, null, 
                    java.lang.reflect.Array.get(propValue, i), 
                    QName_4_194,
                    true,null,context);
              }
            }
          }
          propQName = QName_4_188;
          {
            propValue = bean.getEstablishmentPartners();
            if (propValue != null) {
              for (int i=0; i<java.lang.reflect.Array.getLength(propValue); i++) {
                serializeChild(propQName, null, 
                    java.lang.reflect.Array.get(propValue, i), 
                    QName_4_195,
                    true,null,context);
              }
            }
          }
          propQName = QName_4_189;
          {
            propValue = bean.getOtherPartners();
            if (propValue != null) {
              for (int i=0; i<java.lang.reflect.Array.getLength(propValue); i++) {
                serializeChild(propQName, null, 
                    java.lang.reflect.Array.get(propValue, i), 
                    QName_4_196,
                    true,null,context);
              }
            }
          }
          propQName = QName_4_190;
          {
            propValue = bean.getSignatories();
            if (propValue != null) {
              for (int i=0; i<java.lang.reflect.Array.getLength(propValue); i++) {
                serializeChild(propQName, null, 
                    java.lang.reflect.Array.get(propValue, i), 
                    QName_4_197,
                    true,null,context);
              }
            }
          }
          propQName = QName_4_191;
          {
            propValue = bean.getBoardMembers();
            if (propValue != null) {
              for (int i=0; i<java.lang.reflect.Array.getLength(propValue); i++) {
                serializeChild(propQName, null, 
                    java.lang.reflect.Array.get(propValue, i), 
                    QName_4_198,
                    true,null,context);
              }
            }
          }
          propQName = QName_4_192;
          {
            propValue = bean.getBranches();
            if (propValue != null) {
              for (int i=0; i<java.lang.reflect.Array.getLength(propValue); i++) {
                serializeChild(propQName, null, 
                    java.lang.reflect.Array.get(propValue, i), 
                    QName_4_199,
                    true,null,context);
              }
            }
          }
          propQName = QName_4_193;
          {
            propValue = bean.getActivities();
            if (propValue != null) {
              for (int i=0; i<java.lang.reflect.Array.getLength(propValue); i++) {
                serializeChild(propQName, null, 
                    java.lang.reflect.Array.get(propValue, i), 
                    QName_4_200,
                    true,null,context);
              }
            }
          }
          propQName = QName_4_9;
          propValue = bean.getCommercialRegistrationCode();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_4_17,
              true,null,context);
          }
        }
    }
    private final static javax.xml.namespace.QName QName_4_178 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "commercialRegistrationType");
    private final static javax.xml.namespace.QName QName_4_85 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "status");
    private final static javax.xml.namespace.QName QName_4_194 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "HumanPartner");
    private final static javax.xml.namespace.QName QName_4_186 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "companyPaidCapital");
    private final static javax.xml.namespace.QName QName_4_177 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "companyEndDate");
    private final static javax.xml.namespace.QName QName_4_197 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "Signatory");
    private final static javax.xml.namespace.QName QName_4_9 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "commercialRegistrationCode");
    private final static javax.xml.namespace.QName QName_4_183 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "addressPropertyOwner");
    private final static javax.xml.namespace.QName QName_4_188 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "establishmentPartners");
    private final static javax.xml.namespace.QName QName_4_180 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "commercialRegistrationEntityType");
    private final static javax.xml.namespace.QName QName_4_193 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "activities");
    private final static javax.xml.namespace.QName QName_4_151 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "location");
    private final static javax.xml.namespace.QName QName_4_200 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "Activity");
    private final static javax.xml.namespace.QName QName_1_103 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://www.w3.org/2001/XMLSchema",
                  "double");
    private final static javax.xml.namespace.QName QName_4_182 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "addressStreet");
    private final static javax.xml.namespace.QName QName_4_189 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "otherPartners");
    private final static javax.xml.namespace.QName QName_4_190 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "signatories");
    private final static javax.xml.namespace.QName QName_4_184 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "addressArea");
    private final static javax.xml.namespace.QName QName_4_198 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "BoardMember");
    private final static javax.xml.namespace.QName QName_4_191 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "boardMembers");
    private final static javax.xml.namespace.QName QName_4_17 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "CommercialRegistrationCodeType");
    private final static javax.xml.namespace.QName QName_1_12 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://www.w3.org/2001/XMLSchema",
                  "string");
    private final static javax.xml.namespace.QName QName_4_192 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "branches");
    private final static javax.xml.namespace.QName QName_4_174 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "englishCommercialName");
    private final static javax.xml.namespace.QName QName_4_187 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "humanPartners");
    private final static javax.xml.namespace.QName QName_4_181 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "addressPOBox");
    private final static javax.xml.namespace.QName QName_4_68 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "expiryDate");
    private final static javax.xml.namespace.QName QName_4_172 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "commerceChamberSubscriptionNo");
    private final static javax.xml.namespace.QName QName_1_60 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://www.w3.org/2001/XMLSchema",
                  "int");
    private final static javax.xml.namespace.QName QName_4_171 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "creationDate");
    private final static javax.xml.namespace.QName QName_4_175 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "alias");
    private final static javax.xml.namespace.QName QName_4_176 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "companyStartDate");
    private final static javax.xml.namespace.QName QName_4_195 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "EstablishmentPartner");
    private final static javax.xml.namespace.QName QName_1_13 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://www.w3.org/2001/XMLSchema",
                  "dateTime");
    private final static javax.xml.namespace.QName QName_4_185 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "companyCapital");
    private final static javax.xml.namespace.QName QName_4_179 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "branchesCount");
    private final static javax.xml.namespace.QName QName_4_199 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "Branch");
    private final static javax.xml.namespace.QName QName_4_196 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "OtherPartner");
    private final static javax.xml.namespace.QName QName_4_173 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "arabicCommercialName");
}
