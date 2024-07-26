package com.test.java8.streams.list;

import com.test.common.models.Employee;
import com.test.common.models.Manager;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Write a program to convert a Employee object into Manager object based on some condition like whenever employee salary
is greater than 50,000
 */
public class ConvertEmpToManagerObjectUsingMap {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(new Employee(1, "raman", 60000, 20, "Admin"),
                    new Employee(2, "rajesh", 2000, 25, "Admin"));
        List<Manager> managers = empList.stream()
                                        .filter(emp -> emp.getSalary() > 50000)
                                        .map(emp -> new Manager(emp.getEmpId(), emp.getEmpName(), emp.getSalary()))
                                        .collect(Collectors.toList());
        System.out.println("Manager list : " + managers);
    }
}
