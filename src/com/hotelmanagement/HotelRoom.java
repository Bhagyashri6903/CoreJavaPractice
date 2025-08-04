package com.hotelmanagement;

public class HotelRoom {
    // Fields
    private int roomNumber;
    private String roomType;
    private Float rentPerNight;
    private boolean isACAvailable;
    private char roomGrade; // e.g., 'A', 'B', etc.
    private double discount; // in percentage (e.g., 10.5 means 10.5%)

    // Constructor
    public HotelRoom(int roomNumber, String roomType, Float rentPerNight, boolean isACAvailable, char roomGrade, double discount) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.rentPerNight = rentPerNight;
        this.isACAvailable = isACAvailable;
        this.roomGrade = roomGrade;
        this.discount = discount;
    }

    // Getters and Setters
    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Float getRentPerNight() {
        return rentPerNight;
    }

    public void setRentPerNight(Float rentPerNight) {
        this.rentPerNight = rentPerNight;
    }

    public boolean isACAvailable() {
        return isACAvailable;
    }

    public void setACAvailable(boolean isACAvailable) {
        this.isACAvailable = isACAvailable;
    }

    public char getRoomGrade() {
        return roomGrade;
    }

    public void setRoomGrade(char roomGrade) {
        this.roomGrade = roomGrade;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    // Method to calculate final rent after applying discount
    public double calculateFinalRent() {
        return rentPerNight - (rentPerNight * (discount / 100));
    }

    // Display method
    public void displayDetails() {
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Room Type: " + roomType);
        System.out.println("Rent per Night: $" + rentPerNight);
        System.out.println("AC Available: " + (isACAvailable ? "Yes" : "No"));
        System.out.println("Room Grade: " + roomGrade);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Rent After Discount: $" + String.format("%.2f", calculateFinalRent()));
        System.out.println("-------------------------------------------");
    }
}
