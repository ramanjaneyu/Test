package com.test.core.programs;

import java.util.LinkedHashMap;
import java.util.Map;

/*
Write a program which takes a string and the output of the string will be
compressed string
input : abbbcc
output: a1b3c2
 */
public class CompressedString {
    public static void main(String[] args) {
        String input = "abbbcc";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(int i = 0; i < input.length(); i++){
            if(map.containsKey(input.charAt(i))){
                map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
            } else {
                map.put(input.charAt(i), 1);
            }
        }
        map.forEach((key, value) -> System.out.print(key+""+value));
    }
}
