package com.sda.exceptons;

public class Divider {

    public int divide(int first, int second) throws IllegalArgumentException{

        if (second == 0) {
            throw new IllegalArgumentException("Nie dziel przez 0");
        }
        return first / second;
    }
}
