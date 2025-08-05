package com.inheritance5;

public class Smartphone extends Mobile {

	void browseInternet() {
		System.out.println("It has good features");
	}

	public static void main(String[] args) {
		Smartphone s = new Smartphone();
		s.browseInternet();
	}

}
