package com.test.java8.multithreading.completablefuture;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.java8.multithreading.completablefuture.model.Employee;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
runAsync() method won't return anything. If you don't require any return value then we can use runAsync()
This program will process the employees data in employees.json file and store in DB(Here we are not writing logic for DB store).
 */
public class RunAsyncDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //RunAsyncDemo.saveEmployee(new File("employees.json"));
        RunAsyncDemo.saveEmployeeWithCustomExecutor(new File("employees.json"));
    }
    //If we are not passing any Threadpool to CompletableFuture then by default it uses ForkJoinPool
    public static Void saveEmployee(File jsonFile) throws ExecutionException, InterruptedException {
        ObjectMapper mapper = new ObjectMapper();
        CompletableFuture<Void> runAsyncFuture = CompletableFuture.runAsync(() -> {
            try {
                    List<Employee> users = mapper.readValue(jsonFile, new TypeReference<List<Employee>>() {
                });
                //Here we can write logic for saving the User list into DB.
                System.out.println("Thread : " + Thread.currentThread().getName());
                users.stream().forEach(System.out::println);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        /*
        return runAsyncFuture.toCompletableFuture(); //we can also use toCompletableFuture() but if we want to print
                                                        the values we need to use get() otherwise if we want to just
                                                        save the User info in DB then no need to use get() method.
         */
        return runAsyncFuture.get(); //This is blocking operation
    }
    //Here it uses ExecutorService thread pool as we are passing our own Customer Threadpool to CompletableFuture.
    public static Void saveEmployeeWithCustomExecutor(File jsonFile) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(5);
        ObjectMapper mapper = new ObjectMapper();
        CompletableFuture<Void> runAsyncFutureWithExecutor = CompletableFuture.runAsync(() -> {
            try {
                List<Employee> users = mapper.readValue(jsonFile, new TypeReference<List<Employee>>() {
                });
                //Here we can write logic for saving the User list into DB.
                System.out.println("Thread : " + Thread.currentThread().getName());
                users.stream().forEach(System.out::println);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }, service);
        return runAsyncFutureWithExecutor.get();
    }
}
