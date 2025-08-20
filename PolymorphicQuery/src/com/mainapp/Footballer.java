package com.mainapp;

import javax.persistence.Entity;

@Entity
public class Footballer extends Player{
 private int fgoals;
 private String ftype;

 public Footballer() {
	 
 };
public Footballer(int pid, String pname, int fgoals, String ftype) {
	super(pid, pname);
	this.fgoals = fgoals;
	this.ftype = ftype;
}
public int getFgoals() {
	return fgoals;
}
public void setFgoals(int fgoals) {
	this.fgoals = fgoals;
}
public String getFtype() {
	return ftype;
}
public void setFtype(String ftype) {
	this.ftype = ftype;
}
 
 
 
}
