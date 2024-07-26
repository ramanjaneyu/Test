package com.test.core.programs.threads.producerconsumer;

import java.util.LinkedList;

/*
Producer can't produce/add the data into the Buffer if it is full
Consumer won't consume data if the Buffer is empty
 */
public class ProducerConsumer {
    LinkedList<Integer> buffer = new LinkedList<>();
    private static final int capacity = 3;
    private boolean available = false;
    public void produce(int i) throws InterruptedException {
        synchronized (this) {
            if (available) {
                if (buffer.size() == capacity) {
                    wait();
                }
            }
            buffer.add(i);
            System.out.println("Producer produced value : " + i + " List values: " + buffer);;
            available = true;
            notify();
            Thread.sleep(2000);
        }
    }
    public void consume() throws InterruptedException {
        synchronized (this){
            if (!available) {
                if (buffer.isEmpty()) {
                    wait();
                }
            }
            int val = buffer.removeFirst();
            System.out.println("Consumer consumed value : " + val);
            available = false;
            notify();
            Thread.sleep(1000);
        }
    }
}
