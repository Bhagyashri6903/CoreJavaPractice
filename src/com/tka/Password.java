package com.tka;
public class Password {
    public static void main(String[] args) {
        String str = "Bh12";

        try {
            if (str.length() < 6) {
                throw new IllegalArgumentException("Password too short. Must be at least 6 characters.");
            }
            System.out.println("Strong password: " + str.length());
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
