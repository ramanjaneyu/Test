package com.test.java8.streams.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
Program to sort list of strings by its length and sort alphabetical
input : ["ram", "shyam", "bheem", "krish", "tester", "deepak", "five", "two"]
output: ["ram", "two", "five", "bheem", "krish", "shyam", "deepak", "tester"]
*/
public class SortingWithLengthAndName {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("ram", "shyam", "bheem", "krish", "tester", "deepak", "five", "two");
        List<String> output = input.stream()
                .sorted()
                .sorted(Comparator.comparing(str -> str.length()))
                .collect(Collectors.toList());

        System.out.println("Print the result : " + output);
    }
}
