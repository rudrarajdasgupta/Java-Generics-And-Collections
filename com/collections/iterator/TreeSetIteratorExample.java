package com.collections.iterator;

import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetIteratorExample {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Creating an iterator for the TreeSet
        Iterator<String> iterator = names.iterator();

        // Iterating over the elements using the iterator
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
