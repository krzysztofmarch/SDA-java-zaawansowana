package com.sda.oop.easy;

import java.util.Objects;

public class Honda extends Car {

    private final String model;



    public Honda(String vin, String model, String color) {
        super(vin, color);
        this.model = model;

    }


    @Override
    public void runEngine(){
        System.out.println("Engine is working, Honda " + model);

    }


    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Honda {" +
                "model= '" + model + '\'' +
                ", vin= '" + this.getVin() + '\'' +
                ", color= '" + this.getColor() + '\'' +
                "} ";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Honda honda = (Honda) o;
        return Objects.equals(model, honda.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), model);
    }
}
