package com.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UtilityMethods {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);

        // Sorting a list
        Collections.sort(numbers);
        System.out.println(numbers); // Output: [1, 2, 3]

        // Reversing a list
        Collections.reverse(numbers);
        System.out.println(numbers); // Output: [3, 2, 1]

        // Finding the maximum element
        int max = Collections.max(numbers);
        System.out.println(max); // Output: 3

        // Shuffling the list
        Collections.shuffle(numbers);
        System.out.println(numbers); // Output: [2, 3, 1]

    }
}
