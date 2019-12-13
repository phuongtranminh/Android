package com.example.simplelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email, password;

                EditText emailPage = (EditText) findViewById(R.id.email);
                EditText passPage = (EditText) findViewById(R.id.password);

                if (emailPage.getText().toString().equals("admin") && passPage.getText().toString().equals("admin")) {
                    Toast.makeText(MainActivity.this, "Login success", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getBaseContext(), Show.class);
                    intent.putExtra("email", emailPage.getText().toString());
                    intent.putExtra("password", passPage.getText().toString());
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Email or Password is incorrect", Toast.LENGTH_SHORT).show();
                }
            }
        });

        Button btnRegister = findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Register", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
