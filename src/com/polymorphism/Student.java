package com.polymorphism;

public class Student {
	
	    int rollNumber;
	    String name;

	    
	    public Student() {
	        System.out.println("Default constructor called");
	        rollNumber = 0;
	        name = "Unknown";
	    }

	    
	    public Student(int rollNumber) {
	        this.rollNumber = rollNumber;
	        name = "Unknown";
	    }

	    
	    public Student(int rollNumber, String name) {
	        this.rollNumber = rollNumber;
	        this.name = name;
	    }

	   
	    public void display() {
	        System.out.println("Roll Number: " + rollNumber + ", Name: " + name);
	    }

	      public static void main(String[] args) {
	       
	        Student s1 = new Student();                
	        Student s2 = new Student(01);                
	        Student s3 = new Student(02, "Bhumi");   

	        
	        System.out.println("\nStudent Details:");
	        s1.display();  
	        s2.display();  
	        s3.display();  
	    }
	

}
