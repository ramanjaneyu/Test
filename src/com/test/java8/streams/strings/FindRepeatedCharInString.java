package com.test.java8.streams.strings;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
/*
Repeated character in a String using Stream
Input :  javaj
Output : a -> 2, j -> 2
 */
public class FindRepeatedCharInString {
    public static void main(String[] args) {
            String input = "javaj";
        Set<Integer> unique = new HashSet<>();
        Map<Character, Long> result = input.chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("Print result : " + result);
        /*result.forEach((k, v) -> {
            if (v > 1) {
                System.out.println(k + " : " + v);
            }
        });*/
    }
}
