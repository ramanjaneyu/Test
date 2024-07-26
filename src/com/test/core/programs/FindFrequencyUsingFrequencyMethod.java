package com.test.core.programs;

import java.util.*;
/*
Find frequency of strings using Collections.frequency() method
 */
public class FindFrequencyUsingFrequencyMethod {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Ram",
                "Krishna",
                "Cherry",
                "Ram",
                "Ram",
                "Kalyan",
                "Cherry"
        );
        Set<String> stringSet = new LinkedHashSet<>(names);
        for(String s : stringSet){
            System.out.println(s + ": " + Collections.frequency(names, s));
        }
    }
}
