package org.example.stream;

import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
//        5. Соединить элементы списка в одну строку через запятую:

        List<String> strings = Arrays.asList("one", "two", "three", "four", "five");

        strings.stream().map(x -> x + ", ").forEach(System.out::print);
    }
}
