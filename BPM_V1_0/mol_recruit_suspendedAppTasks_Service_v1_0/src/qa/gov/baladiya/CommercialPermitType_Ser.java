/**
 * CommercialPermitType_Ser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.baladiya;

public class CommercialPermitType_Ser extends com.ibm.ws.webservices.engine.encoding.ser.BeanSerializer {
    /**
     * Constructor
     */
    public CommercialPermitType_Ser(
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType, 
           com.ibm.ws.webservices.engine.description.TypeDesc _typeDesc) {
        super(_javaType, _xmlType, _typeDesc);
    }
    public void serialize(
        javax.xml.namespace.QName name,
        org.xml.sax.Attributes attributes,
        java.lang.Object value,
        com.ibm.ws.webservices.engine.encoding.SerializationContext context)
        throws java.io.IOException
    {
        context.startElement(name, addAttributes(attributes, value, context));
        addElements(value, context);
        context.endElement();
    }
    protected org.xml.sax.Attributes addAttributes(
        org.xml.sax.Attributes attributes,
        java.lang.Object value,
        com.ibm.ws.webservices.engine.encoding.SerializationContext context)
        throws java.io.IOException
    {
           javax.xml.namespace.QName
           elemQName = QName_5_147;
           context.qName2String(elemQName, true);
           elemQName = QName_5_148;
           context.qName2String(elemQName, true);
           elemQName = QName_5_149;
           context.qName2String(elemQName, true);
           elemQName = QName_5_68;
           context.qName2String(elemQName, true);
           elemQName = QName_5_150;
           context.qName2String(elemQName, true);
           elemQName = QName_5_151;
           context.qName2String(elemQName, true);
           elemQName = QName_5_10;
           context.qName2String(elemQName, true);
           elemQName = QName_5_152;
           context.qName2String(elemQName, true);
           elemQName = QName_5_153;
           context.qName2String(elemQName, true);
           elemQName = QName_5_154;
           context.qName2String(elemQName, true);
           elemQName = QName_5_155;
           context.qName2String(elemQName, true);
           elemQName = QName_5_156;
           context.qName2String(elemQName, true);
           elemQName = QName_5_157;
           context.qName2String(elemQName, true);
           elemQName = QName_5_158;
           context.qName2String(elemQName, true);
           elemQName = QName_5_159;
           context.qName2String(elemQName, true);
           elemQName = QName_5_160;
           context.qName2String(elemQName, true);
           elemQName = QName_5_70;
           context.qName2String(elemQName, true);
           elemQName = QName_5_66;
           context.qName2String(elemQName, true);
        return attributes;
    }
    protected void addElements(
        java.lang.Object value,
        com.ibm.ws.webservices.engine.encoding.SerializationContext context)
        throws java.io.IOException
    {
        CommercialPermitType bean = (CommercialPermitType) value;
        java.lang.Object propValue;
        javax.xml.namespace.QName propQName;
        {
          propQName = QName_5_147;
          propValue = bean.getCommercialRegistration();
          serializeChild(propQName, null, 
              propValue, 
              QName_5_161,
              false,null,context);
          propQName = QName_5_148;
          propValue = bean.getEstablishmentCommercialName();
          serializeChild(propQName, null, 
              propValue, 
              QName_7_162,
              true,null,context);
          propQName = QName_5_149;
          propValue = bean.getIssueDate();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_13,
              true,null,context);
          propQName = QName_5_68;
          propValue = bean.getExpiryDate();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_13,
              true,null,context);
          propQName = QName_5_150;
          propValue = bean.getMunicipalityName();
          serializeChild(propQName, null, 
              propValue, 
              QName_7_162,
              false,null,context);
          propQName = QName_5_151;
          propValue = bean.getLocation();
          serializeChild(propQName, null, 
              propValue, 
              QName_7_49,
              false,null,context);
          propQName = QName_5_10;
          propValue = bean.getCommercialPermitID();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_5_18,
              true,null,context);
          }
          propQName = QName_5_152;
          propValue = bean.getLicenseeQID();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              false,null,context);
          }
          propQName = QName_5_153;
          propValue = bean.getLicenseeName();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              false,null,context);
          }
          propQName = QName_5_154;
          propValue = bean.getLicenseeNationality();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              false,null,context);
          }
          propQName = QName_5_155;
          propValue = bean.getManagerQID();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              false,null,context);
          }
          propQName = QName_5_156;
          propValue = bean.getManagerName();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              false,null,context);
          }
          propQName = QName_5_157;
          propValue = bean.getManagerNationality();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              false,null,context);
          }
          propQName = QName_5_158;
          propValue = bean.getCompanyActivity();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              false,null,context);
          }
          propQName = QName_5_159;
          propValue = bean.getBuildingOwner();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              false,null,context);
          }
          propQName = QName_5_160;
          propValue = bean.getLicenseType();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              false,null,context);
          }
          propQName = QName_5_70;
          propValue = bean.getRemarks();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_12,
              false,null,context);
          }
          propQName = QName_5_66;
          propValue = bean.getApplicationNumber();
          serializeChild(propQName, null, 
              propValue, 
              QName_5_80,
              true,null,context);
        }
    }
    private final static javax.xml.namespace.QName QName_5_18 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/",
                  "CommercialPermitIDType");
    private final static javax.xml.namespace.QName QName_5_70 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/",
                  "remarks");
    private final static javax.xml.namespace.QName QName_5_153 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/",
                  "licenseeName");
    private final static javax.xml.namespace.QName QName_5_160 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/",
                  "licenseType");
    private final static javax.xml.namespace.QName QName_5_151 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/",
                  "location");
    private final static javax.xml.namespace.QName QName_5_150 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/",
                  "municipalityName");
    private final static javax.xml.namespace.QName QName_5_152 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/",
                  "licenseeQID");
    private final static javax.xml.namespace.QName QName_7_49 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:baladiya.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "AddressType");
    private final static javax.xml.namespace.QName QName_5_147 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/",
                  "commercialRegistration");
    private final static javax.xml.namespace.QName QName_5_66 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/",
                  "applicationNumber");
    private final static javax.xml.namespace.QName QName_7_162 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:baladiya.gov.qa/commonTypes/xml/schemas/v1_0/",
                  "BilingualName");
    private final static javax.xml.namespace.QName QName_5_159 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/",
                  "buildingOwner");
    private final static javax.xml.namespace.QName QName_5_148 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/",
                  "establishmentCommercialName");
    private final static javax.xml.namespace.QName QName_5_68 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/",
                  "expiryDate");
    private final static javax.xml.namespace.QName QName_1_12 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://www.w3.org/2001/XMLSchema",
                  "string");
    private final static javax.xml.namespace.QName QName_1_13 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://www.w3.org/2001/XMLSchema",
                  "dateTime");
    private final static javax.xml.namespace.QName QName_5_156 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/",
                  "managerName");
    private final static javax.xml.namespace.QName QName_5_157 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/",
                  "managerNationality");
    private final static javax.xml.namespace.QName QName_5_155 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/",
                  "managerQID");
    private final static javax.xml.namespace.QName QName_5_149 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/",
                  "issueDate");
    private final static javax.xml.namespace.QName QName_5_154 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/",
                  "licenseeNationality");
    private final static javax.xml.namespace.QName QName_5_158 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/",
                  "companyActivity");
    private final static javax.xml.namespace.QName QName_5_80 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/",
                  "ApplicationNumber");
    private final static javax.xml.namespace.QName QName_5_161 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/",
                  "CommercialRegistration");
    private final static javax.xml.namespace.QName QName_5_10 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/",
                  "commercialPermitID");
}
