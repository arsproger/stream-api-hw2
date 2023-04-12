package org.example.lambda;

import java.util.function.Predicate;

public class Task4 {
    public static void main(String[] args) {
//        4. Напишите лямбда-выражение, которое возвращает True, если переданная строка содержит более 5 символов.

        Predicate<String> predicate = (x) -> x.length() > 5;

        System.out.println(predicate.test("Hello"));
        System.out.println(predicate.test("Hello World!"));
    }
}
