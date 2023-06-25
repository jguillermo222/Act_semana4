package com.example.actsemana4;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    FragmentPagerAdapter adapterViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_first);


        //boton a otra pagina




        //cambia titulo action bar
        getSupportActionBar().setTitle("PG");

        //aplicar el adaptador



        //base de datos

        RecyclerView recyclerView = findViewById(R.id.reciclerView);


        List<ItemRV> items = new ArrayList<>();
        items.add(new ItemRV(R.drawable.perro10, R.drawable.hueso1,"Lucas", "5",R.drawable.perrooo));
        items.add(new ItemRV(R.drawable.perro11, R.drawable.hueso1,"Nala", "5",R.drawable.perrooo));
        items.add(new ItemRV(R.drawable.perro12, R.drawable.hueso1,"Funji", "5",R.drawable.perrooo));
        items.add(new ItemRV(R.drawable.perro13, R.drawable.hueso1,"Lelo", "5",R.drawable.perrooo));
        items.add(new ItemRV(R.drawable.perro14, R.drawable.hueso1,"Luna", "5",R.drawable.perrooo));
        items.add(new ItemRV(R.drawable.perro21, R.drawable.hueso1,"Zen", "5",R.drawable.perrooo));
        items.add(new ItemRV(R.drawable.perro22, R.drawable.hueso1,"Mojito", "5",R.drawable.perrooo));
        items.add(new ItemRV(R.drawable.perro23, R.drawable.hueso1,"Milo", "5",R.drawable.perrooo));
        items.add(new ItemRV(R.drawable.perro24, R.drawable.hueso1,"Vader", "5",R.drawable.perrooo));



        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new AdapterRV(getApplicationContext(),items));











    }


    //Parte menu

    }



    // main adapter





    //ir a la pagina 2










