package com.test.java8.streams.strings;

import java.util.Arrays;

/*
Program to convert a string array into integer array and the result should be an int[] array
*/
public class ConvertStringArrayIntoIntArray {
    public static void main(String[] args) {
        String[] stringArray = {"1", "3", "2", "abc", "8", "7"};

        int[] intArray = Arrays.stream(stringArray)
                .mapToInt(e -> {
                    try{
                        int i = Integer.parseInt(e);
                        return i;
                    }catch (NumberFormatException ex){
                        return 0;
                    }
                })
                .sorted()
                .toArray();
        System.out.println("Print the output intArray : " + Arrays.toString(intArray));
    }
}