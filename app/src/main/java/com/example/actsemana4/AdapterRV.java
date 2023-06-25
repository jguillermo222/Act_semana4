package com.example.actsemana4;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterRV extends RecyclerView.Adapter<MyViewHolderRV> {

    Context context;
    List<ItemRV> items;


    public AdapterRV(Context context, List<ItemRV> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolderRV onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolderRV(LayoutInflater.from(context).inflate(R.layout.item_view,parent,false));
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolderRV holder, int position) {

        holder.imageView.setImageResource(items.get(position).getImage());
        holder.imageView2.setImageResource(items.get(position).getImageHueso());
        holder.textView.setText(items.get(position).getText());
        holder.textView2.setText(items.get(position).getText2());
        holder.imageView3.setImageResource(items.get(position).getImagenHuesoDorado());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }



}
