package com.example.litepaltest;

import org.litepal.crud.LitePalSupport;

public class Book extends LitePalSupport {
    private int id;

    private String author;

    private double price;

    private int pages;

    private String name;

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    private String press;

    public void setId(int id) {
        this.id = id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getPages() {
        return pages;
    }

    public String getName() {
        return name;
    }
}
