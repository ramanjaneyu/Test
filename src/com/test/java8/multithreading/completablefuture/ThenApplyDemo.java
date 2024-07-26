package com.test.java8.multithreading.completablefuture;
import java.util.stream.Collectors;
import com.test.java8.multithreading.completablefuture.model.Employee;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
/*
thenApply() - After getting the result of one thread if we want to take that result as an input and do further
data processing/manipulation we use thenApply(). In the below example, first task is fetching the employee data
and using the result of task1, we are filtering newly joined employees using thenApply() method and also doing
further operations
thenApply() -> this method will execute all tasks by using a single thread.

This class will do the following tasks
Task 1: Fetch Employee Data from
Task 2: Filter all new Joined Employees
Task 3: Check if training is pending for the employee
Task 4: Get the employee email id

 */
public class ThenApplyDemo {
    public CompletableFuture<Void> sendReminderToEmployee(){
        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("Fetch employee Thread name : " + Thread.currentThread().getName());
            return EmployeeRepository.fetchEmployees();
        }).thenApply((employees) -> {
            System.out.println("Filter new joined Employees Thread : " + Thread.currentThread().getName());
            return employees.stream()
                    .filter(employee -> "TRUE".equalsIgnoreCase(employee.getNewJoiner()))
                    .collect(Collectors.toList());
        }).thenApply((employees) -> {
            System.out.println("Check if training is pending Thread : " + Thread.currentThread().getName());
            return employees.stream()
                    .filter(employee -> "TRUE".equalsIgnoreCase(employee.getLearningPending()))
                    .collect(Collectors.toList());
        }).thenApply((employees) -> {
            System.out.println("Get employee email id Thread : " + Thread.currentThread().getName());
            return employees.stream()
                    .map(Employee::getEmail).collect(Collectors.toList());
        }).thenAccept((emails) -> {
            System.out.println("Send Notification Thread : " + Thread.currentThread().getName());
            emails.forEach(ThenApplyDemo::sendNotification);
        });
        return voidCompletableFuture;
    }
    public static void sendNotification(String email){
        System.out.println("Sending email : " + email);
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThenApplyDemo employeeReminderService = new ThenApplyDemo();
        employeeReminderService.sendReminderToEmployee().get();
    }
}
