package com.example.actsemana4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;






import android.content.Intent;
import android.os.Bundle;

import android.view.Menu;
import android.view.View;



import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    FragmentPagerAdapter adapterViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //boton a otra pagina




        //cambia titulo action bar
        getSupportActionBar().setTitle("PG");

        //aplicar el adaptador

        ViewPager vpPager = (ViewPager) findViewById(R.id.vpPager);
        adapterViewPager = new MyPagerAdapter(getSupportFragmentManager());
        vpPager.setAdapter(adapterViewPager);





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

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_app, menu);
        return true;

    }



    // main adapter

    public static class MyPagerAdapter extends FragmentPagerAdapter {
        private static int NUM_ITEMS = 2;

        public MyPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        // Returns total number of pages
        @Override
        public int getCount() {
            return NUM_ITEMS;
        }

        // Returns the fragment to display for that page
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0: // Fragment # 0 - This will show FirstFragment
                    return FirstFragment.newInstance(0, "Page # 1");
                case 1:  // Fragment # 1 - This will show SecondFragment
                    return SecondFragment.newInstance(1, "Page # 2");
                default:
                    return null;
            }
        }

        // Returns the page title for the top indicator
        @Override
        public CharSequence getPageTitle(int position) {
            return null;
        }





    }




    //ir a la pagina 2
    public void irAPagina2 (View v){
        Intent intent = new Intent(this, Pagina2.class);
        startActivity(intent);
    }






}


