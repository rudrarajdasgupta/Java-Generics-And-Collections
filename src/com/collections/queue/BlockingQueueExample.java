package com.collections.queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueExample {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new LinkedBlockingQueue<>();

        // Producer thread
        Thread producerThread = new Thread(() -> {
            try {
                queue.put("Data 1");
                queue.put("Data 2");
                queue.put("Data 3");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Consumer thread
        Thread consumerThread = new Thread(() -> {
            try {
                String data = queue.take();
                System.out.println("Consumed: " + data);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start producer and consumer threads
        producerThread.start();
        consumerThread.start();
    }
}
