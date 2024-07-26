package com.test.core.java.interview;

public class Question4 {
    static int x = 11;
    private int y = 33;
    public void method1(int x){
        Question4 q4 = new Question4();
        this.x = 22;
        y = 44;
        System.out.println("Question4.x: " + Question4.x); //22
        System.out.println("q4.x: " + q4.x);  //22
        System.out.println("q4.y: " + q4.y);  //33
        System.out.println("y: " + y);  //44
    }

    public static void main(String[] args) {
        Question4 q = new Question4();
        q.method1(5);
    }
}
