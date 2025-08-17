package com.bsp;

import java.util.*;

public class College {
	
	public static void remove(char[] arr) {
		Set<Character> uniqueChars =new LinkedHashSet<>();
		for(char c : arr) 
			uniqueChars.add(c);
			System.out.println("The array after removing duplicates is : " + uniqueChars);
			
		}
	public static void main(String[] args) {
		char[] arr= {'a','c','d','c','a','b','d'};
		remove(arr);
		
		
		
	}

}
