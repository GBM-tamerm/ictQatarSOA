/**
 * ProfessionDetailsType_Helper.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.moi;

public class ProfessionDetailsType_Helper {
    // Type metadata
    private static final com.ibm.ws.webservices.engine.description.TypeDesc typeDesc =
        new com.ibm.ws.webservices.engine.description.TypeDesc(ProfessionDetailsType.class);

    static {
        typeDesc.setOption("buildNum","cf210844.05");
        com.ibm.ws.webservices.engine.description.FieldDesc field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("permittedVisaCount");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/", "permittedVisaCount"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "int"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("usedVisaCount");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/", "usedVisaCount"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "int"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("remainingVisaCount");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/", "remainingVisaCount"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "int"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("profession");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/", "profession"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/", "ProfessionType"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("nationality");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/", "nationality"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/", "NationalityType"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("gender");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/", "gender"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/", "GenderType"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("vpNumber");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/", "vpNumber"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("applicationNumber");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/", "applicationNumber"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("year");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/", "year"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("expiryDate");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/", "expiryDate"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
          new ProfessionDetailsType_Ser(
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
          new ProfessionDetailsType_Deser(
            javaType, xmlType, typeDesc);
    };

}
