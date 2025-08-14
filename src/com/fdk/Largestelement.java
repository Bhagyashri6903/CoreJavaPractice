package com.fdk;

public class Largestelement {

	public static void main(String[] args) {
		int[] arr = { 50,4,20,60,90 };

		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println("Largest element in the array is: " + max);
	}
}
