package com.fdk;

public class Basketball implements Runnable {

	@Override
	public void run() {
		int a = 5;
		int b = 0;
		try {
			System.out.println("The division is : " + a / b);

		} catch (ArithmeticException e) {
			System.out.println("Not possible");
		}
	}

}
