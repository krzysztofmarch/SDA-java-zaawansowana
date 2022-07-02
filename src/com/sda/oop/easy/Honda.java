package com.sda.oop.easy;

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
}
