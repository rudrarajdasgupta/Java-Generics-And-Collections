package com.generics;

interface Calculator<T> {
    T add(T num1, T num2);
    T subtract(T num1, T num2);
}

class IntegerCalculator implements Calculator<Integer> {
    public Integer add(Integer num1, Integer num2) {
        return num1 + num2;
    }

    public Integer subtract(Integer num1, Integer num2) {
        return num1 - num2;
    }
}

class DoubleCalculator implements Calculator<Double> {
    public Double add(Double num1, Double num2) {
        return num1 + num2;
    }

    public Double subtract(Double num1, Double num2) {
        return num1 - num2;
    }
}

public class GenericInterfaceExample {
    public static void main(String[] args) {
        Calculator<Integer> intCalc = new IntegerCalculator();
        int sum = intCalc.add(5, 3);
        int difference = intCalc.subtract(5, 3);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);

        Calculator<Double> doubleCalc = new DoubleCalculator();
        double product = doubleCalc.add(2.5, 3.5);
        double quotient = doubleCalc.subtract(5.0, 2.0);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
