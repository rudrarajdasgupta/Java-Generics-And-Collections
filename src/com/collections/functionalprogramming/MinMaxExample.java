package com.collections.functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMaxExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 4);

        // Using min to find the minimum element in the list
        Optional<Integer> minNumber = numbers.stream()
                .min(Integer::compareTo);

        minNumber.ifPresent(min -> System.out.println("Min: " + min));

        // Using max to find the maximum element in the list
        Optional<Integer> maxNumber = numbers.stream()
                .max(Integer::compareTo);

        maxNumber.ifPresent(max -> System.out.println("Max: " + max));
    }
}
