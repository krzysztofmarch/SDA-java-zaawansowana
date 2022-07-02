package com.sda.interfaces;

public interface MyInterfaceExample {

    int size = 5;

    void saySomething();

    default void print(){
        System.out.println(MyInterfaceExample.class.getName());
    }

    static int getSize(){
        return size;
    }

}
