package com.test.core.java;

public class DefaultMethodsInInterfaces {
    public static void main(String[] args) {
        Phone phone = new AndroidPhone();
        phone.call();
        System.out.println(phone.message());
        phone.message1();
    }
}
interface Phone {
    void call();
    default String message(){
        return "Pager interface :: message() with String return type called";
    }
    default void message1(){
        System.out.println("Pager interface :: message1() called");
    }
}
class AndroidPhone implements Phone{
    public void call(){
        System.out.println("Pager interface :: call() called");
    }
}
