package com.test.java8.streams;

import java.util.List;
import java.util.stream.Collectors;

/*
Print list of integers in b/w 3 and 8 using skip() and limit() methods using java8
Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Output: [4, 5, 6, 7]
*/
public class SkipAndLimitUsingStreams {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream()
                .skip(3)
                .limit(4)
                .forEach(System.out::print);
        /*        .collect(Collectors.toList());
        System.out.print("Print the result : " + result);*/
    }
}
