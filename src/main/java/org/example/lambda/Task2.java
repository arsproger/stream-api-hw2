package org.example.lambda;

import java.util.function.BinaryOperator;

public class Task2 {
    public static void main(String[] args) {
//        2. Напишите лямбда-выражение, которое находит сумму двух чисел.

        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;

        System.out.println(binaryOperator.apply(5, 7));
    }
}
