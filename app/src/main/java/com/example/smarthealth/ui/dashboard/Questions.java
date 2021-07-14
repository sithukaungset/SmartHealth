package com.example.smarthealth.ui.dashboard;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.smarthealth.R;

import java.util.ArrayList;

public class Questions extends AppCompatActivity {
    ListView types;
    WorkoutAdapter adapter;


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.questions);
        ActionBar actionBar;
        actionBar = getSupportActionBar();
        actionBar.setTitle("정보추가");


        // Define ColorDrawable object and parse color
        // using parseColor method
        // with color hash code as its parameter
        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#FF03DAC5"));

        // Set BackgroundDrawable
        actionBar.setBackgroundDrawable(colorDrawable);
        types = (ListView) findViewById(R.id.types);
        adapter = new WorkoutAdapter();


        adapter.addItem(new Qitem("수면 방해 요소", R.drawable.frusated));
        adapter.addItem(new Qitem("메모", R.drawable.memo));
        adapter.addItem(new Qitem("수면모드 설정", R.drawable.mode));
        adapter.addItem(new Qitem("도움말 (설명)", R.drawable.helpp));


        types.setAdapter(adapter);

        types.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Qitem item = (Qitem) adapter.getItem(position);
                if (position == 0)
                    startActivity(new Intent(Questions.this, Disturb.class));
                if (position == 1)
                    startActivity(new Intent(Questions.this, Memo.class));
                if (position == 2)
                    startActivity(new Intent(Questions.this, Graph.class));
                if (position == 3)
                    startActivity(new Intent(Questions.this, QA.class));

                Toast.makeText(getApplicationContext(),"Chosen " +  item.getName(),Toast.LENGTH_LONG).show();


            }
        });
    }


    class WorkoutAdapter extends BaseAdapter {
        ArrayList<Qitem> items = new ArrayList<Qitem>();

        public int getCount() {
            return items.size();
        }

        public void addItem(Qitem item) {
            items.add(item);
        }

        @Override
        public Object getItem(int position) {
            return items.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup viewGroup) {
            QitemView view = new QitemView (getApplicationContext());
            Qitem item = items.get(position);
            view.setName(item.getName());
            view.setImage(item.getResId());

            return view;
        }
    }
}
