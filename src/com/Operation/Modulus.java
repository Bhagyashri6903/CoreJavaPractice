package com.Operation;

public class Modulus {
    public static void main(String[] args) {
         int a = 20;
         int b = 10;

        if (b != 0) {
            System.out.println("Remainder: " + (a % b));
        }
        else {
            System.out.println("Cannot divide by zero.");
        }
    }
}
