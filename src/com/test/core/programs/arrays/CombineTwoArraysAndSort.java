package com.test.core.programs.arrays;

import java.util.Arrays;
/*
Write a program to combine both the arrays and the result array should be in sorting order
{1, 3, 5, 7}
{2, 4, 6, 8}
Output: {1, 2, 3, 4, 5, 6, 7, 8}
 */
public class CombineTwoArraysAndSort {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8};
        int[] mergedArray = new int[array1.length + array2.length];
        int count = 0;
        for(int i : array1){
            mergedArray[count++] = i;
        }
        for(int j : array2){
            mergedArray[count++] = j;
        }
        Arrays.sort(mergedArray);
        System.out.println("Print merged array : " + Arrays.toString(mergedArray));
    }
}
