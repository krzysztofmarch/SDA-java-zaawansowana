package com.sda3.io_nio;

import java.nio.CharBuffer;
import java.util.Arrays;

public class JavaBufforExample {

    public static void main(String[] args) {


        CharBuffer buffer = CharBuffer.allocate(8);

        String text = "sda";

        System.out.println("Input text: " + text);

        for (int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            buffer.put(c);
        }

        System.out.println("Dodano dane do buffera: " + Arrays.toString(buffer.array()));

        buffer.get();
        buffer.reset();

        System.out.println("Dodano dane do buffera: " + Arrays.toString(buffer.array()));
    }
}
