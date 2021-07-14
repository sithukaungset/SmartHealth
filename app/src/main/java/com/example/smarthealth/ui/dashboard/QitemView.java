package com.example.smarthealth.ui.dashboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.example.smarthealth.R;

public class QitemView extends RelativeLayout {
    TextView textView;
    ImageView imageView;
    public QitemView(Context context){
        super(context);
        init(context);

    }
    public QitemView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }
    public void init(Context context) {
        LayoutInflater inflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.qitem,this,true);

        textView = (TextView) findViewById(R.id.textView);
        imageView = (ImageView) findViewById(R.id.imageView);
    }

    public void setName(String name){
        textView.setText(name);

    }
    public void setImage(int resId){
        imageView.setImageResource(resId);
    }

}

