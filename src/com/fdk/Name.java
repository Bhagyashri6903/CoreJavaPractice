package com.fdk;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Name {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Bhagyashri");
		names.add("Divyashri");
		names.add("Bhagyashri");
		names.add("Bhumi");
		names.add("Divyashri");

		Set<String> uniqueNames = new HashSet<>(names);

		System.out.println("Original List:");
		for (String name : names) {
			System.out.println(name);
		}

		System.out.println("Converted Set:");
		for (String name : uniqueNames) {
			System.out.println(name);

		}
	}

}
