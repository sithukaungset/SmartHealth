package com.example.smarthealth.ui.dashboard;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.smarthealth.R;

import java.util.Date;

import static android.app.DatePickerDialog.*;

public class DashboardFragment extends Fragment {
    Button button;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        Button  button=(Button) root.findViewById(R.id.button1);
            button.setOnClickListener(new View.OnClickListener() {

    @Override
    public void onClick(View v) {

        Intent i = new Intent(getActivity(), Questions.class);
        startActivity(i);
    }
            });


        return root;
    }

}
