package com.example.androidrecyclerview;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class NumberAdapter extends RecyclerView.Adapter<NumberAdapter.NumberViewHolder> {

    final List<String> data = new ArrayList<>();

    @NonNull
    @Override
    public NumberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_number, parent, false);

        return new NumberViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NumberViewHolder holder, int position) {
        holder.tvTitle.setText("ABC - "+position);

    }

    @Override
    public int getItemCount() {

        return 6;
    }

    class NumberViewHolder extends RecyclerView.ViewHolder{

        TextView tvTitle;

        public NumberViewHolder (@NonNull View itemView){

            super(itemView);

            tvTitle = itemView.findViewById(R.id.text_title);
        }
    }

}
