package com.test.java8.streams.list;

import com.test.Employee;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
/*
Program to filter the employee list whose name starts with "R" and the salary is greater than 10000
and print the result in a map with empId as key and employee object as value.
 */
public class MultipleFiltersWithMapOutput {
    public static void main(String[] args) {
        List<Employee> employeeList = List.of(new Employee(101, "Ram", 10000, 35, "IT"),
                new Employee(102, "Sam", 20000, 30, "CS"),
                new Employee(103, "Raj", 30000, 25, "CS"),
                new Employee(104, "Sam", 5000, 35, "IT"));

        Map<Integer, Employee> result = employeeList.stream()
                .filter(emp -> emp.getEmpName().startsWith("R"))
                .filter(emp -> emp.getSalary() > 10000)
                .collect(Collectors.toMap(Employee::getEmpId, Function.identity()));

        System.out.println("Print result : " + result);
    }
}
