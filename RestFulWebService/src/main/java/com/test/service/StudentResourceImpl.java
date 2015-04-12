package com.test.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;

import org.springframework.stereotype.Component;

import com.test.dto.Student;

//@Component("stuService")
public class StudentResourceImpl  implements IStudentResource{

	public Student getStudent(int sno, String sname) {
		//TODO: JDBC Logic
		Student student = new Student(sno, sname, 4500f, "MCA");
		return student;
	}

	public Student saveStudent(Student student) {
		//TODO: JDBC Logic
		return student;
	}
	
	
	public Response getCreditReport( String ssn,String fName){//(CreditRequest request){
		//TODO: Intigrate with DAO
	//	try{
		CreditResponse creditResponse = buildResponse(ssn,fName);
		String s = null;
		s.toUpperCase();
		return Response.ok(creditResponse,MediaType.APPLICATION_JSON).build();
		//}/*catch(Exception ex){
		//ResponseBuilder rb = Response.status(Response.Status.INTERNAL_SERVER_ERROR);
		//rb.type(MediaType.APPLICATION_JSON);
		//rb.entity(error);
		//return rb.build();
		//}//*/
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
