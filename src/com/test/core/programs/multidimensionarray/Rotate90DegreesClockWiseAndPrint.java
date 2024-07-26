package com.test.core.programs.multidimensionarray;
/*
Input:
5 7 11 15
6 1 8 2
9 2 25 17
4 9 35 7

Output: After rotating 90 Degrees
4 9 6 5
9 2 1 7
35 25 8 11
7 17 2 15
*/
public class Rotate90DegreesClockWiseAndPrint {
    public static void main(String[] args) {
        //int[][] arr = {{3, 4, 7, 11}, {6, 7, 15, 8}, {11, 27, 15, 14}, {8, 1, 12, 13}};
        int[][] arr = {{5, 7, 11, 15}, {6, 1, 8, 2},{9, 2, 25, 17,},{4, 9, 35, 7}};
        rotate90(arr);
        display(arr);
    }
    public static void rotate90(int[][] arr){
        transpose(arr);
        for(int i = 0; i < arr.length; i++){
            int low = 0, high = arr[i].length - 1;
            while(low < high){
                int temp = arr[i][low];
                arr[i][low] = arr[i][high];
                arr[i][high] = temp;
                low++;
                high--;
            }
        }
    }
    public static void display(int arr[][]){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static void transpose(int[][] inputArray){
        int rows = inputArray.length, cols = inputArray[0].length;
        for(int i = 0; i < inputArray.length; i++){
            for(int j = i + 1; j < inputArray[0].length; j++){
                int temp = inputArray[i][j];
                inputArray[i][j] = inputArray[j][i];
                inputArray[j][i] = temp;
            }
        }
    }
}
