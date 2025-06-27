package com.dao;

import com.dto.Employee;

public class CRUDImpl implements CRUD{
	
private static Employee emp[];

static {
	emp = new Employee[10];
}
 
	@Override
	public String insert(Employee employee) {
		emp[0]=employee;
		
		return "Success";
	}

	@Override
	public Employee[] read() {
		// TODO Auto-generated method stub
		return emp;
	}

}
