package com.evaluation.exception;

public class AddressException extends RuntimeException {
	
	public AddressException() {
		
	}
	
   public AddressException( String message) {
		super(message);
	}

}