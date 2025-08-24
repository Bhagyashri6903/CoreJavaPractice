package com.bsp;
import java.util.Scanner;

public class Per {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[] originalArray = {1, 2, 3, 4, 5};

        System.out.print("Enter a number to add to the array: ");
        int newElement = scanner.nextInt();

        
        int[] newArray = new int[originalArray.length + 1];

        
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        }

       
        newArray[newArray.length - 1] = newElement;

       
        System.out.println("New array after adding the element:");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
