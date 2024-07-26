package com.test.core.datastructures.linear.stack;

import java.util.Arrays;

/*
Stack implementation using Fixed Sized Array
 */
public class Stack1 {
    private int[] stack;
    private int top = 0;
    private int size;
    Stack1(int size){
        this.size = size;
        stack = new int[size];
    }
    public void push(int data){
        //We need to check if the stack is full or not, if the stack is full we should not allow to insert elements in to Stack
        if(top == size){
            System.out.println("Stack is full...");
        } else{
            stack[top] = data;
            top++;
        }
    }
    public int pop(){
        int data=0;
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else{
            top--;
            data = stack[top];
            stack[top] = 0;
        }
        return data;
    }
    public int peek(){
        int data = stack[top - 1];
        return data;
    }
    public int size(){
        return top;
    }
    public boolean isEmpty(){
        return top <=0;
    }
    public void display(){
        for(int n : stack){
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Stack1 stack1 = new Stack1(5);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);
        stack1.push(6);
        stack1.push(7);
        stack1.display();
        //System.out.print();
        //System.out.println(stack1.pop());
        //System.out.println(stack1.peek());
        //stack1.display();
        /*System.out.println(stack1.size());
        stack1.pop();
        System.out.println(stack1.size());
        System.out.println(stack1.isEmpty());
        stack1.pop();
        stack1.pop();
        stack1.pop();
        System.out.println(stack1.isEmpty());*/
    }
}
