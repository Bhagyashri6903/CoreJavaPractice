package com.jbk;
import java.util.Scanner;
public class Operations {
	
	public static void main(String[] args) {
		
		int a = 0,b = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a");
		sc.nextInt();
		System.out.println("b");
		sc.nextInt();
		System.out.println("Enter the operation name : ");
		sc.nextInt();
		sc.close();
		
		int c = a+b;
		int c1 = a-b;
	    int c2 = a*b;
	    int c3 = a/b;
	    
	    System.out.println("The value is :" );
	}

}
