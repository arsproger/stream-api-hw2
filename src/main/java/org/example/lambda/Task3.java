package org.example.lambda;

import java.util.function.Predicate;

public class Task3 {
    public static void main(String[] args) {
//        3. Напишите лямбда-выражение, которое возвращает True, если переданное число больше 10.

        Predicate<Integer> predicate = (x) -> x > 10;

        System.out.println(predicate.test(17));
    }
}
