package com.sda.Zadanie2Enum;

public class Main {

    public static void main(String[] args) {


        PackageSize packageSize = PackageSize.getPackageSize(140, 250);
        System.out.println(packageSize);
    }
}
