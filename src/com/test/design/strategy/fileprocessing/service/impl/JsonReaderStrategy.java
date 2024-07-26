package com.test.design.strategy.fileprocessing.service.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.java8.multithreading.completablefuture.model.Employee;
import com.test.design.strategy.fileprocessing.service.FileReaderStrategy;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class JsonReaderStrategy implements FileReaderStrategy {
    @Override
    public void readFile(File jsonFile) throws ExecutionException, InterruptedException {
        System.out.println("JsonReader Strategy Strategy invoked...");
        ObjectMapper mapper = new ObjectMapper();
        CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(() -> {
            try {
                List<Employee> employeeList = mapper.readValue(jsonFile, new TypeReference<List<Employee>>() {
                });
                //employeeList.stream().forEach(System.out::println);
                System.out.println("Print result : " + employeeList);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        //completableFuture.get();
//        completableFuture.toCompletableFuture();
    }
}
