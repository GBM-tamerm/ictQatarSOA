/**
 * ElectricityBillType_Helper.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.com.kahramaa;

public class ElectricityBillType_Helper {
    // Type metadata
    private static final com.ibm.ws.webservices.engine.description.TypeDesc typeDesc =
        new com.ibm.ws.webservices.engine.description.TypeDesc(ElectricityBillType.class);

    static {
        typeDesc.setOption("buildNum","cf210844.05");
        com.ibm.ws.webservices.engine.description.FieldDesc field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("presentReadingAmount");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "presentReadingAmount"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "float"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("presentReadingDetails");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "presentReadingDetails"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "float"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("previousReadingAmount");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "previousReadingAmount"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "float"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("previousReadingDetails");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "previousReadingDetails"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "float"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("consumptionAverageAmount");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "consumptionAverageAmount"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "float"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("consumptionAverageDetails");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "consumptionAverageDetails"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "float"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("firstLimitAmount");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "firstLimitAmount"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "float"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("firstLimitDetails");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "firstLimitDetails"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "float"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("secondLimitAmount");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "secondLimitAmount"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "float"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("secondLimitDetails");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "secondLimitDetails"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "float"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("thirdLimitAmount");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "thirdLimitAmount"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "float"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("thirdLimitDetails");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "thirdLimitDetails"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "float"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("meterRentAmount");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "meterRentAmount"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "float"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("meterRentDetails");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "meterRentDetails"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "float"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("otherChargesAmount");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "otherChargesAmount"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "float"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("otherChargesDetails");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "otherChargesDetails"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "float"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("deductionAmount");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "deductionAmount"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "float"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("deductionDetails");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "deductionDetails"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "float"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("arrearsAmount");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "arrearsAmount"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "float"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("arrearsDetails");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "arrearsDetails"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "float"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("totalAmount");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "totalAmount"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "float"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("totalDetails");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "totalDetails"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "float"));
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
          new ElectricityBillType_Ser(
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
          new ElectricityBillType_Deser(
            javaType, xmlType, typeDesc);
    };

}
