package com.bsp;

public class Book {
    String title;
    double price;

   
    Book(String title) {
        this.title = title;
        System.out.println("Title: " + title);
    }

   
    Book(String title, double price) {
        this(title);  
        this.price = price;
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Basics");
        Book b2 = new Book("Advanced Java", 499.99);
    }
}
