package com.example.simplelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Show extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        Intent intent = getIntent();
        String email = String.valueOf(intent.getExtras().get("email"));
        String password = String.valueOf(intent.getExtras().get("password"));

        TextView emailResult = findViewById(R.id.emailResult);
        emailResult.setText(email);
        TextView passResult = findViewById(R.id.passwordResult);
        passResult.setText(password);
    }
}
