package com.cutCopyPaste;

import java.io.Serializable;

public class Demo implements Serializable {
    private int eid;
    private String ename;
    private String eaddress;
    private int salary;
	public Demo(int eid, String ename, String eaddress, int salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eaddress = eaddress;
		this.salary = salary;
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
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Demo [eid=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + ", salary=" + salary + "]";
	}
    
}
