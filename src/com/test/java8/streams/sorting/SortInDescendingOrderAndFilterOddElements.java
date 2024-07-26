package com.test.java8.streams.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
/*
Sort the list in descending order and filter only the odd elements
(please use java 8 for this)
   Input : List 1,3,5,9,2,4,6,3
   Output : List 9,5,3,3,1
 */
public class SortInDescendingOrderAndFilterOddElements {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,3,5,9,2,4,6,3);
        List<Integer> result = integerList.stream()
                .sorted(Comparator.reverseOrder())
                .filter(i -> i%2 != 0)
                .collect(Collectors.toList());
        System.out.println("Print result : " + Arrays.asList(result));
    }
}
