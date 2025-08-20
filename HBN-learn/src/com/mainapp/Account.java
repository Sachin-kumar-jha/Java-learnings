package com.mainapp;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Account {
	@Column(unique = true,nullable = false)
	private int accno;
	@Column(name="Bankname")
	private String bankName;
	@Column(name="Amount")
	private int amount;
	
	public Account() {
		System.out.println("&&&&&&&&&&");
	}
	public Account(int accno, String bankName, int amount) {
		super();
		this.accno = accno;
		this.bankName = bankName;
		this.amount = amount;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Account [accno=" + accno + ", bankName=" + bankName + ", amount=" + amount + "]";
	}
	
	

}
