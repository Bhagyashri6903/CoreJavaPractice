package com.encapsulation;

//Encapsulated class
public class Employee {
 // Private data members
 private String name;
 private int age;

 // Public getter for name
 public String getName() {
     return name;
 }

 // Public setter for name
 public void setName(String newName) {
     name = newName;
 }

 // Public getter for age
 public int getAge() {
     return age;
 }

 // Public setter for age
 public void setAge(int newAge) {
     if (newAge > 0) {
         age = newAge;
     } else {
         System.out.println("Age must be positive.");
     }
  }
}
