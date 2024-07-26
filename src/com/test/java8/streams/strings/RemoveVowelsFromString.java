package com.test.java8.streams.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
Remove vowels from provided string using java 8
        vowels -> aeiou
        input -> what is your name ?
        output -> "wht s yr nm ?"
 */
public class RemoveVowelsFromString {
    public static void main(String[] args) {
        String str = "what is your name ?";
        Set<Character> vowelSet = Set.of('a', 'e', 'i', 'o', 'u');
        /*String result  = str.chars()
                .filter(ch -> (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'))
                .mapToObj(ch -> String.valueOf((char) ch))
                .collect(Collectors.joining());*/

        //2nd way using replaceAll() method in String
        String result  = str.chars()
                .mapToObj(ch -> String.valueOf((char) ch))
                .map(ch -> ch.replaceAll("[AEIOUaeiou]", ""))
                .collect(Collectors.joining());
        System.out.println("Print result : " + result);
    }
}
