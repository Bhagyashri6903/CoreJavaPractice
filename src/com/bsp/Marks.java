package com.bsp;

public class Marks {
	
	public static void main(String[] args) {
		int[] numbers = {60,65,72,98,94,84};
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int num : numbers) {
			
			if(num > largest) {
				secondLargest= largest;
				largest = num;
			}else if (num > secondLargest && num!=largest) {
				secondLargest=num;
			}
	}
		System.out.println("Second largest element from given array is : " + secondLargest);
	}

}
