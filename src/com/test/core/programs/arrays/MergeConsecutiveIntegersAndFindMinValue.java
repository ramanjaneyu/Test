package com.test.core.programs.arrays;
/*
Merge the consecutive integers in an array and after merging we need to find the Min value in it.
Ex:
Input size : 8,
Input Array : {12, 56, 11, 45, 99, 66, 33, 85}
Merged : {1256, 1145, 9966, 3385}
Least Value : 1145
Ex: 2
Input size : 5,
Input Array : {12, 56, 11, 45, 10}
Merged : {1256, 1145, 10}
Least Value : 10
*/
public class MergeConsecutiveIntegersAndFindMinValue {
    public static void main(String[] args) {
        int[] inputArray = {12, 56, 11, 45, 10};
        System.out.println("Print results : " + findMin(5, inputArray));
    }
    public static int findMin(int size, int[] inputArray){
        int result = 0, merged = 0;
        for(int i = 0; i < inputArray.length - 1; i = i+2){
            merged = Integer.parseInt(inputArray[i] + "" + inputArray[i + 1]);
            if(merged < result){
                result = merged;
            } else if(result == 0){
                result = merged;
            }
        }
        if(size % 2 != 0 && inputArray[inputArray.length-1] < result){
            result = inputArray[inputArray.length-1];
        }
        return result;
    }
}
