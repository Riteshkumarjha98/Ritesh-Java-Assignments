package com.evaluation.exception;

public class EmployeesException extends RuntimeException {
	public EmployeesException() {
		
	}
	
   public EmployeesException( String message) {
		super(message);
	}

}
