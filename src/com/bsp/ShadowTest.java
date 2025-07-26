package com.bsp;

public class ShadowTest {
    int num = 50;

    void setNum(int num) {
        System.out.println("Local num: " + num);
        System.out.println("Instance num before change: " + this.num);
        this.num = num;
        System.out.println("Instance num after change: " + this.num);
    }

    public static void main(String[] args) {
        ShadowTest obj = new ShadowTest();
        obj.setNum(100);
    }
}
