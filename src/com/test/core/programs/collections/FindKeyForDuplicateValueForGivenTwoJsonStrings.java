package com.test.core.programs.collections;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;
/*
java program for given two json strings and find the list of keys for which the values are different
 */
public class FindKeyForDuplicateValueForGivenTwoJsonStrings {

    public static void main(String[] args) throws JsonProcessingException {

        String s1 = "{\"Hi\":\"Hello\",\"Name\":\"Donal\",\"Address\":\"AMERICA\"}";
        String s2 = "{\"Hi\":\"Helloo\",\"Name\":\"Donal\",\"Address\":\"AMERICA\"}";
        ObjectMapper mapper = new ObjectMapper();
        Map<String, String> map1 = mapper.readValue(s1, new TypeReference<Map<String, String>>() {});
        Map<String, String> map2 = mapper.readValue(s2, new TypeReference<Map<String, String>>() {});
        System.out.println("Print map1 : " + map1);
        System.out.println("Print map2 : " + map2);
        List<String> result = new ArrayList<>(map1.values());
        result.addAll(map2.values());
        Set<String> uniqueSet = new LinkedHashSet<>(result);
        List<String> finalResult = new ArrayList<>();
        for(String s : uniqueSet){
            if(Collections.frequency(result, s) == 1){
                finalResult.add(s);
                break;
            };
        }
        System.out.println("Print result : " + Arrays.asList(finalResult));
        for(Map.Entry<String, String> entry : map1.entrySet()){
            if(entry.getValue().equals(finalResult.get(0))){
                System.out.println("Print map key value : " + entry.getKey());
            }
        }
    }
}
