/**
 * ReviewResultType.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.mol;

public class ReviewResultType  {
    private java.lang.String remarks;
    private java.lang.String notification;
    private java.util.Calendar timeStamp;
    private qa.gov.igov.Language notificationLang;
    private qa.gov.igov.UserIdType userID;
    private qa.gov.mol.ApplicationReviewResultType result;

    public ReviewResultType() {
    }

    public java.lang.String getRemarks() {
        return remarks;
    }

    public void setRemarks(java.lang.String remarks) {
        this.remarks = remarks;
    }

    public java.lang.String getNotification() {
        return notification;
    }

    public void setNotification(java.lang.String notification) {
        this.notification = notification;
    }

    public java.util.Calendar getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(java.util.Calendar timeStamp) {
        this.timeStamp = timeStamp;
    }

    public qa.gov.igov.Language getNotificationLang() {
        return notificationLang;
    }

    public void setNotificationLang(qa.gov.igov.Language notificationLang) {
        this.notificationLang = notificationLang;
    }

    public qa.gov.igov.UserIdType getUserID() {
        return userID;
    }

    public void setUserID(qa.gov.igov.UserIdType userID) {
        this.userID = userID;
    }

    public qa.gov.mol.ApplicationReviewResultType getResult() {
        return result;
    }

    public void setResult(qa.gov.mol.ApplicationReviewResultType result) {
        this.result = result;
    }

}
