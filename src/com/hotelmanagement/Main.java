package com.hotelmanagement;

public class Main {
    public static void main(String[] args) {
        // Create two HotelRoom objects
        HotelRoom room1 = new HotelRoom(101, "Deluxe", 3500.0f, true, 'A', 10.0);
        HotelRoom room2 = new HotelRoom(202, "Standard", 2500.0f, false, 'B', 5.0);

        // Display details
        System.out.println("Hotel Room Details:");
        room1.displayDetails();
        room2.displayDetails();
    }
}
