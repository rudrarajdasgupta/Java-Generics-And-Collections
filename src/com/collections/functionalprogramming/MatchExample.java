package com.collections.functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class MatchExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Using anyMatch to check if any element satisfies a condition
        boolean anyEven = numbers.stream()
                .anyMatch(number -> number % 2 == 0);

        System.out.println("Any even number? " + anyEven);

        // Using allMatch to check if all elements satisfy a condition
        boolean allEven = numbers.stream()
                .allMatch(number -> number % 2 == 0);

        System.out.println("All even numbers? " + allEven);
    }
}
