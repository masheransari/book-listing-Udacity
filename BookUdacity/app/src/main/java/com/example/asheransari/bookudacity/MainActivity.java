package com.example.asheransari.bookudacity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Book> books = QueryUtil.extractBookDetail();

        ListView bookListView = (ListView) findViewById(R.id.list);

        final BookAdapter adapter = new BookAdapter(this, books);

        bookListView.setAdapter(adapter);
    }
}