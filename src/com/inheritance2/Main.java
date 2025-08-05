package com.inheritance2;

public class Main {
    public static void main(String[] args) {
        Shape s;

        s = new Shape();
        s.calculateArea();

        s = new Rectangle(4, 6);
        s.calculateArea();

        s = new Triangle(3, 7);
        s.calculateArea();
    }
}

