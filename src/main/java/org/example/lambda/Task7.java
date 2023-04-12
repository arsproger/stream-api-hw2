package org.example.lambda;

import java.util.List;
import java.util.function.Function;

public class Task7 {
    public static void main(String[] args) {
//        7. Напишите лямбда-выражение, которое возвращает сумму элементов списка.

        Function<List<Integer>, Integer> function = (x) -> x.stream().mapToInt(Integer::intValue).sum();

        System.out.println(function.apply(List.of(1, 2, 3, 4, 5)));

    }
}
