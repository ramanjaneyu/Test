package com.test.java8.streams.strings;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
/*
Find first non-repeated char (case-insensitive) in a string
Input: "my naMe is raman"
Output: y
 */
public class FindFirstNonRepeatingCharInStringUsingStreams {
    public static void main(String[] args) {
        String input = "my naMe is ramany";
        Character result = input.chars()
                .mapToObj(c -> Character.toLowerCase((char) c))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println("Print first non-repeated character in a given string : " + result);
    }
}
