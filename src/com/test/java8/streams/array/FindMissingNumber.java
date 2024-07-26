package com.test.java8.streams.array;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
Find missing number in an integer series
 */
public class FindMissingNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 6};
        int result = IntStream.rangeClosed(1, 6).sum() - Arrays.stream(numbers).sum();
        System.out.println("print result : " + result);
    }
}
