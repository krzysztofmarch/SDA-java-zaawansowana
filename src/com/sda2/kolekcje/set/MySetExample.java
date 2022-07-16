package com.sda2.kolekcje.set;

import java.util.HashSet;
import java.util.Set;

public class MySetExample {

    public static void main(String[] args) {


        Set<String> mySet = new HashSet<>();

        System.out.println("Dodawanie do setu");
        System.out.println(mySet.add("John"));
        System.out.println(mySet.add("Cris"));
        mySet.add("Annie");
        System.out.println(mySet.add("John"));

        System.out.println("\nSprawdzanie czy element istnieje");
        if (mySet.contains("John")) {
            System.out.println("Element istnieje");
        }

        System.out.println("\nWypisanie zawartosci");
        for (String name : mySet) {
            System.out.println(name);
        }

        System.out.println("\nPonowne dodanie do setu\n......");
        mySet.add("Krzysztof");

        System.out.println("\nWypisanie zawartosci");
        for (String name : mySet) {
            System.out.println(name);
        }

        System.out.println("\nSprawdzenie wielkosci setu");
        System.out.println(mySet.size());

        System.out.println("\nSprawdzenie hashcode");
        System.out.println(mySet.hashCode());

        System.out.println("\nPonowne dodanie do setu\n......");
        System.out.println(mySet.add("Leo"));

        System.out.println("\nSprawdzenie hashcode");
        System.out.println(mySet.hashCode());

        System.out.println("\nSprawdzenie czy set jest pusty");
        System.out.println(mySet.isEmpty());

        System.out.println("\nCzyszczenie setu\n.......");
        mySet.clear();

        System.out.println("\nSprawdzenie czy set jest pusty");
        System.out.println(mySet.isEmpty());

        System.out.println("\nPonowne dodanie do setu");
        System.out.println("Dodanie elementu: " + mySet.add("John"));
        System.out.println("Dodanie elementu: " + mySet.add("Annie"));
        System.out.println("Dodanie elementu: " + mySet.add("Cris"));
        System.out.println("Dodanie elementu: " + mySet.add("Leo"));

        System.out.println("\nWypisanie zawartosci");
        for (String name : mySet) {
            System.out.println(name);
        }







    }
}
