package com.fdk;

public class Example1 extends Thread {

	public void run() {

		for (int i = 2; i <= 20; i += 2) {
			System.out.println("Even numbers : " + i);
		}

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
