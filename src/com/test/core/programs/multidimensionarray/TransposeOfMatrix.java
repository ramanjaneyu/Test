package com.test.core.programs.multidimensionarray;
/*
Transpose of Matrix means interchanging rows with columns i.e., rows of the original matrix will become columns of
the new matrix.
Input:
1 2 3
4 5 6
7 8 9
Output:
1 4 7
2 5 8
3 6 9
 */
public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3},{4,5, 6}, {7,8, 9}};
        //transposeInNewArray(array);
        transposeInSameArray(array);
        display(array);
    }
    public static void transposeInNewArray(int[][] inputArray){
        int rows = inputArray.length, cols = inputArray[0].length;
        int[][] outArray = new int[cols][rows];
        for(int i = 0; i < cols; i++){
            for(int j = 0; j < rows; j++){
                outArray[i][j] = inputArray[j][i];
                System.out.print(outArray[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void transposeInSameArray(int[][] inputArray){
        int rows = inputArray.length, cols = inputArray[0].length;
        for(int i = 0; i < inputArray.length; i++){
            for(int j = i + 1; j < inputArray[0].length; j++){
                int temp = inputArray[i][j];
                inputArray[i][j] = inputArray[j][i];
                inputArray[j][i] = temp;
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
}
