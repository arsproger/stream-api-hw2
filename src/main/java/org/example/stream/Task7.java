package org.example.stream;

import java.util.Arrays;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
//        7. Извлечь из списка все уникальные элементы:

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 3, 4, 6);

        numbers.stream().distinct().forEach(x -> System.out.print(x + " "));
    }
}
