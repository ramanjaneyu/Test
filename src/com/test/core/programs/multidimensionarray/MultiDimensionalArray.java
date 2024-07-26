package com.test.core.programs.multidimensionarray;
/*
Print the values as below using Two-dimensional arrays
1 2 3 4
5 6 7 8
9 10 11 12
 */
public class MultiDimensionalArray {
    public static void main(String[] args) {
        //First array represents rows and second represents columns i.e., 3 rows and 4 columns
        int[][] arr = new int[3][4];
        int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
