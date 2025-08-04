package com.abstraction;

public class OnlinePaymentDemo {

    // Interface
    interface OnlinePayment {
       public void makePayment(double amount);
    }

    
    
    // PhonePay class implementing OnlinePayment
    static class PhonePay implements OnlinePayment {
        @Override
        public void makePayment(double amount) {
            if (amount > 0) {
                System.out.println("Payment of ₹" + amount + " made successfully through PhonePay.");
            } else {
                System.out.println("PhonePay: Invalid amount entered.");
            }
        }
    }

    
    
    // GooglePay class implementing OnlinePayment
    static class GooglePay implements OnlinePayment {
        @Override
        public void makePayment(double amount) {
            if (amount > 0) {
                System.out.println("Payment of ₹" + amount + " made successfully through GooglePay.");
            } else {
                System.out.println("GooglePay: Invalid amount entered.");
            }
        }
    }
    
    
    

    // Main method to test
    public static void main(String[] args) {
        OnlinePayment phonePay = new PhonePay();
        OnlinePayment googlePay = new GooglePay();
        phonePay.makePayment(1000.0);
        googlePay.makePayment(2500.0);
        phonePay.makePayment(-500);  // Invalid example
    }
}
