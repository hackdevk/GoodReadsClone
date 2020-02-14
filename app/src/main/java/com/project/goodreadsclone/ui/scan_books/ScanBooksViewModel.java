package com.project.goodreadsclone.ui.scan_books;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ScanBooksViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ScanBooksViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is share fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}