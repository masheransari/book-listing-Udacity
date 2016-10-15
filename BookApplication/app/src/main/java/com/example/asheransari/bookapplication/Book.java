package com.example.asheransari.bookapplication;

/**
 * Created by asher.ansari on 10/16/2016.
 */
public class Book {
    private double mRating;
    private String mTitle;
    private String mAuthor;
    private String mPublisher;
    private String mCategory;
    private String mPicture;

    public Book(double mRating, String mTitle, String mAuthor, String mPublisher, String mCategory, String mPicture) {
        this.mRating = mRating;
        this.mTitle = mTitle;
        this.mAuthor = mAuthor;
        this.mPublisher = mPublisher;
        this.mCategory = mCategory;
        this.mPicture = mPicture;
    }

    public double getmRating() {

        return mRating;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmAuthor() {
        return mAuthor;
    }

    public String getmPublisher() {
        return mPublisher;
    }

    public String getmCategory() {
        return mCategory;
    }

    public String getmPicture() {
        return mPicture;
    }
}
