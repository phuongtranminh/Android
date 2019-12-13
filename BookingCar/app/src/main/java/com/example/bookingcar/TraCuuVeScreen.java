package com.example.bookingcar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.bookingcar.Entities.Ticket;

import java.util.ArrayList;
import java.util.List;

public class TraCuuVeScreen extends AppCompatActivity {

    private RecyclerView ticketRecycler;
    private TicketDatabase database;
    private TicketAdapter adapter;

    @SuppressLint("StaticFieldLeak")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tra_cuu_ve_screen);

        this.database = Room.databaseBuilder(getApplicationContext(), TicketDatabase.class, "ticket_db").allowMainThreadQueries().build();
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
                database = TicketDatabase.getInstance(TraCuuVeScreen.this);
                final ArrayList<Ticket> tickets = (ArrayList<Ticket>) database.ticketDao().getTicketList();
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        ticketRecycler = findViewById(R.id.ticket_recycler);
                        ticketRecycler.setLayoutManager(new LinearLayoutManager(TraCuuVeScreen.this));
                        adapter = new TicketAdapter();
                        adapter.listener =  new TicketAdapter.OnItemListener() {
                            @Override
                            public void onDeleteClicked(int position) {
                                deleteTicket(position);
                            }
                        };
                        adapter.setTickets(tickets);
                        ticketRecycler.setAdapter(adapter);
                    }
                });
                return null;
            }

        }.execute();
    }

    @SuppressLint("StaticFieldLeak")
    private void deleteTicket(final int position) {
        final Ticket ticket = adapter.getTickets().get(position);
        new AsyncTask<Void, Void, Void>() {

            @Override
            protected Void doInBackground(Void... voids) {
                database.ticketDao().deleteTicket(ticket);
                return null;
            }

            @Override
            protected void onPostExecute(Void aVoid) {
                super.onPostExecute(aVoid);
                adapter.getTickets().remove(position);
                adapter.notifyDataSetChanged();
            }
        }.execute();
    }
}
