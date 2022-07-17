package com.sda3.io_nio;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerialuzationExample {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Book book = new Book(1, "Andrzej", "nazwa");

        Path path = Paths.get("src\\com\\sda3\\io_nio\\objectexample");

        File file = new File(path.toUri());

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream);

        objectOutputStream.writeObject(book);
        objectOutputStream.flush();
        objectOutputStream.close();

        //Deserializacja
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream);

        Object obj1 = objectInputStream.readObject();
        System.out.println(obj1);







    }
}
