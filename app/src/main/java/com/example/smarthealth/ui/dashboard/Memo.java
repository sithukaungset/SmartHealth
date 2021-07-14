package com.example.smarthealth.ui.dashboard;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.smarthealth.R;

public class Memo extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        ActionBar actionBar;
        actionBar = getSupportActionBar();
        actionBar.setTitle("Memo");





        // Define ColorDrawable object and parse color
        // using parseColor method
        // with color hash code as its parameter
        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#FF03DAC5"));
        actionBar.setBackgroundDrawable(colorDrawable);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.memo);
    }
}
