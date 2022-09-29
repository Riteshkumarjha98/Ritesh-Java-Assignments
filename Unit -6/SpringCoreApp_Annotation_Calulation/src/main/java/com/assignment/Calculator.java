package com.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class Calculator {
   

   public abstract int evaluate(int a , int b);
   
}
