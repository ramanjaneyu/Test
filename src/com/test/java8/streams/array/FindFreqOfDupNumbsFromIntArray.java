package com.test.java8.streams.array;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
int a[]= {1,2,4,4,2,5};
2=2
4=2
Find the frequency of duplicate numbers
 */
public class FindFreqOfDupNumbsFromIntArray {
    public static void main(String[] args) {
        int[] inputArray = {1,2,4,4,2,5};
        Map<Integer, Long> result = IntStream.of(inputArray)
                .mapToObj(c -> c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue()));

        System.out.println("print the result : " + result);
    }
}
