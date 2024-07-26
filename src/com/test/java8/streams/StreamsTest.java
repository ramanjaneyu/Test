package com.test.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Streams using filter and map
List of products
pname, price, availability, id

price of a particular product
pname whose and price is > 20000

 */
public class StreamsTest {
    public static void main(String[] args) {
        List<Product> productList = Arrays.asList(new Product(11, "name1", "yes", 15000),
                new Product(12, "name2", "yes", 25000),
                new Product(13, "name3", "yes", 10000),
                new Product(14, "name4", "yes", 30000));
        List<Integer> result = productList.stream()
                .filter(pr -> pr.getName().equals("name3"))
                .map(p -> p.getPrice())
                .collect(Collectors.toList());

        System.out.println("Result : " + Arrays.asList(result));
    }
}
class Product {
    private int id;
    private String name;
    private String availability;
    private int price;

    public Product(int id, String name, String availability, int price) {
        this.id = id;
        this.name = name;
        this.availability = availability;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", availability='" + availability + '\'' +
                ", price=" + price +
                '}';
    }
}
