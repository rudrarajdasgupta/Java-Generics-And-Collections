package com.collections.iterator;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListIteratorExample {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Creating an iterator for the LinkedList
        Iterator<Integer> iterator = numbers.iterator();

        // Iterating over the elements using the iterator
        while (iterator.hasNext()) {
            int number = iterator.next();
            System.out.println(number);
        }
    }
}
