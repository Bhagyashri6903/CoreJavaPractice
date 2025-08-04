package com.polymorphism;

public class Area {

    
    double areaCircle(double radius) {
        return Math.PI * radius * radius;
    }

   
    double areaRectangle(double length, double width) {
        return length * width;
    }

    
    int areaSquare(int side) {
        return side * side;
    }

    public static void main(String[] args) {
        Area a = new Area();

        System.out.println("Area of Circle: " + a.areaCircle(8.9));
        System.out.println("Area of Rectangle: " + a.areaRectangle(2.4, 5.6));
        System.out.println("Area of Square: " + a.areaSquare(4));
    }
}
