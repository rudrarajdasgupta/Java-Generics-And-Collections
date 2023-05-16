package com.collections.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Iterate forward using ListIterator
        ListIterator<String> forwardIterator = colors.listIterator();
        System.out.println("Forward Iteration:");
        while (forwardIterator.hasNext()) {
            int index = forwardIterator.nextIndex();
            String color = forwardIterator.next();
            System.out.println("Index: " + index + ", Color: " + color);
        }

        // Iterate backward using ListIterator
        ListIterator<String> backwardIterator = colors.listIterator(colors.size());
        System.out.println("\nBackward Iteration:");
        while (backwardIterator.hasPrevious()) {
            int index = backwardIterator.previousIndex();
            String color = backwardIterator.previous();
            System.out.println("Index: " + index + ", Color: " + color);
        }
    }
}
