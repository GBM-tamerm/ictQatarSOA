/**
 * ValidType_Deser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.mol;

public class ValidType_Deser extends com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializer {
    /**
     * Constructor
     */
    public ValidType_Deser(
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType, 
           com.ibm.ws.webservices.engine.description.TypeDesc _typeDesc) {
        super(_javaType, _xmlType, _typeDesc);
    }
    /**
     * Create instance of java bean
     */
    public void createValue() {
        value = new qa.gov.mol.ValidType();
    }
    protected boolean tryElementSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        if (qName==QName_0_124) {
          ((ValidType)value).setStatisticsNote(strValue);
          return true;}
        else if (qName==QName_0_125) {
          ((ValidType)value).setElectricityNote(strValue);
          return true;}
        return false;
    }
    protected boolean tryAttributeSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        return false;
    }
    protected boolean tryElementSetFromObject(javax.xml.namespace.QName qName, java.lang.Object objValue) {
        if (qName==QName_0_122) {
          if (objValue instanceof java.util.List) {
            qa.gov.moi.ProfessionDetailsType[] array = new qa.gov.moi.ProfessionDetailsType[((java.util.List)objValue).size()];
            ((java.util.List)objValue).toArray(array);
            ((ValidType)value).setStatistics(array);
          } else { 
            ((ValidType)value).setStatistics((qa.gov.moi.ProfessionDetailsType[])objValue);}
          return true;}
        else if (qName==QName_0_123) {
          ((ValidType)value).setElectricityInfo((qa.com.kahramaa.BillSummaryType)objValue);
          return true;}
        return false;
    }
    protected boolean tryElementSetFromList(javax.xml.namespace.QName qName, java.util.List listValue) {
        return false;
    }
    private final static javax.xml.namespace.QName QName_0_123 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "electricityInfo");
    private final static javax.xml.namespace.QName QName_0_124 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "statisticsNote");
    private final static javax.xml.namespace.QName QName_0_122 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "statistics");
    private final static javax.xml.namespace.QName QName_0_125 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/",
                  "electricityNote");
}
