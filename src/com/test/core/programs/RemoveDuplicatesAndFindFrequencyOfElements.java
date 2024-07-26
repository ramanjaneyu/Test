package com.test.core.programs;

import java.util.*;

/*
[1,2,2,2,3,4,4,5,6,6,7,7,7,7]

a. Remove duplicates

b.Each list item how many times repeated in the list

Note: don't use the inbuilt function
 */
public class RemoveDuplicatesAndFindFrequencyOfElements {
    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(1,2,2,2,3,4,4,5,6,6,7,7,7,7);
        Map<Integer, Integer> map = new HashMap();

        for(int i : inputList){
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        Set<Integer> integerSet = new HashSet<>(inputList);
        System.out.println("Print the unique elements : " + integerSet);
        System.out.println("Print repeated frequency of the elements : " + map);
    }
}
