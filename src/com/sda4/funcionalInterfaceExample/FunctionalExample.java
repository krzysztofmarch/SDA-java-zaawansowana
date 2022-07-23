package com.sda4.funcionalInterfaceExample;

import java.util.Locale;
import java.util.function.*;

public class FunctionalExample {
    public static void main(String[] args) {


        Supplier<String> stringSupplier = () -> new String("My supplier");
        System.out.println(stringSupplier.get());

        Function<String, Integer > parse = (number) -> Integer.parseInt(number);
        System.out.println(parse.apply("100"));

        parse = Integer::parseInt;
        System.out.println(parse.apply("200"));

        Consumer<String> consumer = s -> System.out.println(s);
        Consumer<String> consumer1 = System.out::println;

        consumer = consumer.andThen(s -> System.out.println(s + " " + s));
        consumer1 = consumer1.andThen(s -> System.out.println(s + " " + s));

        consumer.accept("Consumer");
        consumer1.accept("Consumer");


        System.out.println();
        UnaryOperator<String> unaryOperator = b -> b.toUpperCase();
        System.out.println(unaryOperator.getClass());
        System.out.println(unaryOperator.apply("kot"));

        System.out.println();
        Predicate<Integer> predicate = x -> x >= 0;

        System.out.println(predicate.test(4));
        System.out.println(predicate.test(-4));
        System.out.println(predicate.test(0));

        System.out.println();
        Predicate<String> predicate1 = x -> x == "Andrzej";
        System.out.println(predicate1.test("Andrzej"));
        System.out.println(predicate1.test("andrzej"));
        System.out.println(predicate1.test("Tomek"));


    }
}
