package com.p3;

class Animal{
   String name;
   Animal(String name) { // constructor
      this.name = name;
   }
   public void move() {
      System.out.println("Animals can move"); // commin targetting
   }
   public void show() {
      System.out.println(name); // common targetting 
   }
}




class Dog extends Animal{
   Dog() {  // zero argument contrt
      //Using this to call current class constructor
      this("Test");
   }
   Dog(String name) { // String contructor
      //Using super to invoke parent constructor
      super(name);
   }
   public void move() {
      // it's  invokes the super class method
      super.move();
      System.out.println("Dogs can walk and run");
   }
}
public class Tester {
   public static void main(String args[]) {
      // Animal reference but Dog object
      Animal b = new Dog("Tiger");
      b.show();
      // runs the method in Dog class
      b.move();
   }
}
