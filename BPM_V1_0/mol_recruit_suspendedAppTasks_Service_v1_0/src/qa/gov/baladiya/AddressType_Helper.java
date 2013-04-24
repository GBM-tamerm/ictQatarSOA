/**
 * AddressType_Helper.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.baladiya;

public class AddressType_Helper {
    // Type metadata
    private static final com.ibm.ws.webservices.engine.description.TypeDesc typeDesc =
        new com.ibm.ws.webservices.engine.description.TypeDesc(AddressType.class);

    static {
        typeDesc.setOption("buildNum","cf210844.05");
        com.ibm.ws.webservices.engine.description.FieldDesc field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("buildingNumber");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:baladiya.gov.qa/commonTypes/xml/schemas/v1_0/", "buildingNumber"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("street");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:baladiya.gov.qa/commonTypes/xml/schemas/v1_0/", "street"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:baladiya.gov.qa/commonTypes/xml/schemas/v1_0/", "Street"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("zone");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:baladiya.gov.qa/commonTypes/xml/schemas/v1_0/", "zone"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:baladiya.gov.qa/commonTypes/xml/schemas/v1_0/", "Zone"));
        field.setMinOccursIs0(true);
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
          new AddressType_Ser(
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
          new AddressType_Deser(
            javaType, xmlType, typeDesc);
    };

}
