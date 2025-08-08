package com.fdk;

public class Evenodd {

	public static void evenodd(int a) {
		if (a % 2 == 0) {
			System.out.println("Even Number");

		} else {
			System.out.println("Odd Number");
		}
	}

	public static void main(String[] args) {

		Evenodd.evenodd(65);
	}

}
