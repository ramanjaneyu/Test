package com.test.core.programs.arrays;

/*
Find Min, Max elements in a given integer array and also find index position of both the elements
 */
public class FindMinAndMaxInGivenIntArray {
    public static void main(String[] args) {
        int[] ints = {3, 1, 5, 2, 6};
        int max = ints[0];
        int min = ints[0];
        int minIndex =0, maxIndex = 0;
        for(int i = 0; i < ints.length; i++){
            if(ints[i] > max){
                max = ints[i];
                maxIndex = i;
            } else if(ints[i] < min){
                min = ints[i];
                minIndex = i;
            }
        }
        System.out.println("Min number is  : " + min + "Min index position : " + minIndex);
        System.out.println("Max number is : " + max + "Min index position : " + maxIndex);
    }
}
