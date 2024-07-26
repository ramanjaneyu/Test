package com.test.java8.streams.list;

import com.test.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Program to convert a List of objects into a Map where the id is the key and the object is the value of the Map
 */
public class ListToMapConversion {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee(101, "ram", 30000, 30, "IT"),
                new Employee(102, "raj", 30000, 30, "IT"),
                new Employee(103, "sam", 30000, 30, "IT"));
        Map<Integer, Employee> resultMap = employeeList.stream()
                .collect(Collectors.toMap(emp -> emp.getEmpId(), emp -> emp));
        System.out.println("Print result : " + resultMap);
    }
}
