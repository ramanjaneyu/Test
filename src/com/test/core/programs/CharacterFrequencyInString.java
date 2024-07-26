package com.test.core.programs;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Iddentify each character and its count

 */
public class CharacterFrequencyInString {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Ram",
                "Krishna",
                "Raghu",
                "Raj",
                "Kalyan",
                "Cherry"
        );
        String nameString = names.toString().replaceAll(",", "");
        char[] charArray = nameString.substring(1, nameString.length()-1).replaceAll(" ", "").toCharArray();
        System.out.println("Print char array : " + Arrays.toString(charArray));

        Map<Character, Integer> stringMap = new HashMap();
        int count = 0;
        for(char c : charArray){
            if(!" ".equals(c) && stringMap.containsKey(c)){
                stringMap.put(c, stringMap.get(c) + 1);
            }else {
                stringMap.put(c, 1);
            }
        }
        System.out.println("print string Map : " + stringMap);
    }
}
