package com.test.java8.streams.list;

import java.util.List;
import java.util.stream.Collectors;

/*
Input: ["apple", "banana", "orange", "kiwi"]
Output: [5, 6, 6, 4]
 */
public class FindLengthOfStringsInList {
    public static void main(String[] args) {
        List<String> stringList = List.of("apple", "banana", "orange", "kiwi");
        List<Integer> result = stringList.stream()
                .map(str -> str.length())
                .collect(Collectors.toList());
        System.out.println("Print result : " + result);
    }
}
