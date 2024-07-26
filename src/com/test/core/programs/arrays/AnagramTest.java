package com.test.core.programs.arrays;

import java.util.Arrays;
/*
Java program to check if two strings are Anagrams
i.e, Two strings are said to be anagram if we can form one string by arranging the characters of another string.
For example, Anagram of Race is Care and heart is earth and "abc" is "cba", or "cab", "bac"....
 */
public class AnagramTest {

    public static void main(String[] args) {

        String input1 = "Race";
        String input2 = "Care";

        if(input1.length() == input2.length()){
            char[] inputArray1 = input1.toLowerCase().toCharArray();
            char[] inputArray2 = input2.toLowerCase().toCharArray();

            Arrays.sort(inputArray1);
            Arrays.sort(inputArray2);
            if(Arrays.equals(inputArray1, inputArray2)) {
                System.out.println(input1 + " and " + input2 + " are anagram.");
            }
            else {
                System.out.println(input1 + " and " + input2 + " are not anagram.");
            }
        } else {
            System.out.println(input1 + " and " + input2 + " are not anagram.");
        }
    }
}
