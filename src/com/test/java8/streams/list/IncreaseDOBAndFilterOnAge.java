package com.test.java8.streams.list;

import com.test.common.models.Employee3;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Increase the dob by 1 day and filter by age greater than 30
Input:
[ {name: "varun", age: 30, dob: "2014-01-20"},
{name: "shyam", age: 31, dob: "1990-02-21"},
{name: "kiran", age: 30, dob: "1992-02-22"},
{name: "ravi", age: 32, dob: "1993-02-23"},
 ]
Output:
[Employee{empId=102, empName='shyam', dob='1990-02-22', age=31}, Employee{empId=104, empName='ravi', dob='1993-02-24', age=32}]
*/
public class IncreaseDOBAndFilterOnAge {
    public static void main(String[] args) {
        List<Employee3> employeeList = Arrays.asList(
                new Employee3(101, "varun", 30,"2014-01-20"),
                new Employee3(102, "shyam", 31, "1990-02-21"),
                new Employee3(103, "kiran", 30, "1992-02-22"),
                new Employee3(104, "ravi", 32, "1993-02-23"));

        List<Employee3> result = employeeList.stream()
                .map(emp -> {
                    String age = LocalDate.parse(emp.getDob()).plusDays(1).toString();
                    emp.setDob(age);
                    return emp;
                })
                .filter(emp -> emp.getAge() > 30)
                .collect(Collectors.toList());
        System.out.println("Print the result : " + result);
    }
}
