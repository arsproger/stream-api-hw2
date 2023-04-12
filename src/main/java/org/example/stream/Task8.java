package org.example.stream;

import java.util.Arrays;
import java.util.List;

public class Task8 {
    public static void main(String[] args) {
//        8. Найти максимальное значение в списке:

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println(numbers.stream().mapToInt(Integer::intValue).max().orElse(0));
    }
}
