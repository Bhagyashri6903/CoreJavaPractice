package com.tka;

public class Divyashri extends Thread {
	
	

		Radio r;

		public Divyashri(Radio obj) {
			r = obj;
		}

		@Override
		public void run() {
			r.play(92.1F);
		}

	


}
