/**
 * CommonErrorStructure_Helper.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.igov;

public class CommonErrorStructure_Helper {
    // Type metadata
    private static final com.ibm.ws.webservices.engine.description.TypeDesc typeDesc =
        new com.ibm.ws.webservices.engine.description.TypeDesc(CommonErrorStructure.class);

    static {
        typeDesc.setOption("buildNum","cf210844.05");
        com.ibm.ws.webservices.engine.description.FieldDesc field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("errorCode");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/", "errorCode"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("userMessage");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/", "userMessage"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("detailMessage");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/", "detailMessage"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "anyType"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("failedMessage");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/", "failedMessage"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("timeStamp");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/", "timeStamp"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("networkLocation");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/", "networkLocation"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
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
          new CommonErrorStructure_Ser(
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
          new CommonErrorStructure_Deser(
            javaType, xmlType, typeDesc);
    };

    public static java.lang.Object createProxy() {
      return new qa.gov.igov.CommonErrorStructure_DeserProxy();
    }
}
