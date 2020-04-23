package com.example.capstone.ui.dinner;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DinnerViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DinnerViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Dinner recipes go here");
    }

    public LiveData<String> getText() {
        return mText;
    }
}