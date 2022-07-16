package com.sda2.kolekcje.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class MyQueueExample {

    public static void main(String[] args) {

        Queue<String> myQue = new PriorityQueue<>();

        System.out.println("QUEUE");
        System.out.println("Dodanie do kolejki");
        System.out.println(myQue.add("cccc"));
        System.out.println(myQue.add("zzzzzz"));
        System.out.println(myQue.add("aaaaa"));
        System.out.println(myQue.add("bbbbb"));

        System.out.println("\nWyswietlanie");
        for (String element : myQue){
            System.out.println(element);
        }

        System.out.println("\nDodanie");
        System.out.println(myQue.add("mmm"));
        System.out.println(myQue.add("xxxxxxxx"));
        System.out.println(myQue.add("ll"));

        System.out.println("\nWyswietlanie");
        for (String element : myQue){
            System.out.println(element);
        }


        System.out.println("\n\nDEQUE");



    }
}
