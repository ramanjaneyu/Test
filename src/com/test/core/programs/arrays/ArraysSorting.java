package com.test.core.programs.arrays;

import com.test.Employee;

import java.util.Arrays;
import java.util.Optional;

/*
Sort an array of 0s, 1s and 2s without using sort() method
arr[]= {0 2 1 2 0}
0 0 1 2 2
 */
public class ArraysSorting {
    public static void main(String[] args) {
        int[] intArray = {0, 2, 1, 2, 0};
        System.out.println("Time before bubble sort : " + intArray);
        sortWithSingleForLoops(intArray, intArray.length);

       // sortUsingTwoForLoops(intArray);

    }
    //sorting using Bubble sort - Bubble sort uses two for loops and time complexity is O(n^2)
    private static void sortUsingTwoForLoops(int[] intArray) {
        int[] sortedArray = new int[intArray.length];
        for(int i = 0; i < intArray.length; i++){
            for(int j = 1; j < intArray.length - 1; j++){
                if(intArray[i] < intArray[j]){
                    sortedArray[i] = intArray[i];
                    break;
                }
            }
          }
    }
    private static void sortWithSingleForLoops(int[] intArray, int n) {
        for(int i = 0; i < n-1; i++){
            if(intArray[i] > intArray[i + 1]){
                int temp = intArray[i];
                intArray[i] = intArray[i + 1];
                intArray[i + 1] = temp;
                i = -1;
            }
        }
        System.out.println("Values after sorting : " + Arrays.toString(intArray));
    }
}
