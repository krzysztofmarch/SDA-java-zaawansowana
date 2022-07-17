package com.sda3.io_nio;

import java.io.*;
import java.util.Scanner;

public class FileStreamExample {

    public static void main(String[] args) throws IOException {


        FileReader in = new FileReader("src/com/sda3/io_nio/someText");
        FileWriter out = new FileWriter("src/com/sda3/io_nio/someOutText3");

        int nextChar;

        while ((nextChar = in.read()) != -1) {

        }



        /*FileInputStream in = null;
        FileOutputStream out = null;

        {
            try {
                in = new FileInputStream("src/com/io_nio/someText");
                out = new FileOutputStream("src/com/io_nio/someOutText2");
                int c;
                while ((c = in.read()) != -1) {
                    out.write(c);
                }
            } finally {
                if (in != null){
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            }
        }*/

        /*String dane;
        Scanner zapisDoPliku = new Scanner(System.in);
        File nowyPlik = new File("src/com/io_nio/nowy_plik.txt");

        PrintWriter zapis = new PrintWriter("src/com/io_nio/nowy_plik.txt");
        do{
            dane = zapisDoPliku.nextLine();
            zapis.println(dane);
            zapis.close();

        } while (
        );




        Scanner odczyt = new Scanner(new File("src/com/io_nio/nowy_plik.txt"));

        String zapisanyText = odczyt.nextLine();

        System.out.println(zapisanyText);*/




    }
}
