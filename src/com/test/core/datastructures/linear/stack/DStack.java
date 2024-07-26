package com.test.core.datastructures.linear.stack;
/*
Stack implementation using Dynamic Array
 */
public class DStack {
    private int capacity = 2;
    private int[] stack = new int[capacity];
    private int top = 0;
    public void push(int data){
        //We need to check if the stack is full or not, if the stack is full we should not allow to insert elements in to Stack
        if(size() == capacity)
            expand();

        stack[top] = data;
        top++;
    }

    private void expand() {
        int length = size();
        int[] newStack = new int[capacity*2];
        System.arraycopy(stack, 0, newStack, 0, length);
        stack = newStack;
        capacity = capacity * 2;
    }
    public int pop(){
        int data=0;
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else{
            top--;
            data = stack[top];
            stack[top] = 0;
            shrink();
        }
        return data;
    }

    private void shrink() {
        int length = size();
        if(length <= (capacity/2)/2){
           capacity = capacity/2;

        int[] newStack = new int[capacity];
        System.arraycopy(stack, 0, newStack, 0, length);
        stack = newStack;
        }
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
        System.out.println();
    }

    public static void main(String[] args) {
        DStack dStack = new DStack();
        dStack.push(3);
        dStack.display();
        dStack.push(4);
        dStack.display();
        dStack.push(5);
        dStack.display();
        dStack.push(6);
        dStack.display();
        dStack.push(7);
        dStack.display();

        dStack.pop();
        dStack.display();
        dStack.pop();
        dStack.display();

        dStack.pop();
        dStack.display();

        //System.out.print();
        //System.out.println(dStack.pop());
        //System.out.println(dStack.peek());
        //dStack.display();
        /*System.out.println(dStack.size());
        dStack.pop();
        System.out.println(dStack.size());
        System.out.println(dStack.isEmpty());
        dStack.pop();
        dStack.pop();
        dStack.pop();
        System.out.println(dStack.isEmpty());*/
    }
}
