package com.sda4.lambda;

public class LambdaExample {

    public static void main(String[] args) {

        Runnable r = () -> System.out.println("Hello");

        r.run();

        System.out.println();
        MySAMExample mySAMExample = (x, y) -> System.out.println("Wynik: " + (x + y));
        mySAMExample.doSomething(2, 1);
        MySAMExample mySAMExample2 = (x, y) -> System.out.println("Wynik: " + (x - y));
        mySAMExample2.doSomething(2, 1);

        mySAMExample = (x, y) -> System.out.println("Wynik: " + (x * y));
        mySAMExample.doSomething(2, 4);

        IntegerSAMExample integerSAMExample = (x, y) -> x / y;
        System.out.println("Wynik: " + integerSAMExample.calculated(100, 10));

        //String
        System.out.println();
        StringInterface stringInterface = (a, b, c) -> System.out.println(a + " " + b + " " + c);
        stringInterface.printText("Ala", "ma", "kota!");
        System.out.println(stringInterface.hashCode());
        System.out.println(stringInterface.getClass().getName());

        stringInterface = (a, b, c) -> System.out.println(c + " " + b + " " + a);
        stringInterface.printText("Ala", "ma", "kota");
        System.out.println(stringInterface.hashCode());
        System.out.println(stringInterface.getClass().getName());

        stringInterface = (a, b, c) -> System.out.println(c + " " + b + " " + a);
        stringInterface.printText("Ala", "ma", "kota");
        System.out.println(stringInterface.hashCode());
        System.out.println(stringInterface.getClass().getName());


    }
}
