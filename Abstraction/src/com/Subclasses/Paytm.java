package com.Subclasses;

import com.abstractClass.PaymentGateway;

public class Paytm implements PaymentGateway {

	//Here in child class here we can call constructor of abstract class using super keyword.
//	public Paytm(int salary) {
//		super(salary);
//		// TODO Auto-generated constructor stub
//	}

	@Override
	public void checkBalance() {
		System.out.println("Paytm");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SetBalance() {
		System.out.println("Paytm");
		// TODO Auto-generated method stub
		
	}

}
