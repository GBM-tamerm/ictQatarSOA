/**
 * OtherPartner_Deser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.mec;

public class OtherPartner_Deser extends com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializer {
    /**
     * Constructor
     */
    public OtherPartner_Deser(
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType, 
           com.ibm.ws.webservices.engine.description.TypeDesc _typeDesc) {
        super(_javaType, _xmlType, _typeDesc);
    }
    /**
     * Create instance of java bean
     */
    public void createValue() {
        value = new qa.gov.mec.OtherPartner();
    }
    protected boolean tryElementSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        if (qName==QName_4_98) {
          ((OtherPartner)value).setNameAr(strValue);
          return true;}
        else if (qName==QName_4_44) {
          ((OtherPartner)value).setNationality(strValue);
          return true;}
        else if (qName==QName_4_203) {
          ((OtherPartner)value).setPercentage(strValue);
          return true;}
        else if (qName==QName_4_85) {
          ((OtherPartner)value).setStatus(strValue);
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
    private final static javax.xml.namespace.QName QName_4_44 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "nationality");
    private final static javax.xml.namespace.QName QName_4_203 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "percentage");
    private final static javax.xml.namespace.QName QName_4_98 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "nameAr");
    private final static javax.xml.namespace.QName QName_4_85 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/",
                  "status");
}
