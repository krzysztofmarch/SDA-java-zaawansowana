package com.sda.oop;

import com.sda.oop.easy.Honda;

public class Main {
    public static void main(String[] args) {


        Honda honda = new Honda("Some Vin", "Civic", "Black");

        System.out.println(honda.getColor());

        honda.runEngine();

        honda.setColor("Red");
        System.out.println(honda.getColor());

        System.out.println(honda.toString());

        System.out.println(honda.hashCode());
        honda.setColor("Green");
        System.out.println(honda.hashCode());

    }
}
