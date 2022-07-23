package com.sda4.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {

        List<String> stringList = List.of("Daniel", "Mateusz", "Agata", "Sylwia", "Edward", "Anna", "Zygmunt", "Paulina");

        stringList.stream().filter(s -> s.length() > 6)
                .forEach(System.out::println);

        System.out.println();
        System.out.println();

        List<String> result = stringList.stream()
                .sorted(String::compareTo)
                .collect(Collectors.toList());

        System.out.println("Wyniki sortowania");
        result.forEach(System.out::println);

        List<Integer> hashCodes = stringList.stream()
                .map(String::hashCode)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("\n\n Hash code");
        hashCodes.forEach(System.out::println);


        System.out.println();
        Map<String, Integer> myMap_1 = stringList.stream()
                .collect(Collectors.toMap(String::new, String::hashCode));

        myMap_1.forEach((k, v) -> System.out.println(k + " -> " + v));



    }
}
