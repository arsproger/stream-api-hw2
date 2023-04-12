package org.example.stream;

import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
//        3. Отфильтровать элементы списка, оставив только четные числа:

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.stream().filter(x -> x % 2 == 0).forEach(x -> System.out.print(x + " "));
    }
}
