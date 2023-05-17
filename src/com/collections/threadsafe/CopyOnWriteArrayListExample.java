package com.collections.threadsafe;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        // Add elements to the list
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");

        // Iterate over the list while allowing concurrent modifications
        Runnable listProcessor = () -> {
            for (String item : list) {
                System.out.println("Processing: " + item);
                // Perform processing on the item
            }
        };

        // Create and start multiple worker threads
        Thread workerThread1 = new Thread(listProcessor);
        Thread workerThread2 = new Thread(listProcessor);
        workerThread1.start();
        workerThread2.start();
    }
}
