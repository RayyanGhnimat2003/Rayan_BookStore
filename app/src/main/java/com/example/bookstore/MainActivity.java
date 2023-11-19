package com.example.bookstore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.bookstore.Model.Book;
import com.example.bookstore.Model.BookFactory;
import com.example.bookstore.Model.IBookDa;

import java.util.List;

public class MainActivity extends AppCompatActivity {
private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner=findViewById(R.id.spinner);
        populateSpinner();
    }

    private void populateSpinner() {
        BookFactory factory =new BookFactory();
        IBookDa objBook=factory.getMOdel();
        String [] cats =objBook.getCategories();
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this , android.R.layout.simple_spinner_item,cats);
        spinner.setAdapter(adapter);
    }

    public void BtnGetBooksOnClick(View view) {
        BookFactory factory =new BookFactory();
        IBookDa objBook=factory.getMOdel();
        List<Book> books=objBook.getBooks("java");
        String str="";
        for(Book b:books){
            str+=b.getTitle()+"\n";

        }
        Toast.makeText(this,str , Toast.LENGTH_SHORT).show();

    }
}