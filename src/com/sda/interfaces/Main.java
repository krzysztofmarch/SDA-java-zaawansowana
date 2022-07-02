package com.sda.interfaces;

public class Main {
    public static void main(String[] args) {

        MyInterfaceExample myInterfaceExample = new MyExample();

        myInterfaceExample.saySomething();

        MyExample myExample = (MyExample) myInterfaceExample;
        myExample.saySomething();
        myExample.myClassMethod();

        System.out.println(MyExample.size);

        myInterfaceExample.print();
    }
}
