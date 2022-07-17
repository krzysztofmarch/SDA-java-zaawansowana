package com.sda3.io_nio;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("src\\com\\sda3\\io_nio");

        System.out.println(rootPath.getParent());


    }
}
