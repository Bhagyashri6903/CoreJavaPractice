package com.bsp;

import java.util.Scanner;

public class Laptop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a Laptop:");
        System.out.println("1. Dell");
        System.out.println("2. HP");
        System.out.println("3. Lenovo");
        System.out.println("4. Apple");

        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Laptop Brand: Dell");
            System.out.println("Processor: Intel i5");
            System.out.println("Price: ₹55000");
        } else if (choice == 2) {
            System.out.println("Laptop Brand: HP");
            System.out.println("Processor: AMD Ryzen 5");
            System.out.println("Price: ₹60000");
        } else if (choice == 3) {
            System.out.println("Laptop Brand: Lenovo");
            System.out.println("Processor: Intel i7");
            System.out.println("Price: ₹70000");
        } else if (choice == 4) {
            System.out.println("Laptop Brand: Apple");
            System.out.println("Processor: M1 Chip");
            System.out.println("Price: ₹120000");
        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
