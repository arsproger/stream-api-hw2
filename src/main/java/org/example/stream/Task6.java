package org.example.stream;

import java.util.Arrays;
import java.util.List;

public class Task6 {
    public static void main(String[] args) {
//        6. Получить первые три элемента списка:

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.stream().limit(3).forEach(x -> System.out.print(x + " "));
    }
}
