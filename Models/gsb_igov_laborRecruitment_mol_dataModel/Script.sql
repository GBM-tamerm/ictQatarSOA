--<ScriptOptions statementTerminator=";"/>

ALTER TABLE "Schema"."Application Status" DROP CONSTRAINT "Application St_Application _FK";

ALTER TABLE "Schema"."PERSON_INFO" DROP CONSTRAINT "PersonInf_Establishment vie_F1";

ALTER TABLE "Schema"."PERSON_INFO" DROP CONSTRAINT "PersonInf_Establishment vie_FK";

ALTER TABLE "Schema"."SOA_ RCT_ RQS_PROF" DROP CONSTRAINT "REQUIRED_PROFESSI_NATIONALI_FK";

ALTER TABLE "Schema"."SOA_ RCT_ RQS_PROF" DROP CONSTRAINT "REQUIRED_PROFESSI_PROFESSI_FK";

ALTER TABLE "Schema"."SOA_ RCT_ RQS_PROF" DROP CONSTRAINT "Required Profes_Application_FK";

ALTER TABLE "Schema"."SOA_ RCT_APV_ PROF" DROP CONSTRAINT "APPROVED_PROFESSI_NATIONALI_FK";

ALTER TABLE "Schema"."SOA_ RCT_APV_ PROF" DROP CONSTRAINT "APPROVED_PROFESSI_PROFESSI_FK";

ALTER TABLE "Schema"."SOA_ RCT_APV_ PROF" DROP CONSTRAINT "APPROVED_PROFE_APPLICATION_FK";

ALTER TABLE "Schema"."SOA_ RCT_CSR_REV" DROP CONSTRAINT "Review Resu_Application Vi_FK";

ALTER TABLE "Schema"."SOA_LBR_RCT_APP" DROP CONSTRAINT "SOA_LBR_RCT_SOA_LBR_RCT_ST_FK";

ALTER TABLE "Schema"."Application Status" DROP CONSTRAINT "Application Status_PK";

ALTER TABLE "Schema"."ESTABLISHMENT_VIEW" DROP CONSTRAINT "Establishment view_PK";

ALTER TABLE "Schema"."PERSON_INFO" DROP CONSTRAINT "Agent_PK";

ALTER TABLE "Schema"."SOA_ RCT_ RQS_PROF" DROP CONSTRAINT "REQUIRED_PROFESSION_PK";

ALTER TABLE "Schema"."SOA_ RCT_APV_ PROF" DROP CONSTRAINT "APPROVED_PROFESSION_PK";

ALTER TABLE "Schema"."SOA_ RCT_CSR_REV" DROP CONSTRAINT "REVIEW_RESULT_PK";

ALTER TABLE "Schema"."SOA_LBR_ NAT" DROP CONSTRAINT "Nationality_PK";

ALTER TABLE "Schema"."SOA_LBR_PROF" DROP CONSTRAINT "Professions_PK";

ALTER TABLE "Schema"."SOA_LBR_RCT_APP" DROP CONSTRAINT "Application View_PK";

ALTER TABLE "Schema"."SOA_LBR_RCT_STATUS" DROP CONSTRAINT "SOA_LBR_RCT_STATUS_PK";

DROP VIEW "Schema"."Required Professions View";

DROP VIEW "Schema"."View1";

DROP TABLE "Schema"."Application Status";

DROP TABLE "Schema"."ESTABLISHMENT_VIEW";

DROP TABLE "Schema"."PERSON_INFO";

DROP TABLE "Schema"."SOA_ RCT_ RQS_PROF";

DROP TABLE "Schema"."SOA_ RCT_APV_ PROF";

DROP TABLE "Schema"."SOA_ RCT_CSR_REV";

DROP TABLE "Schema"."SOA_LBR_ NAT";

DROP TABLE "Schema"."SOA_LBR_PROF";

DROP TABLE "Schema"."SOA_LBR_RCT_APP";

DROP TABLE "Schema"."SOA_LBR_RCT_STATUS";

CREATE SCHEMA AUTHORIZATION "Schema";

CREATE TABLE "Schema"."Application Status" (
		"ID" VARCHAR2(5) NOT NULL,
		"Name_Ar" VARCHAR2(5),
		"Name_En" VARCHAR2(5),
		"APPLICATION_NO" VARCHAR2(8),
		"YEAR" VARCHAR2(4)
	)
	LOGGING;

