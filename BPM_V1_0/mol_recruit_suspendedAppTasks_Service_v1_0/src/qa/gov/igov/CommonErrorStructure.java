/**
 * CommonErrorStructure.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.igov;

public class CommonErrorStructure  extends java.lang.Exception  {
    private java.lang.String errorCode;
    private java.lang.String userMessage;
    private java.lang.Object detailMessage;
    private java.lang.String failedMessage;
    private java.util.Calendar timeStamp;
    private java.lang.String networkLocation;

    public CommonErrorStructure(
           java.lang.String errorCode,
           java.lang.String userMessage,
           java.lang.Object detailMessage,
           java.lang.String failedMessage,
           java.util.Calendar timeStamp,
           java.lang.String networkLocation) {
        this.errorCode = errorCode;
        this.userMessage = userMessage;
        this.detailMessage = detailMessage;
        this.failedMessage = failedMessage;
        this.timeStamp = timeStamp;
        this.networkLocation = networkLocation;
    }

    public java.lang.String getErrorCode() {
        return errorCode;
    }

    public java.lang.String getUserMessage() {
        return userMessage;
    }

    public java.lang.Object getDetailMessage() {
        return detailMessage;
    }

    public java.lang.String getFailedMessage() {
        return failedMessage;
    }

    public java.util.Calendar getTimeStamp() {
        return timeStamp;
    }

    public java.lang.String getNetworkLocation() {
        return networkLocation;
    }

}
