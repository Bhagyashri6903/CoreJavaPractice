package com.fdk;

import java.util.Random;
import java.util.TreeSet;

public class Order {

	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<>();
		Random random = new Random();

		for (int i = 0; i < 10; i++) {
			numbers.add(random.nextInt(100));
		}

		System.out.println("Numbers in ascending order:");
		for (int number : numbers) {
			System.out.println(number);
		}

	}

}
