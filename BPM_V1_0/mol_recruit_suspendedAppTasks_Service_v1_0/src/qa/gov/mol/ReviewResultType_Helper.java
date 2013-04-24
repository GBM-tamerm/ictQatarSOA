/**
 * ReviewResultType_Helper.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.mol;

public class ReviewResultType_Helper {
    // Type metadata
    private static final com.ibm.ws.webservices.engine.description.TypeDesc typeDesc =
        new com.ibm.ws.webservices.engine.description.TypeDesc(ReviewResultType.class);

    static {
        typeDesc.setOption("buildNum","cf210844.05");
        com.ibm.ws.webservices.engine.description.FieldDesc field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("remarks");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/", "remarks"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("notification");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/", "notification"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("timeStamp");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/", "timeStamp"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("notificationLang");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/", "notificationLang"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/", "Language"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("userID");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/", "userID"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/", "UserIdType"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("result");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/", "result"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/", "ApplicationReviewResultType"));
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
          new ReviewResultType_Ser(
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
          new ReviewResultType_Deser(
            javaType, xmlType, typeDesc);
    };

}
