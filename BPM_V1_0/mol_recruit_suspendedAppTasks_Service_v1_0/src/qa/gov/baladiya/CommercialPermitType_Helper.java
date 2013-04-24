/**
 * CommercialPermitType_Helper.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.baladiya;

public class CommercialPermitType_Helper {
    // Type metadata
    private static final com.ibm.ws.webservices.engine.description.TypeDesc typeDesc =
        new com.ibm.ws.webservices.engine.description.TypeDesc(CommercialPermitType.class);

    static {
        typeDesc.setOption("buildNum","cf210844.05");
        com.ibm.ws.webservices.engine.description.FieldDesc field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("commercialRegistration");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/", "commercialRegistration"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/", "CommercialRegistration"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("establishmentCommercialName");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/", "establishmentCommercialName"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:baladiya.gov.qa/commonTypes/xml/schemas/v1_0/", "BilingualName"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("issueDate");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/", "issueDate"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("expiryDate");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/", "expiryDate"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("municipalityName");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/", "municipalityName"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:baladiya.gov.qa/commonTypes/xml/schemas/v1_0/", "BilingualName"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("location");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/", "location"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:baladiya.gov.qa/commonTypes/xml/schemas/v1_0/", "AddressType"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("commercialPermitID");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/", "commercialPermitID"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/", "CommercialPermitIDType"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("licenseeQID");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/", "licenseeQID"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("licenseeName");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/", "licenseeName"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("licenseeNationality");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/", "licenseeNationality"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("managerQID");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/", "managerQID"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("managerName");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/", "managerName"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("managerNationality");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/", "managerNationality"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("companyActivity");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/", "companyActivity"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("buildingOwner");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/", "buildingOwner"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("licenseType");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/", "licenseType"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("remarks");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/", "remarks"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("applicationNumber");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/", "applicationNumber"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/", "ApplicationNumber"));
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
          new CommercialPermitType_Ser(
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
          new CommercialPermitType_Deser(
            javaType, xmlType, typeDesc);
    };

}
