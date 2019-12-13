package com.example.bookingcar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bookingcar.Entities.Ticket;

import java.util.ArrayList;

public class TicketAdapter extends RecyclerView.Adapter<TicketAdapter.TicketViewHolder> {

    private ArrayList<Ticket> tickets;

    public OnItemListener listener;

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }

    @NonNull
    @Override
    public TicketViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TicketViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.ticket_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull TicketViewHolder holder, int position) {

        Ticket ticket = tickets.get(position);
        holder.name.setText(ticket.getNameClient());
        holder.phone.setText(ticket.getPhoneNumber());
        holder.type.setText(ticket.getTypeCar());
        holder.quantity.setText(String.valueOf(ticket.getQuantityTicket()));

    }

    @Override
    public int getItemCount() {
        return tickets.size();
    }

    public class TicketViewHolder extends RecyclerView.ViewHolder {

        private TextView name, phone, type, quantity;
        private Button  btnCancel;

        public TicketViewHolder(@NonNull View itemView) {
            super(itemView);
            this.name = itemView.findViewById(R.id.name);
            this.phone = itemView.findViewById(R.id.phone);
            this.type = itemView.findViewById(R.id.type);
            this.quantity = itemView.findViewById(R.id.quantity);
            this.btnCancel = itemView.findViewById(R.id.btnCancel);
            btnCancel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onDeleteClicked(getAdapterPosition());
                }
            });
        }
    }

    public interface OnItemListener {
        void onDeleteClicked(int position);
    }
}
