package com.test.service;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CreditResponse {

	private String ssn;
	private String fName;
	private String score;
	private int noCards;
	private List<Address> addressList;
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
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public int getNoCards() {
		return noCards;
	}
	public void setNoCards(int noCards) {
		this.noCards = noCards;
	}
	public List<Address> getAddressList() {
		return addressList;
	}
	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}
	@Override
	public String toString() {
		return "CreditResponse [ssn=" + ssn + ", fName=" + fName + ", score="
				+ score + ", noCards=" + noCards + ", addressList="
				+ addressList + "]";
	}
	
}
