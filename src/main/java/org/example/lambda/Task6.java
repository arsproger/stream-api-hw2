package org.example.lambda;

import java.util.function.Function;

public class Task6 {
    public static void main(String[] args) {
//        6. Напишите лямбда-выражение, которое возвращает квадрат переданного числа.

        Function<Integer, Integer> function = x -> x * x;

        System.out.println(function.apply(5));
    }
}
