package com.test.service;

import java.util.List;
import java.util.Map;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.ext.Provider;

import org.apache.cxf.helpers.CastUtils;
import org.apache.cxf.jaxrs.ext.RequestHandler;
import org.apache.cxf.jaxrs.model.ClassResourceInfo;
import org.apache.cxf.message.Message;

@Provider
public class RequestInterceptors implements RequestHandler{

	public Response handleRequest(Message message, ClassResourceInfo classResourceInfo) {
		 Map<String, List<String>> headers = CastUtils.cast((Map)message.get(Message.PROTOCOL_HEADERS));
		 String securityData = (String)message.get(Message.QUERY_STRING);
		 //TODO:Validation Request to Avoid SQL Injections/XSS Injections/Security.
		 Error error = new Error();
		 error.setErrorCode("9999");
		 error.setErrorMessage("Security Validation is Failed !!!!");
		 ResponseBuilder rb = Response.status(Response.Status.INTERNAL_SERVER_ERROR);
		 rb.type(MediaType.APPLICATION_JSON);
		 rb.entity(error);
		return null;//rb.build();
	}

}
