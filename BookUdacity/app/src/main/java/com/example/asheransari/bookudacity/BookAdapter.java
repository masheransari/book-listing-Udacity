package com.example.asheransari.bookudacity;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by asher.ansari on 10/14/2016.
 */
public class BookAdapter extends ArrayAdapter<Book> {
    public BookAdapter(Activity activity, ArrayList<Book> books)
    {
        super(activity, 0 ,books);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View listItemView = convertView;
        if (listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_list, parent, false);
        }

        Book currentBook = getItem(position);

        TextView bookTitle = (TextView) listItemView.findViewById(R.id.book_title);
        bookTitle.setText(currentBook.getmTItle());

        TextView bookAuthor = (TextView) listItemView.findViewById(R.id.book_author);
        bookAuthor.setText(currentBook.getmAuthor());

        TextView bookPublisher = (TextView) listItemView.findViewById(R.id.book_publisher);
        bookPublisher.setText(currentBook.getmPublisher());

        TextView bookCategory = (TextView) listItemView.findViewById(R.id.book_category);
        bookCategory.setText(currentBook.getmCategory());

        RatingBar bookRating = (RatingBar) listItemView.findViewById(R.id.book_rating);
        bookRating.setRating((float) currentBook.getmRating());


        //Return the list item view that is now showing the appropriate date
        return listItemView;

    }
}
