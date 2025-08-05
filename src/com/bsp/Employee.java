package com.bsp;

public class Employee {
	int id;
	String name;
	
	Employee(int id,String name){
		this.id = id;
		this.name = name;
		
	}
	
	void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
	
	public static void main(String[] args) {
		Employee e = new Employee(1 , "Divyashri");
		e.display();
		
	}

}
