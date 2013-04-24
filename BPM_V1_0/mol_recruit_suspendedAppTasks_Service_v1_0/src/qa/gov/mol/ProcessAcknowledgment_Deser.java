/**
 * ProcessAcknowledgment_Deser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.mol;

public class ProcessAcknowledgment_Deser extends com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializer {
    /**
     * Constructor
     */
    public ProcessAcknowledgment_Deser(
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType, 
           com.ibm.ws.webservices.engine.description.TypeDesc _typeDesc) {
        super(_javaType, _xmlType, _typeDesc);
    }
    /**
     * Create instance of java bean
     */
    public void createValue() {
        value = new qa.gov.mol.ProcessAcknowledgment();
    }
    protected boolean tryElementSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        if (qName==QName_0_115) {
          ((ProcessAcknowledgment)value).setFailureNote(strValue);
          return true;}
        return false;
    }
    protected boolean tryAttributeSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        return false;
    }
    protected boolean tryElementSetFromObject(javax.xml.namespace.QName qName, java.lang.Object objValue) {
        if (qName==QName_0_0) {
          ((ProcessAcknowledgment)value).setApplicationID((qa.gov.mol.ApplicationIdType)objValue);
          return true;}
        else if (qName==QName_0_114) {
          ((ProcessAcknowledgment)value).setInValidResults((qa.gov.mol.InValidType)objValue);
          return true;}
        return false;
    }
    protected boolean tryElementSetFromList(javax.xml.namespace.QName qName, java.util.List listValue) {
        return false;
    }
    private final static javax.xml.namespace.QName QName_0_114 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "inValidResults");
    private final static javax.xml.namespace.QName QName_0_0 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "applicationID");
    private final static javax.xml.namespace.QName QName_0_115 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "failureNote");
}
