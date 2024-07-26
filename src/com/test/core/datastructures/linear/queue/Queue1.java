package com.test.core.datastructures.linear.queue;

/*
Queue implementation using Fixed size Circular Array
Insertion is done from Front end
Deletion is done from Rear end
 */
public class Queue1 {

    private int[] queue;
    private int size, front, rear, capacity;
    Queue1(int capacity){
        this.capacity = capacity;
        queue = new int[capacity];
    }
    public void enQueue(int data){
        if(!isFull()){
            queue[rear] = data;
            rear = (rear + 1) % capacity; //Here we need to use Mod(%) operator becoz in Circular array once the array is full
            // and when we delete an element it will delete the first element in the array
            //if we want to point the rear to the first index then we need to use mod operator
            //For ex : 5%5 = 0, 1%5 = 1, 2%5 = 2, 3%5 = 3, 4%5 = 4, 6%5 = 1
            size = size + 1;
        }else{
            System.out.print("The queue is full...");
        }
    }
    public int deQueue(){
        int data = queue[front];
        if(!isEmpty()){
            front = (front+1) % capacity;
            size = size - 1;
        }else{
            System.out.print("Queue is Empty...");
        }
        return data;
    }
    public void display(){
        for(int i = 0; i < size; i++){
            System.out.print(queue[(front + i)%capacity] + " ");
        }
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return size == capacity;
    }
    public static void main(String[] args) {
        Queue1 queue = new Queue1(5);
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.deQueue();
        queue.deQueue();
        /*queue.display();
        System.out.println();
        queue.deQueue();
        queue.deQueue();
        queue.enQueue(5);
        queue.enQueue(6);
        queue.enQueue(7);*/
        queue.enQueue(8);
        queue.enQueue(9);
        queue.enQueue(10);
        queue.enQueue(11);
        System.out.println();
        queue.display();
       // System.out.println(queue.isFull());
    }
}
