/**
 * WaterBillType_Deser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.com.kahramaa;

public class WaterBillType_Deser extends com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializer {
    /**
     * Constructor
     */
    public WaterBillType_Deser(
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType, 
           com.ibm.ws.webservices.engine.description.TypeDesc _typeDesc) {
        super(_javaType, _xmlType, _typeDesc);
    }
    /**
     * Create instance of java bean
     */
    public void createValue() {
        value = new qa.com.kahramaa.WaterBillType();
    }
    protected boolean tryElementSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        if (qName==QName_3_211) {
          ((WaterBillType)value).setPresentReadingAmount(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseFloat(strValue));
          return true;}
        else if (qName==QName_3_212) {
          ((WaterBillType)value).setPresentReadingDetails(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseFloat(strValue));
          return true;}
        else if (qName==QName_3_213) {
          ((WaterBillType)value).setPreviousReadingAmount(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseFloat(strValue));
          return true;}
        else if (qName==QName_3_214) {
          ((WaterBillType)value).setPreviousReadingDetails(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseFloat(strValue));
          return true;}
        else if (qName==QName_3_215) {
          ((WaterBillType)value).setConsumptionAverageAmount(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseFloat(strValue));
          return true;}
        else if (qName==QName_3_216) {
          ((WaterBillType)value).setConsumptionAverageDetails(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseFloat(strValue));
          return true;}
        else if (qName==QName_3_217) {
          ((WaterBillType)value).setFirstLimitAmount(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseFloat(strValue));
          return true;}
        else if (qName==QName_3_218) {
          ((WaterBillType)value).setFirstLimitDetails(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseFloat(strValue));
          return true;}
        else if (qName==QName_3_219) {
          ((WaterBillType)value).setSecondLimitAmount(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseFloat(strValue));
          return true;}
        else if (qName==QName_3_220) {
          ((WaterBillType)value).setSecondLimitDetails(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseFloat(strValue));
          return true;}
        else if (qName==QName_3_221) {
          ((WaterBillType)value).setThirdLimitAmount(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseFloat(strValue));
          return true;}
        else if (qName==QName_3_222) {
          ((WaterBillType)value).setThirdLimitDetails(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseFloat(strValue));
          return true;}
        else if (qName==QName_3_223) {
          ((WaterBillType)value).setMeterRentAmount(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseFloat(strValue));
          return true;}
        else if (qName==QName_3_224) {
          ((WaterBillType)value).setMeterRentDetails(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseFloat(strValue));
          return true;}
        else if (qName==QName_3_225) {
          ((WaterBillType)value).setOtherChargesAmount(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseFloat(strValue));
          return true;}
        else if (qName==QName_3_226) {
          ((WaterBillType)value).setOtherChargesDetails(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseFloat(strValue));
          return true;}
        else if (qName==QName_3_227) {
          ((WaterBillType)value).setDeductionAmount(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseFloat(strValue));
          return true;}
        else if (qName==QName_3_228) {
          ((WaterBillType)value).setDeductionDetails(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseFloat(strValue));
          return true;}
        else if (qName==QName_3_229) {
          ((WaterBillType)value).setArrearsAmount(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseFloat(strValue));
          return true;}
        else if (qName==QName_3_230) {
          ((WaterBillType)value).setArrearsDetails(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseFloat(strValue));
          return true;}
        else if (qName==QName_3_231) {
          ((WaterBillType)value).setTotalAmount(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseFloat(strValue));
          return true;}
        else if (qName==QName_3_232) {
          ((WaterBillType)value).setTotalDetails(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseFloat(strValue));
          return true;}
        return false;
    }
    protected boolean tryAttributeSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        return false;
    }
    protected boolean tryElementSetFromObject(javax.xml.namespace.QName qName, java.lang.Object objValue) {
        return false;
    }
    protected boolean tryElementSetFromList(javax.xml.namespace.QName qName, java.util.List listValue) {
        return false;
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
