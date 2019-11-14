package com.example.gamebatchu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class FourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);

        ImageButton imagePlay2 = findViewById(R.id.imagePlay2);
        imagePlay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnResult();
            }

            private void returnResult() {
                Intent intent3 = new Intent(FourActivity.this, ThirtActivity.class);
                startActivity(intent3);
            }
        });

        ImageButton imagePlay1 = findViewById(R.id.imagePlay1);
        imagePlay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnResult();
            }

            private void returnResult() {
                Toast.makeText(FourActivity.this, "Câu Trả Lời Sai", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton imagePlay3 = findViewById(R.id.imagePlay3);
        imagePlay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnResult();
            }

            private void returnResult() {
                Toast.makeText(FourActivity.this, "Câu Trả Lời Sai", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton imagePlay4 = findViewById(R.id.imagePlay4);
        imagePlay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnResult();
            }

            private void returnResult() {
                Toast.makeText(FourActivity.this, "Câu Trả Lời Sai", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
