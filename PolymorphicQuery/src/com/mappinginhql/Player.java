package com.mappinginhql;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="player")
public class Player {

@Id
@Column(name="pid")
private int pid;
@Column(name="pname")
private String pname;

//Here we don't using embeded here we use mapping using one to one

/*If we want if we create player table and pass adhaar object
 * then we want to create aadhar table also and changes reflect then here 
 * we wil use OneToOne with property OneToOne(cascade=CascadeType.ALL)*/
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "adhaarno")
private Adhar adhar;

public Player() {
	super();
}

public Player(int pid, String pname, Adhar adhar) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.adhar = adhar;
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

public Adhar getAdhar() {
	return adhar;
}

public void setAdhar(Adhar adhar) {
	this.adhar = adhar;
}

@Override
public String toString() {
	return "Player [pid=" + pid + ", pname=" + pname + ", adhar=" + adhar + "]";
}


}
