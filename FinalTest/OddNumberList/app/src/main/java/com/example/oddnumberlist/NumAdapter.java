package com.example.oddnumberlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NumAdapter extends RecyclerView.Adapter<NumAdapter.NumHolder> {

    private int[] numbers;

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    @NonNull
    @Override
    public NumHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NumHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.rown, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull NumHolder holder, int position) {
        holder.number.setText(String.valueOf(numbers[position]));
    }

    @Override
    public int getItemCount() {
        return numbers.length;
    }

    public class NumHolder extends RecyclerView.ViewHolder {

        private TextView number;

        public NumHolder(@NonNull View itemView) {
            super(itemView);
            this.number = itemView.findViewById(R.id.number);
        }
    }
}
