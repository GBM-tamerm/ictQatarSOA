/**
 * EstablishmentInfoType_Helper.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.moi;

public class EstablishmentInfoType_Helper {
    // Type metadata
    private static final com.ibm.ws.webservices.engine.description.TypeDesc typeDesc =
        new com.ibm.ws.webservices.engine.description.TypeDesc(EstablishmentInfoType.class);

    static {
        typeDesc.setOption("buildNum","cf210844.05");
        com.ibm.ws.webservices.engine.description.FieldDesc field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("name");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/", "name"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("id");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/", "Id"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/", "EstablishmentIdType"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("address");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/", "address"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/", "AddressType"));
        field.setMinOccursIs0(true);
        field.setMaxOccurs(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("phone");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/", "phone"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/", "TelephoneNumberType"));
        field.setMinOccursIs0(true);
        field.setMaxOccurs(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("owners");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/", "owners"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/", "PersonInfoType"));
        field.setMinOccursIs0(true);
        field.setMaxOccurs(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("agents");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/", "agents"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/", "PersonInfoType"));
        field.setMinOccursIs0(true);
        field.setMaxOccurs(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("currentCountOfWorkers");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/", "currentCountOfWorkers"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "int"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("email");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/", "email"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("authorizedSignatories");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/", "authorizedSignatories"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/", "PersonInfoType"));
        field.setMinOccursIs0(true);
        field.setMaxOccurs(true);
        typeDesc.addFieldDesc(field);
    };

    /**
     * Return type metadata object
     */
    public static com.ibm.ws.webservices.engine.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static com.ibm.ws.webservices.engine.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class javaType,  
           javax.xml.namespace.QName xmlType) {
        return 
          new EstablishmentInfoType_Ser(
            javaType, xmlType, typeDesc);
    };

    /**
     * Get Custom Deserializer
     */
    public static com.ibm.ws.webservices.engine.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class javaType,  
           javax.xml.namespace.QName xmlType) {
        return 
          new EstablishmentInfoType_Deser(
            javaType, xmlType, typeDesc);
    };

}
