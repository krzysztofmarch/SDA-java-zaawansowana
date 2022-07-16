package com.sda.zad26interfejs;

public class Kolo implements Figura{

    double promien;

    public Kolo(double promien) {
        this.promien = promien;
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
