<?xml version="1.0" encoding="UTF-8"?>
<!-- @generated mapFile="xslt/XSLTransformation1_req_6.map" md5sum="4412c98146a7da477dc5f67cbaed4abc" version="6.2.200" -->
<!--
*****************************************************************************
*   This file has been generated by the IBM XML Mapping Editor V6.2.200
*
*   Mapping file:		XSLTransformation1_req_6.map
*   Map declaration(s):	XSLTransformation1_req_6
*   Input file(s):		smo://smo/name%3Dwsdl-primary/message%3D%257Burn%253Amoi.gov.qa%252FestablishmentInfo%252Fspecifications%252Fv1_0%252F%257DEstablishmentSecurityInfogetLaborStatisticsRequest/xpath%3D%252F/smo.xsd
*   Output file(s):		smo://smo/name%3Dwsdl-primary/message%3D%257Burn%253Amoi.gov.qa%252FestablishmentInfo%252Fspecifications%252Fv1_0%252F%257DEstablishmentSecurityInfogetLaborStatisticsResponse/xpath%3D%252F/smo.xsd
*
*   Note: Do not modify the contents of this file as it is overwritten
*         each time the mapping model is updated.
*****************************************************************************
-->
<xsl:stylesheet
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xalan="http://xml.apache.org/xslt"
    xmlns:io3="wsdl.urn:moi.gov.qa/establishmentInfo/specifications/v1_0/"
    xmlns:io2="http://www.ibm.com/xmlns/prod/websphere/mq/sca/6.0.0"
    xmlns:io="http://www.ibm.com/websphere/sibx/smo/v6.0.1"
    xmlns:io4="urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/"
    xmlns:io5="http://schemas.xmlsoap.org/ws/2004/08/addressing"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:io6="http://www.ibm.com/xmlns/prod/websphere/http/sca/6.1.0"
    xmlns:xsd="http://www.w3.org/2001/XMLSchema"
    xmlns:io8="urn:moi.gov.qa/establishmentInfo/specifications/v1_0/"
    xmlns:io7="http://www.w3.org/2005/08/addressing"
    xmlns:io9="urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/"
    xmlns:io10="urn:igov.gov.qa/xml/schemas/v1_0/"
    exclude-result-prefixes="xalan"
    version="1.0">
  <xsl:output method="xml" encoding="UTF-8" indent="yes" xalan:indent-amount="2"/>
  <xsl:strip-space elements="*"/>

  <!-- root template  -->
  <xsl:template match="/">
    <xsl:apply-templates select="io:smo" mode="XSLTransformation1_req_6"/>
  </xsl:template>

  <!-- This rule represents an element mapping: "io:smo" to "io:smo".  -->
  <xsl:template match="io:smo"  mode="XSLTransformation1_req_6">
    <io:smo>
      <body>
        <io8:EstablishmentSecurityInfogetLaborStatisticsResponse1>
          <io8:estStatistics>
            <io4:professions>
              <io4:profession>
                <!-- a simple mapping with no associated source:  to "io9:ID"(IdType) -->
                <io9:ID>
                  <xsl:text>1</xsl:text>
                </io9:ID>
                <!-- a simple mapping with no associated source:  to "io9:name_En"(string) -->
                <io9:name_En>
                  <xsl:text>Enginner</xsl:text>
                </io9:name_En>
                <!-- a simple mapping with no associated source:  to "io9:name_Ar"(string) -->
                <io9:name_Ar>
                  <xsl:text>مهندس</xsl:text>
                </io9:name_Ar>
              </io4:profession>
              <io4:nationality>
                <!-- a simple mapping with no associated source:  to "io9:ID"(IdType) -->
                <io9:ID>
                  <xsl:text>1232121 </xsl:text>
                </io9:ID>
                <!-- a simple mapping with no associated source:  to "io9:name_En"(string) -->
                <io9:name_En>
                  <xsl:text>Egyption</xsl:text>
                </io9:name_En>
                <!-- a simple mapping with no associated source:  to "io9:name_Ar"(string) -->
                <io9:name_Ar>
                  <xsl:text>مصرى</xsl:text>
                </io9:name_Ar>
              </io4:nationality>
              <!-- a simple mapping with no associated source:  to "io4:gender"(GenderType) -->
              <io4:gender>
                <xsl:text>Male</xsl:text>
              </io4:gender>
              <!-- a simple mapping with no associated source:  to "io4:numberPermitted"(int) -->
              <io4:numberPermitted>
                <xsl:text>20</xsl:text>
              </io4:numberPermitted>
              <!-- a simple mapping with no associated source:  to "io4:numberUsed"(int) -->
              <io4:numberUsed>
                <xsl:text>5</xsl:text>
              </io4:numberUsed>
              <!-- a simple mapping with no associated source:  to "io4:numberRemaining"(int) -->
              <io4:numberRemaining>
                <xsl:text>12</xsl:text>
              </io4:numberRemaining>
              <!-- a simple mapping with no associated source:  to "io4:currentNumberOfWorkers"(int) -->
              <io4:currentNumberOfWorkers>
                <xsl:text>45</xsl:text>
              </io4:currentNumberOfWorkers>
            </io4:professions>
          </io8:estStatistics>
        </io8:EstablishmentSecurityInfogetLaborStatisticsResponse1>
      </body>
    </io:smo>
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