CREATE TABLE "Schema"."ESTABLISHMENT_VIEW" (
		"EST_ID" VARCHAR2(8) NOT NULL,
		"NAME" VARCHAR2(100) NOT NULL,
		"ADDRESS" VARCHAR2(100) NOT NULL,
		"PHONE" VARCHAR2(25) NOT NULL,
		"SPECIALIZATION" VARCHAR2(100)
	)
	LOGGING;

CREATE TABLE "Schema"."PERSON_INFO" (
		"QID" VARCHAR2(11) NOT NULL,
		"NAME" VARCHAR2(100) NOT NULL,
		"PHONE" VARCHAR2(25),
		"EMAIL" VARCHAR2(256),
		"EST_ID" VARCHAR2(8) NOT NULL
	)
	LOGGING;

CREATE TABLE "Schema"."SOA_ RCT_ RQS_PROF" (
		"GENDER" NUMBER(1 , 0) NOT NULL,
		"REQUIRED_COUNT" NUMBER(4 , 0) NOT NULL,
		"PROFESSION_ID" NUMBER(4 , 0) NOT NULL,
		"NATIONALITY_ID" NUMBER(3 , 0) NOT NULL,
		"APPLICATION_NO" VARCHAR2(8) NOT NULL,
		"YEAR" VARCHAR2(4) NOT NULL
	)
	LOGGING;

CREATE TABLE "Schema"."SOA_ RCT_APV_ PROF" (
		"GENDER" NUMBER(1 , 0) NOT NULL,
		"APPROVED_COUNT" NUMBER(4 , 0) NOT NULL,
		"APPLICATION_NO" VARCHAR2(8) NOT NULL,
		"YEAR" VARCHAR2(4) NOT NULL,
		"PROFESSION_ID" NUMBER(4 , 0) NOT NULL,
		"NATIONALITY_ID" NUMBER(3 , 0) NOT NULL
	)
	LOGGING;

CREATE TABLE "Schema"."SOA_ RCT_CSR_REV" (
		"RESULT" NUMBER(1 , 0) NOT NULL,
		"USER_ID" VARCHAR2(30) NOT NULL,
		"REVIEW_DATE" DATE NOT NULL,
		"REMARK" VARCHAR2(2000),
		"NOTIFICATION" VARCHAR2(450),
		"APPLICATION_NO" VARCHAR2(8) NOT NULL,
		"YEAR" VARCHAR2(4) NOT NULL,
		"NOTIFICATION_LANG" NUMBER(1 , 0)
	)
	LOGGING;

CREATE TABLE "Schema"."SOA_LBR_ NAT" (
		"NATIONALITY_ID" NUMBER(3 , 0) NOT NULL,
		"NAME_AR" VARCHAR2(100) NOT NULL,
		"NAME_EN" VARCHAR2(100)
	)
	LOGGING;

CREATE TABLE "Schema"."SOA_LBR_PROF" (
		"PROFESSION_ID" NUMBER(4 , 0) NOT NULL,
		"NAME_AR" VARCHAR2(100) NOT NULL,
		"NAME_EN" VARCHAR2(100)
	)
	LOGGING;

CREATE TABLE "Schema"."SOA_LBR_RCT_APP" (
		"APPLICATION_NO" VARCHAR2(8) NOT NULL,
		"YEAR" VARCHAR2(4) NOT NULL,
		"EST_ID" VARCHAR2(8) NOT NULL,
		"APPLICATION_DATE" DATE NOT NULL,
		"ELECTRICITY_NO" VARCHAR2(8),
		"AGENT_QID" VARCHAR2(11) NOT NULL,
		"AGENT_MOBILE" VARCHAR2(7),
		"AGENT_EMAIL" VARCHAR2(256),
		"STATUS_ID" NUMBER(3 , 0) NOT NULL,
		"REMARKS" VARCHAR2(2000)
	)
	LOGGING;

CREATE TABLE "Schema"."SOA_LBR_RCT_STATUS" (
		"STATUS_ID" NUMBER(3 , 0) NOT NULL,
		"STATUS_AR" VARCHAR2(100) NOT NULL,
		"STATUS_EN" VARCHAR2(100)
	)
	LOGGING;

ALTER TABLE "Schema"."Application Status" ADD CONSTRAINT "Application Status_PK" PRIMARY KEY
	("ID");

