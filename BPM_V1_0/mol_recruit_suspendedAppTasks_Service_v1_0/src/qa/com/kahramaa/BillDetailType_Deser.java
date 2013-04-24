/**
 * BillDetailType_Deser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.com.kahramaa;

public class BillDetailType_Deser extends com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializer {
    /**
     * Constructor
     */
    public BillDetailType_Deser(
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType, 
           com.ibm.ws.webservices.engine.description.TypeDesc _typeDesc) {
        super(_javaType, _xmlType, _typeDesc);
    }
    /**
     * Create instance of java bean
     */
    public void createValue() {
        value = new qa.com.kahramaa.BillDetailType();
    }
    protected boolean tryElementSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        if (qName==QName_3_143) {
          ((BillDetailType)value).setTenantId(strValue);
          return true;}
        else if (qName==QName_3_5) {
          ((BillDetailType)value).setElectricityNumber(strValue);
          return true;}
        return false;
    }
    protected boolean tryAttributeSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        return false;
    }
    protected boolean tryElementSetFromObject(javax.xml.namespace.QName qName, java.lang.Object objValue) {
        if (qName==QName_3_234) {
          ((BillDetailType)value).setElectricityBillData((qa.com.kahramaa.ElectricityBillType)objValue);
          return true;}
        else if (qName==QName_3_235) {
          ((BillDetailType)value).setWaterBillData((qa.com.kahramaa.WaterBillType)objValue);
          return true;}
        return false;
    }
    protected boolean tryElementSetFromList(javax.xml.namespace.QName qName, java.util.List listValue) {
        return false;
    }
    private final static javax.xml.namespace.QName QName_3_5 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "electricityNumber");
    private final static javax.xml.namespace.QName QName_3_143 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "tenantId");
    private final static javax.xml.namespace.QName QName_3_234 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "electricityBillData");
    private final static javax.xml.namespace.QName QName_3_235 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:kahramaa.com.qa/billing/xml/schemas/v1_0/",
                  "waterBillData");
}
