package com.test.java8.streams.list;

import com.test.common.models.Employee;

import java.util.*;
import java.util.stream.Collectors;

/*
Find highest salary of an employee in each dept
 */
public class FindHighSalaryInEachDept {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee(1, "raman", 60000,  50, "CS"),
                new Employee(2, "rajesh", 80000, 25, "CS"),
                new Employee(2, "suresh", 3000, 23, "IT"),
                new Employee(2, "naresh", 2000, 60, "IT"));

        Map<String, Employee> byDepartment = employeeList.stream()
                                                .collect(Collectors.groupingBy(emp -> emp.getDept(), Collectors.collectingAndThen(
                                                        Collectors.maxBy(Comparator.comparingInt(emp -> emp.getSalary())), Optional::get))); //Optional is return type i.e., Employee Object
        System.out.println("Highest salary in each dept" + byDepartment);
    }
}
