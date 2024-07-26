package com.test.core.java.interview;

public class Question2 {
    public static void doPrint(Base base){
        base.print();
    }
    public static void main(String[] args) {
        Base b = new Base();
        System.out.println(b.value);  //90
        Base b1 = new Derived();
        System.out.println(b1.value); //90
        Derived d = new Derived();
        System.out.println(d.value); //45
        doPrint(b);  //Base print() method
        doPrint(b1);  //Derived print() method
        doPrint(d);  //Derived print() method
    }
}
class Base {
    public int value = 90;
    public void print(){
        System.out.println("Base print() method");
    }
}
class Derived extends Base {
    public int value = 45;
    public void print(){
        System.out.println("Derived print() method");
    }
}