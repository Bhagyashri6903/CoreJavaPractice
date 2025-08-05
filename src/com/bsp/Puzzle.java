package com.bsp;

public class Puzzle {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;

        if (a < b) {
            if (b > c) {
                System.out.println("Block 1");
            } else if (a + b > c) {
                System.out.println("Block 2");
            } else {
                System.out.println("Block 3");
            }
        } else {
            System.out.println("Block 4");
        }
    }
}
