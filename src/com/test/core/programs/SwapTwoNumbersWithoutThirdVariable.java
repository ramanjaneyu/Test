package com.test.core.programs;
/*
program to swap two integers without a third variable
 */
public class SwapTwoNumbersWithoutThirdVariable {
    public static void main(String[] args) {
        int a = -2, b = -3;
        a = a + b;  // -5
        b = a - b; // -2
        a = a - b; // -3
        System.out.println("a : " + a + " b : " + b);
    }
}
