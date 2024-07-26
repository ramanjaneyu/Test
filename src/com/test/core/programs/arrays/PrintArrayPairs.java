package com.test.core.programs.arrays;

import java.util.Arrays;

/*
Find all pairs of numbers whose sum is equal to the second integer

First input: 1, 2, 3, 4, 5 and the second input: 6
Output: [ 1, 5 ], [ 2, 4 ]
 */
public class PrintArrayPairs {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int input2 = 6;
        //findPairsUsingTwoForLoops(nums, input2);
        findPairsUsingSortAndWhileLoop(nums, input2);
    }
/*
The time complexity of the above solution is O(n2) and doesn’t require any extra space, where n is the size of the input.
 */
    private static void findPairsUsingTwoForLoops(int[] nums, int input2) {
        for(int i = 0; i < nums.length; i++){
            for(int j = 1; j < nums.length; j++){
                if(nums[i] + nums[j] == input2){
                    System.out.printf("(%d, %d)", nums[i], nums[j]);
                    break;
                }
            }
        }
    }
/*
    The time complexity for the below solution is O(n.log(n)) and doesn’t require any extra space.
 */
    private static void findPairsUsingSortAndWhileLoop(int[] nums, int target){
        Arrays.sort(nums);

        //maintain two indices pointing to endpoints of the array
        int low = 0;
        int high = nums.length - 1;

        while(low < high){
            //check the sum found
            if(nums[low] + nums[high] == target){
                System.out.printf("(%d, %d)", nums[low], nums[high]);
                low++;
                high--;
            } else if(nums[low] + nums[high] < target){  //increment low index if the total sum is less than desired sum
                low++;
            } else if (nums[low] + nums[high] > target){  //decrement high index if the total sum is more than desired sum
                high--;
            }
        }
    }
}
