package com.test.core.programs.arrays;

import java.util.*;
/*
Given an array of distinct integers, find all triplets such that their sum is 0.
    Example:
    Input : int[] arr = {0, -1, 2, -3, 1}
    Output : {0, -1, 1}, {2, -3, 1}
    Input: {-2, 0, 1, 1, 2}
    Output: [-2, 0, 2], [-2, 1, 1]
 */
public class FindAllTripletsSumIsZero {
    public static void main(String[] args) {
       // int[] arr = {0, -1, 2, -3, 1};
        int[] arr = {-2, 0, 1, 1, 2};
        int total = 0, count = 0;
        List<List<Integer>> resultList = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0; i < arr.length -1; i++){
            int low = i+1, high = arr.length - 1;
            int x = arr[i];
            while(low < high){
                if(x + arr[low] + arr[high] == 0){
                    resultList.add(Arrays.asList(x, arr[low], arr[high]));
                    low++;
                    high--;
                } else if (x + arr[low] + arr[high] < 0){
                    low++;
                } else { //If sum is greater than zero
                    high--;
                }
            }
        }
        System.out.println("Print result : " + Arrays.asList(resultList));
    }
}
