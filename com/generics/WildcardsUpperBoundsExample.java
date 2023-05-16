package com.generics;

import java.util.ArrayList;
import java.util.List;

public class WildcardsUpperBoundsExample {
    public static double sumList(List<? extends Number> numbers) {
        double sum = 0.0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(10);
        integers.add(15);

        double sum = sumList(integers);
        System.out.println("Sum: " + sum);
    }
}
