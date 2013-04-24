/**
 * NationalityType_Deser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.igov;

public class NationalityType_Deser extends com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializer {
    /**
     * Constructor
     */
    public NationalityType_Deser(
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType, 
           com.ibm.ws.webservices.engine.description.TypeDesc _typeDesc) {
        super(_javaType, _xmlType, _typeDesc);
    }
    /**
     * Create instance of java bean
     */
    public void createValue() {
        value = new qa.gov.igov.NationalityType();
    }
    protected boolean tryElementSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        if (qName==QName_6_26) {
          ((NationalityType)value).setName_En(strValue);
          return true;}
        else if (qName==QName_6_27) {
          ((NationalityType)value).setName_Ar(strValue);
          return true;}
        else if (qName==QName_6_28) {
          ((NationalityType)value).setID(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseint(strValue));
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
    private final static javax.xml.namespace.QName QName_6_26 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "name_En");
    private final static javax.xml.namespace.QName QName_6_28 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "ID");
    private final static javax.xml.namespace.QName QName_6_27 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "name_Ar");
}
