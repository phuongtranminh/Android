package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSum = findViewById(R.id.btnSum);
        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1, n2, n3, sum;

                EditText num1 = (EditText)findViewById(R.id.text1);
                EditText num2 = (EditText)findViewById(R.id.text2);
                EditText num3 = (EditText)findViewById(R.id.text3);
                TextView result = (TextView) findViewById(R.id.result);

                n1 = Integer.parseInt(num1.getText().toString());
                n2 = Integer.parseInt((num2.getText().toString()));
                n3 = Integer.parseInt(num3.getText().toString());

                sum = n1 + n2 + n3;

                result.setText(Integer.toString(sum));
            }
        });

        Button btnMultiple = findViewById(R.id.btnMultiple);
        btnMultiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1, n2, n3, multiple;

                EditText num1 = (EditText)findViewById(R.id.text1);
                EditText num2 = (EditText)findViewById(R.id.text2);
                EditText num3 = (EditText)findViewById(R.id.text3);
                TextView result = (TextView) findViewById(R.id.result);

                n1 = Integer.parseInt(num1.getText().toString());
                n2 = Integer.parseInt((num2.getText().toString()));
                n3 = Integer.parseInt(num3.getText().toString());

                multiple = n1 * n2 * n3;

                result.setText(Integer.toString(multiple));
            }
        });

        Button btnAverage = findViewById(R.id.btnAverage);
        btnAverage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float n1, n2, n3;
                float average;

                EditText num1 = (EditText)findViewById(R.id.text1);
                EditText num2 = (EditText)findViewById(R.id.text2);
                EditText num3 = (EditText)findViewById(R.id.text3);
                TextView result = (TextView) findViewById(R.id.result);

                n1 = Float.parseFloat(num1.getText().toString());
                n2 = Float.parseFloat((num2.getText().toString()));
                n3 = Float.parseFloat(num3.getText().toString());

                average = (n1 + n2 + n3)/3;

                result.setText(toString().valueOf(average));
            }
        });
    }
}
