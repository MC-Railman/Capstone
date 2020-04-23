package com.example.capstone.ui.breakfast;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BreakfastViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BreakfastViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Breakfast recipes go here");
    }

    public LiveData<String> getText() {
        return mText;
    }
}