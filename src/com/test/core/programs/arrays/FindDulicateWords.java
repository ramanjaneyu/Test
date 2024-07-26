package com.test.core.programs.arrays;

import java.util.*;
/*
https://javahungry.blogspot.com/2020/08/find-duplicate-words-in-string.html
 */
public class FindDulicateWords {
    public static void main(String[] args) {
        String input = "Java is a programming language Python is also a programming language and object is language";
        // Converting given String to lowerCase
        input = input.toLowerCase();
        String[] stringArray = input.split(" ");
        List<String> repeatedWords = new ArrayList<>();
        // Declare HashSet of String that will contain unique words
        Set<String > uniqueWords = new HashSet<>();
        Map<String, Integer> duplicateWords = new HashMap<>();
        int count = 2;
        for(String str : stringArray){
            if(!uniqueWords.add(str)){
                //repeatedWords.add(str);
                duplicateWords.put(str, duplicateWords.get(str) == null ? count : duplicateWords.get(str) + 1);
            }
        }
        System.out.println("Print repeated words : " + duplicateWords);
    }
}
