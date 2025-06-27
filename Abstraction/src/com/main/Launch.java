package com.main;

import com.abstractClass.PaymentGateway;
import com.factory.ObjectFactory;

public class Launch {

	public static void main(String[] args) {
	 PaymentGateway pt= ObjectFactory.get("Gpay");
	 pt.checkBalance();
	 pt.SetBalance();

	}

}
