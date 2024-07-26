package com.test.design.singleton;

public class SingletonWithDoubleCheckLocking {
    private static volatile SingletonWithDoubleCheckLocking INSTANCE; //This field needs to be volatile inorder
                                                                        // to prevent cache incoherence issues.
    private SingletonWithDoubleCheckLocking(){}

    public static SingletonWithDoubleCheckLocking getInstance(){
        if(INSTANCE == null){
            synchronized (SingletonWithDoubleCheckLocking.class){
                if(INSTANCE == null){
                    INSTANCE = new SingletonWithDoubleCheckLocking();
                }
            }
        }
        return INSTANCE;
    }
}
