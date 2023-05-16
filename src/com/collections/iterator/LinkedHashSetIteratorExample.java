package com.collections.iterator;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetIteratorExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Creating an iterator for the LinkedHashSet
        Iterator<Integer> iterator = numbers.iterator();

        // Iterating over the elements using the iterator
        while (iterator.hasNext()) {
            int number = iterator.next();
            System.out.println(number);
        }
    }
}
