package com.sda.interfaces;

public class MyExample implements MyInterfaceExample{

    @Override
    public void saySomething() {
        System.out.println("Hello");
    }

    public void myClassMethod(){
        System.out.println("My class method");
    }

    @Override
    public void print(){
        System.out.println("Override method from interface");
    }

}
