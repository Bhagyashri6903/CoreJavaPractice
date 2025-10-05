package com.fdk;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Colour {
	
	
	    public static void main(String[] args) {
	        Set<String> items = new HashSet<>();
	        items.add("Red");
	        items.add("Blue");
	        items.add("Yellow");
	        items.add("Violet");
	        items.add("Green");

	        Iterator<String> iterator = items.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        
	    }
	}


}
