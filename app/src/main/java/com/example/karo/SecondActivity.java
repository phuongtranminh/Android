package com.example.karo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnPlayNewGame;
    private boolean Player1 = true;
    private boolean endGame = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnPlayNewGame = findViewById(R.id.btnPlayNewGame);

        btnPlayNewGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playNewGame();
            }

            private void playNewGame() {
                btn1.setText("");
                btn1.setClickable(true);
                btn2.setText("");
                btn2.setClickable(true);
                btn3.setText("");
                btn3.setClickable(true);
                btn4.setText("");
                btn4.setClickable(true);
                btn5.setText("");
                btn5.setClickable(true);
                btn6.setText("");
                btn6.setClickable(true);
                btn7.setText("");
                btn7.setClickable(true);
                btn8.setText("");
                btn8.setClickable(true);
                btn9.setText("");
                btn9.setClickable(true);
                Player1 = true;
                endGame = false;

            }

        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(btn1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(btn2);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(btn3);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(btn4);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(btn5);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(btn6);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(btn7);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(btn8);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(btn9);
            }
        });
    }

    protected void play(Button btn) {
        if (!endGame) {
            if (Player1) {
                btn.setText("O");
            } else {
                btn.setText("X");
            }
            Player1 = !Player1;
            btn.setClickable(false);
            checkResult(btn);
        }
    }

    protected void checkResult(Button btn) {
        if (btn1.equals(btn)) {
            check(btn1, btn2, btn3);
            check(btn1, btn4, btn7);
            check(btn1, btn5, btn9);
        }
        if (btn2.equals(btn)) {
            check(btn1, btn2, btn3);
            check(btn1, btn5, btn8);
        }
        if (btn3.equals(btn)) {
            check(btn1, btn2, btn3);
            check(btn3, btn5, btn7);
            check(btn3, btn6, btn9);
        }
        if (btn4.equals(btn)) {
            check(btn4, btn5, btn6);
            check(btn1, btn4, btn7);
        }
        if (btn5.equals(btn)) {
            check(btn1, btn5, btn9);
            check(btn3, btn5, btn7);
            check(btn4, btn5, btn6);
            check(btn2, btn5, btn8);
        }
        if (btn6.equals(btn)) {
            check(btn4, btn5, btn6);
            check(btn4, btn6, btn9);
        }
        if (btn7.equals(btn)) {
            check(btn1, btn4, btn7);
            check(btn7, btn8, btn9);
            check(btn3, btn5, btn7);
        }
        if (btn8.equals(btn)) {
            check(btn2, btn5, btn8);
            check(btn7, btn8, btn9);
        }
        if (btn9.equals(btn)) {
            check(btn1, btn5, btn9);
            check(btn7, btn8, btn9);
            check(btn3, btn6, btn9);
        }
    }


    private void check(Button btn1, Button btn2, Button btn3) {
        if (!endGame) {
            String firstButtonString = btn1.getText().toString();
            String secondButtonString = btn2.getText().toString();
            String thirdButtonString = btn3.getText().toString();
            if (firstButtonString.equals(secondButtonString) && firstButtonString.equals(thirdButtonString) && !firstButtonString.isEmpty()) {
                Toast.makeText(this, "Game End: " + firstButtonString + " Won!", Toast.LENGTH_SHORT).show();
                endGame = true;
            }
        }
    }


}
