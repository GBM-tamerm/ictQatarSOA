/**
 * ApplicationDetailsLW_Helper.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.mol;

public class ApplicationDetailsLW_Helper {
    // Type metadata
    private static final com.ibm.ws.webservices.engine.description.TypeDesc typeDesc =
        new com.ibm.ws.webservices.engine.description.TypeDesc(ApplicationDetailsLW.class);

    static {
        typeDesc.setOption("buildNum","cf210844.05");
        com.ibm.ws.webservices.engine.description.FieldDesc field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("estID");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/", "estID"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/", "EstablishmentIdType"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("electricityNumber");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/", "electricityNumber"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:kahramaa.com.qa/billing/xml/schemas/v1_0/", "ElectricityNumberType"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("agentQID");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/", "agentQID"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/", "QIdType"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("agentEmail");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/", "agentEmail"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/", "EmailAddressType"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("agentPhone");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/", "agentPhone"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/", "TelephoneNumberType"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("requiredProfessions");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/", "requiredProfessions"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/", "DetailedProfessionsType"));
        field.setMaxOccurs(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("estName");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/", "estName"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("paymentFees");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/", "paymentFees"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/", "PaymentFeesType"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("paymentTransaction");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/", "paymentTransaction"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/", "PaymentTransactionType"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("commercialRegistrationCode");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/", "commercialRegistrationCode"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/", "CommercialRegistrationCodeType"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("commercialPermitID");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/", "commercialPermitID"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/", "CommercialPermitIDType"));
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
          new ApplicationDetailsLW_Ser(
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
          new ApplicationDetailsLW_Deser(
            javaType, xmlType, typeDesc);
    };

}
