package com.mainapp;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="mycomplexemployee")
public class ComlexEmployeeDatainsertion {
	@Id
	 @Column(name="id")
	 private int eid;
	 
	 @Column(name="name" ,length = 30)  // Here also we give other properties
	 private String ename;
	 
	 @Column(name="address",length = 500)
	 private String eaddress;
	 
	 @Column(name="salary")
	 private int esalary;
	 
	 @Embedded
	 private Account account;
	 @Embedded                //This means it creates column according to account class not only one column account
	 private Education education;
	 
	public ComlexEmployeeDatainsertion(int eid, String ename, String eaddress, int esalary, Account account,
			Education education) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eaddress = eaddress;
		this.esalary = esalary;
		this.account = account;
		this.education = education;
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

	public int getEsalary() {
		return esalary;
	}

	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Education getEducation() {
		return education;
	}

	public void setEducation(Education education) {
		this.education = education;
	}
	 
	

}
