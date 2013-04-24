<?xml version="1.0" encoding="UTF-8"?>
<!-- @generated mapFile="xslt/XSLTransformation1_req_8.map" md5sum="3c287527bd6c9abc6b1eb9feccc9e301" version="6.2.200" -->
<!--
*****************************************************************************
*   This file has been generated by the IBM XML Mapping Editor V6.2.200
*
*   Mapping file:		XSLTransformation1_req_8.map
*   Map declaration(s):	XSLTransformation1_req_8
*   Input file(s):		smo://smo/name%3Dwsdl-primary/message%3D%257Burn%253Aigov.gov.qa%252FsharedServices%252Fnotification%252Fspecifications%252Fv1_0%252F%257DNotificationsendNotificationRequest/xpath%3D%252F/smo.xsd
*   Output file(s):		smo://smo/name%3Dwsdl-primary/message%3D%257Burn%253Aigov.gov.qa%252FsharedServices%252Fnotification%252Fspecifications%252Fv1_0%252F%257DNotificationsendNotificationResponse/xpath%3D%252F/smo.xsd
*
*   Note: Do not modify the contents of this file as it is overwritten
*         each time the mapping model is updated.
*****************************************************************************
-->
<xsl:stylesheet
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xalan="http://xml.apache.org/xslt"
    xmlns:io="http://www.ibm.com/websphere/sibx/smo/v6.0.1"
    xmlns:io3="wsdl.urn:igov.gov.qa/sharedServices/notification/specifications/v1_0/"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:io10="urn:igov.gov.qa/commonTypes/xml/schemas/v1_0/"
    xmlns:io11="urn:igov.gov.qa/xml/schemas/v1_0/"
    xmlns:io2="http://www.ibm.com/xmlns/prod/websphere/mq/sca/6.0.0"
    xmlns:io4="urn:moi.gov.qa/establishmentInfo/xml/schemas/v1_0/"
    xmlns:io5="http://schemas.xmlsoap.org/ws/2004/08/addressing"
    xmlns:io6="urn:igov.gov.qa/sharedServices/notification/xml/schemas/v1_0/"
    xmlns:io7="http://www.ibm.com/xmlns/prod/websphere/http/sca/6.1.0"
    xmlns:io8="urn:igov.gov.qa/sharedServices/notification/specifications/v1_0/"
    xmlns:xsd="http://www.w3.org/2001/XMLSchema"
    xmlns:io9="http://www.w3.org/2005/08/addressing"
    exclude-result-prefixes="xalan"
    version="1.0">
  <xsl:output method="xml" encoding="UTF-8" indent="yes" xalan:indent-amount="2"/>
  <xsl:strip-space elements="*"/>

  <!-- root template  -->
  <xsl:template match="/">
    <xsl:apply-templates select="io:smo" mode="XSLTransformation1_req_8"/>
  </xsl:template>

  <!-- This rule represents an element mapping: "io:smo" to "io:smo".  -->
  <xsl:template match="io:smo"  mode="XSLTransformation1_req_8">
    <io:smo>
      <body>
        <io8:NotificationsendNotificationResponse1>
          <io8:acknowledgment>
            <!-- a simple mapping with no associated source:  to "io6:acknowledgment"(NotificationStatusType) -->
            <io6:acknowledgment>
              <xsl:text>SENT</xsl:text>
            </io6:acknowledgment>
            <!-- a simple mapping with no associated source:  to "io6:notificationId"(NotificationIdType) -->
            <io6:notificationId>
              <xsl:text>123322</xsl:text>
            </io6:notificationId>
          </io8:acknowledgment>
        </io8:NotificationsendNotificationResponse1>
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
