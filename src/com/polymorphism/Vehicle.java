package com.polymorphism;

class Vehicle {
    public void sound() {
        System.out.println("Generic vehicle speed");
    }
}

class Car extends Vehicle {
    @Override
    public void sound() {
        System.out.println("Car is moving");
    }
}

class Bike extends Vehicle {
    @Override
    public void sound() {
        System.out.println("Bike is moving");
    }
}

