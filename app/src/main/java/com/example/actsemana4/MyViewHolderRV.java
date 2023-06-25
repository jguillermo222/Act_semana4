package com.example.actsemana4;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolderRV extends RecyclerView.ViewHolder {


    ImageView imageView;
    ImageView imageView2;
    TextView textView;
    TextView textView2;
    ImageView imageView3;


    public MyViewHolderRV(@NonNull View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.imagen11);
        imageView2 = itemView.findViewById(R.id.imagen21);
        textView = itemView.findViewById(R.id.texto11);
        textView2 = itemView.findViewById(R.id.texto21);
        imageView3 = itemView.findViewById(R.id.imagen31);


    }
}
