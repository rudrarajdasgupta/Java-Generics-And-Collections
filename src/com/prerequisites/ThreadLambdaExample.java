package com.prerequisites;

public class ThreadLambdaExample {
    public static void main(String[] args) {
        // Create and start a new thread using lambda expression
        Thread myThread = new Thread(() -> {
            // Code to be executed in the thread
            System.out.println("Hello from lambda thread!");
        });
        myThread.start();
    }
}
