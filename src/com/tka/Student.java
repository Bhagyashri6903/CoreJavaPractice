package com.tka;


public class Student {

   
    public static int divide(int a, int b) {
        if (b == 0) {
            
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;  
        try {
            int result = divide(a, b);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}