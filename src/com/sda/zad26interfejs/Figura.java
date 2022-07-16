package com.sda.zad26interfejs;

public interface Figura {

    public static double pi = 3.1415926535d;

    default int obliczObwód(){

        return 0;
    }

    default int obliczPole() {

        return 0;
    }
}
