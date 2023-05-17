package com.generics;

public class GenericsExample2 {
    public static <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        String[] names = {"Alice", "Bob", "Charlie"};

        // Call the generic method with different types of arrays
        printArray(numbers);
        printArray(names);
    }
}
