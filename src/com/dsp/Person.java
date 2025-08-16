package com.dsp;

public class Person {
	
	public static void main(String[] args) {
		int[] a = {200,150,4,6,7,352};
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		System.out.println("Array sum : " + sum);
	}

}
