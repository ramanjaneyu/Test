package com.test.java8.predefinedfunctionalinterfaces;

import java.util.function.*;
/*
Examples of Predefined Functional Interfaces
 */
public class PredefinedFunctionalInterfacesDemo {
    public static void main(String[] args) {
        //Predicate will take one parameter as input and return Boolean value
        Predicate<Integer> predicate = i -> i % 2 == 0;
        System.out.println("Check whether the given number is Even or Odd using Predicate : " + predicate.test(10)); //return true

        //BiPredicate will take two parameters as input and return Boolean value
        BiPredicate<String, String> biPredicate = (str1, str2) -> str1.equals(str2);
        System.out.println("Compare two strings equal or not using BiPredicate : " + biPredicate.test("Raman", "Raman1"));

        //Function will take one input and return any type value.
        Function<String, Integer> function = str -> str.length();
        System.out.println("Print the given string using Function : " + function.apply("Raman"));

        //BiFunction will take two input parameters and return any type value.
        BiFunction<String, String, String> biFunction = (str1, str2) -> str1 + " " + str2;
        System.out.println("Join two string using BiFunction : " + biFunction.apply("Nukala", "Raman"));

        //Consumer will take one input and won't return anything
        Consumer<String> consumer = (str) -> System.out.println("Welcome " + str);
        consumer.accept("Raman");

        //BiConsumer - will take two arguments and won't return any value
        BiConsumer<String, String> biConsumer = (str1, str2) -> System.out.println(str1 + str2);
        biConsumer.accept("Nukala", "Raman");

        //Supplier - Will return any value but won't take any input value
        Supplier<Double> supplier = () -> Math.random();
        System.out.println("Print some Random number Supplier function : " + supplier.get());
    }
}
