package com.test.core.programs;

import java.util.LinkedHashMap;
import java.util.Map;
/*
Given a string s, find the length of the longest substring without repeating characters.
a) Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
b) Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
 */
public class FindLongestSubStringWithoutRepeatingChars {
    public static void main(String[] args) {
        String input = "abcabcbb";

        String longestSubstring = null;
        int longestSubstringLength = 0;

        if(input != null && !input.equals("")){
            char[] charArray = input.toCharArray();
            Map<Character, Integer> resultMap = new LinkedHashMap<>();
            for(int i = 0; i < charArray.length; i++) {
                if(!resultMap.containsKey(charArray[i])){
                    resultMap.put(charArray[i], i);
                } else {
                    i = resultMap.get(charArray[i]);
                    resultMap.clear();
                }
                if(resultMap.size() > longestSubstringLength)
                {
                    longestSubstringLength = resultMap.size();
                    longestSubstring = resultMap.keySet().toString();
                }
            }
            System.out.println("Size of the string : " + longestSubstringLength);
            System.out.println("Longest substring is : " + longestSubstring);
        }
    }
}
