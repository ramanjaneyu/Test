package com.test.core.programs.arrays;
/*
Find the longest common prefix string among an array of strings
Input: {"amazon", "amazed", "amaze", "amazing", "amazes"}
Output: amaz
 */
public class FindLongestPrefixInStringArray {
    public static void main(String[] args) {
        String[] inputArray = {"amazon", "amazed", "amaze", "amazing", "amazes"};
        String prefix = inputArray[0];
        for(int i = 1; i < inputArray.length; i++){
            while(inputArray[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        System.out.println(prefix);
    }
}
