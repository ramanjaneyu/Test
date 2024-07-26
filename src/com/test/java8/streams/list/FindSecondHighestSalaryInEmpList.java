package com.test.java8.streams.list;

import com.test.common.models.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
Write a program to find the second highest salary of an employee in an employee list
 */
public class FindSecondHighestSalaryInEmpList {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee(1, "raman", 60000,  50, "CS"),
                new Employee(2, "rajesh", 80000, 25, "CS"),
                new Employee(2, "suresh", 70000, 23, "IT"),
                new Employee(2, "naresh", 2000, 60, "IT"));

        List<Employee> employee = employeeList.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed())
                .skip(1).limit(1).collect(Collectors.toList());
        System.out.println(employee);
    }
}
