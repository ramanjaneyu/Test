package com.test.core.programs.threads;

import java.util.concurrent.Callable;

public class CallableTwo implements Callable<String> {
    private String callableOneResult;
    CallableTwo(String callableOneResult){
        this.callableOneResult = callableOneResult;
    }
    @Override
    public String call() throws Exception {
        System.out.println(callableOneResult + "Completed" + " and CallableTwo started");
        return "CallableTwo";
    }
}
