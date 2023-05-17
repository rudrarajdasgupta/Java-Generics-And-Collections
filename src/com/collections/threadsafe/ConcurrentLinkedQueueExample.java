package com.collections.threadsafe;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueExample {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();

        // Add elements to the queue
        queue.add("Task 1");
        queue.add("Task 2");
        queue.add("Task 3");

        // Process tasks concurrently using multiple threads
        Runnable taskProcessor = () -> {
            while (!queue.isEmpty()) {
                String task = queue.poll();
                System.out.println("Processing: " + task);
                // Perform task processing
            }
        };

        // Create and start multiple worker threads
        Thread workerThread1 = new Thread(taskProcessor);
        Thread workerThread2 = new Thread(taskProcessor);
        workerThread1.start();
        workerThread2.start();
    }
}
