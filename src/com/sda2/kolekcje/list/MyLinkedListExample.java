package com.sda2.kolekcje.list;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedListExample {

    public static void main(String[] args) {

        List<String> myLinkedList = new LinkedList<>();

        System.out.println("Dodawanie elementow");
        System.out.println(myLinkedList.add("My name"));
        System.out.println(myLinkedList.add("John"));
        System.out.println(myLinkedList.add("Kate"));
        System.out.println(myLinkedList.add("Patricia"));
        System.out.println(myLinkedList.add("Morty"));

        System.out.println("\nRozmiar listy: " + myLinkedList.size());

        System.out.println("\nWypisanie listy po dodaniu");
        for (String element : myLinkedList) {
            System.out.println("Index [" + myLinkedList.indexOf(element) + "] Wartość : " + element);
        }

        System.out.println("\nUsuniecie elementu o indexie 2");
        myLinkedList.remove(2);

        System.out.println("\nWypisanie listy po usunieciu");
        for (String element : myLinkedList) {
            System.out.println("Index [" + myLinkedList.indexOf(element) + "] Wartość : " + element);
        }

        System.out.println("\nDodanie elementu do indexu 2");
        myLinkedList.add(2, "Dodanie");

        System.out.println("\nWypisanie listy po dodaniu do indexu 2");
        for (String element : myLinkedList) {
            System.out.println("Index [" + myLinkedList.indexOf(element) + "] Wartość : " + element);
        }

        System.out.println("\nDodanie tej samej wartosci 'Dodanie'");
        myLinkedList.add("Dodanie");

        System.out.println("\nWypisanie listy po dodaniu tej samej wartosci");
        for (String element : myLinkedList) {
            System.out.println("Index [" + myLinkedList.indexOf(element) + "] Wartość : " + element);
        }

        System.out.println("\nWypisanie elementu o indexie 3");
        System.out.println(myLinkedList.get(3));


    }
}
