package com.project.goodreadsclone.ui.explore_books;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ExploreBooksViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ExploreBooksViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}