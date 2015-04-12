package com.test.service;

public class EmployeeServiceImpl implements EmployeeService {

	public GetEmployeeResponse getEmployee(GetEmployeeRequest parameters) {
		System.out.println(parameters);
		GetEmployeeResponse response = new GetEmployeeResponse();
		Employee employee = new Employee();
		employee.setEno(parameters.getEno());
		employee.setEname(parameters.getEname());
		employee.setSalary("4545");
		
		Address address = new Address();
		address.setState("MN");
		address.setZipcode("45345");
		address.setCity("Plymouth");
		
		employee.setAddress(address);
		response.setEmployee(employee);
		return response;
	}

}
