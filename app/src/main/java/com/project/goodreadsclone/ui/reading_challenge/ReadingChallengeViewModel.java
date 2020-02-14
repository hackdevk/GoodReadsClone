package com.project.goodreadsclone.ui.reading_challenge;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ReadingChallengeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ReadingChallengeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is tools fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}