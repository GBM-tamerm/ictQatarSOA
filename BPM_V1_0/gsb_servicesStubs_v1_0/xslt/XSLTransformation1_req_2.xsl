<?xml version="1.0" encoding="UTF-8"?>
<!-- @generated mapFile="xslt/XSLTransformation1_req_2.map" md5sum="c91922c4a800027b0070be4177a94d5b" version="6.2.200" -->
<!--
*****************************************************************************
*   This file has been generated by the IBM XML Mapping Editor V6.2.200
*
*   Mapping file:		XSLTransformation1_req_2.map
*   Map declaration(s):	XSLTransformation1_req_2
*   Input file(s):		smo://smo/name%3Dwsdl-primary/message%3D%257Burn%253Amoi.gov.qa%252FestablishmentInfo%252Fspecifications%252Fv1_0%252F%257DEstablishmentInfogetEstablishmentInfoByIdRequest/xpath%3D%252Fbody/smo.xsd
*   Output file(s):		smo://smo/name%3Dwsdl-primary/message%3D%257Burn%253Amoi.gov.qa%252FestablishmentInfo%252Fspecifications%252Fv1_0%252F%257DEstablishmentInfogetEstablishmentInfoByIdResponse/xpath%3D%252Fbody/smo.xsd
*
*   Note: Do not modify the contents of this file as it is overwritten
*         each time the mapping model is updated.
*****************************************************************************
-->
<xsl:stylesheet
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xalan="http://xml.apache.org/xslt"
    xmlns:io3="http://www.ibm.com/xmlns/prod/websphere/mq/sca/6.0.0"
    xmlns:io2="http://www.ibm.com/websphere/sibx/smo/v6.0.1"
    xmlns:io="wsdl.urn:moi.gov.qa/establishmentInfo/specifications/v1_0/"
    xmlns:io4="urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/"
    xmlns:io5="http://schemas.xmlsoap.org/ws/2004/08/addressing"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:io6="http://www.ibm.com/xmlns/prod/websphere/http/sca/6.1.0"
    xmlns:xsd="http://www.w3.org/2001/XMLSchema"
    xmlns:io8="http://www.w3.org/2005/08/addressing"
    xmlns:io7="urn:moi.gov.qa/establishmentInfo/specifications/v1_0/"
    xmlns:io9="urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/"
    exclude-result-prefixes="xalan"
    version="1.0">
  <xsl:output method="xml" encoding="UTF-8" indent="yes" xalan:indent-amount="2"/>
  <xsl:strip-space elements="*"/>

  <!-- root template  -->
  <xsl:template match="/">
    <xsl:apply-templates select="body" mode="XSLTransformation1_req_2"/>
  </xsl:template>

  <!-- This rule represents an element mapping: "body" to "body".  -->
  <xsl:template match="body"  mode="XSLTransformation1_req_2">
    <body>
      <io7:EstablishmentInfogetEstablishmentInfoByIdResponse1>
        <io7:establishmentInfo>
          <!-- a simple mapping with no associated source:  to "io4:name"(string) -->
          <io4:name>
            <xsl:text>العمادى</xsl:text>
          </io4:name>
          <!-- a simple data mapping: "io7:EstablishmentInfogetEstablishmentInfoByIdRequest1/io7:estId"(EstablishmentIdType) to "io4:Id"(EstablishmentIdType) -->
          <io4:Id>
            <xsl:value-of select="io7:EstablishmentInfogetEstablishmentInfoByIdRequest1/io7:estId"/>
          </io4:Id>
          <io4:owners>
            <!-- a simple mapping with no associated source:  to "io9:qID"(QIdType) -->
            <io9:qID>
              <xsl:text>2132243</xsl:text>
            </io9:qID>
            <io9:personName>
              <!-- a simple mapping with no associated source:  to "io9:name_Ar"(string) -->
              <io9:name_Ar>
                <xsl:text>عبد الله العمادى</xsl:text>
              </io9:name_Ar>
            </io9:personName>
            <!-- a simple mapping with no associated source:  to "io9:mobilePhone"(TelephoneNumberType) -->
            <io9:mobilePhone>
              <xsl:text>55816892</xsl:text>
            </io9:mobilePhone>
            <!-- a simple mapping with no associated source:  to "io9:emailAddress"(EmailAddressType) -->
            <io9:emailAddress>
              <xsl:text>tamerm@qa.gbm.ihost.com</xsl:text>
            </io9:emailAddress>
          </io4:owners>
          <io4:agents>
            <!-- a simple mapping with no associated source:  to "io9:qID"(QIdType) -->
            <io9:qID>
              <xsl:text>3333333</xsl:text>
            </io9:qID>
            <!-- a simple mapping with no associated source:  to "io9:mobilePhone"(TelephoneNumberType) -->
            <io9:mobilePhone>
              <xsl:text>7704343</xsl:text>
            </io9:mobilePhone>
            <!-- a simple mapping with no associated source:  to "io9:emailAddress"(EmailAddressType) -->
            <io9:emailAddress>
              <xsl:text>agent1@gmail.com</xsl:text>
            </io9:emailAddress>
          </io4:agents>
          <!-- a simple mapping with no associated source:  to "io4:currentCountOfWorkers"(int) -->
          <io4:currentCountOfWorkers>
            <xsl:text>100</xsl:text>
          </io4:currentCountOfWorkers>
        </io7:establishmentInfo>
      </io7:EstablishmentInfogetEstablishmentInfoByIdResponse1>
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
