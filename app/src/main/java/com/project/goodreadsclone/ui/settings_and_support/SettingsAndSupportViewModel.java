package com.project.goodreadsclone.ui.settings_and_support;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SettingsAndSupportViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SettingsAndSupportViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is share fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}