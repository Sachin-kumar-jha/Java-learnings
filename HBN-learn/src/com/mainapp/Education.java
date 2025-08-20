package com.mainapp;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Education {
	@Column(unique = true,nullable = false)
    private int rollNo;
	@Column(name = "collegeName")
    private String clgName;
	@Column(name = "percentage")
    private int percent;
    
	public Education() {
		// TODO Auto-generated constructor stub
	}

	public Education(int rollNo, String clgName, int percent) {
		super();
		this.rollNo = rollNo;
		this.clgName = clgName;
		this.percent = percent;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getClgName() {
		return clgName;
	}

	public void setClgName(String clgName) {
		this.clgName = clgName;
	}

	public int getPercent() {
		return percent;
	}

	public void setPercent(int percent) {
		this.percent = percent;
	}

	@Override
	public String toString() {
		return "Education [rollNo=" + rollNo + ", clgName=" + clgName + ", percent=" + percent + "]";
	}
	
	

}
