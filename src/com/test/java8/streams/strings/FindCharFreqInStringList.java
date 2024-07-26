package com.test.java8.streams.strings;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
/*
https://www.educative.io/answers/how-to-calculate-a-frequency-map-in-java-8p
To find the frequency of each character in List of strings
Output:
result : {a=6, C=1, e=1, g=1, h=3, i=1, j=1, K=2, l=1, ,=5, m=1, n=2, r=3, R=3, s=1, u=1, y=2}
 */
public class FindCharFreqInStringList {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Ram",
                "Krishna",
                "Raghu",
                "Raj",
                "Kalyan",
                "Cherry");

/*      //Splitting using core java
        String str = names.toString().replaceAll(" ", "");
        Map<Character, Long> result = str.substring(1, str.length() -1).chars()
                .mapToObj(e -> (char)e)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("result : " + result);
*/

        //Splitting using java8
        Map<Character, Long> result1 = names.stream()
                .collect(Collectors.joining())
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("result : " + result1);
    }
}
