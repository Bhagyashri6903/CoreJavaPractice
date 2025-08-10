package com.tka;

public class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }

    public String printmessage() {
        return super.getMessage();
    }
}
