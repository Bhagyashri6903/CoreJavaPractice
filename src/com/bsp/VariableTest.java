package com.bsp;

public class VariableTest {
    int instanceVar = 50;          
    static int staticVar = 100;    

    public static void main(String[] args) {
        VariableTest obj1 = new VariableTest();
        VariableTest obj2 = new VariableTest();
        obj2.instanceVar = 75;

        System.out.println("obj1 instanceVar: " + obj1.instanceVar);
        System.out.println("obj2 instanceVar: " + obj2.instanceVar);
        System.out.println("staticVar: " + VariableTest.staticVar);
    }
}
