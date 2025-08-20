/**
 * 
 */
package com.mainapp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * Here if we want to read using hibernate here we need to create a non parameterized  constructor
 * 
 */
@Entity
@Table(name="myemployee")
public class Employee {
 @Id
 @Column(name="id")
 private int eid;
 
 @Column(name="name" ,length = 30)  // Here also we give other properties
 private String ename;
 
 @Column(name="address",length = 500)
 private String eaddress;
 
 @Column(name="salary")
 private int esalary;
 
 
 public Employee(){
	 System.out.println("###########################");
 }
 
public String getEaddress() {
	return eaddress;
}



public void setEaddress(String eaddress) {
	 System.out.println("***************");
	this.eaddress = eaddress;
}



public Employee(int eid, String ename, String eaddress, int esalary) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.eaddress = eaddress;
	this.esalary = esalary;
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



public int getEsalary() {
	return esalary;
}



public void setEsalary(int esalary) {
	this.esalary = esalary;
}

@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + ", esalary=" + esalary + "]";
}






}
