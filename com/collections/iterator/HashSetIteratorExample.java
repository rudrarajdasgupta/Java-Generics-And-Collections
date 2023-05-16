package com.collections.iterator;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIteratorExample {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Creating an iterator for the HashSet
        Iterator<String> iterator = names.iterator();

        // Iterating over the elements using the iterator
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
