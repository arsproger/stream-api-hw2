package org.example.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task9 {
    public static void main(String[] args) {
//        9. Отсортировать список в обратном порядке:

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.stream().sorted(Comparator.reverseOrder()).forEach(x -> System.out.print(x + " "));
    }
}
