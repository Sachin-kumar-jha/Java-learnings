package com.versioning;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;
@Entity
@Table(name="myversionexemployee")
public class Employee{
	@Id
	 @Column(name="id")
	 private int eid;
	 
	 @Column(name="name" ,length = 30)  // Here also we give other properties
	 private String ename;
	 
	 @Column(name="address",length = 500)
	 private String eaddress;
	 
	 @Column(name="salary")
	 private int esalary;
	 
	 
	 @Version
	 private int version;

	 public Employee() {
		 System.out.println("HIIIIIIIIIIIIIIIIII");
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


	public int getVersion() {
		return version;
	}


	public void setVersion(int version) {
		this.version = version;
	}
	 
	 
	
	 
	

}
