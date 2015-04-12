package com.test.service;

import com.test.dto.GetCreditReportRequest;

public class CreditReportImpl implements CreditReport {
	
	public Integer getCreditScore(GetCreditReportRequest request){
		System.out.println(" Request  :" + request);
		//B.L
		return 780;
	}

}
