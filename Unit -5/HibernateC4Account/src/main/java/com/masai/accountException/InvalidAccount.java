package com.masai.accountException;

import javax.security.auth.login.AccountException;

public class InvalidAccount extends AccountException{
	
	public InvalidAccount() {
		// TODO Auto-generated constructor stub
	}
	
	public InvalidAccount(String msg) {
	  super(msg);
	}

}
