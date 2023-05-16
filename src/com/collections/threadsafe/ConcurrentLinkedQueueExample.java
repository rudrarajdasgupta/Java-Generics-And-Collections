package com.collections.threadsafe;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new ConcurrentLinkedQueue<>();

        queue.add("A");
        queue.add("B");
        queue.add("C");

        System.out.println("ConcurrentLinkedQueue: " + queue);
    }
}
