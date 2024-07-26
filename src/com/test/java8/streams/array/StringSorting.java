package com.test.java8.streams.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringSorting {
    public static void main(String[] args) {
        String str = "AGBD";
        String[] splitStrArray = str.split("");
        List<String> stringList = Arrays.stream(splitStrArray).sorted().collect(Collectors.toList());
        System.out.println("Print sorted list : " + Arrays.asList(stringList));
    }
}
