package org.example.lambda;

import java.util.function.Predicate;

public class Task8 {
    public static void main(String[] args) {
//        8. Напишите лямбда-выражение, которое возвращает True, если переданная строка начинается с буквы "A".

        Predicate<String> predicate = x -> x.startsWith("A");

        System.out.println(predicate.test("Arsen"));
        System.out.println(predicate.test("Bob"));
    }
}
