package com.test.core.programs;

public class EnumTest {

    public static void main(String[] args) {
        Season s = Season.valueOf("WINTER");
        System.out.println("Value of s : " + s);
    }
}

enum Season {
    WINTER(5), SPRING(10), SUMMER(15), FALL(20);

    private int value;
    Season(int value){
        this.value = value;
    }
}
