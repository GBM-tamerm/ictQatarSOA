/**
 * PersonInfoType_Ser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.igov;

public class PersonInfoType_Ser extends com.ibm.ws.webservices.engine.encoding.ser.BeanSerializer {
    /**
     * Constructor
     */
    public PersonInfoType_Ser(
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
           elemQName = QName_6_37;
           context.qName2String(elemQName, true);
           elemQName = QName_6_38;
           context.qName2String(elemQName, true);
           elemQName = QName_6_39;
           context.qName2String(elemQName, true);
           elemQName = QName_6_40;
           context.qName2String(elemQName, true);
           elemQName = QName_6_41;
           context.qName2String(elemQName, true);
           elemQName = QName_6_42;
           context.qName2String(elemQName, true);
           elemQName = QName_6_43;
           context.qName2String(elemQName, true);
           elemQName = QName_6_44;
           context.qName2String(elemQName, true);
           elemQName = QName_6_45;
           context.qName2String(elemQName, true);
        return attributes;
    }
    protected void addElements(
        java.lang.Object value,
        com.ibm.ws.webservices.engine.encoding.SerializationContext context)
        throws java.io.IOException
    {
        PersonInfoType bean = (PersonInfoType) value;
        java.lang.Object propValue;
        javax.xml.namespace.QName propQName;
        {
          propQName = QName_6_37;
          propValue = bean.getQID();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_2_14,
              true,null,context);
          }
          propQName = QName_6_38;
          propValue = bean.getPersonName();
          serializeChild(propQName, null, 
              propValue, 
              QName_6_46,
              true,null,context);
          propQName = QName_6_39;
          propValue = bean.getHomePhone();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_6_47,
              false,null,context);
          }
          propQName = QName_6_40;
          propValue = bean.getBusinessPhone();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_6_47,
              false,null,context);
          }
          propQName = QName_6_41;
          propValue = bean.getMobilePhone();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_6_47,
              false,null,context);
          }
          propQName = QName_6_42;
          propValue = bean.getEmailAddress();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_6_48,
              false,null,context);
          }
          propQName = QName_6_43;
          propValue = bean.getAddress();
          serializeChild(propQName, null, 
              propValue, 
              QName_6_49,
              false,null,context);
          propQName = QName_6_44;
          propValue = bean.getNationality();
          serializeChild(propQName, null, 
              propValue, 
              QName_6_50,
              false,null,context);
          propQName = QName_6_45;
          propValue = bean.getProfession();
          serializeChild(propQName, null, 
              propValue, 
              QName_6_51,
              false,null,context);
        }
    }
    private final static javax.xml.namespace.QName QName_6_50 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "NationalityType");
    private final static javax.xml.namespace.QName QName_6_45 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "profession");
    private final static javax.xml.namespace.QName QName_6_44 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "nationality");
    private final static javax.xml.namespace.QName QName_6_48 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "EmailAddressType");
    private final static javax.xml.namespace.QName QName_6_43 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "address");
    private final static javax.xml.namespace.QName QName_2_14 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/",
                  "QIdType");
    private final static javax.xml.namespace.QName QName_6_41 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "mobilePhone");
    private final static javax.xml.namespace.QName QName_6_47 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "TelephoneNumberType");
    private final static javax.xml.namespace.QName QName_6_38 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "personName");
    private final static javax.xml.namespace.QName QName_6_42 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "emailAddress");
    private final static javax.xml.namespace.QName QName_6_49 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "AddressType");
    private final static javax.xml.namespace.QName QName_6_39 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "homePhone");
    private final static javax.xml.namespace.QName QName_6_51 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "ProfessionType");
    private final static javax.xml.namespace.QName QName_6_46 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "PersonNameType");
    private final static javax.xml.namespace.QName QName_6_40 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "businessPhone");
    private final static javax.xml.namespace.QName QName_6_37 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "qID");
}
