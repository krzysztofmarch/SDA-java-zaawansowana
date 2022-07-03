package com.sda.oop.zadania.klasapoint2d;

public class Point2D implements Comparable<Point2D> {

    float x;
    float y;

    public Point2D() {
        x = 0f;
        y = 0f;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{x, y};
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public String toString() {
        return String.format("(%f,%f)", x, y);
    }

    @Override
    public int compareTo(Point2D o) {
        return 0;
    }
}
