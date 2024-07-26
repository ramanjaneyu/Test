package com.test.java8.multithreading;

import java.util.List;
import java.util.concurrent.*;

public class FutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);
        Future<List<Integer>> future1 = service.submit(() -> {
            System.out.println("Thread : " + Thread.currentThread().getName());
            delay(1);
            return List.of(1, 2, 3, 4, 5);
        });
        Future<List<Integer>> future2 = service.submit(() -> {
            System.out.println("Thread : " + Thread.currentThread().getName());
            //System.out.print(10/0); //This line throws exception and we cannot handle exceptions in Futures.
            return List.of(6, 7, 8, 9, 10);
        });
        //Here get() blocks the main thread and we cannot print the result of future2 until future1 is done.
        List<Integer> result1 = future1.get();
        System.out.println("Print the future1 result : " + result1);
        //future1.get() operation will block this code and won't print this result until future1 result is printed.
        //This is the disadvantage with Futures
        List<Integer> result2 = future2.get();
        System.out.print("Print the future2 result : " + result2);
    }
    private static void delay(int min) throws InterruptedException {
        TimeUnit.MINUTES.sleep(min);
    }
}
