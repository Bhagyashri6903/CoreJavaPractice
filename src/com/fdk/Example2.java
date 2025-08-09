package com.fdk;

public class Example2 extends Thread{
	public void run() {
		for (int i= 1; i <= 19; i+=2) {
			System.out.println("Odd numbers:" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

	
}
