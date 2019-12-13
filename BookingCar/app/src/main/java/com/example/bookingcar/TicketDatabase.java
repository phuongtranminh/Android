package com.example.bookingcar;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.bookingcar.Entities.Ticket;

@Database(entities = Ticket.class, exportSchema = false, version = 1)
public abstract class TicketDatabase extends RoomDatabase {
    private static final String DB_NAME = "ticket_db";
    private static TicketDatabase instance;

    public static synchronized TicketDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(), TicketDatabase.class, DB_NAME).fallbackToDestructiveMigration().build();
        }
        return instance;
    }

    public abstract TicketDao ticketDao();
}
