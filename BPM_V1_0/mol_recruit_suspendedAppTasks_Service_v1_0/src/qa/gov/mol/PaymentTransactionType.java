/**
 * PaymentTransactionType.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.mol;

public class PaymentTransactionType  {
    private java.lang.Double amount;
    private java.lang.String transactionID;
    private java.util.Calendar transactionDate;
    private java.lang.String receiptNumber;
    private java.lang.String transactionStatus;

    public PaymentTransactionType() {
    }

    public java.lang.Double getAmount() {
        return amount;
    }

    public void setAmount(java.lang.Double amount) {
        this.amount = amount;
    }

    public java.lang.String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(java.lang.String transactionID) {
        this.transactionID = transactionID;
    }

    public java.util.Calendar getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(java.util.Calendar transactionDate) {
        this.transactionDate = transactionDate;
    }

    public java.lang.String getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(java.lang.String receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    public java.lang.String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(java.lang.String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

}
