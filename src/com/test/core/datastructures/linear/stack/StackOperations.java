package com.test.core.datastructures.linear.stack;

import java.util.Stack;

/*
1. Create a Stack and implement it using the inbuilt classes and methods
2. Access the elements of Stack using Iterator method
3. Implement the following functions
a) Push
b) Pop
c) Empty/isEmpty
d) Peek
e) Search
f) Size
g) sort
 */
public class StackOperations {
    public static void main(String[] args) {
        //Creating a Stack object
        Stack<Integer> stack = new Stack<>();
        //Inserting elements into Stack
        stack.push(2);
        stack.push(4);
        stack.push(9);
        System.out.println("Print stack elements : " + stack);  //Output: Print stack elements : [2, 4, 9]
        //Delete element from Stack
        //System.out.println(stack.pop()); //Output: 9
        //Peek operation will print top element in the Stack i.e., 4 here
        System.out.println(stack.peek()); //Output: 4
        //isEmpty() method
        System.out.println(stack.isEmpty()); //Output: false
        //To find the Index of the given element
        System.out.println(stack.indexOf(2)); //Output: 0
        //To search an element in the stack this returns 3
        System.out.println(stack.search(2)); //Output: 3
        //Iterating elements in stack
        for(Integer i : stack){
            System.out.println("Print elements : " + i);
        }
    }
}
