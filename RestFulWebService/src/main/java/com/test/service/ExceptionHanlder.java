package com.test.service;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
@Produces(MediaType.APPLICATION_JSON)
public class ExceptionHanlder implements ExceptionMapper<Exception> {

	public Response toResponse(Exception exception) {
		Error error = new Error();
		error.setErrorCode("9999");
		ResponseBuilder rb = Response.status(Response.Status.INTERNAL_SERVER_ERROR);
		rb.type(MediaType.APPLICATION_JSON);
		rb.entity(error);
		return rb.build();
	}

}
