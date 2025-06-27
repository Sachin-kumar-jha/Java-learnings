package com.exception;
//if we want to make a exception class then the class is
//is the part of exception hierarchy
@SuppressWarnings("serial")
public class CreateOwnException extends Exception{ 
	

	public CreateOwnException(String msg){
		super(msg);
	}

	/**
	 This is for Checked Exception if we want to 
	unchacked exception then we extends RuntimeException
	like:
	public class CreateOwnException extends RuntimeException
	 for unchecked exception
	 * 
	 */
	

}
