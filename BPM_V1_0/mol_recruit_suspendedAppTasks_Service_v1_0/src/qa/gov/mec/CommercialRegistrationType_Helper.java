/**
 * CommercialRegistrationType_Helper.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.mec;

public class CommercialRegistrationType_Helper {
    // Type metadata
    private static final com.ibm.ws.webservices.engine.description.TypeDesc typeDesc =
        new com.ibm.ws.webservices.engine.description.TypeDesc(CommercialRegistrationType.class);

    static {
        typeDesc.setOption("buildNum","cf210844.05");
        com.ibm.ws.webservices.engine.description.FieldDesc field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("location");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/", "location"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("status");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/", "status"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("creationDate");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/", "creationDate"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("expiryDate");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/", "expiryDate"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("commerceChamberSubscriptionNo");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/", "commerceChamberSubscriptionNo"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("arabicCommercialName");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/", "arabicCommercialName"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("englishCommercialName");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/", "englishCommercialName"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("alias");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/", "alias"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("companyStartDate");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/", "companyStartDate"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("companyEndDate");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/", "companyEndDate"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("commercialRegistrationType");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/", "commercialRegistrationType"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("branchesCount");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/", "branchesCount"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "int"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("commercialRegistrationEntityType");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/", "commercialRegistrationEntityType"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("addressPOBox");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/", "addressPOBox"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("addressStreet");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/", "addressStreet"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("addressPropertyOwner");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/", "addressPropertyOwner"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("addressArea");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/", "addressArea"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("companyCapital");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/", "companyCapital"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("companyPaidCapital");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/", "companyPaidCapital"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "double"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("humanPartners");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/", "humanPartners"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/", "HumanPartner"));
        field.setMinOccursIs0(true);
        field.setMaxOccurs(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("establishmentPartners");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/", "establishmentPartners"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/", "EstablishmentPartner"));
        field.setMinOccursIs0(true);
        field.setMaxOccurs(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("otherPartners");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/", "otherPartners"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/", "OtherPartner"));
        field.setMinOccursIs0(true);
        field.setMaxOccurs(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("signatories");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/", "signatories"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/", "Signatory"));
        field.setMinOccursIs0(true);
        field.setMaxOccurs(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("boardMembers");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/", "boardMembers"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/", "BoardMember"));
        field.setMinOccursIs0(true);
        field.setMaxOccurs(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("branches");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/", "branches"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/", "Branch"));
        field.setMinOccursIs0(true);
        field.setMaxOccurs(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("activities");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/", "activities"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/", "Activity"));
        field.setMinOccursIs0(true);
        field.setMaxOccurs(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("commercialRegistrationCode");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/", "commercialRegistrationCode"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/", "CommercialRegistrationCodeType"));
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
          new CommercialRegistrationType_Ser(
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
          new CommercialRegistrationType_Deser(
            javaType, xmlType, typeDesc);
    };

}
