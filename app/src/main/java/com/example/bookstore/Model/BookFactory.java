package com.example.bookstore.Model;

public class BookFactory {
    public IBookDa getMOdel(){
        return new BookData();
    }
}
