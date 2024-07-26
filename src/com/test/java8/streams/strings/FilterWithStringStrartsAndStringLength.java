package com.test.java8.streams.strings;

import java.util.Arrays;
import java.util.List;

/*
list of string contains words, starts with 'a' and length == 3
 */
public class FilterWithStringStrartsAndStringLength {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("ram", "avinash", "rakesh", "ara", "abc");
        List<String> result = stringList.stream()
                .filter(str -> str.startsWith("a") && str.length() == 3)
                .toList();
        System.out.println("print result : " + result);
    }
}
