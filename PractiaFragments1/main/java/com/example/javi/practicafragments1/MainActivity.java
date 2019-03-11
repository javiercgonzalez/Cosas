package com.example.javi.practicafragments1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

import com.example.javi.practicafragments1.adaptadores.AdaptadorRecycler;
import com.example.javi.practicafragments1.adaptadores.AdaptadorRecycler2;
import com.example.javi.practicafragments1.fragments.FragmentDos;
import com.example.javi.practicafragments1.fragments.FragmentTres;
import com.example.javi.practicafragments1.fragments.FragmentUno;
import com.example.javi.practicafragments1.utils.Version;

public class MainActivity extends AppCompatActivity implements AdaptadorRecycler.OnVersionRecyclerListener,AdaptadorRecycler2.OnVersionRecyclerListener2 {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       FragmentManager fm=getFragmentManager();
       FragmentTransaction ft=fm.beginTransaction();
        ft.add(R.id.sitioFg,new FragmentUno());
        ft.commit();

    }


    @Override
    public void onVersionRecyclerSelected(Version version) {
        FragmentManager fm=getFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.sitioFg,FragmentDos.newInstance(version));
        ft.addToBackStack(null);
        ft.commit();
    }

    @Override
    public void onVersionRecyclerSelected2(Version version) {
        FragmentManager fm=getFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.sitioFg,FragmentTres.newInstance(version));
        ft.addToBackStack(null);
        ft.commit();
    }
}
