package com.ifelse;

public class LargestFromThree {
    public static void main(String[] args) {
        int a = 62;
        int b = 43;
        int c = 84;

        if (a >= b && a >= c) {
            System.out.println("The largest number is: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("The largest number is: " + b);
        } else {
            System.out.println("The largest number is: " + c);
        }
    }
}

