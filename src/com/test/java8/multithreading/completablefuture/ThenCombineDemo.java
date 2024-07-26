package com.test.java8.multithreading.completablefuture;

import lombok.Data;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
/*
thenCombine() combines results from two different asynchronous tasks
*/
public class ThenCombineDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        thenCombineUsingDiffObjects();
        thenCombineUsingIntegers();
    }
    //combining two integers and printing the result.
    private static void thenCombineUsingIntegers() {
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> 5);
        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> 10);
        CompletableFuture<Integer> combinedFutures = future1.thenCombine(future2, (r1, r2) -> r1 * r2);
        //use thenAccept() method takes the consumer function and print the result
        combinedFutures.thenAccept(result -> System.out.println(result));
    }

    //Combining two different objects into one response dto object
    private static void thenCombineUsingDiffObjects() throws InterruptedException, ExecutionException {
        CompletableFuture<Product> future1 = CompletableFuture.supplyAsync(() -> {
            System.out.println("future1 called");
            Product product = new Product();
            product.setId(101);
            product.setName("Prod1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return product;
        });
        CompletableFuture<Item> future2 = CompletableFuture.supplyAsync(() -> {
            System.out.println("future2 called");
            Item item = new Item();
            item.setId(102);
            item.setName("Item1");
            item.setQuantity(10);
            item.setPrice(500);
            return item;
        });
        CompletableFuture<ResponseDTO> result = future1.thenCombine(future2, (r1, r2) -> {
            ResponseDTO responseDTO = new ResponseDTO();
            responseDTO.setProduct(r1);
            responseDTO.setItem(r2);
            return responseDTO;
        });
        System.out.println(result.get());
        System.out.println("CompletableFuture completed");
    }
}
@Data
class ResponseDTO{
    private Product product;
    private Item item;
}
@Data
class Product{
    private int id;
    private String name;
}
@Data
class Item{
    private int id;
    private String name;
    private int quantity;
    private int price;
}