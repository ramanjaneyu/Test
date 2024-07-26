package com.test.java8.streams.array;

import java.util.Arrays;

public class RemoveDuplicatesInIntArray {
    public static void main(String[] args) {
        int[] intArray = {1, 1, 2, 3, 4, 4, 5};
        int[] outputArray = Arrays.stream(intArray).distinct().toArray();
        System.out.println("Print the result : " + Arrays.toString(outputArray));
    }
}
