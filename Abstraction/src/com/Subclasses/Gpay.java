package com.Subclasses;

import com.abstractClass.PaymentGateway;

public class Gpay implements PaymentGateway{

	@Override
	public void checkBalance() {
		System.out.println("Gpay");
		
	}

	@Override
	public void SetBalance() {
		System.out.println("Gpay");
		// TODO Auto-generated method stub
		
	}

}
