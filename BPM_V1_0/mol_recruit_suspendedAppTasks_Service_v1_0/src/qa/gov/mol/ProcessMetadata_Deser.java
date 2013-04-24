/**
 * ProcessMetadata_Deser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.mol;

public class ProcessMetadata_Deser extends com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializer {
    /**
     * Constructor
     */
    public ProcessMetadata_Deser(
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType, 
           com.ibm.ws.webservices.engine.description.TypeDesc _typeDesc) {
        super(_javaType, _xmlType, _typeDesc);
    }
    /**
     * Create instance of java bean
     */
    public void createValue() {
        value = new qa.gov.mol.ProcessMetadata();
    }
    protected boolean tryElementSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        if (qName==QName_0_111) {
          ((ProcessMetadata)value).setStepID(strValue);
          return true;}
        else if (qName==QName_0_112) {
          ((ProcessMetadata)value).setFaultMessage(strValue);
          return true;}
        else if (qName==QName_0_113) {
          ((ProcessMetadata)value).setCorrelationID(strValue);
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
    private final static javax.xml.namespace.QName QName_0_112 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "faultMessage");
    private final static javax.xml.namespace.QName QName_0_111 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "stepID");
    private final static javax.xml.namespace.QName QName_0_113 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "correlationID");
}
