package com.test.java8.streams;

@java.lang.FunctionalInterface
public interface FunctionalInterface {
    int add(int i1, int i2);
    default void message() {
        System.out.print("print default method");
    }
    static void message1() {
        System.out.print("print static method");
    }
}
class DefaultClass {
    public static void main(String[] args) {
        FunctionalInterface functionalInterface = (a, b) -> a + b;
        int result = functionalInterface.add(5, 4);
        System.out.println("Print result : " + result);
        //Calling static method
        FunctionalInterface.message1();
        System.out.println();
        //Calling default method
        functionalInterface.message();
    }
}
