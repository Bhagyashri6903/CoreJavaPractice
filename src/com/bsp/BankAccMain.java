package com.bsp;

public class BankAccMain {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setAccountDetails(123456789, "Bhagyashri", 15000);
        acc.deposit(14500);
        acc.withdraw(200);
        acc.withdraw(6000);  
        acc.displayAccountInfo();
    }
}
