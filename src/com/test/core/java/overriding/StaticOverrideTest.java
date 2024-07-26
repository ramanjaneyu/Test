package com.test.core.java.overriding;

public class StaticOverrideTest {
    public static void main(String[] args) {
        ParentStaticClass pc = new ChildStaticClass();
        pc.staticMethod();
        pc.nonStaticMethod();
        //ChildStaticClass.staticMethod();
    }
}
