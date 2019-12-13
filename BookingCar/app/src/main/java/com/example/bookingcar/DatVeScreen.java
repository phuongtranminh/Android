package com.example.bookingcar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.bookingcar.Entities.Ticket;

import java.io.Serializable;
import java.util.List;

public class DatVeScreen extends AppCompatActivity {

    private TicketDatabase database;

    @SuppressLint("StaticFieldLeak")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dat_ve_screen);


//        get  data  from screen
        final EditText name = findViewById(R.id.et_name);
        final EditText phone = findViewById(R.id.et_phone);
        final EditText type = findViewById(R.id.type_car);
        final EditText amount = findViewById(R.id.et_amount);

        this.database = Room.databaseBuilder(getApplicationContext(), TicketDatabase.class, "ticket_db").allowMainThreadQueries().build();
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
                database = TicketDatabase.getInstance(DatVeScreen.this);
                final List<Ticket> tickets = database.ticketDao().getTicketList();

                if (tickets.isEmpty()) {
                    Ticket ticket = new Ticket("Trần Văn Tài", "0123456789", "Xe Giường Nằm", 2);
                    database.ticketDao().insertTicket(ticket);
                }

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
//Do something
                    }
                });
                return null;
            }

        }.execute();

        List<Ticket> ticketList = this.database.ticketDao().getTicketList();
        for (int i = 0; i < ticketList.size(); i++) {
            System.out.println("" + i + "-thong tin: " + ticketList.get(i).getNameClient());
        }

        Button btn_continue = findViewById(R.id.btn_continue);
        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Ticket ticket = new Ticket(name.getText().toString(), phone.getText().toString(), type.getText().toString(), Integer.parseInt(amount.getText().toString()));

                new AsyncTask<Void, Void, Void>() {
                    @Override
                    protected Void doInBackground(Void... voids) {

                        database.ticketDao().insertTicket(ticket);

                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
//Do something
                            }
                        });
                        return null;
                    }

                }.execute();

                Intent intent = new Intent(DatVeScreen.this, DatThanhCongScreen.class);

                intent.putExtra("ticketName", ticket.getNameClient());
                intent.putExtra("ticketPhone", ticket.getPhoneNumber());
                intent.putExtra("ticketType", ticket.getTypeCar());
                intent.putExtra("ticketAmount", String.valueOf(ticket.getQuantityTicket()));
                startActivity(intent);
            }
        });


    }

}
