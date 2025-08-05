package com.ifelse;

public class LargestNumber {
	public static void main(String[] args) {

		int a = 30;
		int b = 46;

		if (a > b) {
			System.out.println("The largest number is " + a);
		} else if (b > a) {
			System.out.println("The largest number is " + b);
		} else {
			System.out.println("Both numbers are equal.");
		}
	}
}
