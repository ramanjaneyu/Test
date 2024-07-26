package com.test.core.datastructures.sorting;

import java.util.Arrays;

/*
Time complexity of Quick Sort is O(n log(n))
 */
public class MergeSort {
    public static void main(String[] args) {
        //int[] arr = {3, 5, 1, 4, 6, 2};
        int[] arr = {8, 5, 9, 1, 6, 7};
        mergeSort(arr, 0, arr.length -1);
        System.out.println("After merge sort : " + Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if(left < right){
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        //Size of the left and right arrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        //Create left and right arrays for merging
        int[] lArr = new int[n1];
        int[] rArr = new int[n2];

        //Copy the values into the array
        for(int x = 0; x < n1; x++){
            lArr[x] = arr[left+x];
        }
        for(int x = 0; x < n2; x++){
            rArr[x] = arr[mid+1+x];
        }
        int i = 0;
        int j = 0;
        int k = left;

        while(i < n1 && j < n2){
            if(lArr[i] <= rArr[j]){
                arr[k] = lArr[i];
                i++;
            } else{
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }
        //For remaining elements in the left array we will simply copy the elements in the main array
        while(i < n1){
            arr[k] = lArr[i];
            i++;
            k++;
        }
        //For remaining elements in the right array we will simply copy the elements in the main array
        while(j < n2){
            arr[k] = rArr[j];
            j++;
            k++;
        }
    }

}
