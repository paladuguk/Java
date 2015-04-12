package com.test.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

import com.test.dto.Student;


@Produces({"application/xml","application/json"})
//@Path("/service/")
public interface IStudentResource {
	
	@GET
	@Path("/student/{sno}/{sname}")
	Student getStudent(@PathParam("sno") int sno, @PathParam("sname") String sname);
	
	@POST
	@Path("/student")
	@Consumes({"application/xml","application/json"})
	Student saveStudent(Student student);
	
	@GET
	@Path("/creditReport/{ssn}/{fName}")
	@Consumes({"application/xml","application/json"})
	public Response getCreditReport(@PathParam("ssn") String ssn,@PathParam("fName")String fName);
}
