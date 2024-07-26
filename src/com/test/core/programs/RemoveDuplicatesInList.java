package com.test.core.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
How to remove duplicate elements in an integer list without using any inbuilt API methods.
 */
public class RemoveDuplicatesInList {
    public static void main(String[] args) {
        List<Integer> duplicateList = Arrays.asList(1, 2, 3, 1, 5, 2);
        List<Integer> uniqueList = new ArrayList<>();
        for(int i : duplicateList){
            if(!uniqueList.contains(i)){
                uniqueList.add(i);
            }
        }
        System.out.println("Print unique list : " + Arrays.asList(uniqueList));

    }
}
