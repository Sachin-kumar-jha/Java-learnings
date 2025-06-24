package com.dto;

public class EmployeeDto {
       private int eid;
       private String eName;
       private String eaddress;
       private int Salary;
       
	public EmployeeDto(int eid, String eName, String eaddress, int salary) {
		this.eid = eid;
		this.eName = eName;
		this.eaddress = eaddress;
		Salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getEaddress() {
		return eaddress;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}
       
       
}
