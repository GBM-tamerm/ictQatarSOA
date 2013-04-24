/**
 * ProfessionDetailsType_Ser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.moi;

public class ProfessionDetailsType_Ser extends com.ibm.ws.webservices.engine.encoding.ser.BeanSerializer {
    /**
     * Constructor
     */
    public ProfessionDetailsType_Ser(
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
           elemQName = QName_2_61;
           context.qName2String(elemQName, true);
           elemQName = QName_2_62;
           context.qName2String(elemQName, true);
           elemQName = QName_2_63;
           context.qName2String(elemQName, true);
           elemQName = QName_2_45;
           context.qName2String(elemQName, true);
           elemQName = QName_2_44;
           context.qName2String(elemQName, true);
           elemQName = QName_2_64;
           context.qName2String(elemQName, true);
           elemQName = QName_2_65;
           context.qName2String(elemQName, true);
           elemQName = QName_2_66;
           context.qName2String(elemQName, true);
           elemQName = QName_2_67;
           context.qName2String(elemQName, true);
           elemQName = QName_2_68;
           context.qName2String(elemQName, true);
        return attributes;
    }
    protected void addElements(
        java.lang.Object value,
        com.ibm.ws.webservices.engine.encoding.SerializationContext context)
        throws java.io.IOException
    {
        ProfessionDetailsType bean = (ProfessionDetailsType) value;
        java.lang.Object propValue;
        javax.xml.namespace.QName propQName;
        {
          propQName = QName_2_61;
          propValue = bean.getPermittedVisaCount();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_60,
              false,null,context);
          propQName = QName_2_62;
          propValue = bean.getUsedVisaCount();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_60,
              false,null,context);
          propQName = QName_2_63;
          propValue = bean.getRemainingVisaCount();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_60,
              false,null,context);
          propQName = QName_2_45;
          propValue = bean.getProfession();
          serializeChild(propQName, null, 
              propValue, 
              QName_6_51,
              true,null,context);
          propQName = QName_2_44;
          propValue = bean.getNationality();
          serializeChild(propQName, null, 
              propValue, 
              QName_6_50,
              true,null,context);
          propQName = QName_2_64;
          propValue = bean.getGender();
          serializeChild(propQName, null, 
              propValue, 
              QName_6_69,
              true,null,context);
          propQName = QName_2_65;
          propValue = bean.getVpNumber();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              false,null,context);
          }
          propQName = QName_2_66;
          propValue = bean.getApplicationNumber();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              false,null,context);
          }
          propQName = QName_2_67;
          propValue = bean.getYear();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              false,null,context);
          }
          propQName = QName_2_68;
          propValue = bean.getExpiryDate();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_13,
              false,null,context);
        }
    }
    private final static javax.xml.namespace.QName QName_2_65 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/",
                  "vpNumber");
    private final static javax.xml.namespace.QName QName_6_50 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "NationalityType");
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
    private final static javax.xml.namespace.QName QName_1_60 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://www.w3.org/2001/XMLSchema",
                  "int");
    private final static javax.xml.namespace.QName QName_1_12 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://www.w3.org/2001/XMLSchema",
                  "string");
    private final static javax.xml.namespace.QName QName_6_51 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "ProfessionType");
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
    private final static javax.xml.namespace.QName QName_1_13 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://www.w3.org/2001/XMLSchema",
                  "dateTime");
    private final static javax.xml.namespace.QName QName_6_69 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "GenderType");
    private final static javax.xml.namespace.QName QName_2_45 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/",
                  "profession");
}
