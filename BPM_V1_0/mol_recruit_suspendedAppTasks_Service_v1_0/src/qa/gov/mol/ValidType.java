/**
 * ValidType.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.mol;

public class ValidType  {
    private qa.gov.moi.ProfessionDetailsType[] statistics;
    private qa.com.kahramaa.BillSummaryType electricityInfo;
    private java.lang.String statisticsNote;
    private java.lang.String electricityNote;

    public ValidType() {
    }

    public qa.gov.moi.ProfessionDetailsType[] getStatistics() {
        return statistics;
    }

    public void setStatistics(qa.gov.moi.ProfessionDetailsType[] statistics) {
        this.statistics = statistics;
    }

    public qa.com.kahramaa.BillSummaryType getElectricityInfo() {
        return electricityInfo;
    }

    public void setElectricityInfo(qa.com.kahramaa.BillSummaryType electricityInfo) {
        this.electricityInfo = electricityInfo;
    }

    public java.lang.String getStatisticsNote() {
        return statisticsNote;
    }

    public void setStatisticsNote(java.lang.String statisticsNote) {
        this.statisticsNote = statisticsNote;
    }

    public java.lang.String getElectricityNote() {
        return electricityNote;
    }

    public void setElectricityNote(java.lang.String electricityNote) {
        this.electricityNote = electricityNote;
    }

}