ALTER TABLE "Schema"."ESTABLISHMENT_VIEW" ADD CONSTRAINT "Establishment view_PK" PRIMARY KEY
	("EST_ID");

ALTER TABLE "Schema"."PERSON_INFO" ADD CONSTRAINT "Agent_PK" PRIMARY KEY
	("QID",
	 "EST_ID");

ALTER TABLE "Schema"."SOA_ RCT_ RQS_PROF" ADD CONSTRAINT "REQUIRED_PROFESSION_PK" PRIMARY KEY
	("PROFESSION_ID",
	 "NATIONALITY_ID",
	 "APPLICATION_NO",
	 "YEAR");

ALTER TABLE "Schema"."SOA_ RCT_APV_ PROF" ADD CONSTRAINT "APPROVED_PROFESSION_PK" PRIMARY KEY
	("APPLICATION_NO",
	 "YEAR",
	 "PROFESSION_ID",
	 "NATIONALITY_ID");

ALTER TABLE "Schema"."SOA_ RCT_CSR_REV" ADD CONSTRAINT "REVIEW_RESULT_PK" PRIMARY KEY
	("APPLICATION_NO",
	 "YEAR");

ALTER TABLE "Schema"."SOA_LBR_ NAT" ADD CONSTRAINT "Nationality_PK" PRIMARY KEY
	("NATIONALITY_ID");

ALTER TABLE "Schema"."SOA_LBR_PROF" ADD CONSTRAINT "Professions_PK" PRIMARY KEY
	("PROFESSION_ID");

ALTER TABLE "Schema"."SOA_LBR_RCT_APP" ADD CONSTRAINT "Application View_PK" PRIMARY KEY
	("APPLICATION_NO",
	 "YEAR");

ALTER TABLE "Schema"."SOA_LBR_RCT_STATUS" ADD CONSTRAINT "SOA_LBR_RCT_STATUS_PK" PRIMARY KEY
	("STATUS_ID");

ALTER TABLE "Schema"."Application Status" ADD CONSTRAINT "Application St_Application _FK" FOREIGN KEY
	("APPLICATION_NO",
	 "YEAR")
	REFERENCES "Schema"."SOA_LBR_RCT_APP"
	("APPLICATION_NO",
	 "YEAR")
	ON DELETE RESTRICT;

ALTER TABLE "Schema"."PERSON_INFO" ADD CONSTRAINT "PersonInf_Establishment vie_F1" FOREIGN KEY
	("EST_ID")
	REFERENCES "Schema"."ESTABLISHMENT_VIEW"
	("EST_ID");

ALTER TABLE "Schema"."PERSON_INFO" ADD CONSTRAINT "PersonInf_Establishment vie_FK" FOREIGN KEY
	("EST_ID")
	REFERENCES "Schema"."ESTABLISHMENT_VIEW"
	("EST_ID");

ALTER TABLE "Schema"."SOA_ RCT_ RQS_PROF" ADD CONSTRAINT "REQUIRED_PROFESSI_NATIONALI_FK" FOREIGN KEY
	("NATIONALITY_ID")
	REFERENCES "Schema"."SOA_LBR_ NAT"
	("NATIONALITY_ID")
	ON DELETE CASCADE;

ALTER TABLE "Schema"."SOA_ RCT_ RQS_PROF" ADD CONSTRAINT "REQUIRED_PROFESSI_PROFESSI_FK" FOREIGN KEY
	("PROFESSION_ID")
	REFERENCES "Schema"."SOA_LBR_PROF"
	("PROFESSION_ID")
	ON DELETE CASCADE;

ALTER TABLE "Schema"."SOA_ RCT_ RQS_PROF" ADD CONSTRAINT "Required Profes_Application_FK" FOREIGN KEY
	("APPLICATION_NO",
	 "YEAR")
	REFERENCES "Schema"."SOA_LBR_RCT_APP"
	("APPLICATION_NO",
	 "YEAR")
	ON DELETE RESTRICT;

ALTER TABLE "Schema"."SOA_ RCT_APV_ PROF" ADD CONSTRAINT "APPROVED_PROFESSI_NATIONALI_FK" FOREIGN KEY
	("NATIONALITY_ID")
	REFERENCES "Schema"."SOA_LBR_ NAT"
	("NATIONALITY_ID")
	ON DELETE CASCADE;

