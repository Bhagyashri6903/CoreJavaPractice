package com.tka;

public class Bhagyashri extends Thread {

	

		Radio r;

		public Bhagyashri(Radio obj) {
			r = obj;
		}

		@Override
		public void run() {
			r.play(108.2F);
		}

	
}
