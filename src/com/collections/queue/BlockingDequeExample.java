package com.collections.queue;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class BlockingDequeExample {
    public static void main(String[] args) {
        BlockingDeque<String> deque = new LinkedBlockingDeque<>();

        // Producer thread
        Thread producerThread = new Thread(() -> {
            try {
                deque.putFirst("Data 1");
                deque.putLast("Data 2");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Consumer thread
        Thread consumerThread = new Thread(() -> {
            try {
                String data = deque.takeLast();
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
