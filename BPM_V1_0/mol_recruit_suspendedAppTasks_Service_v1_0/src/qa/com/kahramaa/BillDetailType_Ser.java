/**
 * BillDetailType_Ser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.com.kahramaa;

public class BillDetailType_Ser extends com.ibm.ws.webservices.engine.encoding.ser.BeanSerializer {
    /**
     * Constructor
     */
    public BillDetailType_Ser(
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
           elemQName = QName_3_234;
           context.qName2String(elemQName, true);
           elemQName = QName_3_235;
           context.qName2String(elemQName, true);
           elemQName = QName_3_143;
           context.qName2String(elemQName, true);
           elemQName = QName_3_5;
           context.qName2String(elemQName, true);
        return attributes;
    }
    protected void addElements(
        java.lang.Object value,
        com.ibm.ws.webservices.engine.encoding.SerializationContext context)
        throws java.io.IOException
    {
        BillDetailType bean = (BillDetailType) value;
        java.lang.Object propValue;
        javax.xml.namespace.QName propQName;
        {
          propQName = QName_3_234;
          propValue = bean.getElectricityBillData();
          serializeChild(propQName, null, 
              propValue, 
              QName_3_236,
              true,null,context);
          propQName = QName_3_235;
          propValue = bean.getWaterBillData();
          serializeChild(propQName, null, 
              propValue, 
              QName_3_237,
              true,null,context);
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
        }
    }
    private final static javax.xml.namespace.QName QName_3_5 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "electricityNumber");
    private final static javax.xml.namespace.QName QName_3_143 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "tenantId");
    private final static javax.xml.namespace.QName QName_3_144 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "TenantIDType");
    private final static javax.xml.namespace.QName QName_3_236 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "ElectricityBillType");
    private final static javax.xml.namespace.QName QName_3_234 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "electricityBillData");
    private final static javax.xml.namespace.QName QName_3_237 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "WaterBillType");
    private final static javax.xml.namespace.QName QName_3_235 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "waterBillData");
    private final static javax.xml.namespace.QName QName_3_16 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "ElectricityNumberType");
}
