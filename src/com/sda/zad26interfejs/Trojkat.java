package com.sda.zad26interfejs;

public class Trojkat implements Figura{

    double dlugosc1;
    double dlugosc2;
    double dlugosc3;

    public Trojkat(double dlugosc1, double dlugosc2, double dlugosc3) {
        this.dlugosc1 = dlugosc1;
        this.dlugosc2 = dlugosc2;
        this.dlugosc3 = dlugosc3;
    }

    @Override
    public int obliczObwód() {
        return 0;
    }

    @Override
    public int obliczPole() {
        return 0;
    }
}
