package com.bsp;

public class Reverse {
    public static void main(String[] args) {
      String s = "My name is Bhagyashri Sunil Patil";
      String reversed = reverseWords(s);
      System.out.println("After reversing the string : " + reversed);
    }
    public static String reverseWords(String s){
        String[] words = s.split(" ");
        StringBuilder strb = new StringBuilder();
        for(String word : words){
            StringBuilder sbr = new StringBuilder();
            for(int i = word.length()-1 ; i>=0 ; i--){
              sbr.append(word.charAt(i));  
            }
            strb.append(sbr).append(" ");
        }
        return strb.toString().trim();
    }
}