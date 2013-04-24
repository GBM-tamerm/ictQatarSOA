/**
 * ApplicationType_Helper.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.mol;

public class ApplicationType_Helper {
    // Type metadata
    private static final com.ibm.ws.webservices.engine.description.TypeDesc typeDesc =
        new com.ibm.ws.webservices.engine.description.TypeDesc(ApplicationType.class);

    static {
        typeDesc.setOption("buildNum","cf210844.05");
        com.ibm.ws.webservices.engine.description.FieldDesc field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("id");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/", "Id"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/", "ApplicationIdType"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("details");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/", "details"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/", "ApplicationDetailsType"));
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
          new ApplicationType_Ser(
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
          new ApplicationType_Deser(
            javaType, xmlType, typeDesc);
    };

}
