package com.abstraction;


public class Animal1 {

    // Interface
     public interface Animal {
        void sound();
        void color();
    }

    // Dog class
     public static class Dog implements Animal {
        @Override
        public void sound() {
            System.out.println("Dog Sound: Bark");
        }

        @Override
        public void color() {
            System.out.println("Dog Color: Brown");
        }
    }

    // Cat class
   public static class Cat implements Animal {
        @Override
        public void sound() {
            System.out.println("Cat Sound: Meow");
        }

        @Override
        public void color() {
            System.out.println("Cat Color: White");
        }
    }

    // Cow class
   public static class Cow implements Animal {
        @Override
        public void sound() {
            System.out.println("Cow Sound: Moo");
        }

        @Override
        public void color() {
            System.out.println("Cow Color: Black and White");
        }
    }

    // Main method to test
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cow = new Cow();

        System.out.println("Dog Info:");
        dog.sound();
        dog.color();

        System.out.println("\nCat Info:");
        cat.sound();
        cat.color();

        System.out.println("\nCow Info:");
        cow.sound();
        cow.color();
    }
}

