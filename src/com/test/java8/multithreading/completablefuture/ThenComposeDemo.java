package com.test.java8.multithreading.completablefuture;

import java.util.concurrent.CompletableFuture;
/*
When we have two dependent asynchronous tasks, and the result of the first task determines the second task i.e.,
second task is dependent on first task.
 */
public class ThenComposeDemo {
    public static void main(String[] args) {
        CompletableFuture<Integer> task1 = CompletableFuture.supplyAsync(() -> {
            System.out.println("task1 started");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return 10;
        });
        CompletableFuture<Integer> task2 = task1.thenCompose(result ->
                CompletableFuture.supplyAsync(() -> {
                    System.out.println("task2 started");
                    return result * 2;
        }));

        task2.thenAccept(finalResult -> {
            System.out.println("Combined result of task1 and task2 is : " + finalResult);
        });
    }
}
