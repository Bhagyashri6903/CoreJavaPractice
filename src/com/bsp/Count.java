package com.bsp;

public class Count {
	
	
	    public static void main(String[] args) {
	        String input = "Bhagyashri@2013";

	        int letterCount = 0;
	        int digitCount = 0;
	        int specialSymbolCount = 0;

	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);

	            if (Character.isLetter(ch)) {
	                letterCount++;
	            } else if (Character.isDigit(ch)) {
	                digitCount++;
	            } else {
	                specialSymbolCount++;
	            }
	        }

	        System.out.println("Letter Count: " + letterCount);
	        System.out.println("Special Symbol Count: " + specialSymbolCount);
	        System.out.println("Digit Count: " + digitCount);
	    }
	}
