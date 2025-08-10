package com.tka;

public class Number {

	public static void divide(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("Division by zero is not allowed.");
		} else {
			System.out.println("Result: " + (a / b));
		}
	}

	public static void main(String[] args) {
		try {
			divide(10, 0);
		} catch (ArithmeticException e) {
			System.out.println("Caught Exception: " + e.getMessage());
		}

	}
}
