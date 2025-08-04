package com.polymorphism;


public class TestVehicle {
    public static void main(String[] args) {
        Vehicle v;

        v = new Car();
        v.sound();

        v = new Bike();
        v.sound();
    }
}

