package com.project.goodreadsclone.ui.best_books_of_year;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BestBooksOfYearViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BestBooksOfYearViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is send fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}