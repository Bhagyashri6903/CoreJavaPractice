package com.dsp;
public class CountVowels {
    public static void main(String[] args) {
        String input = "Hello World! This is a Java program.";
        printVowels(input);
    }

    public static void printVowels(String str) {
        System.out.print("Vowels in the string: ");
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.print(str.charAt(i) + " ");
            }
        }
    }
}
