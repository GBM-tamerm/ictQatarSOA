/**
 * CommonErrorStructure_DeserProxy.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.igov;

public class CommonErrorStructure_DeserProxy  extends java.lang.Exception  {
    private java.lang.String errorCode;
    private java.lang.String userMessage;
    private java.lang.Object detailMessage;
    private java.lang.String failedMessage;
    private java.util.Calendar timeStamp;
    private java.lang.String networkLocation;

    public CommonErrorStructure_DeserProxy() {
    }

    public java.lang.String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(java.lang.String errorCode) {
        this.errorCode = errorCode;
    }

    public java.lang.String getUserMessage() {
        return userMessage;
    }

    public void setUserMessage(java.lang.String userMessage) {
        this.userMessage = userMessage;
    }

    public java.lang.Object getDetailMessage() {
        return detailMessage;
    }

    public void setDetailMessage(java.lang.Object detailMessage) {
        this.detailMessage = detailMessage;
    }

    public java.lang.String getFailedMessage() {
        return failedMessage;
    }

    public void setFailedMessage(java.lang.String failedMessage) {
        this.failedMessage = failedMessage;
    }

    public java.util.Calendar getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(java.util.Calendar timeStamp) {
        this.timeStamp = timeStamp;
    }

    public java.lang.String getNetworkLocation() {
        return networkLocation;
    }

    public void setNetworkLocation(java.lang.String networkLocation) {
        this.networkLocation = networkLocation;
    }

    public java.lang.Object convert() {
      qa.gov.igov.CommonErrorStructure _e;
      _e = new qa.gov.igov.CommonErrorStructure(
        getErrorCode(),
        getUserMessage(),
        getDetailMessage(),
        getFailedMessage(),
        getTimeStamp(),
        getNetworkLocation());
      return _e;
    }
}
