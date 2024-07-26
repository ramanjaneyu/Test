package com.test.core.datastructures.linear.linkedlist;

/*
Singly Linkedlist implementation using Head and Tail whereas Head points to the First item and Tail points to the Last.
Here Tail is optional, if we use Tail then inserting an item at the end is O(1) otherwise
if we don't have Tail then inserting an item at the end will take Time Complexity of O(n). Because we need to traverse
from starting to ending item inorder to insert an item at the end
 */
public class LinkedList2 {
    private Node head;
    private Node tail;
    private int size;
    LinkedList2(){
        head = tail = null;
        size = 0;
    }
    //Time Complexity : O(1)
    public void addFirst(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
        //If it is a first Node, then both head & tail should point to the same Node
        if(size == 0){
            tail = node;
        }
        size++;
    }
    //Time Complexity : O(1)
    public void addLast(int data){
        Node node = new Node(data);
        if(size == 0){
            head = tail = node;
        }else{
            tail.next = node;
            tail = node;
        }
        size++;
    }
    //This method will add an element at particular index. Time Complexity : O(1)
    public void addAt(int data, int index) throws Exception {
        if(index < 0 || index > size){
            throw new Exception("Index out of bound exception");
        }
        if(index == 0){
            addFirst(data);
        }else if(index == size){
            addLast(data);
        }else{
            Node temp = head;
            int count = 0;
            while(count <= index-1){
                temp = temp.next;
                count++;
            }
            Node node = new Node(data);
            node.next = temp.next;
            temp.next = node;
            size++;
        }
    }
    //This method will return the first element in the list and Time complexity is O(1)
    public int getFirst() throws Exception {
        if(size == 0){
            throw new Exception("Linked list is empty.");
        }
        return head.data;
    }
    //This method will return the last element in the list and Time complexity is O(1)
    public int getLast() throws Exception {
        if(size == 0){
            throw new Exception("Linked list is empty.");
        }
        return tail.data;
    }
    //This method returns the element at particular index and time complexity is O(n)
    public int getAt(int index) throws Exception{
        if(size == 0){
            throw new Exception("Linked list is empty.");
        }else if(index == 0){
            return getFirst();
        } else if(index == size-1){
            return getLast();
        }else{
            Node temp = head;
            for(int i = 1; i <= index; i++){
                temp = temp.next;
            }
            return temp.data;
        }
    }
    //This method will delete the first element in the Linked list. Time complexity is O(1) times.
    public void deleteFirst() throws Exception{
        if(size == 0){
            throw new Exception("Linked list is empty.");
        } else if(size == 1){
            head = tail = null;
            size--;
        } else {
            Node temp = head.next;
            head.next = null;
            head = temp;
            size--;
        }
    }
    //This method will delete the last element in the Linked list. Time complexity is O(n) times.
    public void deleteLast() throws Exception {
        if(size == 0){
            throw new Exception("Linked list is empty.");
        } else if(size == 1){
            head = tail = null;
        } else {
            Node temp = head;
            while(temp.next != tail){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
            size--;
        }
    }
    public void deleteAt(int index) throws Exception{
        if(size == 0){
            throw new Exception("Linked list is empty.");
        }else if(index < 0 || index >= size){
            throw new Exception("Index is out of bounds.");
        }else if(index == 0){
            deleteFirst();
        }else if(index == size -1){
            deleteLast();
        }else{
            Node temp = head;
            int count = 0;
            while(count < index-1){
                temp = temp.next;
                count++;
            }
            temp.next = temp.next.next;
            size--;
        }

    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) throws Exception {
        LinkedList2 linkedList2 = new LinkedList2();
        linkedList2.addFirst(10);
        linkedList2.addLast(10);
        linkedList2.addAt(20, 2);
        linkedList2.display();
        //System.out.println(linkedList2.getAt(2));
    //    linkedList2.deleteFirst();
        //linkedList2.deleteAt(1);
        //linkedList2.display();
    }
}
class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
