package com.assignment;

import org.springframework.stereotype.Service;

@Service
public class Substract extends Calculator {

	@Override
	public int evaluate(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

}
