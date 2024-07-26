package com.test.java8.multithreading;
/*
Create a thread using lambdas
 */
public class ThreadUsingLambdas {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("This is new thread" + Thread.currentThread().getName());
        Thread thread = new Thread(runnable);
        thread.start();
        //Creating multiple threads using for loop
        /*for(int i = 0; i < 10; i++){
            Thread thread = new Thread(() -> System.out.println("Runnable called"));
            thread.start();
        }*/
    }
}
