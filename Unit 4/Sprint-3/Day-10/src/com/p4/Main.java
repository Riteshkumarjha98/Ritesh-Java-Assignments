package com.p4;

public class Main {
 public static void main (String[] args) {
	 Area area= new Area();
	 int RectangleArea = area.rectangleArea(10, 5);
	 int SquareArea = area.squareArea(20);
	 int CircleArea=area.circleArea(7);
	 
	 
	 System.out.println(RectangleArea);
	 System.out.println(SquareArea);
	 System.out.println(CircleArea);
	
 }
	
	
}
