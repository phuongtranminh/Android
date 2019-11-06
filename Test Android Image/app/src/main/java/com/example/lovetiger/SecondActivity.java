package com.example.lovetiger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    private boolean IsFirstImage = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final ImageView image_1 = findViewById(R.id.image_1);
        image_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View view) {
                if (IsFirstImage){
                image_1.setImageResource(R.drawable.anh2);
                }else {
                    image_1.setImageResource(R.drawable.anh);
                }
                IsFirstImage = ! IsFirstImage;
            }
        });
    }
}
