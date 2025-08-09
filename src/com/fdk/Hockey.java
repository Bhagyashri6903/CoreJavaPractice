package com.fdk;

public class Hockey extends Thread {
	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("Hockey: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}

	}

}
