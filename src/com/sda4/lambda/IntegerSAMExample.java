package com.sda4.lambda;

public interface IntegerSAMExample {

    int calculated (int x, int y);

    default void print(){
        System.out.println();
    }
}
