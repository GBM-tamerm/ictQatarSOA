/**
 * BillDetailType_Helper.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.com.kahramaa;

public class BillDetailType_Helper {
    // Type metadata
    private static final com.ibm.ws.webservices.engine.description.TypeDesc typeDesc =
        new com.ibm.ws.webservices.engine.description.TypeDesc(BillDetailType.class);

    static {
        typeDesc.setOption("buildNum","cf210844.05");
        com.ibm.ws.webservices.engine.description.FieldDesc field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("electricityBillData");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "electricityBillData"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "ElectricityBillType"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("waterBillData");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "waterBillData"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "WaterBillType"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("tenantId");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "tenantId"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "TenantIDType"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("electricityNumber");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "electricityNumber"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "ElectricityNumberType"));
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
          new BillDetailType_Ser(
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
          new BillDetailType_Deser(
            javaType, xmlType, typeDesc);
    };

}
