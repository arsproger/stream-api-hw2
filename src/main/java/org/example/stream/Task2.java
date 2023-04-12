package org.example.stream;

import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
//        2. Получить список квадратов чисел в списке:

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream().map(x -> x * 2).forEach(x -> System.out.print(x + " "));
    }
}
