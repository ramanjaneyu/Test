package com.test.core.programs.threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newCachedThreadPool();

        /*Here the output is predicted
        CallableOne started
        CallableOneCompleted and CallableTwo started
        CallableTwoCompleted and CallableThree started
        CallableThree Completed
        */
        Future<String> futureResult1 = service.submit(new CallableOne());
        //waits until CallableOne finishes it's task i.e., Line21 is not executed until we get the result from futureResult1
        String callableOneResult = futureResult1.get();
        Future<String> futureResult2 = service.submit(new CallableTwo(callableOneResult));
        //waits until CallableTwo finishes it's task
        String callableTwoResult = futureResult2.get();
        Future<String> futureResult3 = service.submit(new CallableThree(callableTwoResult));
        ////waits until CallableThree finishes it's task
        String callableThreeResult = futureResult3.get();
        System.out.println(callableThreeResult);

        /*Here the output is not predicted
        CallableOne started
        nullCompleted and CallableThree started
        nullCompleted and CallableTwo started
        */
        /*Future<String> futureResult1 = service.submit(new CallableOne());
        String callableOneResult = null;
        String callableTwoResult = null;
        if(futureResult1.isDone()){
            callableOneResult = futureResult1.get();
        }
        Future<String> futureResult2 = service.submit(new CallableTwo(callableOneResult));
        if(futureResult2.isDone()){
            callableTwoResult = futureResult2.get();
        }
        Future<String> futureResult3 = service.submit(new CallableThree(callableTwoResult));
        if(futureResult3.isDone()){
            String callableThreeResult = futureResult3.get();
        }*/
        service.shutdown();
    }
}
