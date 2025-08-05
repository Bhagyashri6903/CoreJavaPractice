package com.bsp;
public class BankAccount {
    private long accountNumber;
    private String accountHolderName;
    private double balance;

    public void setAccountDetails(long accNo, String name, double initialBalance) {
        accountNumber = accNo;
        accountHolderName = name;
        if (initialBalance >= 0)
            balance = initialBalance;
        else {
            balance = 0;
            System.out.println("Initial balance can't be negative. Setting to 0.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void displayAccountInfo() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Holder Name: " + accountHolderName);
        System.out.println("Current Balance: " + balance);
    }
}
