package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedCollectionExample {
    public static void main(String[] args) {
        List<String> synchronizedList = Collections.synchronizedList(new ArrayList<>());

        // Adding elements to the synchronized list
        synchronizedList.add("Apple");
        synchronizedList.add("Banana");
        synchronizedList.add("Orange");

        // Performing synchronized iteration
        synchronized (synchronizedList) {
            for (String item : synchronizedList) {
                System.out.println(item);
            }
        }
    }
}
