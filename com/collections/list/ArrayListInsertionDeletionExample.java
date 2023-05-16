package com.collections.list;

import java.util.ArrayList;

public class ArrayListInsertionDeletionExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Adding elements to the ArrayList
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }

        // Insertion at the beginning
        long startTime = System.nanoTime();
        arrayList.add(0, -1); // Inserting -1 at the beginning
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("ArrayList insertion time: " + duration + " nanoseconds");

        // Deletion from the beginning
        startTime = System.nanoTime();
        arrayList.remove(0); // Removing the first element
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList deletion time: " + duration + " nanoseconds");
    }
}
