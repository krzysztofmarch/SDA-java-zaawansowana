package com.sda4.opcional;

import java.util.Optional;

public class OpcionalExample {

    public static void main(String[] args) {

        Optional<String> optional_1 = Optional.ofNullable("My Optional");

        System.out.println(optional_1.isPresent());
        System.out.println(optional_1.isEmpty());

        optional_1.ifPresent(System.out::println);
        System.out.println();
        optional_1 = Optional.ofNullable(null);
        System.out.println(optional_1.isPresent());
        System.out.println(optional_1.isEmpty());

        optional_1.ifPresent(System.out::println);

        System.out.println();

        Optional<String> optionalWithNull = Optional.ofNullable(null);
        String value = optionalWithNull.orElse("Wartość w przypadku null");
        System.out.println(value);

        System.out.println(optionalWithNull.orElseGet(() -> "Some default value"));
        System.out.println(optionalWithNull.orElseGet(() -> new String ("Some value")));

        optionalWithNull.orElseThrow(NullPointerException::new);

    }
}
