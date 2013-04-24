/**
 * ProcessAcknowledgment_Ser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.mol;

public class ProcessAcknowledgment_Ser extends com.ibm.ws.webservices.engine.encoding.ser.BeanSerializer {
    /**
     * Constructor
     */
    public ProcessAcknowledgment_Ser(
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
           elemQName = QName_0_0;
           context.qName2String(elemQName, true);
           elemQName = QName_0_114;
           context.qName2String(elemQName, true);
           elemQName = QName_0_115;
           context.qName2String(elemQName, true);
        return attributes;
    }
    protected void addElements(
        java.lang.Object value,
        com.ibm.ws.webservices.engine.encoding.SerializationContext context)
        throws java.io.IOException
    {
        ProcessAcknowledgment bean = (ProcessAcknowledgment) value;
        java.lang.Object propValue;
        javax.xml.namespace.QName propQName;
        {
          propQName = QName_0_0;
          propValue = bean.getApplicationID();
          serializeChild(propQName, null, 
              propValue, 
              QName_0_11,
              false,null,context);
          propQName = QName_0_114;
          propValue = bean.getInValidResults();
          serializeChild(propQName, null, 
              propValue, 
              QName_0_116,
              false,null,context);
          propQName = QName_0_115;
          propValue = bean.getFailureNote();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              false,null,context);
          }
        }
    }
    private final static javax.xml.namespace.QName QName_0_114 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "inValidResults");
    private final static javax.xml.namespace.QName QName_0_116 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "InValidType");
    private final static javax.xml.namespace.QName QName_1_12 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://www.w3.org/2001/XMLSchema",
                  "string");
    private final static javax.xml.namespace.QName QName_0_0 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "applicationID");
    private final static javax.xml.namespace.QName QName_0_11 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "ApplicationIdType");
    private final static javax.xml.namespace.QName QName_0_115 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "failureNote");
}
