package com.test.core.java.overriding;

public class ParentStaticClass {
    public static void staticMethod(){
        System.out.println("ParentStaticClass.staticMethod() called");
    }
    public void nonStaticMethod(){
        System.out.println("ParentStaticClass.nonStaticMethod() called");
    }
}
class ChildStaticClass extends ParentStaticClass{
    public static void staticMethod(){
        System.out.println("ChildStaticClass.staticMethod() called");
    }
    public void nonStaticMethod(){
        System.out.println("ChildStaticClass.nonStaticMethod() called");
    }
}
