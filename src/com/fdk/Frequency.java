package com.fdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Frequency {
	
	
	    public static void main(String[] args) {
	        List<Integer> numbers = new ArrayList<>();
	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(10);
	        numbers.add(30);
	        numbers.add(10);
	        numbers.add(10);

	        Set<Integer> uniqueNumbers = new HashSet<>(numbers);

	        for (int num : uniqueNumbers) {
	            int freq = Collections.frequency(numbers, num);
	            System.out.println(num + " occurs " + freq + " times");
	        
	    }
	}


}
