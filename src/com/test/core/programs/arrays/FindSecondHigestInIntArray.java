package com.test.core.programs.arrays;

public class FindSecondHigestInIntArray {
    public static void main(String[] args) {
        int[] intputArray = {3,2,7,1,6,5,8,9};
        //findSecondLargestBySorting(intputArray);
        findSecondLargest(intputArray);  //use this
    }
    //This method will sort the given list and find the second largest based on the index position
    private static void findSecondLargestBySorting(int[] intputArray) {
        int temp = 0;
        for(int i = 0; i < intputArray.length -1; i++){
            if(intputArray[i] > intputArray[i+1]){
                temp = intputArray[i];
                intputArray[i] = intputArray[i+1];
                intputArray[i+1] = temp;
            }
        }
        System.out.println("Second highest value : " + intputArray[intputArray.length - 2]);
    }
    //This method will find the second largest without sorting
    public static void findSecondLargest(int[] intputArray) {
        int firstLargest = 0;
        int secondLargest = -1;
        for(int i = 0; i < intputArray.length; i++) {
            if(intputArray[i] > intputArray[firstLargest]){
                secondLargest = firstLargest;
                firstLargest = i;
            } else if(intputArray[i] < intputArray[firstLargest]){
                secondLargest = i;
            }
        }
        System.out.println("Second highest value without sorting : " + intputArray[secondLargest]);
    }
}
