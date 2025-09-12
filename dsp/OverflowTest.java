package com.dsp;

public class OverflowTest {
    public static void main(String[] args) {
        int large = 260;
        byte b = (byte) large;  
        System.out.println("Original int: " + large);
        System.out.println("Converted byte: " + b);  
    }
}

