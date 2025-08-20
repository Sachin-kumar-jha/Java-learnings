package com.mainapp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;



//@Inheritance (strategy = InheritanceType.JOINED)
/*
 * Here by default inheritance is SINGLE_TABLE
 * If we want to prevent the table creation of his  superclass 
 * then remove Entity annotation and by using MappedSuperClass
 * and use inheritance strategy Table_per_class
 * we have done this.
 * **/
@Entity
//@MappedSuperclass
//@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
//@Inheritance (strategy = InheritanceType.TABLE_PER_CLASS) //created only child class tables
@Inheritance(strategy =InheritanceType.JOINED) //For reading purpose code.
public class Player {
    @Id
	private int pid;
	private String pname;
	public Player(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Player() {
       System.out.println("Player zero parameterized");
	}
	
	
}
