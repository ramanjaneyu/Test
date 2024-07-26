package com.test.core.java;

public class GarbageCollectionTest {
    public static void main(String[] args) {
        GarbageCollectionTest gc1 = new GarbageCollectionTest();
        gc1 = null;
        GarbageCollectionTest gc2 = new GarbageCollectionTest();
        gc2 = null;
        System.gc();
    }
    public void finalize() {
        System.out.println("Finalize method is called.");
    }
}
