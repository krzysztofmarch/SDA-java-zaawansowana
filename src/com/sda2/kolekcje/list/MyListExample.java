package com.sda2.kolekcje.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.SortedMap;

public class MyListExample {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();

        System.out.println("Dodawanie elementow do listy\n.....");
        myList.add(5);
        myList.add(4);
        myList.add(78);
        myList.add(6);
        myList.add(53);

        System.out.println("\nWypisanie listy");
        for (Integer element : myList) {
            System.out.println("Index [" + myList.indexOf(element) + "] Wartość :" + element);
        }

        System.out.println("\nDodanie do listy");
        System.out.println("Elementu o wartosci: 42 :" + myList.add(42));
        System.out.println("Elementu o wartosci: 6 :" + myList.add(6));

        System.out.println("\nWypisanie listy po dodaniu");
        int i =0;
        for (Integer element : myList) {
            System.out.println("Index [" + i + "] Wartość :" + element);
            i++;
        }


        System.out.println("\nUsuwanie lementu o indexie 2\n....");
        myList.remove(2);

        System.out.println("\nWypisanie listy po usunieciu");
        for (Integer element : myList) {
            System.out.println("Index [" + myList.indexOf(element) + "] Wartość :" + element);
        }

        System.out.println("\nDodawanie elementu 101 na miejsce w indexie 2");
        myList.add(2,101);

        System.out.println("\nWypisanie listy po dodaniu elementu 101");
        for (Integer element : myList) {
            System.out.println("Index [" + myList.indexOf(element) + "] Wartość :" + element);
        }

        System.out.println(myList.stream().isParallel());

        System.out.println("\nSortowanie listy");
        myList.sort(Integer::compareTo);
        System.out.println("Rosnaco");
        for (Integer element : myList) {
            System.out.println("Index [" + myList.indexOf(element) + "] Wartość :" + element);
        }

        myList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o2 > o1) {
                    return 1;
                } else if (o2 < o1) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        //Podobnie jak powyżej - krótsza implementacja
        myList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        System.out.println("\nMalejąco");
        for (Integer element : myList) {
            System.out.println("Index [" + myList.indexOf(element) + "] Wartość :" + element);
        }


    }
}
