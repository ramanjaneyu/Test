package com.test.core.programs.arrays;

import java.util.Arrays;

/*Program to move all matching elements with inputvalue to end of array
input{2, 3, 2, 5, 3, 2, 2, 6, 2}
inputvalue : 2
output {3, 5, 3, 6, 2, 2, 2, 2, 2}
 */
public class OrderElementsBasedOnInput {
    public static void main(String[] args) {
        int[] inputArray = {2, 3, 2, 5, 3, 2, 2, 6, 2};
        int target = 2;
        int count = 0; //Count of non-equal of target elements
        for(int i = 0; i < inputArray.length; i++){
            if(inputArray[i] != target){
                inputArray[count++] = inputArray[i];
            }
        }
        while(count < inputArray.length){
            inputArray[count++] = target;
        }
        System.out.println("Print the result :  " + Arrays.toString(inputArray));
    }
}
