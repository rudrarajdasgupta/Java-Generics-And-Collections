package com.collections.list;

import java.util.ArrayList;

public class ArrayListRandomAccessExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Adding elements to the ArrayList
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }

        // Random access by index
        long startTime = System.nanoTime();
        int element = arrayList.get(500000); // Accessing element at index 500000
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Accessed element: " + element);
        System.out.println("ArrayList random access time: " + duration + " nanoseconds");
    }
}
