package com.example.oddnumberlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.my_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        int arr[] = new int[1000];
        int number = 3;
        int i = 0;

        while (i < 1000) {
            arr[i] = number;
            i++;
            number += 2;
        }
        NumAdapter adapter = new NumAdapter();
        adapter.setNumbers(arr);
        recyclerView.setAdapter(adapter);
    }
}
