package com.test.java8.multithreading.completablefuture;
import java.util.stream.Collectors;
import com.test.java8.multithreading.completablefuture.model.Employee;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/*
thenApplyAsync() - After getting the result of one thread if we want to take that result as an input and do further
data processing/manipulation we use thenApply(). In the below example, first task is fetching the employee data
and using the result of task1, we are filtering newly joined employees using thenApply() method and also doing
further operations
thenApplyAsync() -> this method will execute each task in different thread.

This class will do the following tasks
Task 1: Fetch Employee Data from DB
Task 2: Filter all new Joined Employees
Task 3: Check if training is pending for the employee
Task 4: Get the employee email id
Task 5: Send email notification to the employees
 */
public class ThenApplyAsyncDemo {
    public CompletableFuture<Void> sendReminderToEmployee(){
        ExecutorService service = Executors.newFixedThreadPool(5);
        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("Fetch employee Thread name : " + Thread.currentThread().getName());
            return EmployeeRepository.fetchEmployees();
        }, service).thenApplyAsync((employees) -> {
            System.out.println("Filter all new joined employees Thread name : " + Thread.currentThread().getName());
            return employees.stream()
                    .filter(emp -> "TRUE".equalsIgnoreCase(emp.getNewJoiner()))
                    .collect(Collectors.toList());
        }, service).thenApplyAsync((employees) -> {
            System.out.println("Check if training is pending for employees Thread name : " + Thread.currentThread().getName());
            return employees.stream().filter(emp -> "TRUE".equalsIgnoreCase(emp.getLearningPending())).collect(Collectors.toList());
        }, service).thenApplyAsync((employees) -> {
            System.out.println("Get the employee email ids Thread name : " + Thread.currentThread().getName());
            return employees.stream()
                    .map(Employee::getEmail)
                    .collect(Collectors.toList());
        }, service).thenAcceptAsync((emails) -> {
            System.out.println("Send Notification Thread : " + Thread.currentThread().getName());
            emails.stream().forEach(ThenApplyAsyncDemo::sendNotification);
        }, service);
        return voidCompletableFuture;
    }
    public static void sendNotification(String email){
        System.out.println("Sending email notification :" + email);
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThenApplyAsyncDemo thenApplyAsyncDemo = new ThenApplyAsyncDemo();
        thenApplyAsyncDemo.sendReminderToEmployee().get();
    }
}
