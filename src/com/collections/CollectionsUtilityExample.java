package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsUtilityExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(4);

        System.out.println("Original list: " + numbers);

        // Sorting the list
        Collections.sort(numbers);
        System.out.println("Sorted list: " + numbers);

        // Reversing the list
        Collections.reverse(numbers);
        System.out.println("Reversed list: " + numbers);

        // Shuffling the list
        Collections.shuffle(numbers);
        System.out.println("Shuffled list: " + numbers);

        // Finding the maximum element
        int max = Collections.max(numbers);
        System.out.println("Max: " + max);

        // Finding the minimum element
        int min = Collections.min(numbers);
        System.out.println("Min: " + min);
    }
}
