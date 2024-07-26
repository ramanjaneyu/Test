package com.test.core.programs.threads;

public class ThreadDemo {
    public static void main(String[] args) {
        //Whatever we write here will be executed by main thread.
        //threads always execute the jobs in a sequence

        //Job1
        System.out.println("Job1 started");

        //Job2
        /*
        Till Job2 is finished, below written jobs i.e., Job3 are waiting and not executed
        In case Job2 is a long running operation,i.e., several documents are supposed to be printed. In such
        case JVM shall give a message that App is not responding and will hang.
         */
        for(int doc = 0; doc < 10; doc++){
            System.out.println("Printing doc in Job2 : " + doc);
        }
        //Job3
        System.out.println("Job3 started");
    }
}
