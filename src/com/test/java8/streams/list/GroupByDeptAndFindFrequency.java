package com.test.java8.streams.list;

import com.test.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Program to group the employee list based on Dept and find the frequency of employees in each dept
 */
public class GroupByDeptAndFindFrequency {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee(101, "ram", 20000, 30, "IT"),
                new Employee(102, "raj", 30000, 30, "CS"),
                new Employee(103, "sam", 40000, 30, "CS"),
                new Employee(104, "kiran", 20000, 30, "CS"));

        Map<String, Long> resultMap = employeeList.stream()
                .collect(Collectors.groupingBy(emp -> emp.getDept(), Collectors.counting()));

        System.out.println("Print the result : " + resultMap);
    }
}
