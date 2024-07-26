package com.test.java8.streams.partitionby;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/*
Write a program to filter Odd and Even numbers in a integer list using partitionBy() method
 */
public class FilterOddEvenNumsUsingPartitionBy {
    public static void main(String[] args) {
        List<Integer> intList = List.of(2, 4, 5, 6, 8);
        Map<Boolean, List<Integer>> filteredMap = intList.stream()
                .collect(Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println("Print Even and Odd map : " + filteredMap);
    }
}
