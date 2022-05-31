package com.p1;

   public class TajHotel implements Hotel{

	
	public void welcomeDrink(){
   System.out.println("Welcome Drink from the TajHotel");
		
		}

     @Override
	public void chickenBiryani() {
		System.out.println("ChickenBiryani From The TajHotel");
		
	}
	@Override
	public void masalaDosa() {
		System.out.println("MasslaDosa From the TajHotel");
		
	}

}
