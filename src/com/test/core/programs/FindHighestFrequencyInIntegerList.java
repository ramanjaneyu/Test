package com.test.core.programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
find the highest frequency in the given list
input: {1, 1, 1, 2, 2, 2, 1, 1, 1, 1, 2, 2, 2, 2}
Output: 1 and 2
*/
public class FindHighestFrequencyInIntegerList {
    public static void main(String[] args) {
        int[] inputArray = {1, 1, 1, 2, 2, 2, 1, 1, 1, 1, 2, 2, 2, 2};
        Map<Integer, Integer> result = new HashMap<>();

        for(int i = 0; i < inputArray.length; i++){
            if(result.containsKey(inputArray[i])){
                result.put(inputArray[i], result.get(inputArray[i]) + 1);
            } else{
                result.put(inputArray[i], 1);
            }
        }
        int maxFreq = 0;
        Set<Integer> resultSet = new HashSet<>();
        for(Map.Entry<Integer, Integer> entry : result.entrySet()){
            int count = entry.getValue();
            int element = entry.getKey();
            if(count > maxFreq){
                maxFreq = count;
                resultSet.clear();
                resultSet.add(entry.getKey());
            } else if(count == maxFreq){
                resultSet.add(entry.getKey());
            }
        }
        System.out.println("Print Highest Frequent element : " + resultSet);
    }
}
