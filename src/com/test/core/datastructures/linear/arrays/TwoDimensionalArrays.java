package com.test.core.datastructures.linear.arrays;
/*
Output:
1 2 3 4
5 6 7 8
9 10 11 12

Note: intTwoDimArray = new int[3][4]. Here the array can store 3 * 4 = 12 values (i.e., 3 rows and 4 columns)
 */
public class TwoDimensionalArrays {
    public static void main(String[] args) {
        //Creation and implementation of 2D Array
        int[][] intTwoDimArray = new int[3][4];  //Here first indices will represent row and second indices is used to represent columns.
        int count = 1;
        for(int i = 0; i < intTwoDimArray.length; i++){
            for(int j = 0; j < intTwoDimArray[i].length; j++){
                intTwoDimArray[i][j] = count;
                count++;
            }
        }
        //To display the
        for(int i = 0; i < intTwoDimArray.length; i++){
            for(int j = 0; j < intTwoDimArray[i].length; j++){
                System.out.print(intTwoDimArray[i][j] + " ");
            }
            System.out.println(); //If we want to print in table format we use println to print the next set in another line
        }
    }
}
