package com.example.bookingcar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDatVe = findViewById(R.id.btnDatVe);
        btnDatVe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDatVeScreen();
            }

            private void openDatVeScreen() {
                Intent datvescreen = new Intent(MainActivity.this, DatVeScreen.class);
                startActivity(datvescreen);
            }
        });

        Button btnTraCuu = findViewById(R.id.btnTraCuu);
        btnTraCuu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tracuu = new Intent(MainActivity.this, TraCuuVeScreen.class);
                startActivity(tracuu);
            }
        });
    }
}
