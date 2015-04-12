package com.test.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class GetCreditReportRequest {
	
	private String ssn;
	
	public GetCreditReportRequest() {
		super();
	}

	public GetCreditReportRequest(String ssn, String dob, String fname,
			String lname) {
		super();
		this.ssn = ssn;
		this.dob = dob;
		this.fname = fname;
		this.lname = lname;
	}

	private String dob;
	
	private String fname;
	
	private String lname;

	@Override
	public String toString() {
		return "GetCreditReportRequest [ssn=" + ssn + ", dob=" + dob
				+ ", fname=" + fname + ", lname=" + lname + "]";
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
	

}
