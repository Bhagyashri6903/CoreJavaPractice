package com.fdk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSort {
	
	
	    public static void main(String[] args) {
	        List<Employee> employees = new ArrayList<>();
	        employees.add(new Employee(101, "Bhagyashri", 50000));
	        employees.add(new Employee(102, "Bhumi", 45000));
	        employees.add(new Employee(103, "Divyashri", 55000));
	        employees.add(new Employee(104, "Swara", 47000));

	        Collections.sort(employees, Comparator.comparingDouble(emp -> emp.salary));

	        for (Employee emp : employees) {
	            System.out.println(emp);
	        }
	    }
	

}
