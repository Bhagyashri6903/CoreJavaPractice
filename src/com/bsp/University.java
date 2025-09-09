package com.bsp;

import java.util.Arrays;
import java.util.Scanner;

public class University {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid array size!");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double avg = (double) sum / n;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);

        System.out.print("Enter element to search: ");
        int search = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == search) {
                System.out.println(search + " found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(search + " not found in the array.");
        }

        int max = arr[0], min = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);

        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        sc.close();
    }
}
