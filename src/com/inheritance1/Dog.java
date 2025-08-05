package com.inheritance1;

public class Dog {

	void makeSound() {
		System.out.println("Dog barks");
	}

	public static void main(String[] args) {
		Dog d = new Dog();
		d.makeSound(); // Should print: Dog barks
	}
}
