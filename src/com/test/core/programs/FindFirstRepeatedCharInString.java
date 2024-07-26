package com.test.core.programs;

import java.util.HashSet;
import java.util.Set;

/*
Find first repeated char (case-insensitive) in a string
Input: "my naMe is raman"
Output: m
 */
public class FindFirstRepeatedCharInString {
    public static void main(String[] args) {
        String input = "my naMe is raman";
        if(input== null || input.isEmpty() || input.isBlank()){
            System.out.println("String is empty");
        } else {
            char[] charArray = input.toLowerCase().replaceAll(" ", "").toCharArray();
            Set<Character> resultSet = new HashSet<>();
            for(Character c : charArray){
                if(!resultSet.add(c)){
                    System.out.println("First repeated char is : " + c);
                    break;
                }
            }
        }
    }
}
