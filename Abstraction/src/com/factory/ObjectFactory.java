package com.factory;

import com.Subclasses.Gpay;
import com.Subclasses.Paytm;
import com.Subclasses.Ppay;
import com.abstractClass.PaymentGateway;

public class ObjectFactory {

	public static PaymentGateway get(String s) {
		
		if(s.equalsIgnoreCase("Ppay")) {
			return new Ppay();
		}else if(s.equalsIgnoreCase("Gpay")) {
			return new Gpay();
		}else if(s.equalsIgnoreCase("Paytm")) {
			return new Paytm();
		}else {
			return null;
		}
		
	}
}
