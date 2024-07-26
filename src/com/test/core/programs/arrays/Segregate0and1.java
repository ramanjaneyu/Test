package com.test.core.programs.arrays;

import java.util.Arrays;

/*
Program to segregate all 0's on one side and all 1's on one side
Input array     =  [0, 1, 0, 1, 0, 0, 1, 1, 1, 0]
Output array =  [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]
 */
public class Segregate0and1 {
    public static void main(String[] args) {
        int[] inputArray = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        int a = 0, b = inputArray.length - 1;
        while(a < b){
            if(inputArray[a] == 1 && inputArray[b] == 0){
                int temp = inputArray[a];
                inputArray[a] = inputArray[b];
                inputArray[b] = temp;
            } else if(inputArray[a] == 1){
                b--;
            } else {
                a++;
            }
        }
        System.out.println("Result array after segregation : " + Arrays.toString(inputArray));
    }
}
