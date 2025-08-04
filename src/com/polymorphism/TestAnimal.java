package com.polymorphism;

public class TestAnimal {

	
	    public static void main(String[] args) {
	        Animal a; // Reference of superclass

	        a = new Dog(); // Object of subclass Dog
	        a.sound();     // Calls Dog's sound()

	        a = new Cat(); // Object of subclass Cat
	        a.sound();     // Calls Cat's sound()
	    }
}
