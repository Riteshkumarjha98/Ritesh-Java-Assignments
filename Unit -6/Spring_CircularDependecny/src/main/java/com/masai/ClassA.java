package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassA {
	
 private ClassB objB;

 public ClassB getObjB() {
  return objB;
 }
 @Autowired
 public void setObjB(ClassB objB) {
  this.objB = objB;
 }
 
 public void displayMessage(){
  System.out.println("That the message");
 }
}