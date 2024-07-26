package com.test.java8.streams.strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
list of integers even and odd numbers
odd integers should append 'o' after the integer
even with 'e' and the final output should print in the form of a string with comma seperated
Output: "2e, 4e, 3o, 6e, 7o, 9o, 10e"
*/
public class PrintOddAndEvenNumbersInCommaSeperatoredString {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2, 4, 3, 6, 7, 9, 10);
        String result = integerList.stream()
                .map(e -> e % 2 == 0 ? e+"e" : e+"o")
                .collect(Collectors.joining(","));
        System.out.println("print result : " + result);
    }
}
