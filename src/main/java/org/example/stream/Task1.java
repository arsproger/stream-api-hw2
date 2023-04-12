package org.example.stream;

import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
//        1. Найти среднее значение чисел в списке:

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(numbers.stream().mapToDouble(Integer::doubleValue).average().orElse(0));
    }
}
