package com.example.capstone.ui.lunch;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LunchViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public LunchViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is the lunch fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}