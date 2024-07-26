package com.test.core.programs.arrays;

/*
Find a contiguous subarray with largest sum from a given array of integers
Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
Output: [4, -1, 2, 1] is 6
*/
public class FindContiguousSubarrayWithLargestSum {
    public static void main(String[] args) {
        int[] ints = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.print("Largest sum is: " + largestSubArraySum(ints));
    }
    public static int largestSubArraySum(int[] inputArray){

        int sum = 0, maximum_sum = 0, index_start = 0, index_end = 0, start = 0, end = 0;
        for(int i : inputArray){
            sum = sum + i;
            if(sum > maximum_sum){
                maximum_sum = sum;
                index_start = start;
                index_end = end;
            }
            if(sum < 0){
                sum = 0;
                start = end + 1;
            }
            end++;
        }
        for(int i = index_start; i <= index_end; i++)
            System.out.print(inputArray[i] + " ");
        return maximum_sum;
    }
}
