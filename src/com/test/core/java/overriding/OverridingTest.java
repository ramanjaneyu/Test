package com.test.core.java.overriding;

import java.io.IOException;

public class OverridingTest {
    void msg()throws IOException {
        System.out.println("parent method");
    }
    void msg1() throws ArithmeticException{
        System.out.println("parent method");
    }
    public static void main(String[] args) throws Exception {
        OverridingTest parent = new ChildClass();
        parent.msg();
        parent.msg1();
    }
}
class ChildClass extends OverridingTest {
    void msg() throws IOException {
        System.out.println("child method");
    }
    void msg1() throws RuntimeException {
        System.out.println("Child method of msg1()");
    }
}
