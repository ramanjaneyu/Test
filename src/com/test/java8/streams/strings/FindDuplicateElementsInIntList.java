package com.test.java8.streams.strings;

import java.util.*;
import java.util.stream.Collectors;
/*
Program to find duplicate numbers repeated more than 2 times
Input: 10,15,8,29,25,98,98,22,15,15,8,29,29,98
Output: [15, 29, 98]
 */
public class FindDuplicateElementsInIntList {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(98,10,15,8,29,25,98,98,22,15,15,8,29,29,98);

        List<Integer> duplicates = myList.stream()
                .collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(p -> p.getValue() > 2)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        /*This is another way of finding the duplicates in an int array */
        //Set<Integer> result = myList.stream().filter(i -> Collections.frequency(myList, i) > 2).collect(Collectors.toSet());
        System.out.println("Print result :  " + duplicates);
    }
}
