package com.evaluation.exception;

public class EmployeeException extends RuntimeException {
	public EmployeeException() {
		
	}
	
   public EmployeeException( String message) {
		super(message);
	}

}
