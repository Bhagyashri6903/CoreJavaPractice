package com.fdk;

public class Carrom extends Thread implements Runnable {

	@Override
	public void run() {
		String str = null;

		try {

			int length = str.length();
			System.out.println("Length of the string: " + length);
		} catch (NullPointerException e) {
			System.out.println("Invalid format");
		}
	}

}
