package com.inheritance2;

public class Circle {
	
	
	    double radius;

	    Circle(double radius) {
	        this.radius = radius;
	    }

	   
	    void calculateArea() {
	        double area = Math.PI * radius * radius;
	        System.out.println("Area of Circle: " + area);
	    }
	}



