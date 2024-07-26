package com.test.java8.streams.array;

import java.util.Arrays;
import java.util.Comparator;
/*
Find longest string in a given String array
 */
public class FindLongestStringInStringArray {
    public static void main(String[] args) {
        String[] names = {"sumit", "karan", "GainJavaKnowledge", "Vivek", "Raman"};
        String result = Arrays.stream(names)
                        .max(Comparator.comparingInt(String::length))
                                .get();
        System.out.println(result);
    }
}
