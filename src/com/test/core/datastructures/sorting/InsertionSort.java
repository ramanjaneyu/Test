package com.test.core.datastructures.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {3, 6, 2, 1, 5, 7};
        int size = nums.length;

        for(int i = 1; i < size; i++){
            int key = nums[i];
            int j = i - 1;
            while(j >= 0 && nums[j] > key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
        System.out.println("Print result : " + Arrays.toString(nums));
    }
}
