package org.example.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Task1 {
    public static void main(String[] args) {
//        1. Напишите лямбда-выражение, которое умножает каждый элемент списка на 2.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Function<Integer, Integer> function = x -> x * 2;

        numbers.stream().map(function).forEach(x -> System.out.print(x + " "));
    }
}
