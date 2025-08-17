package com.bsp;
public class Numbers {
    public static void main(String[] args) {
        int[] arr = {5, 8, 7, 11, 6, 55};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("Second largest: " + secondLargest);
    }
}
