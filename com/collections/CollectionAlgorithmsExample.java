package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionAlgorithmsExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(4);

        System.out.println("Original List: " + numbers);

        // Sorting the list using reverse order
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Sorted List (Descending Order): " + numbers);

        // Shuffling the list
        Collections.shuffle(numbers);
        System.out.println("Shuffled List: " + numbers);

        // Swapping elements
        Collections.swap(numbers, 1, 3);
        System.out.println("Swapped List: " + numbers);

        // Finding the index of an element
        int index = Collections.binarySearch(numbers, 4);
        System.out.println("Index of 4: " + index);
    }
}
