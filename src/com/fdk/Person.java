package com.fdk;

public class Person {
public static void main(String[] args) {
	String s = "Bhagyashri@2003";
	s.substring(0, 10);
	s.substring(10, 11);
	s.substring(11,15);
	System.out.println(s.substring(0, 10) + " is Characters");
	System.out.println(s.substring(10,11) + " is Special Symbol");
	System.out.println(s.substring(11,15) + " is Integer");
}
}
