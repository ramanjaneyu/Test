package com.test.java8.streams.map;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
/*
Write a program for FlatMap Demo
 */
public class    FlatMapDemo {
    public static void main(String[] args) {
        String[] strings = {"ram", "kri"};
        List<List<String>> list = Arrays.asList(
                Arrays.asList("Sample1", "Test1"),
                Arrays.asList("Sample2", "Test2"),
                Arrays.asList("Sample3", "Test3")
        );
        List<String> resultList = list.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println("Print result : " + resultList);
    }
}
