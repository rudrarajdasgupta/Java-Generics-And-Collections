package com.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Alice");
        deque.addLast("Bob");
        deque.addLast("Charlie");

        while (!deque.isEmpty()) {
            String item = deque.removeFirst();
            System.out.println(item);
        }
    }
}
