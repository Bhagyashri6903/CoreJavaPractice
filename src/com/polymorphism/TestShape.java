package com.polymorphism;

public class TestShape {
	
	public static void main(String[] args) {
       Shape s;

        s = new Circle();
        s.draw();
        s = new Rectangle();
        s.draw();
        s = new Square();
        s.draw();
       
    }

}
