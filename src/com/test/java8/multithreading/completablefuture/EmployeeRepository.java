package com.test.java8.multithreading.completablefuture;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.java8.multithreading.completablefuture.model.Employee;

import java.io.File;
import java.io.IOException;
import java.util.List;
public class EmployeeRepository {

    //In real-time, we will the Users data from DB. Here we are hard-coded the data.
    public static List<Employee> fetchEmployees()  {
        ObjectMapper mapper = new ObjectMapper();
        List<Employee> employees = null;
        try {
            employees = mapper.readValue(new File("employees.json"), new TypeReference<List<Employee>>() {
        });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return employees;
    }
}
