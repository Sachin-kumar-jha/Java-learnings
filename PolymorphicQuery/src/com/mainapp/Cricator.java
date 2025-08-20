package com.mainapp;

import javax.persistence.Entity;

@Entity
public class Cricator extends Player{
  
	private int  crun;
	private String ctype;
	public Cricator() {
		
	}
	public Cricator(int pid, String pname, int crun, String ctype) {
		super(pid, pname);
		this.crun = crun;
		this.ctype = ctype;
	}
	public int getCrun() {
		return crun;
	}
	public void setCrun(int crun) {
		this.crun = crun;
	}
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	
	
}
