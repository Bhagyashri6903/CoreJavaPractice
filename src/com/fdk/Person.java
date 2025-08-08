package com.fdk;

public class Person {

	public static int returnValueFunction(int n) {
		return n * 2;
	}

	public static void main(String[] args) {
		int result = returnValueFunction(2);
		System.out.println(result);
	}

}
