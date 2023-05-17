package com.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(5);
        priorityQueue.offer(3);
        priorityQueue.offer(7);
        priorityQueue.offer(1);

        while (!priorityQueue.isEmpty()) {
            Integer item = priorityQueue.poll();
            System.out.println(item);
        }
    }
}
