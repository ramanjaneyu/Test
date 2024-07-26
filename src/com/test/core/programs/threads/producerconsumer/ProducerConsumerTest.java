package com.test.core.programs.threads.producerconsumer;

public class ProducerConsumerTest {
    public static void main(String[] args) throws InterruptedException {
        ProducerConsumer pc = new ProducerConsumer();

        Thread t1 = new Thread(() -> {
            try {
                for(int i = 0; i < 10; i++){
                    pc.produce(i);
                }
            } catch (InterruptedException ie) {

            }
        });
        Thread t2 = new Thread(() -> {
            try {
                for(int i = 0; i < 10; i++){
                    pc.consume();
                }
            } catch (InterruptedException ie) {

            }
        });

        t1.start();
        t2.start();

        /*t1.join();
        t2.join();*/
    }
}