ALTER TABLE "Schema"."SOA_ RCT_APV_ PROF" ADD CONSTRAINT "APPROVED_PROFESSI_PROFESSI_FK" FOREIGN KEY
	("PROFESSION_ID")
	REFERENCES "Schema"."SOA_LBR_PROF"
	("PROFESSION_ID")
	ON DELETE CASCADE;

ALTER TABLE "Schema"."SOA_ RCT_APV_ PROF" ADD CONSTRAINT "APPROVED_PROFE_APPLICATION_FK" FOREIGN KEY
	("APPLICATION_NO",
	 "YEAR")
	REFERENCES "Schema"."SOA_LBR_RCT_APP"
	("APPLICATION_NO",
	 "YEAR");

ALTER TABLE "Schema"."SOA_ RCT_CSR_REV" ADD CONSTRAINT "Review Resu_Application Vi_FK" FOREIGN KEY
	("APPLICATION_NO",
	 "YEAR")
	REFERENCES "Schema"."SOA_LBR_RCT_APP"
	("APPLICATION_NO",
	 "YEAR")
	ON DELETE RESTRICT;

ALTER TABLE "Schema"."SOA_LBR_RCT_APP" ADD CONSTRAINT "SOA_LBR_RCT_SOA_LBR_RCT_ST_FK" FOREIGN KEY
	("STATUS_ID")
	REFERENCES "Schema"."SOA_LBR_RCT_STATUS"
	("STATUS_ID");

CREATE OR REPLACE VIEW "Schema"."Required Professions View" AS;

CREATE OR REPLACE VIEW "Schema"."View1" AS;

COMMENT ON COLUMN "Schema"."SOA_ RCT_ RQS_PROF"."APPLICATION_NO" IS
'Application Number Part of the Unique Identifier of the Application , Unique within a given year .  ';

COMMENT ON COLUMN "Schema"."SOA_ RCT_ RQS_PROF"."GENDER" IS
'Code For Gender .
1= Male
2= Female
';

COMMENT ON COLUMN "Schema"."SOA_ RCT_ RQS_PROF"."NATIONALITY_ID" IS
'Code of Nationality Based on MOI Coding .';

COMMENT ON COLUMN "Schema"."SOA_ RCT_ RQS_PROF"."PROFESSION_ID" IS
'Code of Profession Based on MOI Coding .';

COMMENT ON COLUMN "Schema"."SOA_ RCT_ RQS_PROF"."REQUIRED_COUNT" IS
'The requested number of workers .';

COMMENT ON COLUMN "Schema"."SOA_ RCT_ RQS_PROF"."YEAR" IS
'The YEAR when application has been submitted Part of the Unique Identifier of the Application.';

COMMENT ON COLUMN "Schema"."SOA_ RCT_APV_ PROF"."APPLICATION_NO" IS
'Application Number Part of the Unique Identifier of the Application , Unique within a given year .  ';

COMMENT ON COLUMN "Schema"."SOA_ RCT_APV_ PROF"."APPROVED_COUNT" IS
'The Approved  number of workers .';

COMMENT ON COLUMN "Schema"."SOA_ RCT_APV_ PROF"."GENDER" IS
'Code For Gender .
1= Male
2= Female
';

COMMENT ON COLUMN "Schema"."SOA_ RCT_APV_ PROF"."NATIONALITY_ID" IS
'Code of Nationality Based on MOI Coding .';

COMMENT ON COLUMN "Schema"."SOA_ RCT_APV_ PROF"."PROFESSION_ID" IS
'Code of Profession Based on MOI Coding .';

COMMENT ON COLUMN "Schema"."SOA_ RCT_APV_ PROF"."YEAR" IS
'The YEAR when application has been submitted Part of the Unique Identifier of the Application.';

COMMENT ON COLUMN "Schema"."SOA_ RCT_CSR_REV"."APPLICATION_NO" IS
'Application Number Part of the Unique Identifier of the Application , Unique within a given year .';

COMMENT ON COLUMN "Schema"."SOA_ RCT_CSR_REV"."NOTIFICATION" IS
'Text of the Message Communicated to end user using SMS , Email.';

COMMENT ON COLUMN "Schema"."SOA_ RCT_CSR_REV"."NOTIFICATION_LANG" IS
'Language Code of  the Message Communicated to end user using SMS .
0 for English 
8 for Arabic
';

COMMENT ON COLUMN "Schema"."SOA_ RCT_CSR_REV"."REMARK" IS
'To Communicate message between CSR and End User.';

