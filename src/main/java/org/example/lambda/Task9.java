package org.example.lambda;

import java.util.List;
import java.util.function.Function;

public class Task9 {
    public static void main(String[] args) {
//        9. Напишите лямбда-выражение, которое возвращает список квадратов элементов исходного списка.

        Function<List<Integer>, List<Integer>> function = x -> x.stream().map(y -> y * y).toList();

        System.out.println(function.apply(List.of(1, 2, 3, 4, 5)));
    }
}
