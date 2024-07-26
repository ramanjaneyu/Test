package com.test.core.programs.threads.producerconsumer.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
/*
Java provides a BlockingQueue interface that is thread-safe. In other words, multiple threads can add and remove messages from this queue without any concurrency issues.
Its put() method blocks the calling thread if the queue is full. Similarly, if the queue is empty, its take() method blocks the calling thread.
 */
public class ProducerConsumerBlockingQueue {
    public static void main(String[] args) {
        BlockingQueue<Integer> buffer = new ArrayBlockingQueue<>(5);
        //If you want to run multiple threads then we can use below for-loop
        /*for(int i = 0; i < 5; i++){ } */
        Thread producerThread = new Thread(() -> {
            for(int i = 0; i < 10; i++){
                try{
                    buffer.put(i);  //put() method will wait if the queue is full.
                    System.out.println("Produced item by : " + i);
                    Thread.sleep(1000);
                }catch (InterruptedException ie){
                    throw new RuntimeException(ie);
                }
            }
        }, "ProducerThread");

        Thread consumerThread = new Thread(() -> {
            for(int i = 0; i < 10; i++){
                try{
                    int value = buffer.take(); //This will block if the buffer is empty
                    System.out.println("Consumed item : " + i);
                    Thread.sleep(1000);
                }catch (InterruptedException ie){
                }
            }
        }, "ConsumerThread");
        producerThread.start();
        consumerThread.start();
    }
}
