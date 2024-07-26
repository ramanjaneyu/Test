package com.test.core.programs.arrays;

import java.util.Arrays;

/*
1. Preserve the sequence of non zero numbers
2. move/shift all the zeros at the end of the array
3. we can't take any new DS like list, array etc.
4. optimized solution
   Input: int[] arr = {0,4,1,0,9,0};
   output: {4,1,9,0,0,0}
 */
public class MoveAllZerosToEndInTheSameArray {
    public static void main(String[] args) {
        int[] arr = {0,4,1,0,9,0};
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[count++] = arr[i];
            }
        }
        //Remaining elements i.e., all zeros place at the end of the array
        while(count < arr.length){
            arr[count++] = 0;
        }
        System.out.println("Print result : " + Arrays.toString(arr));
    }
}
