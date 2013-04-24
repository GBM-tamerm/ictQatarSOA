/**
 * AddressType_Deser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.igov;

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
        value = new qa.gov.igov.AddressType();
    }
    protected boolean tryElementSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        if (qName==QName_6_30) {
          ((AddressType)value).setPoBox(strValue);
          return true;}
        else if (qName==QName_6_31) {
          ((AddressType)value).setZone(strValue);
          return true;}
        else if (qName==QName_6_32) {
          ((AddressType)value).setStreetNumber(strValue);
          return true;}
        else if (qName==QName_6_33) {
          ((AddressType)value).setBuildingNumber(strValue);
          return true;}
        else if (qName==QName_6_34) {
          ((AddressType)value).setAddressText(strValue);
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
    private final static javax.xml.namespace.QName QName_6_30 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "poBox");
    private final static javax.xml.namespace.QName QName_6_34 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "addressText");
    private final static javax.xml.namespace.QName QName_6_31 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "zone");
    private final static javax.xml.namespace.QName QName_6_33 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "buildingNumber");
    private final static javax.xml.namespace.QName QName_6_32 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "streetNumber");
}
