package com.test.core.programs.threads;

import java.util.concurrent.Callable;

public class CallableOne implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("CallableOne started");
        return "CallableOne";
    }
}
