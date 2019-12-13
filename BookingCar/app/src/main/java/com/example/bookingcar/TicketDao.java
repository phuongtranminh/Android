package com.example.bookingcar;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.bookingcar.Entities.Ticket;

import java.util.List;

@Dao
public interface TicketDao {

    @Query("Select * from ticket")
    List<Ticket> getTicketList();

    @Insert
    void insertTicket(Ticket ticket);

    @Update
    void updateTicket(Ticket ticket);

    @Delete
    void deleteTicket(Ticket ticket);

}
