package com.example.smarthealth.ui.dashboard;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.icu.text.CaseMap;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.smarthealth.MainActivity;
import com.example.smarthealth.R;
import com.example.smarthealth.ui.home.HomeFragment;

import static java.lang.Integer.getInteger;
import static java.lang.Integer.valueOf;

public class Disturb extends AppCompatActivity {
    CheckBox checkbox;
    CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox3;
    CheckBox checkBox4;
    CheckBox checkBox5;
    CheckBox checkBox6;
    CheckBox checkBox7;
    CheckBox checkBox8;
    CheckBox checkBox9;

    TextView textBox;
    Button button;
    public int score;
    public int score1;
    public int score2;
    public int score3;
    public int score4;
    public int score5;
    public int score6;
    public int score7;
    public int score8;
    public int score9;
    public int totscore;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.disturb);
        ActionBar actionBar;
        actionBar = getSupportActionBar();
        actionBar.setTitle("수면 방해 요소");

        // Define ColorDrawable object and parse color
        // using parseColor method
        // with color hash code as its parameter
        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#FF03DAC5"));
        actionBar.setBackgroundDrawable(colorDrawable);
        Button button = (Button) findViewById((R.id.save));

        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("nameKey", "Bruce the Hoon");
        editor.apply();
        editor.commit();
        TextView textBox = (TextView) findViewById(R.id.text1);
        CheckBox checkBox = (CheckBox) findViewById(R.id.checkbox_alcohol);

        checkBox.setOnClickListener(new CheckBox.OnClickListener() {
            public void onClick(View v) {
                score = 10;
                System.out.println(score);

            }


        });


        CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkbox_snacks);
        checkBox1.setOnClickListener(new CheckBox.OnClickListener() {
            public void onClick(View v) {
                score1 = 10;
                System.out.println(score1);
            }


        });

        CheckBox checkBox2 = (CheckBox) findViewById(R.id.caffeine);
        checkBox2.setOnClickListener(new CheckBox.OnClickListener() {
            public void onClick(View v) {
                 score2 = 10;
                System.out.println(score2);
            }


        });
    CheckBox checkBox3 = (CheckBox) findViewById(R.id.checkbox_cigarette);
        checkBox3.setOnClickListener(new CheckBox.OnClickListener() {
            public void onClick(View v) {
                 score3 = 10;
                System.out.println(score3);
            }


        });

        CheckBox checkBox4 = (CheckBox) findViewById(R.id.checkbox_noise);
        checkBox4.setOnClickListener(new CheckBox.OnClickListener() {
            public void onClick(View v) {
                score4 = 10;
                System.out.println(score4);
            }


        });

        CheckBox checkBox5 = (CheckBox) findViewById(R.id.checkbox_light);
        checkBox5.setOnClickListener(new CheckBox.OnClickListener() {
            public void onClick(View v) {
                 score5 = 10;
                System.out.println(score5);
            }


        });

        CheckBox checkBox6 = (CheckBox) findViewById(R.id.checkbox_stress);
        checkBox6.setOnClickListener(new CheckBox.OnClickListener() {
            public void onClick(View v) {
              score6 = 10;
                System.out.println(score6);
            }


        });

        CheckBox checkBox7 = (CheckBox) findViewById(R.id.nap);
        checkBox7.setOnClickListener(new CheckBox.OnClickListener() {
            public void onClick(View v) {
               score7 = 10;
                System.out.println(score7);
            }


        });

        CheckBox checkBox8 = (CheckBox) findViewById(R.id.urination);
        checkBox8.setOnClickListener(new CheckBox.OnClickListener() {
            public void onClick(View v) {
                 score8 = 10;
                System.out.println(score8);
            }


        });

        CheckBox checkBox9 = (CheckBox) findViewById(R.id.Stimulation);
        checkBox9.setOnClickListener(new CheckBox.OnClickListener() {
            public void onClick(View v) {
                score9 = 10;
                System.out.println(score9);
            }


        });

        ProgressBar progressBar = (ProgressBar)findViewById(R.id.P1);
        progressBar.setMax(100);


        button.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                totscore = score + score1 + score2 + score3 + score4 + score5+ score6+score7+score8+score9;
                System.out.println(totscore);

                progressBar.setProgress(totscore);
                textBox.setText(totscore + "%");


                }
        });


    }

}