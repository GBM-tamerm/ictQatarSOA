/**
 * ValidType_Ser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.mol;

public class ValidType_Ser extends com.ibm.ws.webservices.engine.encoding.ser.BeanSerializer {
    /**
     * Constructor
     */
    public ValidType_Ser(
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
           elemQName = QName_0_122;
           context.qName2String(elemQName, true);
           elemQName = QName_0_123;
           context.qName2String(elemQName, true);
           elemQName = QName_0_124;
           context.qName2String(elemQName, true);
           elemQName = QName_0_125;
           context.qName2String(elemQName, true);
        return attributes;
    }
    protected void addElements(
        java.lang.Object value,
        com.ibm.ws.webservices.engine.encoding.SerializationContext context)
        throws java.io.IOException
    {
        ValidType bean = (ValidType) value;
        java.lang.Object propValue;
        javax.xml.namespace.QName propQName;
        {
          propQName = QName_0_122;
          propValue = bean.getStatistics();
          serializeChild(propQName, null, 
              propValue, 
              QName_2_126,
              false,null,context);
          propQName = QName_0_123;
          propValue = bean.getElectricityInfo();
          serializeChild(propQName, null, 
              propValue, 
              QName_3_127,
              false,null,context);
          propQName = QName_0_124;
          propValue = bean.getStatisticsNote();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              true,null,context);
          }
          propQName = QName_0_125;
          propValue = bean.getElectricityNote();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              true,null,context);
          }
        }
    }
    private final static javax.xml.namespace.QName QName_0_123 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "electricityInfo");
    private final static javax.xml.namespace.QName QName_0_124 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "statisticsNote");
    private final static javax.xml.namespace.QName QName_0_122 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "statistics");
    private final static javax.xml.namespace.QName QName_0_125 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "electricityNote");
    private final static javax.xml.namespace.QName QName_1_12 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://www.w3.org/2001/XMLSchema",
                  "string");
    private final static javax.xml.namespace.QName QName_3_127 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "BillSummaryType");
    private final static javax.xml.namespace.QName QName_2_126 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/",
                  "StatisticsType");
}
