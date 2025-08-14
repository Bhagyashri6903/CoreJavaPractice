package com.fdk;

public class Smallestelement {
	
	    public static void main(String[] args) {
	        int[] arr = {5,10,80,9,7,2,6};

	        int min = arr[0];  

	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] < min) {
	                min = arr[i];  
	            }
	        }

	        System.out.println("Smallest element in the array is: " + min);
	    }
	


}
