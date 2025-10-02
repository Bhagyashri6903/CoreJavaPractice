package com.fdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Countries {
	
	    public static void main(String[] args) {
	        List<String> countries = new ArrayList<>();
	        countries.add("India");
	        countries.add("Brazil");
	        countries.add("Canada");
	        countries.add("Australia");
	        countries.add("Germany");

	        Collections.sort(countries);

	        System.out.println("Countries sorted alphabetically:");
	        for (String country : countries) {
	            System.out.println(country);
	        
	    }
	}

}
