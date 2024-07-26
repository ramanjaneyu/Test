package com.test.core.programs;

import java.util.*;
/*
Write a program to find the duplicate words and the count of the duplicate words.
 */
public class FindDuplicateWordsCountFrequentcy {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("big", "black", "bug", "bit", "a", "big", "black", "dog", "on", "his",
                "big", "black", "nose");
        Collections.sort(words);
        System.out.println("Sorted list : " + Arrays.asList(words));
        Map<String, Integer> duplicateWordMap = new HashMap<>();
        Map<String, Integer> uniqueWordMap = new HashMap<String, Integer>();
        int count = 1;
        for(String str : words){
            if(uniqueWordMap.containsKey(str)){
                count++;
                duplicateWordMap.put(str, count);
            } else {
                count = 1;
                uniqueWordMap.put(str, 1);
            }
        }
        System.out.println("Print duplicate words and its frequency : " + duplicateWordMap);
    }
}
