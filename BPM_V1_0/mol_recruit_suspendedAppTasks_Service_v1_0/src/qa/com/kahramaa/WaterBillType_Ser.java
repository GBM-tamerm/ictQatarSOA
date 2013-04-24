/**
 * WaterBillType_Ser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.com.kahramaa;

public class WaterBillType_Ser extends com.ibm.ws.webservices.engine.encoding.ser.BeanSerializer {
    /**
     * Constructor
     */
    public WaterBillType_Ser(
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
           elemQName = QName_3_211;
           context.qName2String(elemQName, true);
           elemQName = QName_3_212;
           context.qName2String(elemQName, true);
           elemQName = QName_3_213;
           context.qName2String(elemQName, true);
           elemQName = QName_3_214;
           context.qName2String(elemQName, true);
           elemQName = QName_3_215;
           context.qName2String(elemQName, true);
           elemQName = QName_3_216;
           context.qName2String(elemQName, true);
           elemQName = QName_3_217;
           context.qName2String(elemQName, true);
           elemQName = QName_3_218;
           context.qName2String(elemQName, true);
           elemQName = QName_3_219;
           context.qName2String(elemQName, true);
           elemQName = QName_3_220;
           context.qName2String(elemQName, true);
           elemQName = QName_3_221;
           context.qName2String(elemQName, true);
           elemQName = QName_3_222;
           context.qName2String(elemQName, true);
           elemQName = QName_3_223;
           context.qName2String(elemQName, true);
           elemQName = QName_3_224;
           context.qName2String(elemQName, true);
           elemQName = QName_3_225;
           context.qName2String(elemQName, true);
           elemQName = QName_3_226;
           context.qName2String(elemQName, true);
           elemQName = QName_3_227;
           context.qName2String(elemQName, true);
           elemQName = QName_3_228;
           context.qName2String(elemQName, true);
           elemQName = QName_3_229;
           context.qName2String(elemQName, true);
           elemQName = QName_3_230;
           context.qName2String(elemQName, true);
           elemQName = QName_3_231;
           context.qName2String(elemQName, true);
           elemQName = QName_3_232;
           context.qName2String(elemQName, true);
        return attributes;
    }
    protected void addElements(
        java.lang.Object value,
        com.ibm.ws.webservices.engine.encoding.SerializationContext context)
        throws java.io.IOException
    {
        WaterBillType bean = (WaterBillType) value;
        java.lang.Object propValue;
        javax.xml.namespace.QName propQName;
        {
          propQName = QName_3_211;
          propValue = bean.getPresentReadingAmount();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_233,
              false,null,context);
          propQName = QName_3_212;
          propValue = bean.getPresentReadingDetails();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_233,
              false,null,context);
          propQName = QName_3_213;
          propValue = bean.getPreviousReadingAmount();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_233,
              false,null,context);
          propQName = QName_3_214;
          propValue = bean.getPreviousReadingDetails();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_233,
              false,null,context);
          propQName = QName_3_215;
          propValue = bean.getConsumptionAverageAmount();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_233,
              false,null,context);
          propQName = QName_3_216;
          propValue = bean.getConsumptionAverageDetails();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_233,
              false,null,context);
          propQName = QName_3_217;
          propValue = bean.getFirstLimitAmount();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_233,
              false,null,context);
          propQName = QName_3_218;
          propValue = bean.getFirstLimitDetails();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_233,
              false,null,context);
          propQName = QName_3_219;
          propValue = bean.getSecondLimitAmount();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_233,
              false,null,context);
          propQName = QName_3_220;
          propValue = bean.getSecondLimitDetails();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_233,
              false,null,context);
          propQName = QName_3_221;
          propValue = bean.getThirdLimitAmount();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_233,
              false,null,context);
          propQName = QName_3_222;
          propValue = bean.getThirdLimitDetails();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_233,
              false,null,context);
          propQName = QName_3_223;
          propValue = bean.getMeterRentAmount();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_233,
              false,null,context);
          propQName = QName_3_224;
          propValue = bean.getMeterRentDetails();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_233,
              false,null,context);
          propQName = QName_3_225;
          propValue = bean.getOtherChargesAmount();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_233,
              false,null,context);
          propQName = QName_3_226;
          propValue = bean.getOtherChargesDetails();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_233,
              false,null,context);
          propQName = QName_3_227;
          propValue = bean.getDeductionAmount();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_233,
              false,null,context);
          propQName = QName_3_228;
          propValue = bean.getDeductionDetails();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_233,
              false,null,context);
          propQName = QName_3_229;
          propValue = bean.getArrearsAmount();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_233,
              false,null,context);
          propQName = QName_3_230;
          propValue = bean.getArrearsDetails();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_233,
              false,null,context);
          propQName = QName_3_231;
          propValue = bean.getTotalAmount();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_233,
              false,null,context);
          propQName = QName_3_232;
          propValue = bean.getTotalDetails();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_233,
              false,null,context);
        }
    }
    private final static javax.xml.namespace.QName QName_3_225 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "otherChargesAmount");
    private final static javax.xml.namespace.QName QName_3_227 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "deductionAmount");
    private final static javax.xml.namespace.QName QName_3_228 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "deductionDetails");
    private final static javax.xml.namespace.QName QName_3_224 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "meterRentDetails");
    private final static javax.xml.namespace.QName QName_3_223 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "meterRentAmount");
    private final static javax.xml.namespace.QName QName_3_229 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "arrearsAmount");
    private final static javax.xml.namespace.QName QName_3_216 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "consumptionAverageDetails");
    private final static javax.xml.namespace.QName QName_3_226 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "otherChargesDetails");
    private final static javax.xml.namespace.QName QName_3_219 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "secondLimitAmount");
    private final static javax.xml.namespace.QName QName_3_221 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "thirdLimitAmount");
    private final static javax.xml.namespace.QName QName_1_233 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://www.w3.org/2001/XMLSchema",
                  "float");
    private final static javax.xml.namespace.QName QName_3_211 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "presentReadingAmount");
    private final static javax.xml.namespace.QName QName_3_222 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "thirdLimitDetails");
    private final static javax.xml.namespace.QName QName_3_218 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "firstLimitDetails");
    private final static javax.xml.namespace.QName QName_3_214 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "previousReadingDetails");
    private final static javax.xml.namespace.QName QName_3_212 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "presentReadingDetails");
    private final static javax.xml.namespace.QName QName_3_231 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "totalAmount");
    private final static javax.xml.namespace.QName QName_3_230 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "arrearsDetails");
    private final static javax.xml.namespace.QName QName_3_213 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "previousReadingAmount");
    private final static javax.xml.namespace.QName QName_3_217 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "firstLimitAmount");
    private final static javax.xml.namespace.QName QName_3_232 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "totalDetails");
    private final static javax.xml.namespace.QName QName_3_220 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "secondLimitDetails");
    private final static javax.xml.namespace.QName QName_3_215 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "consumptionAverageAmount");
}
