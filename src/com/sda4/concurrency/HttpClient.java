package com.sda4.concurrency;

public class HttpClient {
    public static void main(String[] args) {

        HttpAction httpAction = new HttpAction();

        //start - nowy watek
        httpAction.start();
        System.out.println();

        //run - ten sam watek
        httpAction.run();
        System.out.println();

        Runnable r = () -> System.out.println("Watek przez klase anonimowa");
        r.run();

        System.out.println();

        Thread myThread = new Thread(r);
        myThread.start();
    }
}
