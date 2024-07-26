package com.test.core.programs.arrays;
/*
Find the missing number from the given integer array
input: {1, 2, 3, 4, 6};
output: 5
 */
public class FindMissingNumberFromIntArray {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 6};
        int n = inputArray.length + 1;
        int sumTotal = (n*(n+1))/2;
        int sumOfArray = 0;
        for(int i : inputArray){
            sumOfArray = sumOfArray + i;
        }
        int missingNum = sumTotal - sumOfArray;
        System.out.println("Print missing number : " + missingNum);
    }
}
