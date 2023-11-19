package com.example.bookstore.Model;

public class Book {
    private int pages;
    private String title;
    private String catagory;

    public Book(int pages, String title, String catagory) {
        this.pages = pages;
        this.title = title;
        this.catagory = catagory;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }
}
