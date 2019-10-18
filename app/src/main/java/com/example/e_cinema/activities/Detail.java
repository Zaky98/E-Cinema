package com.example.e_cinema.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.e_cinema.R;

public class Detail extends AppCompatActivity {

    public TextView title;
    public TextView descs;
    public TextView rate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        title = findViewById(R.id.title);
        descs = findViewById(R.id.desc);
        rate = findViewById(R.id.rate);
        title.setText(getIntent().getExtras().getString("title"));
        descs.setText(getIntent().getExtras().getString("desc"));
        rate.setText(getIntent().getExtras().getString("rate"));
    }
}
