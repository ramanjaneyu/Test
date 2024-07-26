package com.test.core.datastructures.sorting;

import java.util.Arrays;

/*
Time complexity of Quick Sort is O(n log(n)) in best-case and in worst-case it is O(n^2)
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 6, 2, 3, 1, 8, 4};
        quickSort(arr, 0, arr.length -1);
        System.out.println("After Quick Sort : " + Arrays.toString(arr));
    }
    public static void quickSort(int[] arr, int low, int high) {
        if(low < high){
            int pi = partition(arr, low, high);
            //Here we need to recursive calls, because we will split the array into two parts based on partition
            quickSort(arr, low, pi -1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for(int j = low; j < high; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
}
