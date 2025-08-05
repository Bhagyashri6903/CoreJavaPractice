package com.bsp;

public class StudMain {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.setName("Bhagyashri");
        s1.setRollNo(101);
        s1.setMarks(95);

        Students s2 = new Students();
        s2.setName("Divyashri");
        s2.setRollNo(102);
        s2.setMarks(92);  

        s1.displayInfo();
        System.out.println();
        s2.displayInfo();
    }
}
