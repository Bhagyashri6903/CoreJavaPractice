package com.tka;



public class Office {

	public static void main(String[] args) {
		
		Radio r = new Radio();
		
		Bhumi n = new Bhumi(r);
		Bhagyashri g = new Bhagyashri(r);
		Divyashri m = new Divyashri(r);
		
		n.start();
		g.start();
		m.start();
		
		
	}
	
}