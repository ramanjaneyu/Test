package com.test.design.singleton;

import java.io.Serializable;

public class SingletonClass implements Serializable, Cloneable {
    private static SingletonClass INSTANCE = null;
    private SingletonClass(){
    }
    public static SingletonClass getInstance(){
        if(INSTANCE == null){
            INSTANCE = new SingletonClass();
        }
        return INSTANCE;
    }

    //We need to override readResolve() method if we are serializing the singleton class otherwise it will be break
   protected Object readResolve()
   {
        return INSTANCE;
   }
   //We need to override clone() method if our singleton class implement Cloneable interface
   @Override
   protected Object clone() throws CloneNotSupportedException {
        //return super.clone();
        //throw new CloneNotSupportedException(); //If we want we can throw CloneNotSupportedException using this statement
        return INSTANCE;  //If we want we can return the same instance.
   }
}
