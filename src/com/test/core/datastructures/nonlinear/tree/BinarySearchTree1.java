package com.test.core.datastructures.nonlinear.tree;
/*
Implementation of Binary Search Tree using Nodes
In BST, the Left node value will be less than the Root Node value and the Right node value will be greater
than the Root Node value.
Input: 8 7 12 15 2 5
Output:
2 5 7 8 12 15 (InOrder traverse)
8 7 2 5 12 15 (PreOrder traverse)
 */
public class BinarySearchTree1 {
    Node root;
    public void insert(int data) {
        root = insertRec(root, data);
    }
    private Node insertRec(Node root, int data) {
        if(root == null){
            root = new Node(data);
        }else if(data < root.data){
            root.leftNode = insertRec(root.leftNode, data);
        }else if(data > root.data){
            root.rightNode = insertRec(root.rightNode, data);
        }
        return root;
    }
    public void display() {
        inorderPrint(root); //To print in inorder traverse
        //preorderPrint(root); //If you want to print in preorder traverse we should use this
    }
    private void inorderPrint(Node root){
        if(root != null){
            inorderPrint(root.leftNode);
            System.out.print(root.data + " ");
            inorderPrint(root.rightNode);
        }
    }
    private void preorderPrint(Node root){
        if(root != null){
            System.out.print(root.data + " ");
            preorderPrint(root.leftNode);
            preorderPrint(root.rightNode);
        }
    }
    //Search an element in binary tree is more efficient becoz here we can skip half of the elements
    // becoz here we are searching only left portion if key < root or right portion if key > root
    public boolean search(int key){
        return searchFn(root, key);
    }
    private boolean searchFn(Node root, int key){
        if(root == null) {
            return false;
        }
        if(key == root.data){
            return true;
        }else if(key < root.data){
            return searchFn(root.leftNode, key);
        }
        return searchFn(root.rightNode, key);
    }
    public static void main(String[] args) {
        BinarySearchTree1 binarySearchTree1 = new BinarySearchTree1();
        binarySearchTree1.insert(8);
        binarySearchTree1.insert(7);
        binarySearchTree1.insert(12);
        binarySearchTree1.insert(15);
        binarySearchTree1.insert(2);
        binarySearchTree1.insert(5);

        //binarySearchTree1.inOrder();
        binarySearchTree1.display();
        System.out.println(binarySearchTree1.search(17));
    }
}
class Node{
    int data;
    Node leftNode;
    Node rightNode;
    public Node(int data){
        this.data = data;
    }
}