package com.example.asheransari.bookudacity;

/**
 * Created by asher.ansari on 10/14/2016.
 */
public class Book {
    private double mRating;
    private String mTItle;
    private String mAuthor;
    private String mPublisher;
    private String mCategory;

    public Book(double mRating, String mTitle, String mAuthor, String mPublisher, String mCategory) {
        this.mRating = mRating;
        this.mTItle= mTitle;
        this.mAuthor = mAuthor;
        this.mPublisher = mPublisher;
        this.mCategory = mCategory;
    }

    public double getmRating() {
        return mRating;
    }

    public String getmTItle() {
        return mTItle;
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

}