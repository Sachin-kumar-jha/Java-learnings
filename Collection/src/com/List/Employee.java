package com.List;

import java.util.List;

public class Employee {
  private int eid;
  private String ename;
  private String eaddress;
  private int Salary;
 private List<String> listofBooks;
 private List<String> listofContacts;
 
public Employee(int eid, String ename, String eaddress, int Salary, List<String> listofBooks,
		List<String> listofContacts) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.eaddress = eaddress;
	this.Salary = Salary;
	this.listofBooks = listofBooks;
	this.listofContacts = listofContacts;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
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
public void setSalary(int Salary) {
	this.Salary = Salary;
}
public List<String> getListofBooks() {
	return listofBooks;
}
public void setListofBooks(List<String> listofBooks) {
	this.listofBooks = listofBooks;
}
public List<String> getListofContacts() {
	return listofContacts;
}
public void setListofContacts(List<String> listofContacts) {
	this.listofContacts = listofContacts;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + ", Salary=" + Salary
			+ ", listofBooks=" + listofBooks + ", listofContacts=" + listofContacts + "]";
}

 
}