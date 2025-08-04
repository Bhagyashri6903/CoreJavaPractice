package com.polymorphism;

public class Calculator {
	
	public void add(int a, int b) {
		System.out.println("Sum of two integers: " + (a + b));
	
	}
	
	public void add(double a,double b) {
		System.out.println("Sum of two doubles: " + (a + b));
		
	}
	 public void add(int a,int b,int c) {
		 System.out.println("Sum of three integers: " + (a + b + c));
	 }
	 
	 public static void main(String[] args)
	 {
		 Calculator c  = new Calculator();
		 c.add(4,4);
		 c.add(56.4,44.6);
		 c.add(3,6,9);
				 
	 }
	

}
