package com.bsp;

public class Game {
    public static void main(String[] args) {
        int marks = 75;

        if (marks > 90)
            System.out.println("Grade A");
        else if (marks > 80)
            System.out.println("Grade B");
        else if (marks > 70)
            if (marks % 2 == 0)
                System.out.println("Grade C - Even Marks");
            else
                System.out.println("Grade C - Odd Marks");
        else
            System.out.println("Fail");
    }
}
