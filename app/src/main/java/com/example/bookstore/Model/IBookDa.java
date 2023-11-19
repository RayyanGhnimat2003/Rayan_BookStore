package com.example.bookstore.Model;

import java.util.List;

public interface IBookDa {
    List<Book> getBooks(String Cat);
    String [] getCategories();
}
