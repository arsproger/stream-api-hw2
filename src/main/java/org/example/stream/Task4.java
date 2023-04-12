package org.example.stream;

import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
//        4. Проверить, содержит ли список число 3:

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println(numbers.stream().anyMatch(x -> x == 3));
    }
}
