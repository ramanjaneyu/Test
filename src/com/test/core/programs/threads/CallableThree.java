package com.test.core.programs.threads;

import java.util.concurrent.Callable;

public class CallableThree implements Callable<String> {
    private String callableTwoResult;
    CallableThree(String callableTwoResult){
        this.callableTwoResult = callableTwoResult;
    }
    @Override
    public String call() throws Exception {
        System.out.println(callableTwoResult + "Completed" + " and CallableThree started");
        return "CallableThree Completed";
    }
}
