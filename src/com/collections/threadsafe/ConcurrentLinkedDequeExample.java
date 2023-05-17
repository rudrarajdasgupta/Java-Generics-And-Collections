package com.collections.threadsafe;

import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDequeExample {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();
        deque.addFirst("Alice");
        deque.addLast("Bob");

        String first = deque.pollFirst();
        System.out.println("First element: " + first);

        String last = deque.pollLast();
        System.out.println("Last element: " + last);
    }
}
