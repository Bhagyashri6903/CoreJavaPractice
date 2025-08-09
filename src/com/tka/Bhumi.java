package com.tka;

public class Bhumi extends Thread{
	
	

		Radio r;

		public Bhumi(Radio obj) {
			r = obj;
		}

		@Override
		public void run() {
			r.play(94.3F);
		

	}


}
