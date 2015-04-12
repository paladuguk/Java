package com.test.service;

import javax.jws.WebService;

import com.test.dto.GetCreditReportRequest;

@WebService
public interface CreditReport {
	
	public Integer getCreditScore(GetCreditReportRequest request);

}
