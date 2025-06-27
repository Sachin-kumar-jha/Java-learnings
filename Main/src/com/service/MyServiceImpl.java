package com.service;
import com.dao.CRUD;
import com.dao.CRUDImpl;
import com.dto.Employee;
public class MyServiceImpl implements MyService{

	private CRUD crud;
	
	
	
	public MyServiceImpl() {
		crud=new CRUDImpl();
	}

	@Override
	public String insert(Employee emp) {
		return crud.insert(emp);
		
	}

	@Override
	public Employee[] read() {

		return crud.read();
	}

}
