package com.sda4.streams;


import java.util.List;
import java.util.stream.Collectors;



public class StreamIntegerExample {

    public static void main(String[] args) {


        List<Integer> myIntegerList = List.of(100, 10, 11, 1, 0, 15, 16, 20, 23, 53, 64, 27);

        List<Integer> sortedIntegerList = myIntegerList.stream()
                .sorted()
                .collect(Collectors.toList());

        sortedIntegerList.forEach(System.out::println);

        Double averge = myIntegerList.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);

        System.out.println(averge);

    }
}
