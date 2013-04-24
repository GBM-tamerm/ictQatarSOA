package qa.gov.mol.lr.process.util;

import java.text.DateFormat;
import java.util.Date;

public class CESData {
	
	private String errorCode;
	private String userMessage;
	private Object detailMessage;
	private String failedMessage;
	private Date timeStamp;
	private String networkLocation;
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getUserMessage() {
		return userMessage;
	}
	public void setUserMessage(String userMessage) {
		this.userMessage = userMessage;
	}
	public Object getDetailMessage() {
		return detailMessage;
	}
	public void setDetailMessage(Object detailMessage) {
		this.detailMessage = detailMessage;
	}
	public String getFailedMessage() {
		return failedMessage;
	}
	public void setFailedMessage(String failedMessage) {
		this.failedMessage = failedMessage;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getNetworkLocation() {
		return networkLocation;
	}
	public void setNetworkLocation(String networkLocation) {
		this.networkLocation = networkLocation;
	}
	@Override
	public String toString() {
		StringBuffer logText= new StringBuffer();
		logText.append("CommonErrorStrcuture: \n\r");
		logText.append("Time stamp = "+ DateFormat.getInstance().format(timeStamp)+"\n\r") ;
		logText.append("Error Code = "+ errorCode+"\n\r") ;
		logText.append("User Message = "+ userMessage+"\n\r") ;
		logText.append("Detailed Message = "+ detailMessage+"\n\r") ;
		logText.append("Failed Message = "+ failedMessage+"\n\r") ;
		logText.append("Network Location = "+networkLocation) ;
		return logText.toString();
	}
	

}
