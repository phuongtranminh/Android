package com.example.bookingcar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bookingcar.Entities.Ticket;

public class DatThanhCongScreen extends AppCompatActivity {

    private TextView tvName, tvPhone, tvType, tvQuantity;
    String Name, Phone, Amount, Type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dat_thanh_cong_screen);

//        Ticket ticket = (Ticket) getIntent().getSerializableExtra("ticket");
        Intent myIntent=getIntent();
        Name = myIntent.getStringExtra("ticketName");
        Phone = myIntent.getStringExtra("ticketPhone");
        Type = myIntent.getStringExtra("ticketType");
        Amount = myIntent.getStringExtra("ticketAmount");

        Toast.makeText(this, "Dang mo trang dat thanh cong", Toast.LENGTH_SHORT).show();

        tvName = findViewById(R.id.tv_name);
        tvName.setText(tvName.getText().toString() + Name);
        Log.i("check: ",Name);
        tvPhone = findViewById(R.id.tv_phone);
        tvPhone.setText(tvPhone.getText().toString() + Phone);

        tvType = findViewById(R.id.tv_type);
        tvType.setText(tvType.getText().toString() + Type);

        tvQuantity = findViewById(R.id.tv_amount);
        tvQuantity.setText(tvQuantity.getText().toString() + Amount);


//        Button btn_ok = findViewById(R.id.btn_ok);

        Button btn_ok = findViewById(R.id.btn_ok);
        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainscreen = new Intent(DatThanhCongScreen.this, MainActivity.class);
                startActivity(mainscreen);
            }
        });
    }
}
