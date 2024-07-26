package com.test.core.java.interview;
/*
Out of below methods which one will get called with args (null,null)
Ans: both
 */
public class Question5 {
    /*public void print(Object o, String i){
        System.out.println("print() with Object and String objects called");
    }*/
    public void print(Object o, Integer i){
        System.out.println("print() with Object and Integer objects called");
    }

    public static void main(String[] args) {
        Question5 question5 = new Question5();
        question5.print(null, null); //here both methods will match and both will be called
    }
}
