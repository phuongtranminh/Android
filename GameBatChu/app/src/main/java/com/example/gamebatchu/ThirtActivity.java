package com.example.gamebatchu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirtActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirt);

        Button btnNextGame = findViewById(R.id.btnNextGame);
        btnNextGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextGame();
            }

            private void nextGame() {
                Intent intentNextGame = new Intent(ThirtActivity.this, FourActivity.class);
                startActivity(intentNextGame);
            }
        });
    }
}
