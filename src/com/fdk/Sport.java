package com.fdk;

public class Sport {

	public static void main(String[] args) {
		Cricket c = new Cricket();
		Hockey h = new Hockey();
		Basketball b = new Basketball();
		Ludo l = new Ludo();
		Carrom o = new Carrom();
		c.start();
		h.start();
		Thread t = new Thread(b);
		t.start();
		Thread r = new Thread(l);
		r.start();
		o.start();
	}

}
