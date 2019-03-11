package com.example.javi.practicafragments1.fragments;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.javi.practicafragments1.R;
import com.example.javi.practicafragments1.utils.Version;


public class FragmentTres extends Fragment {
    ImageView imageView;
    TextView nom, fech, api, desc;
    View v;
    Context c;
    Version version;

    public static FragmentTres newInstance(Version version){
        FragmentTres d = new FragmentTres();
        Bundle b = new Bundle();
        b.putSerializable("version", version);
        d.setArguments(b);
        return d;

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        c=context;
        version= (Version) getArguments().getSerializable("version");
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v= inflater.inflate(R.layout.fragment_layout3,container,false);
        instancias();
        RecuperarDatos();
        return v;
    }

    private void instancias() {
        imageView = v.findViewById(R.id.imagenVersion);
        nom = v.findViewById(R.id.nombreVersion);
        fech = v.findViewById(R.id.fechaVersion);
        api = v.findViewById(R.id.apiVersion);
        desc = v.findViewById(R.id.descRecycler);
    }
    public void RecuperarDatos() {
        imageView.setImageResource(version.getImagen());
        nom.setText(version.getNombre());
        fech.setText(version.getFech());
        api.setText(version.getApi());
        desc.setText(version.getDesc());

    }
}
