package com.tka;


public class TestCustomException {
 
 static void checkAge(int age) throws InvalidAgeException {
     if (age < 18) {
         throw new InvalidAgeException("Age must be 18 or older to register.");
     } else {
         System.out.println("Age is valid: " + age);
     }
 }

 public static void main(String[] args) {
     try {
         checkAge(16); 
     } catch (InvalidAgeException e) {
         System.out.println("Exception caught: " + e.getMessage());
     }
 }
}

