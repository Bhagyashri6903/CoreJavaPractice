package com.fdk;

public class Example3 extends Thread {
	public void run() {

		for (char a = 'A'; a <= 'Z'; a++) {
			System.out.print("Alphabet is: ");
			System.out.println(a);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	}
	
}
