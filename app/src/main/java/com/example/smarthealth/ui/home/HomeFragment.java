
package com.example.smarthealth.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.smarthealth.R;
import com.example.smarthealth.ui.dashboard.Questions;
import com.hsalf.smileyrating.SmileyRating;

import static android.content.ContentValues.TAG;


public class HomeFragment extends Fragment {

    public HomeViewModel homeViewModel;
    Button button1;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        Button button1=(Button) root.findViewById(R.id.startButton);
        TextView textView = (TextView) root.findViewById(R.id.txtProgress);

        SmileyRating smileyRating = (SmileyRating)root.findViewById(R.id.smile_rating);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(getActivity(), CustomProgressBarActivity.class);
                startActivity(i);


            }
        });


        return root;

    }
}
