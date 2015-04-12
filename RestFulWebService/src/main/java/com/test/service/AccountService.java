package com.test.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Produces({"application/xml","application/json"})
public class AccountService {
	
	@GET
	@Path("/account/credit/{ssn}/{fName}")
	@Consumes({"application/xml","application/json"})
	public Response getCreditReport(@PathParam("ssn") String ssn,@PathParam("fName")String fName){//(CreditRequest request){
		//TODO: Intigrate with DAO
		CreditResponse creditResponse = buildResponse(ssn,fName);
		return Response.ok(creditResponse,MediaType.APPLICATION_JSON).build();
	}
	
	private CreditResponse buildResponse(String ssn,String fName){
		CreditResponse creditResponse = new CreditResponse();
		creditResponse.setSsn(ssn);
		creditResponse.setfName(fName);
		creditResponse.setNoCards(3);
		creditResponse.setScore("776");
		List<Address>  addressList = new ArrayList<Address>();
//		addressList.add(new Address("Plymouth", "25248", "MN"));
//		addressList.add(new Address("Xenium", "23132", "AZ"));
//		addressList.add(new Address("Test3454", "90123", "NJ"));
		creditResponse.setAddressList(addressList);
		return creditResponse;
	}
	
}
