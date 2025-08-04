package com.polymorphism;

public class Shape {
	
	
	    
	    public void draw() {
	        System.out.println("Different shapes");
	    }
	}

	class Circle extends Shape {
	    
	    @Override
	    public void draw() {
	        System.out.println("It has radius");
	    }
	}

	class Rectangle extends Shape {
	    
	    @Override
	    public void draw() {
	        System.out.println("It has length and breadth");
	    }
	}
	class Square extends Shape {
		 @Override
		 public void draw() {
			 System.out.println("It has side");
		 }
	}
	
