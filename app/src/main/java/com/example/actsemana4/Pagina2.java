package com.example.actsemana4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Pagina2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina2);

        getSupportActionBar().setTitle("PG");

    }

    //paso 2 cambio de pagina a atras

    public void irAPaginaMain (View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}