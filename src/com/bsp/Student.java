package com.bsp;

public class Student {
    String name;
    int rollNumber;

   
    Student() {
        System.out.println("Default Constructor Called");
    }

    
    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        System.out.println("Name: " + name + " ; Roll Number: " + rollNumber);
    }

    public static void main(String[] args) {
        Student s1 = new Student();                     
        Student s2 = new Student("Bhagyashri", 101);    
    }
}
