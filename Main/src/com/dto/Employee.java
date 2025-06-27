package com.dto;

public class Employee {

	 private int age;
	 private static int companyId=1234;
	 private final int eid;
	 private String name;
	 private int salary;
	 private String address;
	 
	public Employee(int age, int eid, String name, int salary, String address) {
		super();
		this.age = age;
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public int getEid() {
		return eid;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public String getAddress() {
		return address;
	}
	
	
	 
}
