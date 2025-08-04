package com.abstraction;

public class Son implements Father {
	
	public void bike(int amount) {
		
		if(amount > 10000) {
			System.out.println("Price of bike is  " +  amount + " Bike is expensive");
		}else {
			System.out.println("Price is low .Bike is not expensive" );
			
		}
	}
	public static void main(String[] args) {
		Son s = new Son();
		s.bike(20000);
		s.bike(9500);
	}

}
