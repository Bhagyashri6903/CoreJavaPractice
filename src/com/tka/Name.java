package com.tka;

public class Name {
	
	public static void main(String[] args) {
		String s = "Welcome to the world";
		String show = removeWhitespaces(s);
		System.out.println("Original :" + s);
		System.out.println("After removing spaces:" + show);
	}

	public static String removeWhitespaces(String s) {
		char[] c = s.toCharArray();
		StringBuilder show = new StringBuilder();
		for(int i =0;i<c.length;i++) {
			
			if(c[i] != ' ' &&c[i] != '\t' && c[i] != '\n') {
				show.append(c[i]);
			}
		}
		return show.toString();		
	}

}
