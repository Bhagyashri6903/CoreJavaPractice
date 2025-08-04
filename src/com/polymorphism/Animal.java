package com.polymorphism;

public class Animal {
	
	
	    // Superclass method
	    public void sound() {
	        System.out.println("Animal makes a sound");
	    }
	}

	class Dog extends Animal {
	    // Overriding the sound() method
	    @Override
	    public void sound() {
	        System.out.println("Bark");
	    }
	}

	class Cat extends Animal {
	    // Overriding the sound() method
	    @Override
	    public void sound() {
	        System.out.println("Meow");
	    }
	}

	


