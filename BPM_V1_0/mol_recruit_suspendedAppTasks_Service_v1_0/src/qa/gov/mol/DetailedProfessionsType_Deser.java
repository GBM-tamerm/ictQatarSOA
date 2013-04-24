/**
 * DetailedProfessionsType_Deser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.mol;

public class DetailedProfessionsType_Deser extends com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializer {
    /**
     * Constructor
     */
    public DetailedProfessionsType_Deser(
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType, 
           com.ibm.ws.webservices.engine.description.TypeDesc _typeDesc) {
        super(_javaType, _xmlType, _typeDesc);
    }
    /**
     * Create instance of java bean
     */
    public void createValue() {
        value = new qa.gov.mol.DetailedProfessionsType();
    }
    protected boolean tryElementSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        if (qName==QName_0_97) {
          ((DetailedProfessionsType)value).setRequiredNumber(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseint(strValue));
          return true;}
        else if (qName==QName_0_65) {
          ((DetailedProfessionsType)value).setVpNumber(strValue);
          return true;}
        return false;
    }
    protected boolean tryAttributeSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        return false;
    }
    protected boolean tryElementSetFromObject(javax.xml.namespace.QName qName, java.lang.Object objValue) {
        if (qName==QName_0_45) {
          ((DetailedProfessionsType)value).setProfession((qa.gov.igov.ProfessionType)objValue);
          return true;}
        else if (qName==QName_0_44) {
          ((DetailedProfessionsType)value).setNationality((qa.gov.igov.NationalityType)objValue);
          return true;}
        else if (qName==QName_0_64) {
          ((DetailedProfessionsType)value).setGender((qa.gov.igov.GenderType)objValue);
          return true;}
        return false;
    }
    protected boolean tryElementSetFromList(javax.xml.namespace.QName qName, java.util.List listValue) {
        return false;
    }
    private final static javax.xml.namespace.QName QName_0_44 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "nationality");
    private final static javax.xml.namespace.QName QName_0_64 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "gender");
    private final static javax.xml.namespace.QName QName_0_97 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "requiredNumber");
    private final static javax.xml.namespace.QName QName_0_45 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "profession");
    private final static javax.xml.namespace.QName QName_0_65 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "vpNumber");
}
