package com.generics;

public class MathUtil {
    public static <T extends Number> double average(T[] numbers) {
        double sum = 0.0;
        for (T number : numbers) {
            sum += number.doubleValue();
        }
        return sum / numbers.length;
    }

    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5};
        Double[] doubles = {1.5, 2.5, 3.5, 4.5, 5.5};

        double intAverage = average(integers);
        System.out.println("Integer Average: " + intAverage);

        double doubleAverage = average(doubles);
        System.out.println("Double Average: " + doubleAverage);
    }
}
