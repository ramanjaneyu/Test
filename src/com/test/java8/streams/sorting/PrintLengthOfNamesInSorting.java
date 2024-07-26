package com.test.java8.streams.sorting;

import java.util.List;
import java.util.stream.Collectors;
/*
From this list Collect the length of names begining with letter R and sort them in ascending order. Prnt the list

    [Ram, Babloo, Guddu, Rajesh, Remo]
    [3 , 6, 4]
    [3, 4, 6]
 */
public class PrintLengthOfNamesInSorting {
    public static void main(String[] args) {
        List<String> inputList = List.of("Ram", "Babloo", "Guddu", "Rajesh", "Remo");
        List<Integer> result = inputList.stream()
                .filter(str -> str.startsWith("R"))
                .map(str -> str.length())
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Print the result : " + result);
    }
}
