package com.example.bookstore.Model;

import java.util.ArrayList;
import java.util.List;

 class BookData  implements IBookDa{
    private ArrayList<Book> books = new ArrayList<>();

    public BookData() {
        books.add(new Book(300, "Java Book", "Java"));
        books.add(new Book(450, "Python Book", "Python"));
        books.add(new Book(300, "C++ Book", "C++"));

    }

    public List<Book> getBooks(String Cat) {
        ArrayList<Book> data = new ArrayList<>();
        for (Book b : books) {
            if (b.getCatagory().equals(Cat)) {
                data.add(b);
            }
        }
        return data;



    }

     @Override
     public String [] getCategories() {
        String [] cats =new String []{"java","c++","Python"};
         return cats;
     }

 }
