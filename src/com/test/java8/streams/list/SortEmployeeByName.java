package com.test.java8.streams.list;

import com.test.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeeByName {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee(101, "varun", 1000, 30, "CS"),
                new Employee(102, "shyam", 2000, 30, "CS"),
                new Employee(103, "kiran", 3000, 30, "IT"),
                new Employee(104, "ravi", 4000, 30, "IT"));

        List<Employee> sortedList = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getEmpName))
                .collect(Collectors.toList());
        System.out.println("Print sorted employee list : " + sortedList);
    }
}
