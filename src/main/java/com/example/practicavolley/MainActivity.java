package com.example.practicavolley;


import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.support.v7.widget.Toolbar;

import com.example.practicavolley.adaptadores.AdaptadorRecyclerEquipos;
import com.example.practicavolley.fragments.FragmentJugadores;
import com.example.practicavolley.fragments.FragmentEquipos;
import com.example.practicavolley.utils.Equipo;


public class MainActivity extends AppCompatActivity implements AdaptadorRecyclerEquipos.OnRecyclerListener {
    FrameLayout sitioFg;
    Toolbar tool;
    NavigationView nav;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instacias();
        acciones();
        rellenarFragment1();
    }

    private void instacias() {
        tool = findViewById(R.id.tool);
        sitioFg = findViewById(R.id.sitioFg);
        nav = findViewById(R.id.navigation);
        setSupportActionBar(tool);
    }

    private void acciones() {
        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                switch (menuItem.getItemId()) {
                    case R.id.liga1:
                        ft.add(sitioFg.getId(), FragmentEquipos.newInstance("Spanish La Liga", "https://www.thesportsdb.com/api/v1/json/1/search_all_teams.php?s=Soccer&c=Spain"));
                        ft.commit();

                        break;
                    case R.id.liga2:
                        ft.add(sitioFg.getId(), FragmentEquipos.newInstance("English Premier League", "https://www.thesportsdb.com/api/v1/json/1/search_all_teams.php?s=Soccer&c=England"));
                        ft.commit();

                        break;
                    case R.id.liga3:
                        ft.add(sitioFg.getId(), FragmentEquipos.newInstance("German Bundesliga", "https://www.thesportsdb.com/api/v1/json/1/search_all_teams.php?s=Soccer&c=Germany"));
                        ft.commit();

                        break;
                    case R.id.liga4:
                        ft.add(sitioFg.getId(), FragmentEquipos.newInstance("Italian Serie A", "https://www.thesportsdb.com/api/v1/json/1/search_all_teams.php?s=Soccer&c=Italy"));
                        ft.commit();
                        break;
                }

                return true;
            }
        });
    }

    private void rellenarFragment1() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(sitioFg.getId(), FragmentEquipos.newInstance("Spanish La Liga", "https://www.thesportsdb.com/api/v1/json/1/search_all_teams.php?s=Soccer&c=Spain"));
        ft.commit();
    }


    @Override
    public void onRecyclerSelected(Equipo e) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(sitioFg.getId(), FragmentJugadores.newInstance(e.getNombre(), e.getEscudo()));
        ft.addToBackStack("F");
        ft.commit();
    }
}
