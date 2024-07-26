package com.test.design.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class WaysToBreakSingletonDP {
    public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        SingletonClass originalSingletonInstance = SingletonClass.getInstance();

        //Breaking using Serialization
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:\\Serialization.ser"));
        objectOutputStream.writeObject(originalSingletonInstance);

        //Deserialize process
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:\\Serialization.ser"));
        SingletonClass brokenSingletonUsingSerializationIns = (SingletonClass) objectInputStream.readObject();

        System.out.println("Original singleton Instance hashcode : " + originalSingletonInstance.hashCode());
        System.out.println("Broken Singleton Using Serialization Instance hashcode : " + brokenSingletonUsingSerializationIns.hashCode());

        //cloning
        System.out.println("Breaking singleton using cloning");
        SingletonClass brokenSingletonUsingCloningIns = (SingletonClass) originalSingletonInstance.clone();

        System.out.println("Original singleton Instance hashcode : " + originalSingletonInstance.hashCode());
        System.out.println("Broken Singleton Using Cloning Instance hashcode : " + brokenSingletonUsingCloningIns.hashCode());

        //Reflection
        System.out.println("Breaking singleton using Reflection");
        Class<?> singletonClass = Class.forName("com.test.design.singleton.SingletonClass");
        Constructor<SingletonClass> constructor = (Constructor<SingletonClass>) singletonClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonClass brokenSingletonUsingReflectionIns = constructor.newInstance();

        System.out.println("Original singleton Instance hashcode : " + originalSingletonInstance.hashCode());
        System.out.println("Broken Singleton Using Reflection Instance hashcode : " + brokenSingletonUsingReflectionIns.hashCode());

    }
}
