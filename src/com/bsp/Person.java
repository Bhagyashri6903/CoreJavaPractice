package com.bsp;

public class Person {
	
	public static void main(String[] args) {
		String a = "Divyashri";
		String b = "";
		
		for(int i=a.length()-1;i>=0;i--) {
			b += a.charAt(i);
		}
		System.out.println("Original String : " + a);
		System.out.println("Now the reversed string is : " + b);
		
	}

}
