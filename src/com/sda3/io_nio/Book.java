package com.sda3.io_nio;

import java.io.Serializable;

public class Book implements Serializable {

    int id;
    String author;
    String nameBook;

    public Book(int id, String author, String nameBook) {
        this.id = id;
        this.author = author;
        this.nameBook = nameBook;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", nameBook='" + nameBook + '\'' +
                '}';
    }
}
