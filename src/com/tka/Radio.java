package com.tka;

public class Radio {

	
		public synchronized void play(float freq) {
			
			for(int i=0; i<=10;i++) {
				System.out.println("playing "+freq);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
		
	
}
