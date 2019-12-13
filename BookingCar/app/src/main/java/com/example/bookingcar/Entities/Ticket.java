package com.example.bookingcar.Entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity (tableName = "ticket")
public class Ticket {
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "nameClient")
    private String nameClient;
    @ColumnInfo(name = "phoneNumber")
    private String phoneNumber;
    @ColumnInfo(name = "typeCar")
    private String typeCar;
    @ColumnInfo(name = "quantityTicket")
    private int quantityTicket;


    public Ticket(int id, String nameClient, String phoneNumber, String typeCar, int quantityTicket) {
        this.id = id;
        this.nameClient = nameClient;
        this.phoneNumber = phoneNumber;
        this.typeCar = typeCar;
        this.quantityTicket = quantityTicket;
    }

    @Ignore
    public Ticket(String nameClient, String phoneNumber, String typeCar, int quantityTicket) {
        this.nameClient = nameClient;
        this.phoneNumber = phoneNumber;
        this.typeCar = typeCar;
        this.quantityTicket = quantityTicket;
    }

    public int getId() {
        return id;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }

    public int getQuantityTicket() {
        return quantityTicket;
    }

    public void setQuantityTicket(int quantityTicket) {
        this.quantityTicket = quantityTicket;
    }
}
