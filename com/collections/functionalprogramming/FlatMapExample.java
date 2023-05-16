package com.collections.functionalprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<Integer>> numberLists = new ArrayList<>();
        numberLists.add(Arrays.asList(1, 2, 3));
        numberLists.add(Arrays.asList(4, 5, 6));
        numberLists.add(Arrays.asList(7, 8, 9));

        // Using flatMap to flatten nested lists and collect to a single list
        List<Integer> flattenedList = numberLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(flattenedList);
    }
}
