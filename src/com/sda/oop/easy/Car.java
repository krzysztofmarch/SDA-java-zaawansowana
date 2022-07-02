package com.sda.oop.easy;

public abstract class Car {

    private final String vin;

    protected Car(String vin) {
        this.vin = vin;
    }

    abstract void runEngine();



}
