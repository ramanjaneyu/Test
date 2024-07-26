package com.test.core.java.interview;

public class Question3 {
    private static int x;

    public static void main(String args[]) {
        System.out.println(fun());  // 1
    }
    static int fun() {
        return ++x;
    }
}
