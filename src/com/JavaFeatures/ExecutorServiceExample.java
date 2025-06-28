package com.JavaFeatures;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(10);

        for(int i=0; i<10; i++){

            int taskNumber =i;

            service.execute(()-> {
                System.out.println("Executing tasks " + taskNumber +" by "+ Thread.currentThread().getName());
            });
        }

        service.shutdown();
    }
}
