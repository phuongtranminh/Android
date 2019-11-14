package com.example.gamebatchu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ImageButton imagePlay1 = findViewById(R.id.imagePlay1);
        imagePlay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnResult();
            }

            private void returnResult() {
                Toast.makeText(SecondActivity.this, "Câu Trả Lời Sai", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton imagePlay2 = findViewById(R.id.imagePlay2);
        imagePlay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnAnswer();
            }

            private void returnAnswer() {
                Intent intent2 = new Intent(SecondActivity.this, ThirtActivity.class);
                startActivity(intent2);
            }
        });

        ImageButton imagePlay3 =findViewById(R.id.imagePlay3);
        imagePlay3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnResult();
            }

            private void returnResult() {
                Toast.makeText(SecondActivity.this, "Câu Trả Lời Sai", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton imagePaly4 = findViewById(R.id.imagePlay4);
        imagePaly4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnResult();
            }

            private void returnResult() {
                Toast.makeText(SecondActivity.this, "Câu Trả Lời Sai", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
