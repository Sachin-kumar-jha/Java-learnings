package com.abstractClass;

//public abstract class PaymentGateway {
//
//	public void show() {
//		System.out.println("Hello");
//	}
//	
//	public abstract void checkBalance();
//	public abstract void SetBalance();
//}

//Here using abstract class we get 70% abstraction partial abstraction. We get 100% abstraction
//interface implementation
//This is the code for 100 % abstraction using interface.
public interface PaymentGateway {
	
	public abstract void checkBalance();
	public abstract void SetBalance();
}
