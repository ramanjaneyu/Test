package com.test.java8.streams.map;

import com.test.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ResultToMap {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee(101, "varun", 1000, 30, "CS"),
                new Employee(102, "shyam", 2000, 30, "CS"),
                new Employee(103, "kiran", 3000, 30, "IT"),
                new Employee(104, "ravi", 4000, 30, "IT"));
        Map<Integer, Employee> result= employeeList.stream()
                .filter(emp -> emp.getSalary() > 2000)
                .collect(Collectors.toMap(emp -> emp.getEmpId(), emp -> emp));
        System.out.println("Print result : " + result);
    }
}
