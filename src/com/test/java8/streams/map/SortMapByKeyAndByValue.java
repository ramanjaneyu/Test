package com.test.java8.streams.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
/*
Program to sort a map by keys in ascending and by values in descending order
 */
public class SortMapByKeyAndByValue {

    public static void main(String[] args) {
        Map<String, Integer> unsortMap = new HashMap<>();
        unsortMap.put("alex", 1);
        unsortMap.put("david", 5);
        unsortMap.put("elle", 3);
        unsortMap.put("charles", 4);
        unsortMap.put("brian", 2);

        //Sort by keys in ascending order
        //In toMap() method, second argument is mergeFunction and this argument is used whenever there are duplicate keys in Map then mergeFunction will
        //replace the oldvalue with newValue.
        Map<String, Integer> sortedMap = unsortMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        System.out.println("Print result after sorting by keys : " + sortedMap);

        //Sort by Values in descending order
        Map<String, Integer> sortedDescMap = unsortMap.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue(), (oldValue, NewValue) -> oldValue, LinkedHashMap::new));
        System.out.println("Print result after reverse sort by values : " + sortedDescMap);
    }
}
