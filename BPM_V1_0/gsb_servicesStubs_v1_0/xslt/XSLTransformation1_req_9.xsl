<?xml version="1.0" encoding="UTF-8"?>
<!-- @generated mapFile="xslt/XSLTransformation1_req_9.map" md5sum="dabd8de0137795963997fe353c544fdf" version="6.2.200" -->
<!--
*****************************************************************************
*   This file has been generated by the IBM XML Mapping Editor V6.2.200
*
*   Mapping file:		XSLTransformation1_req_9.map
*   Map declaration(s):	XSLTransformation1_req_9
*   Input file(s):		smo://smo/name%3Dwsdl-primary/message%3D%257Burn%253Amol.gov.qa%252FcustomerService%252Frecruitment%252Fspecifications%252Fv1_0%252F%257DLookupsgetAllLookupsRequest/xpath%3D%252Fbody/smo.xsd
*   Output file(s):		smo://smo/name%3Dwsdl-primary/message%3D%257Burn%253Amol.gov.qa%252FcustomerService%252Frecruitment%252Fspecifications%252Fv1_0%252F%257DLookupsgetAllLookupsResponse/xpath%3D%252Fbody/smo.xsd
*
*   Note: Do not modify the contents of this file as it is overwritten
*         each time the mapping model is updated.
*****************************************************************************
-->
<xsl:stylesheet
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xalan="http://xml.apache.org/xslt"
    xmlns:io="urn:kahramaa.com.qa/billing/xml/schemas/v1_0/"
    xmlns:io2="urn:mol.gov.qa/customerService/recruitment/specifications/v1_0/"
    xmlns:io3="http://www.ibm.com/websphere/sibx/smo/v6.0.1"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:io4="urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/"
    xmlns:io5="urn:mol.gov.qa/customerService/recruitment/xml/schemas/v1_0/"
    xmlns:io6="urn:baladiya.gov.qa/commonTypes/xml/schemas/v1_0/"
    xmlns:io7="http://www.ibm.com/xmlns/prod/websphere/mq/sca/6.0.0"
    xmlns:io8="urn:mec.gov.qa/commercialRegistration/xml/schemas/v1_0/"
    xmlns:io9="urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/"
    xmlns:io10="http://schemas.xmlsoap.org/ws/2004/08/addressing"
    xmlns:io11="wsdl.urn:mol.gov.qa/customerService/recruitment/specifications/v1_0/"
    xmlns:io12="http://www.ibm.com/xmlns/prod/websphere/http/sca/6.1.0"
    xmlns:xsd="http://www.w3.org/2001/XMLSchema"
    xmlns:io13="http://www.w3.org/2005/08/addressing"
    xmlns:io14="urn:baladiya.gov.qa/commercialPermit/xml/schemas/v1_0/"
    exclude-result-prefixes="xalan"
    version="1.0">
  <xsl:output method="xml" encoding="UTF-8" indent="yes" xalan:indent-amount="2"/>
  <xsl:strip-space elements="*"/>

  <!-- root template  -->
  <xsl:template match="/">
    <xsl:apply-templates select="body" mode="XSLTransformation1_req_9"/>
  </xsl:template>

  <!-- This rule represents an element mapping: "body" to "body".  -->
  <xsl:template match="body"  mode="XSLTransformation1_req_9">
    <body>
      <io2:LookupsgetAllLookupsResponse1>
        <io2:nationalitiesList>
          <!-- a simple mapping with no associated source:  to "io4:name_En"(string) -->
          <io4:name_En>
            <xsl:text>egyption</xsl:text>
          </io4:name_En>
          <!-- a simple mapping with no associated source:  to "io4:name_Ar"(string) -->
          <io4:name_Ar>
            <xsl:text>مصرى</xsl:text>
          </io4:name_Ar>
          <!-- a simple mapping with no associated source:  to "io4:ID"(IdType) -->
          <io4:ID>
            <xsl:text>264</xsl:text>
          </io4:ID>
        </io2:nationalitiesList>
        <io2:professionsList>
          <!-- a simple mapping with no associated source:  to "io4:name_En"(string) -->
          <io4:name_En>
            <xsl:text>Engineer</xsl:text>
          </io4:name_En>
          <!-- a simple mapping with no associated source:  to "io4:name_Ar"(string) -->
          <io4:name_Ar>
            <xsl:text>مهندس</xsl:text>
          </io4:name_Ar>
          <!-- a simple mapping with no associated source:  to "io4:ID"(IdType) -->
          <io4:ID>
            <xsl:text>765</xsl:text>
          </io4:ID>
        </io2:professionsList>
      </io2:LookupsgetAllLookupsResponse1>
    </body>
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
