package com.test.core.programs.arrays;

import java.util.Arrays;

/*
Remove duplicates from a random array and sort without Collection and inbuilt function
input a[] = {3,7,4,6,3,5,8,2,1,7,9,4,5}
Output = {1,2,3,4,5,6,7,8,9}
 */
public class RemoveDuplicatesAndSortIntArray {
    public static void main(String[] args) {
        int input[] = {3,7,4,6,3,5,8,2,1,7,9,4,5};
        int temp = 0;
        int[] output = new int[input.length];
        int k = 0;
        for(int i = 0; i < input.length; i++){
            for(int j = i+1; j < input.length; j++){
                if(input[i] > input[j]){
                    temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
            if(i == 0){
                output[k++] = input[i];
            } else if (input[i] != output[k-1]){
                output[k++] = input[i];
            }
        }
        System.out.println("print result : " + Arrays.toString(output));
    }
}
