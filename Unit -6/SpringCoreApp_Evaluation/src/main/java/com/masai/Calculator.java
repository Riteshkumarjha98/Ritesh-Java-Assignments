package com.masai;

import org.springframework.stereotype.Service;

@Service
public abstract class Calculator {

   public abstract int evaluate(int a , int b, double r);
   
}