COMMENT ON COLUMN "Schema"."SOA_ RCT_CSR_REV"."RESULT" IS
'CSR Decision  about accept receiving the Application , Or Rejecting it , Or put it on hold  
1-Accepted
2-Rejected
3-Pending
';

COMMENT ON COLUMN "Schema"."SOA_ RCT_CSR_REV"."REVIEW_DATE" IS
'CSR Review Date';

COMMENT ON COLUMN "Schema"."SOA_ RCT_CSR_REV"."USER_ID" IS
'CSR USER ID as Registered with ICT .';

COMMENT ON COLUMN "Schema"."SOA_ RCT_CSR_REV"."YEAR" IS
'The YEAR when application has been submitted Part of the Unique Identifier of the Application.';

COMMENT ON COLUMN "Schema"."SOA_LBR_ NAT"."NAME_AR" IS
'Arabic Description .';

COMMENT ON COLUMN "Schema"."SOA_LBR_ NAT"."NAME_EN" IS
'English Description .';

COMMENT ON COLUMN "Schema"."SOA_LBR_ NAT"."NATIONALITY_ID" IS
'Code of Nationality Based on MOI Coding .';

COMMENT ON COLUMN "Schema"."SOA_LBR_PROF"."NAME_AR" IS
'Arabic Description .';

COMMENT ON COLUMN "Schema"."SOA_LBR_PROF"."NAME_EN" IS
'English Description .';

COMMENT ON COLUMN "Schema"."SOA_LBR_PROF"."PROFESSION_ID" IS
'Code of Profession Based on MOI Coding .';

COMMENT ON COLUMN "Schema"."SOA_LBR_RCT_APP"."AGENT_EMAIL" IS
'Establishment  Agent EMAIL';

COMMENT ON COLUMN "Schema"."SOA_LBR_RCT_APP"."AGENT_MOBILE" IS
'Establishment  Agent MOBILE number';

COMMENT ON COLUMN "Schema"."SOA_LBR_RCT_APP"."AGENT_QID" IS
'Establishment  Agent QID';

COMMENT ON COLUMN "Schema"."SOA_LBR_RCT_APP"."APPLICATION_DATE" IS
'Date Of Application Submission';

COMMENT ON COLUMN "Schema"."SOA_LBR_RCT_APP"."APPLICATION_NO" IS
'Application Number Part of the Unique Identifier of the Application , Unique within a given year . ';

COMMENT ON COLUMN "Schema"."SOA_LBR_RCT_APP"."ELECTRICITY_NO" IS
'ELECTRICITY Number As defined by KAHRAMA';

COMMENT ON COLUMN "Schema"."SOA_LBR_RCT_APP"."EST_ID" IS
'Establishment ID Unique Identifier as Defined By MOI . ';

COMMENT ON COLUMN "Schema"."SOA_LBR_RCT_APP"."REMARKS" IS
'General Remarks added as a place holder to communicate with End User extra info.';

COMMENT ON COLUMN "Schema"."SOA_LBR_RCT_APP"."STATUS_ID" IS
'Application Status in different stages.';

COMMENT ON COLUMN "Schema"."SOA_LBR_RCT_APP"."YEAR" IS
'The YEAR when application has been submitted Part of the Unique Identifier of the Application .';

COMMENT ON COLUMN "Schema"."SOA_LBR_RCT_STATUS"."STATUS_AR" IS
'STATUS Arabic Description .';

COMMENT ON COLUMN "Schema"."SOA_LBR_RCT_STATUS"."STATUS_EN" IS
'STATUS English Description .';

COMMENT ON COLUMN "Schema"."SOA_LBR_RCT_STATUS"."STATUS_ID" IS
'Code Of The Of Application Valid Status ';

COMMENT ON TABLE "Schema"."SOA_LBR_RCT_STATUS" IS
'10	????? ?? ???? ???	 
20	????? ??? ???????	 
30	????? ????? ???? ?? ????? ?????????  ? ?? ?????? ???? ??????	 
40	????? ????? ?? ????? ?????????	 
50	????? ????? ???? ?? ???? ?????????	?? ??? ?????? ???? ????? ?????? ??????? ??????? ?????
60	????? ????? ?? ???? ?????????	 
210	?? ?????? ???? ?????? ?????	 
220	?? ???  ?????? ?????	 
230	?????? ????? ???? ???? ??????? ?????????	 
';

