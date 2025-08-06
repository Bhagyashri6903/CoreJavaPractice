package com.jbk;

import java.util.Scanner;

public class Person {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int a = sc.nextInt();

		System.out.print("Enter the second number: ");
		int b = sc.nextInt();

		int sum = a + b;
		System.out.println("Sum of the numbers: " + sum);

		sc.close(); 
	}
}
