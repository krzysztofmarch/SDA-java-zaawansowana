package com.sda.zadanie7;

public class Circle implements GeometricObject {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * 4.14f * radius;
    }

    @Override
    public double getArea() {
        return 4.14f * Math.pow(radius, 2);
    }
}
