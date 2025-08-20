package com.mappinginhql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="adhar")
public class Adhar{
	@Id
	@Column(name = "adhaarno")  //Here if we don't provide column name by default
	private int adharNo;       //when we use camelcase it add underscore
	@Column(name="Adharname")
	private String adharName;

	public int getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(int adharNo) {
		this.adharNo = adharNo;
	}

	public String getAdharName() {
		return adharName;
	}

	public void setAdharName(String adharName) {
		this.adharName = adharName;
	}

	public Adhar(int adharNo, String adharName) {
		super();
		this.adharNo = adharNo;
		this.adharName = adharName;
	}

	public Adhar() {
		super();
	}

	@Override
	public String toString() {
		return "Adhar [adharNo=" + adharNo + ", adharName=" + adharName + "]";
	}
	                           



}
