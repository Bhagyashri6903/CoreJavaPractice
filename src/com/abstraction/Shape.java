package com.abstraction;

// Abstract class
abstract class Shape {
    abstract void display(); // abstract method

    void show() {            // concrete method
        System.out.println("This is a shape.");
    }
}
