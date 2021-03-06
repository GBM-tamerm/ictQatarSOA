<?xml version="1.0" encoding="UTF-8"?>
<!-- @generated mapFile="xslt/XSLTransformation1_req_10.map" md5sum="2852f51d94fc69bfc7b8f9bdd589d195" version="6.2.200" -->
<!--
*****************************************************************************
*   This file has been generated by the IBM XML Mapping Editor V6.2.200
*
*   Mapping file:		XSLTransformation1_req_10.map
*   Map declaration(s):	XSLTransformation1_req_10
*   Input file(s):		smo://smo/name%3Dwsdl-primary/message%3D%257Burn%253Akahramaa.com.qa%252Fbilling%252Fspecifications%252Fv1_0%252F%257DBillInfogetLastBillDetailsRequest/xpath%3D%252F/smo.xsd
*   Output file(s):		smo://smo/name%3Dwsdl-primary/message%3D%257Burn%253Akahramaa.com.qa%252Fbilling%252Fspecifications%252Fv1_0%252F%257DBillInfogetLastBillDetailsResponse/xpath%3D%252F/smo.xsd
*
*   Note: Do not modify the contents of this file as it is overwritten
*         each time the mapping model is updated.
*****************************************************************************
-->
<xsl:stylesheet
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xalan="http://xml.apache.org/xslt"
    xmlns:io2="urn:kahramaa.com.qa/billing/xml/schemas/v1_0/"
    xmlns:io3="http://www.ibm.com/websphere/sibx/smo/v6.0.1"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:io10="urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/"
    xmlns:io11="urn:igov.gov.qa/xml/schemas/v1_0/"
    xmlns:io="urn:kahramaa.com.qa/billing/specifications/v1_0/"
    xmlns:io4="http://www.ibm.com/xmlns/prod/websphere/mq/sca/6.0.0"
    xmlns:io5="urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/"
    xmlns:io6="http://schemas.xmlsoap.org/ws/2004/08/addressing"
    xmlns:io7="http://www.ibm.com/xmlns/prod/websphere/http/sca/6.1.0"
    xmlns:io8="wsdl.urn:kahramaa.com.qa/billing/specifications/v1_0/"
    xmlns:xsd="http://www.w3.org/2001/XMLSchema"
    xmlns:io9="http://www.w3.org/2005/08/addressing"
    exclude-result-prefixes="xalan"
    version="1.0">
  <xsl:output method="xml" encoding="UTF-8" indent="yes" xalan:indent-amount="2"/>
  <xsl:strip-space elements="*"/>

  <!-- root template  -->
  <xsl:template match="/">
    <xsl:apply-templates select="io3:smo" mode="XSLTransformation1_req_10"/>
  </xsl:template>

  <!-- This rule represents an element mapping: "io3:smo" to "io3:smo".  -->
  <xsl:template match="io3:smo"  mode="XSLTransformation1_req_10">
    <io3:smo>
      <body>
        <io:BillInfogetLastBillDetailsResponse1>
          <io:billDetails>
            <io2:electricityBillData>
              <!-- a simple mapping with no associated source:  to "io2:presentReadingAmount"(float) -->
              <io2:presentReadingAmount>
                <xsl:text>324244</xsl:text>
              </io2:presentReadingAmount>
              <!-- a simple mapping with no associated source:  to "io2:deductionAmount"(float) -->
              <io2:deductionAmount>
                <xsl:text>2342442</xsl:text>
              </io2:deductionAmount>
              <!-- a simple mapping with no associated source:  to "io2:totalDetails"(float) -->
              <io2:totalDetails>
                <xsl:text>465465</xsl:text>
              </io2:totalDetails>
            </io2:electricityBillData>
            <io2:waterBillData>
              <!-- a simple mapping with no associated source:  to "io2:presentReadingAmount"(float) -->
              <io2:presentReadingAmount>
                <xsl:text>132444</xsl:text>
              </io2:presentReadingAmount>
              <!-- a simple mapping with no associated source:  to "io2:firstLimitAmount"(float) -->
              <io2:firstLimitAmount>
                <xsl:text>5454656</xsl:text>
              </io2:firstLimitAmount>
              <!-- a simple mapping with no associated source:  to "io2:otherChargesAmount"(float) -->
              <io2:otherChargesAmount>
                <xsl:text>4535454545</xsl:text>
              </io2:otherChargesAmount>
              <!-- a simple mapping with no associated source:  to "io2:totalAmount"(float) -->
              <io2:totalAmount>
                <xsl:text>2332</xsl:text>
              </io2:totalAmount>
            </io2:waterBillData>
          </io:billDetails>
        </io:BillInfogetLastBillDetailsResponse1>
      </body>
    </io3:smo>
  </xsl:template>

  <!-- *****************    Utility Templates    ******************  -->
  <!-- copy the namespace declarations from the source to the target -->
  <xsl:template name="copyNamespaceDeclarations">
    <xsl:param name="root"/>
    <xsl:for-each select="$root/namespace::*">
      <xsl:copy/>
    </xsl:for-each>
  </xsl:template>
</xsl:stylesheet>
