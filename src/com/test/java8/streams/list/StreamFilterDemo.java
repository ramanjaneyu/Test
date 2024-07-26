package com.test.java8.streams.list;

import com.test.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
Program to filter list of employees whose salary is greater than 10000
 */
public class StreamFilterDemo {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee(101, "zzam", 15000, 30, "IT"),
                new Employee(102, "bb", 10000, 30, "IT"),
                new Employee(103, "sam", 9000, 30, "IT"),
                new Employee(104, "aa", 18000, 30, "IT"));

        List<Employee> employees = employeeList.stream()
                .filter(emp -> emp.getSalary() > 10000)
                .sorted(Comparator.comparing(Employee::getEmpName))
                .collect(Collectors.toList());

        System.out.println("Filtered list " + Arrays.asList(employees));
    }
}
