package com.test.java8;

import java.util.Optional;
/* Creation of Optional class in different ways */
public class OptionalDemo {
    public static void main(String[] args) {

        Optional<String> optional = Optional.empty();
        System.out.println("Optional.empty() : " + optional);

        //Optional class using of() method
        //String str = null;
        //Optional<String> optionalOf = Optional.of(str);  //This will throw NullPointerException if the string is null.
        //System.out.println("Optional using of() : " + optionalOf);

        //Optional class creation using ofNullable() method
        String str1 = null;
        Optional<String> optionalOfNullable = Optional.ofNullable(str1);  //This won't throw NPE
       // System.out.println("Optional using ofNullable() : " + optionalOfNullable); //Prints empty Optional class

        //ifPresent
        if(optionalOfNullable.isPresent()){
            System.out.println("Print optional of : " + optionalOfNullable.get());
        }
        optionalOfNullable.ifPresent(System.out::println);
    }
}
