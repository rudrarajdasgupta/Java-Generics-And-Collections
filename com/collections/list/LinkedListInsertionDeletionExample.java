package com.collections.list;

import java.util.LinkedList;

public class LinkedListInsertionDeletionExample {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }

        // Insertion at the beginning
        long startTime = System.nanoTime();
        linkedList.addFirst(-1); // Inserting -1 at the beginning
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("LinkedList insertion time: " + duration + " nanoseconds");

        // Deletion from the beginning
        startTime = System.nanoTime();
        linkedList.removeFirst(); // Removing the first element
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList deletion time: " + duration + " nanoseconds");
    }
}
