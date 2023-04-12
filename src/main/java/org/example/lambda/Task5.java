package org.example.lambda;

import java.util.function.Function;

public class Task5 {
    public static void main(String[] args) {
//        5. Напишите лямбда-выражение, которое возвращает длину переданной строки.

        Function<String, Integer> function = x -> x.length();

        System.out.println(function.apply("Arsen"));
    }
}
