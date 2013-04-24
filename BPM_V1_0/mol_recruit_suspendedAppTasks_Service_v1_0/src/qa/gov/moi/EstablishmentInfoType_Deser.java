/**
 * EstablishmentInfoType_Deser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.moi;

public class EstablishmentInfoType_Deser extends com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializer {
    /**
     * Constructor
     */
    public EstablishmentInfoType_Deser(
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType, 
           com.ibm.ws.webservices.engine.description.TypeDesc _typeDesc) {
        super(_javaType, _xmlType, _typeDesc);
    }
    /**
     * Create instance of java bean
     */
    public void createValue() {
        value = new qa.gov.moi.EstablishmentInfoType();
    }
    protected boolean tryElementSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        if (qName==QName_2_36) {
          ((EstablishmentInfoType)value).setName(strValue);
          return true;}
        else if (qName==QName_2_52) {
          ((EstablishmentInfoType)value).setId(strValue);
          return true;}
        else if (qName==QName_2_56) {
          ((EstablishmentInfoType)value).setCurrentCountOfWorkers(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseInteger(strValue));
          return true;}
        else if (qName==QName_2_57) {
          ((EstablishmentInfoType)value).setEmail(strValue);
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
        if (qName==QName_2_43) {
          qa.gov.igov.AddressType[] array = new qa.gov.igov.AddressType[listValue.size()];
          listValue.toArray(array);
          ((EstablishmentInfoType)value).setAddress(array);
          return true;}
        else if (qName==QName_2_53) {
          java.lang.String[] array = new java.lang.String[listValue.size()];
          listValue.toArray(array);
          ((EstablishmentInfoType)value).setPhone(array);
          return true;}
        else if (qName==QName_2_54) {
          qa.gov.igov.PersonInfoType[] array = new qa.gov.igov.PersonInfoType[listValue.size()];
          listValue.toArray(array);
          ((EstablishmentInfoType)value).setOwners(array);
          return true;}
        else if (qName==QName_2_55) {
          qa.gov.igov.PersonInfoType[] array = new qa.gov.igov.PersonInfoType[listValue.size()];
          listValue.toArray(array);
          ((EstablishmentInfoType)value).setAgents(array);
          return true;}
        else if (qName==QName_2_58) {
          qa.gov.igov.PersonInfoType[] array = new qa.gov.igov.PersonInfoType[listValue.size()];
          listValue.toArray(array);
          ((EstablishmentInfoType)value).setAuthorizedSignatories(array);
          return true;}
        return false;
    }
    private final static javax.xml.namespace.QName QName_2_54 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/",
                  "owners");
    private final static javax.xml.namespace.QName QName_2_57 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/",
                  "email");
    private final static javax.xml.namespace.QName QName_2_52 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/",
                  "Id");
    private final static javax.xml.namespace.QName QName_2_56 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/",
                  "currentCountOfWorkers");
    private final static javax.xml.namespace.QName QName_2_55 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/",
                  "agents");
    private final static javax.xml.namespace.QName QName_2_36 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/",
                  "name");
    private final static javax.xml.namespace.QName QName_2_43 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/",
                  "address");
    private final static javax.xml.namespace.QName QName_2_53 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/",
                  "phone");
    private final static javax.xml.namespace.QName QName_2_58 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/",
                  "authorizedSignatories");
}
