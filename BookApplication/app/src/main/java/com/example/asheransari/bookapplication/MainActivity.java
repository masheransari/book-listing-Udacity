package com.example.asheransari.bookapplication;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.net.URL;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getName();

    private String userBookSearch;
    private EditText userInput;
    private Button SearchBtn;
    private ArrayList<Book> tempBookArrayList = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView bookListView = (ListView)findViewById(R.id.list);

        userInput = (EditText)findViewById(R.id.editText);

        SearchBtn = (Button)findViewById(R.id.searchBtn);

        SearchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                userBookSearch = userInput.getText().toString().replace(" ","+");

                Log.v(LOG_TAG, userBookSearch);

                if (userBookSearch.trim().length()<=0 || userBookSearch.length()<=0)
                {
                    Toast.makeText(getApplicationContext(),"No Search Enteries",Toast.LENGTH_LONG).show();
                    Log.e(LOG_TAG, "Error Response code: No Search Given");
                }
                else
                {
                    Log.v(LOG_TAG,userBookSearch);
                    BookAsyncTask task = new BookAsyncTask();
                    task.execute();
                }
            }
        });

        if (tempBookArrayList !=null)
        {
            BookAdapter adapter = new BookAdapter(this, tempBookArrayList);

            bookListView.setAdapter(adapter);
        }
    }

    private void UpdateUi(ArrayList<Book> books)
    {
        tempBookArrayList = books;
        if (books !=null)
        {
            ListView bookListView = (ListView)findViewById(R.id.list);
            BookAdapter adapter = new BookAdapter(this, books);
            bookListView.setAdapter(adapter);
        }
        else
        {
            Log.e(LOG_TAG,"Still Suffering from random void error and no Result found.");
        }
    }

    private class BookAsyncTask extends AsyncTask<URL, Void, ArrayList<Book>>
    {

        @Override
        protected ArrayList<Book> doInBackground(URL... urls) {
            return null;
        }

        @Override
        protected void onPostExecute(ArrayList<Book> books) {
            super.onPostExecute(books);
        }
    }
}
