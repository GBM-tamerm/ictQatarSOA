/**
 * BillSummaryType_Helper.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.com.kahramaa;

public class BillSummaryType_Helper {
    // Type metadata
    private static final com.ibm.ws.webservices.engine.description.TypeDesc typeDesc =
        new com.ibm.ws.webservices.engine.description.TypeDesc(BillSummaryType.class);

    static {
        typeDesc.setOption("buildNum","cf210844.05");
        com.ibm.ws.webservices.engine.description.FieldDesc field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("waterNumber");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "waterNumber"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("billNumber");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "billNumber"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("address");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "address"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/", "AddressType"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("areaCode");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "areaCode"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("billPeriod");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "billPeriod"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("billDate");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "billDate"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("customerNameArabic");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "customerNameArabic"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("customerNameEnglish");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "customerNameEnglish"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("accountId");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "accountId"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("ownerNameArabic");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "ownerNameArabic"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("ownerNameEnglish");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "ownerNameEnglish"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("remarksArabic");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "remarksArabic"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("remarksEnglish");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "remarksEnglish"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("status");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "status"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("lastPaidDate");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "lastPaidDate"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("outstandingAmount");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "outstandingAmount"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("grandTotal");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "grandTotal"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("electricityNumber");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "electricityNumber"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "ElectricityNumberType"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("tenantId");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "tenantId"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "TenantIDType"));
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
          new BillSummaryType_Ser(
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
          new BillSummaryType_Deser(
            javaType, xmlType, typeDesc);
    };

}
