package com.test.service;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Error {
	
	private String errorCode;
	private String errorMessage;
	
	public Error() {
		super();
	}
	public Error(String errorCode,String errorMessage) {
		super();
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	

}
