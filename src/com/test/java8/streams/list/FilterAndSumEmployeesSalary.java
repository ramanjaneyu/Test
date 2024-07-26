package com.test.java8.streams.list;

import com.test.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Program to filter the employees salary > 2000 and the sum of their employee salaries
 */
public class FilterAndSumEmployeesSalary {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee(101, "varun", 1000, 30, "CS"),
                new Employee(102, "shyam", 2000, 30, "CS"),
                new Employee(103, "kiran", 3000, 30, "IT"),
                new Employee(104, "ravi", 4000, 30, "IT"));

        int sum = employeeList.stream()
                .filter(emp -> emp.getSalary() > 2000)
                .collect(Collectors.summingInt(Employee::getSalary));
        System.out.println("Sum of employees salaries greater than 2000 : " + sum);
    }
}
