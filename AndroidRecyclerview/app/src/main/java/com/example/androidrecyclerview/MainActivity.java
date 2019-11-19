package com.example.androidrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvNumber = findViewById(R.id.recyclerview_number);
        rvNumber.setLayoutManager(new LinearLayoutManager(this));

        NumberAdapter adapter = new NumberAdapter();
        rvNumber.setAdapter(adapter );
    }
}
