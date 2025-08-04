package com.hotelmanagement1;

public class Main {
    public static void main(String[] args) {
        // Creating flight objects
        Flight flight1 = new Flight("AI101", "Air India", 180, 12000.50f, true, 'E');
        Flight flight2 = new Flight("BA202", "British Airways", 220, 35000.75f, false, 'B');

        // Display initial flight details
        System.out.println("Initial Flight Details:");
        flight1.displayInfo();
        flight2.displayInfo();

        // Update ticket rate
        flight1.updateTicketRate(12500.00f);
        flight2.updateTicketRate(34000.00f);

        // Display updated details
        System.out.println("Updated Flight Details:");
        flight1.displayInfo();
        flight2.displayInfo();
    }
}
