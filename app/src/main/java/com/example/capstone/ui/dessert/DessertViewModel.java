package com.example.capstone.ui.dessert;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DessertViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DessertViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Dessert recipes go here");
    }

    public LiveData<String> getText() {
        return mText;
    }
}