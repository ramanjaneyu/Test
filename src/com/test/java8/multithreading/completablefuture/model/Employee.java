package com.test.java8.multithreading.completablefuture.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor(staticName = "build")
public class Employee {
    private int id;
    private String name;
    private String email;
    private String gender;
    private String learningPending;
    private String newJoiner;

}
