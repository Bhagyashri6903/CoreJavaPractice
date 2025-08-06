package com.jbk;

import java.util.Scanner;

public class Grade {
	
	public static void main(String[] args) {
		
		int a,b,c,Average;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name : ");
		sc.next();
		System.out.println("Enter the roll no. : ");
		sc.nextInt();
		System.out.println("a");
		a = sc.nextInt();
		System.out.println("b");
		b = sc.nextInt();
		System.out.println("c");
		c = sc.nextInt();
		sc.close();
		int sum = a+b+c;
		System.out.println(sum);
		Average = ((a+b+c)/3);
	
	if(Average >= 90) {
		System.out.println("Grade A");
	}
	else if (Average >= 80) {
		System.out.println("Grade B");
	}
	else if(Average >= 60) {
		System.out.println("Grade C");
	}
	else {
		System.out.println("Fail");
	}
	
	}

}
