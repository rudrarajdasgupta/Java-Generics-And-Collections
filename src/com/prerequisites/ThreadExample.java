package com.prerequisites;

public class ThreadExample {
    public static void main(String[] args) {
        // Create and start a new thread
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
