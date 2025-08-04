package com.abstraction;

public class SbiBank implements Bank {
    @Override
    public void makePayment(double amount) {
        if (amount > 0) {
            System.out.println("Payment of ₹" + amount + " has been successfully made through SBI Bank.");
        } else {
            System.out.println("Invalid payment amount. Please enter a valid amount.");
        }
    }

    public static void main(String[] args) {
        SbiBank sbi = new SbiBank();
        sbi.makePayment(5000);
        sbi.makePayment(2000);
    }
}
