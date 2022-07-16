package com.sda2.kolekcje.map;

import java.util.*;

public class MyMapExample {

    public static void main(String[] args) {

        Map<String, Integer> myMap = new HashMap<>();

        System.out.println("Dodawanie danych: Imie, wiek\n......");
        myMap.put("Jacek", 20);
        myMap.put("Mateusz", 7);
        myMap.put("Tadeusz", 15);
        myMap.put("Alicja", 45);
        myMap.put("Sylwia", 30);

        System.out.println("\nWypisanie");
        for (Map.Entry<String, Integer> pair : myMap.entrySet()) {
            System.out.println("Key: " + pair.getKey() + ", Value: " + pair.getValue());
        }

        System.out.println("\nMetody z Map");
        System.out.println(myMap.get("Sylwia"));
        System.out.println(myMap.put("Sylwia", 32));
        System.out.println(myMap.get("Sylwia"));

        System.out.println(myMap.put("Andrzej", 14));

        System.out.println("\nMetody z Map");
        System.out.println(myMap.containsKey("Sylwia"));
        System.out.println(myMap.containsValue(32));
        System.out.println(myMap.getOrDefault("Piotr", 0));
        System.out.println(myMap.get("Piotr"));


        System.out.println();
        System.out.println();
        System.out.println("Wypisanie ilosci powtorzen");

        Map<Integer, Integer> duplicateCounter = new HashMap<>();
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 17, 17, 20, 11, 11, 3, 1, 1);

        for (Integer number : numbers) {
            if (duplicateCounter.get(number) == null){
                duplicateCounter.put(number, 1);
            } else {
                int counter = duplicateCounter.get(number) +1;
                duplicateCounter.put(number, counter);
            }
        }

        System.out.println("Wypisanie");
        for (Map.Entry<Integer, Integer> pair : duplicateCounter.entrySet()) {
            System.out.println("Key: " + pair.getKey() + ", Value: " + pair.getValue());
        }


        System.out.println();
        System.out.println();

        System.out.print("Key:");
        duplicateCounter.forEach((key, value) -> System.out.printf("%3s", key));
        System.out.println();

        System.out.print("Val:");
        for (Integer number : duplicateCounter.values()) {
            System.out.printf("%3s", number);
        }

        Map<Integer, Integer> duplicateCounter_2 = new HashMap<>();

        for (Integer i : numbers) {
            duplicateCounter_2.merge(i, 1, (x, y) -> duplicateCounter_2.get(i) + 1);
        }

        System.out.println();
        System.out.println();
        duplicateCounter_2.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " +value));

    }
}
