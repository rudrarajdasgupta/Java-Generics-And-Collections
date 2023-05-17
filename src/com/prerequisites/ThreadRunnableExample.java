package com.prerequisites;

public class ThreadRunnableExample {
    public static void main(String[] args) {
        // Create an instance of the Runnable
        MyRunnable myRunnable = new MyRunnable();

        // Create and start a new thread using the Runnable
        Thread myThread = new Thread(myRunnable);
        myThread.start();
    }
}
