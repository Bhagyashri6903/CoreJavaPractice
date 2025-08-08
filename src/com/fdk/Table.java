package com.fdk;

public class Table {

	public static void printTable(int number) {
		System.out.println("Multiplication table for: " + number);
		for (int i = 1; i <= 10; i++) {
			System.out.println(number + " x " + i + " = " + (number * i));
		}
	}

	public static void main(String[] args) {
		Table.printTable(6);
	}
}
