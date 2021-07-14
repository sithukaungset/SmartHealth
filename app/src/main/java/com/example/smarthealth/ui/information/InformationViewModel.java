package com.example.smarthealth.ui.information;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InformationViewModel extends ViewModel {
    private MutableLiveData<String> mText;
    public InformationViewModel(){
        mText = new MutableLiveData<>();
        mText.setValue("FAQ");

    }

    public LiveData<String> getText() {return mText;}

}
