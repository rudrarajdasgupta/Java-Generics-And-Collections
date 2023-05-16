package com.generics;

import java.util.ArrayList;
import java.util.List;

public class WildcardsLowerBoundsExample {
    public static void addNumbers(List<? super Integer> numbers) {
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
    }

    public static void main(String[] args) {
        List<Number> numberList = new ArrayList<>();
        numberList.add(5.5);

        addNumbers(numberList);

        System.out.println("Number List: " + numberList);
    }
}
