package com.khairul.digitaltosbi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button addOne,subOne ,reSet;

    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textview);
        addOne = findViewById(R.id.addOne);
        subOne = findViewById(R.id.subOne);
        reSet = findViewById(R.id.reSet);

        addOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = count+1;
                textView.setText(""+count);
            }
        });
        subOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = count-1;
                textView.setText(""+count);
            }
        });
        reSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count =0;
                textView.setText(""+count);
            }
        });

    }
}