package com.test.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesUsingDistinct {
    public static void main(String[] args) {
        List<Integer> duplicateList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
        List<Integer> withoutDuplicates = duplicateList.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("List without duplicates : " + withoutDuplicates);
    }
}
