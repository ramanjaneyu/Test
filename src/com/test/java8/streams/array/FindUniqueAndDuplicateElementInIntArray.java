package com.test.java8.streams.array;
/*
int a[] = {1,2,2,6,7,9,5,8}
	perform below operation in stream
	1. find unique element
	2. find duplicate element
*/
public class FindUniqueAndDuplicateElementInIntArray {
    public static void main(String[] args) {
        /*int a[] = {1,2,2,6,7,9,5,8};
        Map<Integer, Long> result = Arrays.stream(a).mapToObj(i -> i).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                        .entrySet()
                                .stream()
                                        .filter(entry -> entry.getValue() > 1)
                                                .collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue()));
        System.out.println(result);*/
    }
}
