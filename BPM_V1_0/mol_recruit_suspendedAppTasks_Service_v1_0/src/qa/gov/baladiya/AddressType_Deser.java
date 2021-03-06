/**
 * AddressType_Deser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.baladiya;

public class AddressType_Deser extends com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializer {
    /**
     * Constructor
     */
    public AddressType_Deser(
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType, 
           com.ibm.ws.webservices.engine.description.TypeDesc _typeDesc) {
        super(_javaType, _xmlType, _typeDesc);
    }
    /**
     * Create instance of java bean
     */
    public void createValue() {
        value = new qa.gov.baladiya.AddressType();
    }
    protected boolean tryElementSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        if (qName==QName_7_33) {
          ((AddressType)value).setBuildingNumber(strValue);
          return true;}
        return false;
    }
    protected boolean tryAttributeSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        return false;
    }
    protected boolean tryElementSetFromObject(javax.xml.namespace.QName qName, java.lang.Object objValue) {
        if (qName==QName_7_166) {
          ((AddressType)value).setStreet((qa.gov.baladiya.Street)objValue);
          return true;}
        else if (qName==QName_7_31) {
          ((AddressType)value).setZone((qa.gov.baladiya.Zone)objValue);
          return true;}
        return false;
    }
    protected boolean tryElementSetFromList(javax.xml.namespace.QName qName, java.util.List listValue) {
        return false;
    }
    private final static javax.xml.namespace.QName QName_7_166 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:baladiya.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "street");
    private final static javax.xml.namespace.QName QName_7_31 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:baladiya.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "zone");
    private final static javax.xml.namespace.QName QName_7_33 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:baladiya.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "buildingNumber");
}
