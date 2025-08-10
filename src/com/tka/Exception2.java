package com.tka;

public class Exception2 {

	static void findSquareRoot(int number) throws NegativeNumberException{
		if(number>=0) {
		
        double result = Math.sqrt(number);
        System.out.println("Square root of " + number + " is: " + result);
        }
		else {
			 throw new NegativeNumberException("Number is negative: " + number);
			}}

	public static void main(String[] args) {
		int number = 25;
	
		try {
			findSquareRoot(number);
		} catch (NegativeNumberException e) {
			System.out.println("Caught Exception : NegativeNumberException" + e.printmessage());
		}

	}

}
