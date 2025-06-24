package com.dao;

import com.dto.EmployeeDto;

public class MyDao {

	private EmployeeDto arr[]=new EmployeeDto[10];
	
public String insert(EmployeeDto data) {
	
	arr[0]=data;
	return "Data Inserted Successfully";
}

public EmployeeDto[] ReadData() {
	return arr;
}
}
