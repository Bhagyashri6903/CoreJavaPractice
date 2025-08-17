package com.bsp;

public class Student {

    public static void main(String[] args) {
        int secondLargest = findSecondLargest();
        System.out.println("Second largest element is: " + secondLargest);
    }

    public static int findSecondLargest() {
        int[] a = {5, 2, 8, 9, 80, 1};
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;

        for (int num : a) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        return secondMax;
    }
}
