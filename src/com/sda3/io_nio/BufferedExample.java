package com.sda3.io_nio;

import java.io.*;

public class BufferedExample {

    public static void main(String[] args) throws IOException {


        BufferedReader in = new BufferedReader(new FileReader("src/com/sda3/io_nio/someText"));
        BufferedWriter out = new BufferedWriter(new FileWriter("src/com/sda3/io_nio/someOutTextBuffered"));

        String line;

        while ((line = in.readLine()) != null) {
            System.out.println(line);
            out.write(line);
            out.newLine();
        }
        out.flush();

        


    }
}
