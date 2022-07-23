package com.sda4.concurrency;

public class Main {

    public static void main(String[] args) {

        Runnable r = () -> {
            Lotto lotto1 = new Lotto();
            lotto1.start(50);
        };

        Thread thread = new Thread(r);
        thread.start();

        Lotto lotto = new Lotto();

        lotto.start(50);



    }
}
