package com.example.practicafragments2;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.practicafragments2.adaptadores.AdaptadorRecycler;
import com.example.practicafragments2.adaptadores.AdaptadorRecycler2;
import com.example.practicafragments2.fragments.FragmentDos;
import com.example.practicafragments2.fragments.FragmentTres;
import com.example.practicafragments2.fragments.FragmentUno;
import com.example.practicafragments2.utils.DataSet;
import com.example.practicafragments2.utils.Version;

public class MainActivity extends AppCompatActivity implements AdaptadorRecycler.OnVersionRecyclerListener, AdaptadorRecycler2.OnVersionRecyclerListener2 {

    FrameLayout sitioMaster, sitioDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sitioMaster = findViewById(R.id.sitioFMaster);
        sitioDetail = findViewById(R.id.sitioFDetail);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
        ft.replace(R.id.sitioFMaster, new FragmentUno());
        ft.addToBackStack("F1");
        ft.commit();

        if (sitioDetail == null) {

        } else {

            FragmentManager fm2 = getSupportFragmentManager();
            FragmentTransaction ft2 = fm2.beginTransaction();
            ft2.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
            ft2.replace(R.id.sitioFDetail, FragmentDos.newInstance((Version) DataSet.listar().get(0)));
            ft2.addToBackStack("F2");
            ft2.commit();
        }
    }


    @Override
    public void onVersionRecyclerSelected(Version version) {
        if (sitioDetail == null) {
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.sitioFMaster, FragmentDos.newInstance(version));
            ft.addToBackStack(null);
            ft.commit();
        } else {
            FragmentManager fm2 = getSupportFragmentManager();
            FragmentTransaction ft2 = fm2.beginTransaction();
            ft2.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
            ft2.replace(R.id.sitioFDetail,FragmentDos.newInstance(version));
            ft2.addToBackStack("F2");
            ft2.commit();

        }
    }

    @Override
    public void onVersionRecyclerSelected2(Version version) {
        if (sitioDetail == null) {
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.sitioFMaster, FragmentTres.newInstance(version));
            ft.addToBackStack(null);
            ft.commit();
        } else {
            FragmentManager fm2 = getSupportFragmentManager();
            FragmentTransaction ft2 = fm2.beginTransaction();
            ft2.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
            ft2.replace(R.id.sitioFDetail, FragmentTres.newInstance(version));
            ft2.addToBackStack(FragmentDos.class.getName());
            ft2.commit();

        }
    }
}
