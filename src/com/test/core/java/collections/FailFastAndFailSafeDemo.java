package com.test.core.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastAndFailSafeDemo {
    public static void main(String[] args) {
        //failFastIterator();
        failSafeIterator();
    }
    public static void failFastIterator(){
        List<String> stringList = new ArrayList<>();
        stringList.add("Rohan Sharma");
        stringList.add("Rahul");
        stringList.add("Raj");
        Iterator iterator = stringList.listIterator();
        while(iterator.hasNext()){
            String str = (String) iterator.next();
            System.out.println(str);
            stringList.add("Raman");
        }
        //Fail-fast using Maps
        /*Map<String, String> studentName = new HashMap<>();
        studentName.put("Rohan Sharma", "Delhi");
        studentName.put("Rahul Kumar", "Mumbai");
        studentName.put("Aditya Das", "Kolkata");
        Iterator iterator = studentName.keySet().iterator();
        while(iterator.hasNext()){
            System.out.println(studentName.get(iterator.next()));
            studentName.put("Raman", "Hyd");
        }*/
    }
    public static void failSafeIterator(){
        List<String> copyOnWriteList = new CopyOnWriteArrayList<>();
        copyOnWriteList.add("Rohan Sharma");
        copyOnWriteList.add("Rahul");
        copyOnWriteList.add("Raj");
        Iterator iterator1 = copyOnWriteList.listIterator();
        while(iterator1.hasNext()){
            String str = (String) iterator1.next();
            System.out.println(str);
            copyOnWriteList.add("Raman");
        }
    }
}
