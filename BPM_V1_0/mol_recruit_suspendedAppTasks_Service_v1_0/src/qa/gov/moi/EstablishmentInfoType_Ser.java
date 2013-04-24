/**
 * EstablishmentInfoType_Ser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.moi;

public class EstablishmentInfoType_Ser extends com.ibm.ws.webservices.engine.encoding.ser.BeanSerializer {
    /**
     * Constructor
     */
    public EstablishmentInfoType_Ser(
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
           elemQName = QName_2_36;
           context.qName2String(elemQName, true);
           elemQName = QName_2_52;
           context.qName2String(elemQName, true);
           elemQName = QName_2_43;
           context.qName2String(elemQName, true);
           elemQName = QName_2_53;
           context.qName2String(elemQName, true);
           elemQName = QName_2_54;
           context.qName2String(elemQName, true);
           elemQName = QName_2_55;
           context.qName2String(elemQName, true);
           elemQName = QName_2_56;
           context.qName2String(elemQName, true);
           elemQName = QName_2_57;
           context.qName2String(elemQName, true);
           elemQName = QName_2_58;
           context.qName2String(elemQName, true);
        return attributes;
    }
    protected void addElements(
        java.lang.Object value,
        com.ibm.ws.webservices.engine.encoding.SerializationContext context)
        throws java.io.IOException
    {
        EstablishmentInfoType bean = (EstablishmentInfoType) value;
        java.lang.Object propValue;
        javax.xml.namespace.QName propQName;
        {
          propQName = QName_2_36;
          propValue = bean.getName();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              true,null,context);
          }
          propQName = QName_2_52;
          propValue = bean.getId();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_2_15,
              true,null,context);
          }
          propQName = QName_2_43;
          {
            propValue = bean.getAddress();
            if (propValue != null) {
              for (int i=0; i<java.lang.reflect.Array.getLength(propValue); i++) {
                serializeChild(propQName, null, 
                    java.lang.reflect.Array.get(propValue, i), 
                    QName_6_49,
                    true,null,context);
              }
            }
          }
          propQName = QName_2_53;
          {
            propValue = bean.getPhone();
            if (propValue != null) {
              for (int i=0; i<java.lang.reflect.Array.getLength(propValue); i++) {
                if (java.lang.reflect.Array.get(propValue, i) != null && !context.shouldSendXSIType()) {
                  context.simpleElement(propQName, null, java.lang.reflect.Array.get(propValue, i).toString()); 
                } else {
                  serializeChild(propQName, null, 
                    java.lang.reflect.Array.get(propValue, i), 
                    QName_6_47,
                    true,null,context);
                }
              }
            }
          }
          propQName = QName_2_54;
          {
            propValue = bean.getOwners();
            if (propValue != null) {
              for (int i=0; i<java.lang.reflect.Array.getLength(propValue); i++) {
                serializeChild(propQName, null, 
                    java.lang.reflect.Array.get(propValue, i), 
                    QName_6_59,
                    true,null,context);
              }
            }
          }
          propQName = QName_2_55;
          {
            propValue = bean.getAgents();
            if (propValue != null) {
              for (int i=0; i<java.lang.reflect.Array.getLength(propValue); i++) {
                serializeChild(propQName, null, 
                    java.lang.reflect.Array.get(propValue, i), 
                    QName_6_59,
                    true,null,context);
              }
            }
          }
          propQName = QName_2_56;
          propValue = bean.getCurrentCountOfWorkers();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_60,
              false,null,context);
          propQName = QName_2_57;
          propValue = bean.getEmail();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              false,null,context);
          }
          propQName = QName_2_58;
          {
            propValue = bean.getAuthorizedSignatories();
            if (propValue != null) {
              for (int i=0; i<java.lang.reflect.Array.getLength(propValue); i++) {
                serializeChild(propQName, null, 
                    java.lang.reflect.Array.get(propValue, i), 
                    QName_6_59,
                    true,null,context);
              }
            }
          }
        }
    }
    private final static javax.xml.namespace.QName QName_2_54 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/",
                  "owners");
    private final static javax.xml.namespace.QName QName_2_57 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/",
                  "email");
    private final static javax.xml.namespace.QName QName_2_52 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/",
                  "Id");
    private final static javax.xml.namespace.QName QName_2_56 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/",
                  "currentCountOfWorkers");
    private final static javax.xml.namespace.QName QName_2_55 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/",
                  "agents");
    private final static javax.xml.namespace.QName QName_2_36 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/",
                  "name");
    private final static javax.xml.namespace.QName QName_2_43 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/",
                  "address");
    private final static javax.xml.namespace.QName QName_6_59 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "PersonInfoType");
    private final static javax.xml.namespace.QName QName_6_47 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "TelephoneNumberType");
    private final static javax.xml.namespace.QName QName_2_15 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/",
                  "EstablishmentIdType");
    private final static javax.xml.namespace.QName QName_6_49 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "AddressType");
    private final static javax.xml.namespace.QName QName_1_60 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://www.w3.org/2001/XMLSchema",
                  "int");
    private final static javax.xml.namespace.QName QName_1_12 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://www.w3.org/2001/XMLSchema",
                  "string");
    private final static javax.xml.namespace.QName QName_2_53 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/",
                  "phone");
    private final static javax.xml.namespace.QName QName_2_58 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/",
                  "authorizedSignatories");
}
