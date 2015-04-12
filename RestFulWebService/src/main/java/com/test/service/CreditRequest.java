package com.test.service;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="CreditRequest")
public class CreditRequest {

	private String ssn;
	private String fName;

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	@Override
	public String toString() {
		return "CreditRequest [ssn=" + ssn + ", fName=" + fName + "]";
	}

}
