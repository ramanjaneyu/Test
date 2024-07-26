package com.test.java8.multithreading.completablefuture;

import com.test.java8.multithreading.completablefuture.model.Employee;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.*;

/*
SupplyAsnc is used if you want to return any value then we use this method.
In this example, we will get the data from DB and return the result.
 */
public class SupplyAsyncDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        SupplyAsyncDemo supplyAsyncDemo = new SupplyAsyncDemo();
        List<Employee> userList = supplyAsyncDemo.getEmployees();
        userList.stream().forEach(System.out::println);
    }
    public List<Employee> getEmployees() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        CompletableFuture<List<Employee>> supplyAsyncFuture = CompletableFuture.supplyAsync(() -> {
                System.out.println("Executed by : " + Thread.currentThread().getName());
                return EmployeeRepository.fetchEmployees();

        }, executorService);
        return supplyAsyncFuture.get();
    }
}
