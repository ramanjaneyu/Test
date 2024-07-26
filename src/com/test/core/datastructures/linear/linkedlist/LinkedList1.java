package com.test.core.datastructures.linear.linkedlist;

import java.util.NoSuchElementException;
/*
Singly LinedList implementation
 */
/*public class LinkedList1 {
    Node head;
    public void insert(int data){
        Node node = new Node(data);
        if(isEmpty()){
            head = node;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }
    public void insertAtStart(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
    }
    public void insertAt(int index, int data){
        Node node = new Node(data);

        if(index == 0){
            insertAtStart(data);
        }else{
            Node temp = head;

            for(int i = 0; i<index-1; i++){
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }
    }
    public void deleteAt(int index){
        if(index == 0){
            head = head.next;
        }else{
            Node temp = head;
            Node n1;
            for(int i=0; i<index-1; i++){
                temp = temp.next;
            }
            n1 = temp.next;
            temp.next = n1.next;
            n1=null;
        }
    }
    public void deleteFirst(){
        if(isEmpty())
            throw new NoSuchElementException();
        if(head.next == null) {
            head = null;
            return;
        }
        Node temp = head.next;
        head.next = null;
        head = temp;
    }
    /*public void deleteLast(){
        //[10, 20, 30, 40]
        if(isEmpty())
            throw new NoSuchElementException();
        Node temp = head;
        while(temp != null){
            temp = temp.next;
        }
        Node current = temp;
        head = temp;
    }*/
  /*  public int indexOf(int item){
        int index = 0;
        Node current = head;
        while(current.next != null){
            if(current.data == item)
                return index;
            else{
                current = current.next;
                index++;
            }
        }
        return -1;
    }
    public void show(){
        Node node = head;
        if(node == null)
            return;
        while(node.next != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.print(node.data);
    }
    public boolean contains(int data){
        return indexOf(data) != -1;
    }
    private boolean isEmpty(){
        return head == null;
    }
    public static void main(String[] args) {
        LinkedList1 linkedList1 = new LinkedList1();
        linkedList1.insert(1);
        linkedList1.insert(2);
        linkedList1.insert(3);
        linkedList1.insert(4);
        //System.out.println(linkedList1.indexOf(5));
       // linkedList1.insertAtStart(15);
        //linkedList1.insertAt(1, 16);
        //linkedList1.deleteAt(1);
        linkedList1.show();
    }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}*/
