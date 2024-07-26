package com.test.core.programs.arrays;

/*
Binary search is used to search a key element from multiple elements. Binary search is faster than linear search.
In case of binary search, array elements must be in ascending order. If you have unsorted array, you can sort the
array using Arrays.sort(arr) method.
 */
public class BinarySearchExample {
    public static void main(String[] args) {
        int[] intArray = {10,20,30,40,50,60};
       int key = 30;
        int first = 0, last = intArray.length - 1;
        int mid = first + last / 2;
        System.out.println("Mid value : " + mid);
        while(first <= last){
            if(intArray[mid] < key){
                first = mid + 1;
            } else if(intArray[mid] == key){
                System.out.println("Element found at index : " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
    }
}
