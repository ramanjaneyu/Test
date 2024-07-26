package com.test.java8.streams.list;

import com.test.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Program to group by city and find the no. of employees in the resp cities
 */
public class StreamFiltersExample {

    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee(101, "ram", 2000, 30, "IT"),
                new Employee(102, "raj", 2000, 30, "CS"),
                new Employee(103, "kiran", 2000, 30, "IT"),
        new Employee(104, "sam", 2000, 30, "CS"));

        Map<String, Long> resultMap = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDept,
                        Collectors.counting()));

        System.out.println("Print the result : " + resultMap);

    }
}

